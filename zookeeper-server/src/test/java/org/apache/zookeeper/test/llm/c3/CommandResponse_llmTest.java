package org.apache.zookeeper.server.admin;

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
import org.junit.Test;

/**
 * Tests for {@link CommandResponse}.
 */
public class CommandResponse_llmTest {

    @Test
    public void singleArgumentConstructorUsesOkStatusAndNullOptionalValues() {
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
    public void threeArgumentConstructorPreservesArguments() {
        CommandResponse response = new CommandResponse(
                "ruok", "not allowed", HttpServletResponse.SC_FORBIDDEN);

        assertEquals("ruok", response.getCommand());
        assertEquals("not allowed", response.getError());
        assertEquals(HttpServletResponse.SC_FORBIDDEN, response.getStatusCode());
        assertNull(response.getInputStream());
    }

    @Test
    public void fourArgumentConstructorPreservesInputStream() {
        InputStream stream = new ByteArrayInputStream(new byte[] {1, 2, 3});

        CommandResponse response = new CommandResponse(
                "dump", null, HttpServletResponse.SC_ACCEPTED, stream);

        assertSame(stream, response.getInputStream());
        assertEquals(HttpServletResponse.SC_ACCEPTED, response.getStatusCode());
    }

    @Test
    public void settersReplaceStatusCodeAndInputStreamIncludingNull() {
        CommandResponse response = new CommandResponse("cons");
        InputStream first = new ByteArrayInputStream(new byte[] {10});
        InputStream second = new ByteArrayInputStream(new byte[] {20});

        response.setStatusCode(HttpServletResponse.SC_CREATED);
        response.setInputStream(first);
        assertEquals(HttpServletResponse.SC_CREATED, response.getStatusCode());
        assertSame(first, response.getInputStream());

        response.setStatusCode(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        response.setInputStream(second);
        assertEquals(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertSame(second, response.getInputStream());

        response.setInputStream(null);
        assertNull(response.getInputStream());
    }

    @Test
    public void putReturnsPreviousValueAndToMapContainsData() {
        CommandResponse response = new CommandResponse("mntr");

        assertNull(response.put("version", "1.0"));
        assertEquals("1.0", response.put("version", "2.0"));
        assertNull(response.put("nullable", null));

        Map<String, Object> map = response.toMap();
        assertEquals("2.0", map.get("version"));
        assertTrue(map.containsKey("nullable"));
        assertNull(map.get("nullable"));
    }

    @Test
    public void putAllCopiesEveryEntryAndPreservesInsertionOrderInToMap() {
        CommandResponse response = new CommandResponse("envi");
        Map<String, Object> values = new LinkedHashMap<>();
        values.put("first", 1);
        values.put("second", 2);

        response.putAll(values);
        values.put("third", 3); // putAll must not retain the source map itself.

        Map<String, Object> map = response.toMap();
        assertEquals(Integer.valueOf(1), map.get("first"));
        assertEquals(Integer.valueOf(2), map.get("second"));
        assertFalse(map.containsKey("third"));
        assertEquals("[first, second, command, error]", map.keySet().toString());
    }

    @Test
    public void toMapIsAnIndependentMutableSnapshot() {
        CommandResponse response = new CommandResponse("srvr", "original", 500);
        response.put("answer", 42);

        Map<String, Object> firstSnapshot = response.toMap();
        firstSnapshot.put("answer", 99);
        firstSnapshot.put("new-key", "new-value");
        firstSnapshot.remove(CommandResponse.KEY_COMMAND);

        Map<String, Object> secondSnapshot = response.toMap();
        assertEquals(Integer.valueOf(42), secondSnapshot.get("answer"));
        assertFalse(secondSnapshot.containsKey("new-key"));
        assertEquals("srvr", secondSnapshot.get(CommandResponse.KEY_COMMAND));
        assertEquals("original", secondSnapshot.get(CommandResponse.KEY_ERROR));
    }

    @Test
    public void userDataWithReservedKeysOverridesMetadataInToMap() {
        CommandResponse response = new CommandResponse("real-command", "real-error", 500);
        response.put(CommandResponse.KEY_COMMAND, "data-command");
        response.put(CommandResponse.KEY_ERROR, "data-error");

        Map<String, Object> map = response.toMap();

        // CommandResponse.toMap() deliberately applies data last.
        assertEquals("data-command", map.get(CommandResponse.KEY_COMMAND));
        assertEquals("data-error", map.get(CommandResponse.KEY_ERROR));
        // The response's own fields remain unchanged.
        assertEquals("real-command", response.getCommand());
        assertEquals("real-error", response.getError());
    }

    @Test
    public void headersCanBeAddedReplacedAndAccessedThroughReturnedMap() {
        CommandResponse response = new CommandResponse("wchc");

        response.addHeader("Content-Type", "text/plain");
        response.addHeader("Content-Type", "application/json");
        response.addHeader(null, null);

        Map<String, String> headers = response.getHeaders();
        assertSame(headers, response.getHeaders());
        assertEquals("application/json", headers.get("Content-Type"));
        assertTrue(headers.containsKey(null));
        assertNull(headers.get(null));

        // getHeaders() exposes the live header map, as documented by its API shape.
        headers.put("X-Test", "yes");
        assertEquals("yes", response.getHeaders().get("X-Test"));
    }

    @Test
    public void nullCommandIsRepresentedAsPresentNullValue() {
        CommandResponse response = new CommandResponse(null, null, 0, null);

        assertNull(response.getCommand());
        assertEquals(0, response.getStatusCode());
        Map<String, Object> map = response.toMap();
        assertTrue(map.containsKey(CommandResponse.KEY_COMMAND));
        assertNull(map.get(CommandResponse.KEY_COMMAND));
        assertTrue(map.containsKey(CommandResponse.KEY_ERROR));
        assertNull(map.get(CommandResponse.KEY_ERROR));
    }
}
