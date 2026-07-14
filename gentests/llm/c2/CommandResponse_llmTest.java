package org.apache.zookeeper.test.llm.c2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
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
    public void singleArgumentConstructorCreatesSuccessfulEmptyResponse() {
        CommandResponse response = new CommandResponse("stat");

        assertEquals("stat", response.getCommand());
        assertNull(response.getError());
        assertEquals(HttpServletResponse.SC_OK, response.getStatusCode());
        assertNull(response.getInputStream());
        assertTrue(response.getHeaders().isEmpty());

        Map<String, Object> result = response.toMap();
        assertEquals(2, result.size());
        assertEquals("stat", result.get(CommandResponse.KEY_COMMAND));
        assertTrue(result.containsKey(CommandResponse.KEY_ERROR));
        assertNull(result.get(CommandResponse.KEY_ERROR));
    }

    @Test
    public void threeArgumentConstructorPreservesValues() {
        CommandResponse response = new CommandResponse("ruok", "not allowed", 403);

        assertEquals("ruok", response.getCommand());
        assertEquals("not allowed", response.getError());
        assertEquals(403, response.getStatusCode());
        assertNull(response.getInputStream());
    }

    @Test
    public void fourArgumentConstructorPreservesInputStream() {
        InputStream stream = new ByteArrayInputStream(new byte[] {1, 2, 3});

        CommandResponse response = new CommandResponse("dump", null, 206, stream);

        assertEquals("dump", response.getCommand());
        assertNull(response.getError());
        assertEquals(206, response.getStatusCode());
        assertSame(stream, response.getInputStream());
    }

    @Test
    public void statusCodeCanBeChanged() {
        CommandResponse response = new CommandResponse("stat", null, 200);

        response.setStatusCode(503);

        assertEquals(503, response.getStatusCode());
    }

    @Test
    public void inputStreamCanBeSetReplacedAndCleared() {
        CommandResponse response = new CommandResponse("dump");
        InputStream first = new ByteArrayInputStream(new byte[] {1});
        InputStream second = new ByteArrayInputStream(new byte[] {2});

        response.setInputStream(first);
        assertSame(first, response.getInputStream());

        response.setInputStream(second);
        assertSame(second, response.getInputStream());

        response.setInputStream(null);
        assertNull(response.getInputStream());
    }

    @Test
    public void putReturnsPreviousValueAndToMapContainsLatestValue() {
        CommandResponse response = new CommandResponse("conf");

        assertNull(response.put("version", 1));
        assertEquals(1, response.put("version", 2));

        Map<String, Object> result = response.toMap();
        assertEquals(2, result.get("version"));
    }

    @Test
    public void putAllCopiesAllEntriesAndPreservesInsertionOrder() {
        CommandResponse response = new CommandResponse("mntr");
        response.put("first", 1);
        Map<String, Object> additional = new LinkedHashMap<String, Object>();
        additional.put("second", 2);
        additional.put("third", null);

        response.putAll(additional);
        Map<String, Object> result = response.toMap();

        assertEquals(5, result.size());
        assertEquals(1, result.get("first"));
        assertEquals(2, result.get("second"));
        assertTrue(result.containsKey("third"));
        assertNull(result.get("third"));

        Iterator<String> keys = result.keySet().iterator();
        assertEquals("first", keys.next());
        assertEquals("second", keys.next());
        assertEquals("third", keys.next());
        assertEquals(CommandResponse.KEY_COMMAND, keys.next());
        assertEquals(CommandResponse.KEY_ERROR, keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void dataEntriesWithReservedKeysOverrideCommandAndErrorInMap() {
        CommandResponse response = new CommandResponse("original-command", "original-error", 500);
        response.put(CommandResponse.KEY_COMMAND, "data-command");
        response.put(CommandResponse.KEY_ERROR, "data-error");

        Map<String, Object> result = response.toMap();

        assertEquals("data-command", result.get(CommandResponse.KEY_COMMAND));
        assertEquals("data-error", result.get(CommandResponse.KEY_ERROR));
        // The object's own immutable properties are not changed by map conversion.
        assertEquals("original-command", response.getCommand());
        assertEquals("original-error", response.getError());
    }

    @Test
    public void toMapReturnsAnIndependentMutableSnapshot() {
        CommandResponse response = new CommandResponse("stat");
        response.put("count", 10);

        Map<String, Object> first = response.toMap();
        first.put("count", 99);
        first.put("new-key", "new-value");
        first.remove(CommandResponse.KEY_COMMAND);

        Map<String, Object> second = response.toMap();
        assertEquals(10, second.get("count"));
        assertFalse(second.containsKey("new-key"));
        assertEquals("stat", second.get(CommandResponse.KEY_COMMAND));
    }

    @Test
    public void headersCanBeAddedReplacedAndAccessedThroughReturnedMap() {
        CommandResponse response = new CommandResponse("stat");

        response.addHeader("Content-Type", "text/plain");
        response.addHeader("Content-Type", "application/json");
        response.addHeader("X-Test", "one");

        Map<String, String> headers = response.getHeaders();
        assertEquals(2, headers.size());
        assertEquals("application/json", headers.get("Content-Type"));
        assertEquals("one", headers.get("X-Test"));

        // getHeaders() exposes the response's live header map.
        headers.put("X-Added", "two");
        assertEquals("two", response.getHeaders().get("X-Added"));
        assertSame(headers, response.getHeaders());
    }
}
