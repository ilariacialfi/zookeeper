package org.apache.zookeeper.test.llm.c0;

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

/**
 * Tests for {@link CommandResponse}.
 */
public class CommandResponse_llmTest {

    @Test
    public void oneArgumentConstructorUsesOkStatusAndNullOptionalValues() {
        CommandResponse response = new CommandResponse("ruok");

        assertEquals("ruok", response.getCommand());
        assertNull(response.getError());
        assertEquals(HttpServletResponse.SC_OK, response.getStatusCode());
        assertNull(response.getInputStream());
        assertTrue(response.getHeaders().isEmpty());

        Map<String, Object> result = response.toMap();
        assertEquals(2, result.size());
        assertEquals("ruok", result.get(CommandResponse.KEY_COMMAND));
        assertTrue(result.containsKey(CommandResponse.KEY_ERROR));
        assertNull(result.get(CommandResponse.KEY_ERROR));
    }

    @Test
    public void threeArgumentConstructorRetainsAllArguments() {
        CommandResponse response = new CommandResponse("stat", "not available", 503);

        assertEquals("stat", response.getCommand());
        assertEquals("not available", response.getError());
        assertEquals(503, response.getStatusCode());
        assertNull(response.getInputStream());
    }

    @Test
    public void fourArgumentConstructorRetainsInputStreamByIdentity() {
        InputStream stream = new ByteArrayInputStream(new byte[] {1, 2, 3});
        CommandResponse response = new CommandResponse("dump", null, 206, stream);

        assertEquals("dump", response.getCommand());
        assertNull(response.getError());
        assertEquals(206, response.getStatusCode());
        assertSame(stream, response.getInputStream());
    }

    @Test
    public void statusCodeCanBeChanged() {
        CommandResponse response = new CommandResponse("conf");

        response.setStatusCode(418);

        assertEquals(418, response.getStatusCode());
    }

    @Test
    public void inputStreamCanBeReplacedAndCleared() {
        InputStream original = new ByteArrayInputStream(new byte[] {1});
        InputStream replacement = new ByteArrayInputStream(new byte[] {2});
        CommandResponse response = new CommandResponse("stream", null, 200, original);

        response.setInputStream(replacement);
        assertSame(replacement, response.getInputStream());

        response.setInputStream(null);
        assertNull(response.getInputStream());
    }

    @Test
    public void putReturnsPreviousValueAndStoresLatestValue() {
        CommandResponse response = new CommandResponse("mntr");

        assertNull(response.put("count", 1));
        assertEquals(Integer.valueOf(1), response.put("count", 2));
        assertEquals(Integer.valueOf(2), response.toMap().get("count"));
    }

    @Test
    public void putAllCopiesAllEntriesIncludingNullValues() {
        CommandResponse response = new CommandResponse("environment");
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("version", "1.0");
        values.put("optional", null);

        response.putAll(values);

        Map<String, Object> result = response.toMap();
        assertEquals("1.0", result.get("version"));
        assertTrue(result.containsKey("optional"));
        assertNull(result.get("optional"));
    }

    @Test
    public void dataEntriesWithReservedKeysOverrideConstructorValues() {
        CommandResponse response = new CommandResponse("original", "original error", 500);

        response.put(CommandResponse.KEY_COMMAND, "overridden");
        response.put(CommandResponse.KEY_ERROR, null);

        Map<String, Object> result = response.toMap();
        assertEquals("overridden", result.get(CommandResponse.KEY_COMMAND));
        assertTrue(result.containsKey(CommandResponse.KEY_ERROR));
        assertNull(result.get(CommandResponse.KEY_ERROR));

        // The object's immutable fields are unaffected by the map representation.
        assertEquals("original", response.getCommand());
        assertEquals("original error", response.getError());
    }

    @Test
    public void toMapPreservesInsertionOrderWithMetadataAfterOrdinaryData() {
        CommandResponse response = new CommandResponse("order");
        response.put("first", 1);
        response.put("second", 2);

        Object[] keys = response.toMap().keySet().toArray();

        assertEquals("first", keys[0]);
        assertEquals("second", keys[1]);
        assertEquals(CommandResponse.KEY_COMMAND, keys[2]);
        assertEquals(CommandResponse.KEY_ERROR, keys[3]);
    }

    @Test
    public void toMapReturnsIndependentMutableSnapshots() {
        CommandResponse response = new CommandResponse("snapshot");
        response.put("value", "stored");

        Map<String, Object> first = response.toMap();
        first.put("value", "changed only in snapshot");
        first.put("new", "snapshot only");
        first.remove(CommandResponse.KEY_COMMAND);

        Map<String, Object> second = response.toMap();
        assertEquals("stored", second.get("value"));
        assertFalse(second.containsKey("new"));
        assertEquals("snapshot", second.get(CommandResponse.KEY_COMMAND));
    }

    @Test
    public void headersAreAddedReplacedAndExposedByTheReturnedMap() {
        CommandResponse response = new CommandResponse("headers");

        response.addHeader("Content-Type", "text/plain");
        response.addHeader("Content-Type", "application/json");
        response.addHeader("X-Test", "yes");

        Map<String, String> headers = response.getHeaders();
        assertEquals(2, headers.size());
        assertEquals("application/json", headers.get("Content-Type"));
        assertEquals("yes", headers.get("X-Test"));

        headers.put("X-From-Caller", "visible");
        assertEquals("visible", response.getHeaders().get("X-From-Caller"));
    }

    @Test
    public void nullCommandIsRepresentedWithoutDroppingTheKey() {
        CommandResponse response = new CommandResponse(null, null, 204);

        Map<String, Object> result = response.toMap();
        assertTrue(result.containsKey(CommandResponse.KEY_COMMAND));
        assertNull(result.get(CommandResponse.KEY_COMMAND));
        assertTrue(result.containsKey(CommandResponse.KEY_ERROR));
        assertNull(result.get(CommandResponse.KEY_ERROR));
    }
}
