package org.apache.zookeeper.test.llm.c0;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.APIErrorException;
import org.apache.zookeeper.KeeperException.BadArgumentsException;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.KeeperException.ConnectionLossException;
import org.apache.zookeeper.KeeperException.NoNodeException;
import org.apache.zookeeper.KeeperException.NotEmptyException;
import org.apache.zookeeper.KeeperException.QuotaExceededException;
import org.apache.zookeeper.KeeperException.ReconfigDisabledException;
import org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException;
import org.apache.zookeeper.KeeperException.SystemErrorException;
import org.apache.zookeeper.KeeperException.ThrottledOpException;
import org.apache.zookeeper.KeeperException.UnimplementedException;
import org.apache.zookeeper.OpResult;
import org.junit.Test;

/**
 * Tests for {@link KeeperException}.
 */
public class KeeperException_llmTest {

    @Test
    public void testCodeRoundTripUsingGetAndIntValue() {
        for (Code code : Code.values()) {
            assertSame(code, Code.get(code.intValue()));
            assertEquals(code.intValue(), Code.get(code.intValue()).intValue());
        }
    }

    @Test
    public void testCodeGetWithUnknownValueThrows() {
        try {
            Code.get(123456789);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("cannot lookup this code"));
        }
    }

    @Test
    public void testCreateReturnsExpectedSubclasses() {
        assertTrue(KeeperException.create(Code.SYSTEMERROR)
                instanceof SystemErrorException);

        assertTrue(KeeperException.create(Code.CONNECTIONLOSS)
                instanceof ConnectionLossException);

        assertTrue(KeeperException.create(Code.APIERROR)
                instanceof APIErrorException);

        assertTrue(KeeperException.create(Code.NONODE)
                instanceof NoNodeException);

        assertTrue(KeeperException.create(Code.RECONFIGDISABLED)
                instanceof ReconfigDisabledException);

        assertTrue(KeeperException.create(Code.QUOTAEXCEEDED)
                instanceof QuotaExceededException);

        assertTrue(KeeperException.create(Code.THROTTLEDOP)
                instanceof ThrottledOpException);

        assertTrue(KeeperException.create(Code.UNIMPLEMENTED)
                instanceof UnimplementedException);
    }

    @Test
    public void testCreateWithPathSetsPathAndMessage() {
        KeeperException ex =
                KeeperException.create(Code.NONODE, "/test/node");

        assertEquals(Code.NONODE, ex.code());
        assertEquals("/test/node", ex.getPath());
        assertEquals(
                "KeeperErrorCode = NoNode for /test/node",
                ex.getMessage());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedCreateIntOverloads() {
        KeeperException ex1 =
                KeeperException.create(Code.NONODE.intValue());

        assertEquals(Code.NONODE, ex1.code());

        KeeperException ex2 =
                KeeperException.create(Code.NODEEXISTS.intValue(), "/p");

        assertEquals(Code.NODEEXISTS, ex2.code());
        assertEquals("/p", ex2.getPath());
    }

    @Test
    public void testCreateWithInvalidCodeThrows() {
        try {
            KeeperException.create(Code.OK);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid exception code"));
        }
    }

    @Test
    public void testGetMessageWithoutPathWhenPathIsNull() {
        KeeperException ex = new NoNodeException();

        assertEquals(
                "KeeperErrorCode = NoNode",
                ex.getMessage());
    }

    @Test
    public void testGetMessageWithoutPathWhenPathIsEmpty() {
        KeeperException ex = new BadArgumentsException("");

        assertEquals(
                "KeeperErrorCode = BadArguments",
                ex.getMessage());
    }

    @Test
    public void testGetMessageWithPath() {
        KeeperException ex = new NotEmptyException("/parent");

        assertEquals(
                "KeeperErrorCode = Directory not empty for /parent",
                ex.getMessage());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testCodeAccessorAndDeprecatedSetCode() {
        KeeperException ex = new NoNodeException();

        assertEquals(Code.NONODE, ex.code());
        assertEquals(Code.NONODE.intValue(), ex.getCode());

        ex.setCode(Code.BADVERSION.intValue());

        assertEquals(Code.BADVERSION, ex.code());
        assertEquals(Code.BADVERSION.intValue(), ex.getCode());
        assertEquals("KeeperErrorCode = BadVersion", ex.getMessage());
    }

    @Test
    public void testConstructorsWithPathPreservePath() {
        assertEquals("/a", new NoNodeException("/a").getPath());
        assertEquals("/b", new BadArgumentsException("/b").getPath());
        assertEquals("/c", new ReconfigDisabledException("/c").getPath());
        assertEquals("/d", new QuotaExceededException("/d").getPath());
        assertEquals("/e", new SessionClosedRequireAuthException("/e").getPath());
    }

    @Test
    public void testGetResultsReturnsDefensiveCopy() throws Exception {
        KeeperException ex = new NoNodeException();

        List<OpResult> original = new ArrayList<>();

        Method m = KeeperException.class.getDeclaredMethod(
                "setMultiResults",
                List.class);
        m.setAccessible(true);
        m.invoke(ex, original);

        List<OpResult> returned1 = ex.getResults();
        List<OpResult> returned2 = ex.getResults();

        assertNotNull(returned1);
        assertNotSame(original, returned1);
        assertNotSame(returned1, returned2);

        returned1.add(null);

        assertEquals(
                "Internal state must not be modified through returned list",
                0,
                ex.getResults().size());
    }

    @Test
    public void testGetResultsReturnsNullWhenNoResultsPresent() {
        KeeperException ex = new NoNodeException();

        assertNull(ex.getResults());
    }
}