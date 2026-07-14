package org.apache.zookeeper.test.llm.c3;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
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
import org.apache.zookeeper.OpResult;
import org.junit.Test;

public class KeeperException_llmTest {

    @Test
    public void testCodeLookupRoundTripForEveryEnumValue() {
        for (Code code : Code.values()) {
            assertSame(code, Code.get(code.intValue()));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCodeLookupInvalidValueThrows() {
        Code.get(123456789);
    }

    @Test
    public void testCreateReturnsExpectedSubclassForRepresentativeCodes() {
        assertTrue(KeeperException.create(Code.SYSTEMERROR)
                instanceof SystemErrorException);

        assertTrue(KeeperException.create(Code.RUNTIMEINCONSISTENCY)
                instanceof RuntimeInconsistencyException);

        assertTrue(KeeperException.create(Code.DATAINCONSISTENCY)
                instanceof DataInconsistencyException);

        assertTrue(KeeperException.create(Code.CONNECTIONLOSS)
                instanceof ConnectionLossException);

        assertTrue(KeeperException.create(Code.MARSHALLINGERROR)
                instanceof MarshallingErrorException);

        assertTrue(KeeperException.create(Code.UNIMPLEMENTED)
                instanceof UnimplementedException);

        assertTrue(KeeperException.create(Code.OPERATIONTIMEOUT)
                instanceof OperationTimeoutException);

        assertTrue(KeeperException.create(Code.BADARGUMENTS)
                instanceof BadArgumentsException);

        assertTrue(KeeperException.create(Code.APIERROR)
                instanceof APIErrorException);

        assertTrue(KeeperException.create(Code.NONODE)
                instanceof NoNodeException);

        assertTrue(KeeperException.create(Code.NOAUTH)
                instanceof NoAuthException);

        assertTrue(KeeperException.create(Code.BADVERSION)
                instanceof BadVersionException);

        assertTrue(KeeperException.create(Code.NOCHILDRENFOREPHEMERALS)
                instanceof NoChildrenForEphemeralsException);

        assertTrue(KeeperException.create(Code.NODEEXISTS)
                instanceof NodeExistsException);

        assertTrue(KeeperException.create(Code.INVALIDACL)
                instanceof InvalidACLException);

        assertTrue(KeeperException.create(Code.AUTHFAILED)
                instanceof AuthFailedException);

        assertTrue(KeeperException.create(Code.NOTEMPTY)
                instanceof NotEmptyException);

        assertTrue(KeeperException.create(Code.SESSIONEXPIRED)
                instanceof SessionExpiredException);

        assertTrue(KeeperException.create(Code.INVALIDCALLBACK)
                instanceof InvalidCallbackException);

        assertTrue(KeeperException.create(Code.SESSIONMOVED)
                instanceof SessionMovedException);

        assertTrue(KeeperException.create(Code.NOTREADONLY)
                instanceof NotReadOnlyException);

        assertTrue(KeeperException.create(Code.EPHEMERALONLOCALSESSION)
                instanceof EphemeralOnLocalSessionException);

        assertTrue(KeeperException.create(Code.NOWATCHER)
                instanceof NoWatcherException);

        assertTrue(KeeperException.create(Code.RECONFIGDISABLED)
                instanceof ReconfigDisabledException);

        assertTrue(KeeperException.create(Code.SESSIONCLOSEDREQUIRESASLAUTH)
                instanceof SessionClosedRequireAuthException);

        assertTrue(KeeperException.create(Code.REQUESTTIMEOUT)
                instanceof RequestTimeoutException);

        assertTrue(KeeperException.create(Code.QUOTAEXCEEDED)
                instanceof QuotaExceededException);

        assertTrue(KeeperException.create(Code.THROTTLEDOP)
                instanceof ThrottledOpException);

        assertTrue(KeeperException.create(Code.NEWCONFIGNOQUORUM)
                instanceof NewConfigNoQuorum);

        assertTrue(KeeperException.create(Code.RECONFIGINPROGRESS)
                instanceof ReconfigInProgress);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithOkCodeThrows() {
        KeeperException.create(Code.OK);
    }

    @Test
    public void testCreateWithPathSetsPathAndMessage() {
        KeeperException ex =
                KeeperException.create(Code.NONODE, "/test/path");

        assertEquals(Code.NONODE, ex.code());
        assertEquals("/test/path", ex.getPath());
        assertEquals(
                "KeeperErrorCode = NoNode for /test/path",
                ex.getMessage());
    }

    @Test
    public void testDeprecatedCreateUsingIntCode() {
        KeeperException ex =
                KeeperException.create(Code.NONODE.intValue(), "/legacy");

        assertTrue(ex instanceof NoNodeException);
        assertEquals("/legacy", ex.getPath());
        assertEquals(Code.NONODE, ex.code());
    }

    @Test
    public void testMessageWithoutPathUsesShortFormat() {
        KeeperException ex = new NoAuthException();

        assertEquals(
                "KeeperErrorCode = NoAuth",
                ex.getMessage());
    }

    @Test
    public void testMessageWithEmptyPathUsesShortFormat() {
        KeeperException ex = new NoNodeException("");

        assertEquals(
                "KeeperErrorCode = NoNode",
                ex.getMessage());
    }

    @Test
    public void testPathConstructorsPreservePath() {
        KeeperException ex1 = new NodeExistsException("/node");
        assertEquals("/node", ex1.getPath());

        KeeperException ex2 = new BadVersionException("/version");
        assertEquals("/version", ex2.getPath());

        KeeperException ex3 = new InvalidACLException("/acl");
        assertEquals("/acl", ex3.getPath());

        KeeperException ex4 = new NoChildrenForEphemeralsException("/e");
        assertEquals("/e", ex4.getPath());

        KeeperException ex5 = new NotEmptyException("/dir");
        assertEquals("/dir", ex5.getPath());
    }

    @Test
    public void testSetCodeChangesReportedCode() {
        KeeperException ex = new NoNodeException();

        assertEquals(Code.NONODE, ex.code());

        ex.setCode(Code.NOAUTH.intValue());

        assertEquals(Code.NOAUTH, ex.code());
        assertEquals(Code.NOAUTH.intValue(), ex.getCode());
    }

    @Test
    public void testGetResultsInitiallyNull() {
        KeeperException ex = new NoNodeException();

        assertNull(ex.getResults());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testGetResultsReturnsDefensiveCopy() throws Exception {
        KeeperException ex = new NoNodeException();

        List<OpResult> original = new ArrayList<OpResult>();

        Method setter =
                KeeperException.class.getDeclaredMethod(
                        "setMultiResults",
                        List.class);
        setter.setAccessible(true);
        setter.invoke(ex, original);

        List<OpResult> copy1 = ex.getResults();
        List<OpResult> copy2 = ex.getResults();

        assertNotNull(copy1);
        assertNotSame(original, copy1);
        assertNotSame(copy1, copy2);

        copy1.add(null);

        assertEquals(0, ex.getResults().size());
    }

    @Test
    public void testMessagesCoverAdditionalBranches() {
        assertEquals(
                "KeeperErrorCode = Directory not empty",
                new NotEmptyException().getMessage());

        assertEquals(
                "KeeperErrorCode = Session expired",
                new SessionExpiredException().getMessage());

        assertEquals(
                "KeeperErrorCode = No such watcher",
                new NoWatcherException().getMessage());

        assertEquals(
                "KeeperErrorCode = Reconfig is disabled",
                new ReconfigDisabledException().getMessage());

        assertEquals(
                "KeeperErrorCode = Session closed because client failed to authenticate",
                new SessionClosedRequireAuthException().getMessage());

        assertEquals(
                "KeeperErrorCode = Quota has exceeded",
                new QuotaExceededException().getMessage());

        assertEquals(
                "KeeperErrorCode = Op throttled due to high load",
                new ThrottledOpException().getMessage());
    }
}