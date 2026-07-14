package org.apache.zookeeper.test.llm.c1;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.APIErrorException;
import org.apache.zookeeper.KeeperException.AuthFailedException;
import org.apache.zookeeper.KeeperException.BadArgumentsException;
import org.apache.zookeeper.KeeperException.BadVersionException;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.KeeperException.ConnectionLossException;
import org.apache.zookeeper.KeeperException.DataInconsistencyException;
import org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException;
import org.apache.zookeeper.KeeperException.InvalidACLException;
import org.apache.zookeeper.KeeperException.InvalidCallbackException;
import org.apache.zookeeper.KeeperException.MarshallingErrorException;
import org.apache.zookeeper.KeeperException.NewConfigNoQuorum;
import org.apache.zookeeper.KeeperException.NoAuthException;
import org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException;
import org.apache.zookeeper.KeeperException.NoNodeException;
import org.apache.zookeeper.KeeperException.NoWatcherException;
import org.apache.zookeeper.KeeperException.NodeExistsException;
import org.apache.zookeeper.KeeperException.NotEmptyException;
import org.apache.zookeeper.KeeperException.NotReadOnlyException;
import org.apache.zookeeper.KeeperException.OperationTimeoutException;
import org.apache.zookeeper.KeeperException.QuotaExceededException;
import org.apache.zookeeper.KeeperException.ReconfigDisabledException;
import org.apache.zookeeper.KeeperException.ReconfigInProgress;
import org.apache.zookeeper.KeeperException.RequestTimeoutException;
import org.apache.zookeeper.KeeperException.RuntimeInconsistencyException;
import org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException;
import org.apache.zookeeper.KeeperException.SessionExpiredException;
import org.apache.zookeeper.KeeperException.SessionMovedException;
import org.apache.zookeeper.KeeperException.SystemErrorException;
import org.apache.zookeeper.KeeperException.ThrottledOpException;
import org.apache.zookeeper.KeeperException.UnimplementedException;
import org.junit.Test;

public class KeeperException_llmTest {

    @Test
    public void testCreateReturnsExpectedSubclassForAllSupportedCodes() {
        assertTrue(KeeperException.create(Code.SYSTEMERROR) instanceof SystemErrorException);
        assertTrue(KeeperException.create(Code.RUNTIMEINCONSISTENCY) instanceof RuntimeInconsistencyException);
        assertTrue(KeeperException.create(Code.DATAINCONSISTENCY) instanceof DataInconsistencyException);
        assertTrue(KeeperException.create(Code.CONNECTIONLOSS) instanceof ConnectionLossException);
        assertTrue(KeeperException.create(Code.MARSHALLINGERROR) instanceof MarshallingErrorException);
        assertTrue(KeeperException.create(Code.UNIMPLEMENTED) instanceof UnimplementedException);
        assertTrue(KeeperException.create(Code.OPERATIONTIMEOUT) instanceof OperationTimeoutException);
        assertTrue(KeeperException.create(Code.NEWCONFIGNOQUORUM) instanceof NewConfigNoQuorum);
        assertTrue(KeeperException.create(Code.RECONFIGINPROGRESS) instanceof ReconfigInProgress);
        assertTrue(KeeperException.create(Code.BADARGUMENTS) instanceof BadArgumentsException);
        assertTrue(KeeperException.create(Code.APIERROR) instanceof APIErrorException);
        assertTrue(KeeperException.create(Code.NONODE) instanceof NoNodeException);
        assertTrue(KeeperException.create(Code.NOAUTH) instanceof NoAuthException);
        assertTrue(KeeperException.create(Code.BADVERSION) instanceof BadVersionException);
        assertTrue(KeeperException.create(Code.NOCHILDRENFOREPHEMERALS) instanceof NoChildrenForEphemeralsException);
        assertTrue(KeeperException.create(Code.NODEEXISTS) instanceof NodeExistsException);
        assertTrue(KeeperException.create(Code.INVALIDACL) instanceof InvalidACLException);
        assertTrue(KeeperException.create(Code.AUTHFAILED) instanceof AuthFailedException);
        assertTrue(KeeperException.create(Code.NOTEMPTY) instanceof NotEmptyException);
        assertTrue(KeeperException.create(Code.SESSIONEXPIRED) instanceof SessionExpiredException);
        assertTrue(KeeperException.create(Code.INVALIDCALLBACK) instanceof InvalidCallbackException);
        assertTrue(KeeperException.create(Code.SESSIONMOVED) instanceof SessionMovedException);
        assertTrue(KeeperException.create(Code.NOTREADONLY) instanceof NotReadOnlyException);
        assertTrue(KeeperException.create(Code.EPHEMERALONLOCALSESSION) instanceof EphemeralOnLocalSessionException);
        assertTrue(KeeperException.create(Code.NOWATCHER) instanceof NoWatcherException);
        assertTrue(KeeperException.create(Code.RECONFIGDISABLED) instanceof ReconfigDisabledException);
        assertTrue(KeeperException.create(Code.SESSIONCLOSEDREQUIRESASLAUTH)
                instanceof SessionClosedRequireAuthException);
        assertTrue(KeeperException.create(Code.REQUESTTIMEOUT) instanceof RequestTimeoutException);
        assertTrue(KeeperException.create(Code.QUOTAEXCEEDED) instanceof QuotaExceededException);
        assertTrue(KeeperException.create(Code.THROTTLEDOP) instanceof ThrottledOpException);
    }

    @Test
    public void testCreateWithPathSetsPathAndMessage() {
        KeeperException ex = KeeperException.create(Code.NONODE, "/test/path");

        assertEquals(Code.NONODE, ex.code());
        assertEquals("/test/path", ex.getPath());
        assertEquals("KeeperErrorCode = NoNode for /test/path", ex.getMessage());
    }

    @Test
    public void testDeprecatedCreateUsingIntCode() {
        KeeperException ex = KeeperException.create(Code.NODEEXISTS.intValue(), "/node");

        assertTrue(ex instanceof NodeExistsException);
        assertEquals(Code.NODEEXISTS, ex.code());
        assertEquals("/node", ex.getPath());
    }

    @Test
    public void testCreateThrowsForUnsupportedCodes() {
        try {
            KeeperException.create(Code.OK);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Invalid exception code"));
        }

        try {
            KeeperException.create(Code.UNKNOWNSESSION);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("Invalid exception code"));
        }
    }

    @Test
    public void testCodeLookupAndIntValueRoundTrip() {
        for (Code code : Code.values()) {
            assertSame(code, Code.get(code.intValue()));
        }
    }

    @Test
    public void testCodeLookupWithUnknownValueThrowsException() {
        try {
            Code.get(123456789);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertTrue(expected.getMessage().contains("cannot lookup this code"));
        }
    }

    @Test
    public void testDeprecatedSetCodeChangesCode() {
        KeeperException ex = new NoNodeException();

        ex.setCode(Code.NODEEXISTS.intValue());

        assertEquals(Code.NODEEXISTS, ex.code());
        assertEquals(Code.NODEEXISTS.intValue(), ex.getCode());
    }

    @Test
    public void testGetMessageWithoutPathWhenPathIsNull() {
        KeeperException ex = new NoNodeException();

        assertEquals("KeeperErrorCode = NoNode", ex.getMessage());
        assertNull(ex.getPath());
    }

    @Test
    public void testGetMessageWithoutPathWhenPathIsEmpty() {
        KeeperException ex = KeeperException.create(Code.NONODE, "");

        assertEquals("KeeperErrorCode = NoNode", ex.getMessage());
    }

    @Test
    public void testGetResultsReturnsNullWhenNoResultsPresent() {
        KeeperException ex = new NoNodeException();

        assertNull(ex.getResults());
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void testGetResultsReturnsDefensiveCopy() throws Exception {
        KeeperException ex = new NoNodeException();

        List original = new ArrayList();
        original.add(null);

        Method m = KeeperException.class.getDeclaredMethod("setMultiResults", List.class);
        m.setAccessible(true);
        m.invoke(ex, original);

        List returned = ex.getResults();

        assertNotNull(returned);
        assertEquals(1, returned.size());
        assertNotSame(original, returned);

        returned.clear();

        assertEquals(1, ex.getResults().size());
    }

    @Test
    public void testConstructorsWithPathPreservePathAndCode() {
        KeeperException[] exceptions = new KeeperException[] {
                new BadArgumentsException("/a"),
                new BadVersionException("/b"),
                new InvalidACLException("/c"),
                new NoChildrenForEphemeralsException("/d"),
                new NodeExistsException("/e"),
                new NoNodeException("/f"),
                new NotEmptyException("/g"),
                new NoWatcherException("/h"),
                new ReconfigDisabledException("/i"),
                new SessionClosedRequireAuthException("/j"),
                new QuotaExceededException("/k")
        };

        for (KeeperException ex : exceptions) {
            assertNotNull(ex.getPath());
            assertTrue(ex.getMessage().contains(ex.getPath()));
            assertEquals(ex.code(), Code.get(ex.getCode()));
        }
    }
}
