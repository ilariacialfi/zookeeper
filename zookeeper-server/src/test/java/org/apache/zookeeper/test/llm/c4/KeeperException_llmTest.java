package org.apache.zookeeper.test.llm.c4;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.BadArgumentsException;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.KeeperException.NodeExistsException;
import org.apache.zookeeper.OpResult;
import org.junit.Test;

public class KeeperException_llmTest {

    @Test
    public void testCreateWithPathSetsTypeCodePathAndMessage() {
        KeeperException ex = KeeperException.create(Code.NONODE, "/test");

        assertTrue(ex instanceof KeeperException.NoNodeException);
        assertEquals(Code.NONODE, ex.code());
        assertEquals("/test", ex.getPath());
        assertEquals(
                "KeeperErrorCode = NoNode for /test",
                ex.getMessage());
    }

    @Test
    public void testCreateWithoutPathReturnsExpectedSubclass() {
        KeeperException ex = KeeperException.create(Code.NODEEXISTS);

        assertTrue(ex instanceof KeeperException.NodeExistsException);
        assertEquals(Code.NODEEXISTS, ex.code());
        assertNull(ex.getPath());
    }

    @Test
    public void testDeprecatedCreateIntVariants() {
        KeeperException ex1 = KeeperException.create(Code.BADVERSION.intValue());
        KeeperException ex2 = KeeperException.create(
                Code.BADVERSION.intValue(),
                "/versioned");

        assertTrue(ex1 instanceof KeeperException.BadVersionException);
        assertTrue(ex2 instanceof KeeperException.BadVersionException);
        assertEquals("/versioned", ex2.getPath());
    }

    @Test
    public void testCreateRejectsOkCode() {
        try {
            KeeperException.create(Code.OK);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid exception code"));
        }
    }

    @Test
    public void testCodeGetAndIntValueRoundTrip() {
        for (Code code : Code.values()) {
            assertSame(code, Code.get(code.intValue()));
            assertEquals(code.intValue(), Code.get(code.intValue()).intValue());
        }
    }

    @Test
    public void testCodeGetRejectsUnknownValue() {
        try {
            Code.get(123456789);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("cannot lookup this code"));
        }
    }

    @Test
    public void testDeprecatedSetCodeChangesStoredCode() {
        KeeperException ex = new BadArgumentsException();

        ex.setCode(Code.NONODE.intValue());

        assertEquals(Code.NONODE, ex.code());
        assertEquals(Code.NONODE.intValue(), ex.getCode());
    }

    @Test
    public void testGetMessageWithoutPath() {
        KeeperException ex = new KeeperException.ConnectionLossException();

        assertEquals(
                "KeeperErrorCode = ConnectionLoss",
                ex.getMessage());
    }

    @Test
    public void testGetMessageWithEmptyPathUsesNoPathBranch() {
        KeeperException ex = new NodeExistsException("");

        assertEquals(
                "KeeperErrorCode = NodeExists",
                ex.getMessage());
    }

    @Test
    public void testGetMessageWithPath() {
        KeeperException ex = new NodeExistsException("/existing");

        assertEquals(
                "KeeperErrorCode = NodeExists for /existing",
                ex.getMessage());
    }

    @Test
    public void testGetResultsReturnsNullWhenNoResultsAvailable() {
        KeeperException ex = new KeeperException.ConnectionLossException();

        assertNull(ex.getResults());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetResultsReturnsDefensiveCopy() throws Exception {
        KeeperException ex = new KeeperException.ConnectionLossException();

        List<OpResult> original = new ArrayList<OpResult>();

        Method setMultiResults =
                KeeperException.class.getDeclaredMethod(
                        "setMultiResults",
                        List.class);
        setMultiResults.setAccessible(true);
        setMultiResults.invoke(ex, original);

        List<OpResult> returned1 = ex.getResults();
        List<OpResult> returned2 = ex.getResults();

        assertNotNull(returned1);
        assertNotSame(original, returned1);
        assertNotSame(returned1, returned2);

        returned1.add(null);

        assertEquals(
                "Defensive copy must prevent external modification",
                0,
                ex.getResults().size());
    }

    @Test
    public void testRepresentativeExceptionConstructorsExposeExpectedCodesAndPaths() {
        KeeperException ex1 = new KeeperException.InvalidACLException("/acl");
        KeeperException ex2 = new KeeperException.NoWatcherException("/watch");
        KeeperException ex3 = new KeeperException.QuotaExceededException("/quota");
        KeeperException ex4 = new KeeperException.SessionClosedRequireAuthException("/auth");

        assertEquals(Code.INVALIDACL, ex1.code());
        assertEquals("/acl", ex1.getPath());

        assertEquals(Code.NOWATCHER, ex2.code());
        assertEquals("/watch", ex2.getPath());

        assertEquals(Code.QUOTAEXCEEDED, ex3.code());
        assertEquals("/quota", ex3.getPath());

        assertEquals(Code.SESSIONCLOSEDREQUIRESASLAUTH, ex4.code());
        assertEquals("/auth", ex4.getPath());
    }
}