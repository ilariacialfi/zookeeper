package org.apache.zookeeper.server.admin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;

/**
 * Tests for {@link CommandResponse}.
 */
public class CommandResponse_llmTest {

    @Test
    public void singleArgumentConstructorUsesExpectedDefaults() {
        CommandResponse response = new CommandResponse("ruok");

        assertEquals("ruok", response.getCommand());
        assertNull(response.getError());
        assertEquals(HttpServletResponse.SC_OK, response.getStatusCode());
        assertNull(response.getInputStream());
        assertTrue(response.getHeaders().isEmpty());

        Map<String, Object> map = response.toMap();
        assertEquals(2, map.size());
        assertEquals("ruok", map.get(CommandResponse.KEY_COMMAND));
        assertTrue(map.containsKey(CommandResponse.KEY_ERROR));
        assertNull(map.get(CommandResponse.KEY_ERROR));
    }

    @Test
    public void threeArgumentConstructorPreservesArguments() {
        CommandResponse response = new CommandResponse(
            "stat", "not allowed", HttpServletResponse.SC_FORBIDDEN);

        assertEquals("stat", response.getCommand());
        assertEquals("not allowed", response.getError());
        assertEquals(HttpServletResponse.SC_FORBIDDEN, response.getStatusCode());
        assertNull(response.getInputStream());
    }

    @Test
    public void fourArgumentConstructorPreservesInputStream() {
        InputStream stream = new ByteArrayInputStream(
            "payload".getBytes(StandardCharsets.UTF_8));

        CommandResponse response = new CommandResponse(
            "dump", null, HttpServletResponse.SC_OK, stream);

        assertSame(stream, response.getInputStream());
    }

    @Test
    public void statusCodeCanBeChanged() {
        CommandResponse response = new CommandResponse("stat");

        response.setStatusCode(HttpServletResponse.SC_SERVICE_UNAVAILABLE);

        assertEquals(HttpServletResponse.SC_SERVICE_UNAVAILABLE, response.getStatusCode());
    }

    @Test
    public void inputStreamCanBeChangedAndCleared() {
        CommandResponse response = new CommandResponse("dump");
        InputStream stream = new ByteArrayInputStream(new byte[] {1, 2, 3});

        response.setInputStream(stream);
        assertSame(stream, response.getInputStream());

        response.setInputStream(null);
        assertNull(response.getInputStream());
    }

    @Test
    public void putReturnsPreviousValueAndToMapContainsLatestValue() {
        CommandResponse response = new CommandResponse("conf");

        assertNull(response.put("clientPort", 2181));
        assertEquals(2181, response.put("clientPort", 2281));
        assertNull(response.put("nullable", null));

        Map<String, Object> map = response.toMap();
        assertEquals(2281, map.get("clientPort"));
        assertTrue(map.containsKey("nullable"));
        assertNull(map.get("nullable"));
    }

    @Test
    public void putAllCopiesAllEntries() {
        CommandResponse response = new CommandResponse("envi");
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("version", "1.0");
        values.put("readOnly", Boolean.TRUE);

        response.putAll(values);

        Map<String, Object> map = response.toMap();
        assertEquals("1.0", map.get("version"));
        assertEquals(Boolean.TRUE, map.get("readOnly"));
    }

    @Test
    public void dataEntriesWithReservedKeysOverrideConstructorMetadata() {
        CommandResponse response = new CommandResponse(
            "original", "original error", HttpServletResponse.SC_BAD_REQUEST);

        response.put(CommandResponse.KEY_COMMAND, "overridden");
        response.put(CommandResponse.KEY_ERROR, null);

        Map<String, Object> map = response.toMap();
        assertEquals("overridden", map.get(CommandResponse.KEY_COMMAND));
        assertTrue(map.containsKey(CommandResponse.KEY_ERROR));
        assertNull(map.get(CommandResponse.KEY_ERROR));

        // The object's immutable fields themselves are not changed.
        assertEquals("original", response.getCommand());
        assertEquals("original error", response.getError());
    }

    @Test
    public void toMapReturnsIndependentMutableSnapshots() {
        CommandResponse response = new CommandResponse("mntr");
        response.put("count", 1);

        Map<String, Object> first = response.toMap();
        first.put("count", 99);
        first.put("external", "only in snapshot");
        first.remove(CommandResponse.KEY_COMMAND);

        Map<String, Object> second = response.toMap();
        assertEquals(1, second.get("count"));
        assertFalse(second.containsKey("external"));
        assertEquals("mntr", second.get(CommandResponse.KEY_COMMAND));
    }

    @Test
    public void toMapKeepsInsertionOrderWithMetadataAfterOrdinaryData() {
        CommandResponse response = new CommandResponse("keys");
        response.put("first", 1);
        response.put("second", 2);

        String[] keys = response.toMap().keySet().toArray(new String[0]);

        assertEquals("first", keys[0]);
        assertEquals("second", keys[1]);
        assertEquals(CommandResponse.KEY_COMMAND, keys[2]);
        assertEquals(CommandResponse.KEY_ERROR, keys[3]);
    }

    @Test
    public void headersAreAddedReplacedAndExposedAsLiveMap() {
        CommandResponse response = new CommandResponse("dump");

        response.addHeader("Content-Type", "text/plain");
        response.addHeader("Content-Type", "application/octet-stream");
        response.addHeader("X-Nullable", null);

        Map<String, String> headers = response.getHeaders();
        assertSame(headers, response.getHeaders());
        assertEquals("application/octet-stream", headers.get("Content-Type"));
        assertTrue(headers.containsKey("X-Nullable"));
        assertNull(headers.get("X-Nullable"));

        headers.put("X-External", "visible");
        assertEquals("visible", response.getHeaders().get("X-External"));
    }

    @Test(expected = NullPointerException.class)
    public void putAllRejectsNullMap() {
        CommandResponse response = new CommandResponse("conf");

        response.putAll(null);
    }
}
