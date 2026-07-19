/*
 * JUnit 4 tests for CommandResponse.
 */
package org.apache.zookeeper.test.llm.c1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import org.apache.zookeeper.server.admin.CommandResponse;
import org.junit.Test;

public class CommandResponse_llmTest {

    @Test
    public void oneArgumentConstructorCreatesSuccessfulEmptyResponse() {
        CommandResponse response = new CommandResponse("stat");

        assertEquals("stat", response.getCommand());
        assertNull(response.getError());
        assertEquals(HttpServletResponse.SC_OK, response.getStatusCode());
        assertNull(response.getInputStream());
        assertTrue(response.getHeaders().isEmpty());

        Map<String, Object> map = response.toMap();
        assertEquals(2, map.size());
        assertEquals("stat", map.get(CommandResponse.KEY_COMMAND));
        assertTrue(map.containsKey(CommandResponse.KEY_ERROR));
        assertNull(map.get(CommandResponse.KEY_ERROR));
    }

    @Test
    public void threeArgumentConstructorPreservesAllArguments() {
        CommandResponse response = new CommandResponse("ruok", "not allowed", 403);

        assertEquals("ruok", response.getCommand());
        assertEquals("not allowed", response.getError());
        assertEquals(403, response.getStatusCode());
        assertNull(response.getInputStream());
    }

    @Test
    public void fourArgumentConstructorPreservesInputStream() {
        InputStream stream = new ByteArrayInputStream(new byte[] {1, 2, 3});
        CommandResponse response = new CommandResponse("dump", null, 201, stream);

        assertEquals("dump", response.getCommand());
        assertNull(response.getError());
        assertEquals(201, response.getStatusCode());
        assertSame(stream, response.getInputStream());
    }

    @Test
    public void statusCodeCanBeChanged() {
        CommandResponse response = new CommandResponse("conf");

        response.setStatusCode(503);

        assertEquals(503, response.getStatusCode());
    }

    @Test
    public void inputStreamCanBeChangedAndCleared() {
        CommandResponse response = new CommandResponse("snapshot");
        InputStream stream = new ByteArrayInputStream(new byte[] {42});

        response.setInputStream(stream);
        assertSame(stream, response.getInputStream());

        response.setInputStream(null);
        assertNull(response.getInputStream());
    }

    @Test
    public void putReturnsPreviousValueAndToMapContainsLatestValue() {
        CommandResponse response = new CommandResponse("mntr");

        assertNull(response.put("version", "1"));
        assertEquals("1", response.put("version", "2"));

        assertEquals("2", response.toMap().get("version"));
    }

    @Test
    public void putSupportsNullKeyAndNullValue() {
        CommandResponse response = new CommandResponse("test");

        assertNull(response.put(null, null));

        Map<String, Object> map = response.toMap();
        assertTrue(map.containsKey(null));
        assertNull(map.get(null));
    }

    @Test
    public void putAllCopiesEntriesAndPreservesTheirIterationOrder() {
        CommandResponse response = new CommandResponse("envi");
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("first", 1);
        values.put("second", 2);

        response.putAll(values);

        Map<String, Object> map = response.toMap();
        assertEquals(1, map.get("first"));
        assertEquals(2, map.get("second"));
        assertEquals("[first, second, command, error]", map.keySet().toString());
    }

    @Test(expected = NullPointerException.class)
    public void putAllRejectsNullMap() {
        new CommandResponse("test").putAll(null);
    }

    @Test
    public void dataUsingReservedKeysOverridesConstructorMetadata() {
        CommandResponse response = new CommandResponse("original", "original error", 500);
        response.put(CommandResponse.KEY_COMMAND, "overridden");
        response.put(CommandResponse.KEY_ERROR, null);

        Map<String, Object> map = response.toMap();

        assertEquals("overridden", map.get(CommandResponse.KEY_COMMAND));
        assertTrue(map.containsKey(CommandResponse.KEY_ERROR));
        assertNull(map.get(CommandResponse.KEY_ERROR));
        // The object metadata itself remains unchanged.
        assertEquals("original", response.getCommand());
        assertEquals("original error", response.getError());
    }

    @Test
    public void toMapReturnsIndependentMutableSnapshot() {
        CommandResponse response = new CommandResponse("srvr");
        response.put("count", 1);

        Map<String, Object> first = response.toMap();
        first.put("count", 99);
        first.put("external", true);
        first.remove(CommandResponse.KEY_COMMAND);

        Map<String, Object> second = response.toMap();
        assertEquals(1, second.get("count"));
        assertFalse(second.containsKey("external"));
        assertEquals("srvr", second.get(CommandResponse.KEY_COMMAND));
    }

    @Test
    public void headersCanBeAddedReplacedAndRead() {
        CommandResponse response = new CommandResponse("dirs");

        response.addHeader("Content-Type", "text/plain");
        response.addHeader("Content-Type", "application/json");
        response.addHeader("X-Nullable", null);

        Map<String, String> headers = response.getHeaders();
        assertEquals(2, headers.size());
        assertEquals("application/json", headers.get("Content-Type"));
        assertTrue(headers.containsKey("X-Nullable"));
        assertNull(headers.get("X-Nullable"));
    }

    @Test
    public void getHeadersReturnsLiveMutableHeaderMap() {
        CommandResponse response = new CommandResponse("cons");
        Map<String, String> headers = response.getHeaders();

        headers.put("X-Test", "yes");

        assertSame(headers, response.getHeaders());
        assertEquals("yes", response.getHeaders().get("X-Test"));
    }

    @Test
    public void nullCommandIsRetainedAndIncludedInMap() {
        CommandResponse response = new CommandResponse(null);

        assertNull(response.getCommand());
        assertTrue(response.toMap().containsKey(CommandResponse.KEY_COMMAND));
        assertNull(response.toMap().get(CommandResponse.KEY_COMMAND));
    }
}
