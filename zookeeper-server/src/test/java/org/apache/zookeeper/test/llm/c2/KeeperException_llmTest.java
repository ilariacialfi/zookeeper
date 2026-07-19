/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0.
 */
package org.apache.zookeeper.test.llm.c2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.Code;
import org.apache.zookeeper.OpResult;
import org.junit.Test;

/**
 * Tests for the public API of {@link KeeperException}.
 *
 * <p>The suite deliberately uses only constructors and methods present in
 * KeeperException.java. Package-private implementation hooks such as
 * setMultiResults are not accessed from this test package.</p>
 */
public class KeeperException_llmTest {

    private static final Code[] FACTORY_CODES = {
        Code.SYSTEMERROR,
        Code.RUNTIMEINCONSISTENCY,
        Code.DATAINCONSISTENCY,
        Code.CONNECTIONLOSS,
        Code.MARSHALLINGERROR,
        Code.UNIMPLEMENTED,
        Code.OPERATIONTIMEOUT,
        Code.NEWCONFIGNOQUORUM,
        Code.RECONFIGINPROGRESS,
        Code.BADARGUMENTS,
        Code.APIERROR,
        Code.NONODE,
        Code.NOAUTH,
        Code.BADVERSION,
        Code.NOCHILDRENFOREPHEMERALS,
        Code.NODEEXISTS,
        Code.INVALIDACL,
        Code.AUTHFAILED,
        Code.NOTEMPTY,
        Code.SESSIONEXPIRED,
        Code.INVALIDCALLBACK,
        Code.SESSIONMOVED,
        Code.NOTREADONLY,
        Code.EPHEMERALONLOCALSESSION,
        Code.NOWATCHER,
        Code.RECONFIGDISABLED,
        Code.SESSIONCLOSEDREQUIRESASLAUTH,
        Code.REQUESTTIMEOUT,
        Code.QUOTAEXCEEDED,
        Code.THROTTLEDOP
    };

    private static final Class<?>[] FACTORY_TYPES = {
        KeeperException.SystemErrorException.class,
        KeeperException.RuntimeInconsistencyException.class,
        KeeperException.DataInconsistencyException.class,
        KeeperException.ConnectionLossException.class,
        KeeperException.MarshallingErrorException.class,
        KeeperException.UnimplementedException.class,
        KeeperException.OperationTimeoutException.class,
        KeeperException.NewConfigNoQuorum.class,
        KeeperException.ReconfigInProgress.class,
        KeeperException.BadArgumentsException.class,
        KeeperException.APIErrorException.class,
        KeeperException.NoNodeException.class,
        KeeperException.NoAuthException.class,
        KeeperException.BadVersionException.class,
        KeeperException.NoChildrenForEphemeralsException.class,
        KeeperException.NodeExistsException.class,
        KeeperException.InvalidACLException.class,
        KeeperException.AuthFailedException.class,
        KeeperException.NotEmptyException.class,
        KeeperException.SessionExpiredException.class,
        KeeperException.InvalidCallbackException.class,
        KeeperException.SessionMovedException.class,
        KeeperException.NotReadOnlyException.class,
        KeeperException.EphemeralOnLocalSessionException.class,
        KeeperException.NoWatcherException.class,
        KeeperException.ReconfigDisabledException.class,
        KeeperException.SessionClosedRequireAuthException.class,
        KeeperException.RequestTimeoutException.class,
        KeeperException.QuotaExceededException.class,
        KeeperException.ThrottledOpException.class
    };

    @Test
    public void createReturnsTheSpecializedExceptionForEverySupportedCode() {
        assertEquals(FACTORY_CODES.length, FACTORY_TYPES.length);

        for (int i = 0; i < FACTORY_CODES.length; i++) {
            KeeperException exception = KeeperException.create(FACTORY_CODES[i]);

            assertSame(FACTORY_CODES[i], exception.code());
            assertEquals(FACTORY_CODES[i].intValue(), exception.getCode());
            assertEquals(FACTORY_TYPES[i], exception.getClass());
            assertNull(exception.getPath());
            assertNotNull(exception.getMessage());
        }
    }

    @Test
    public void createWithCodeAndPathStoresPathAndIncludesItInMessage() {
        String path = "/animals/otter";
        KeeperException exception = KeeperException.create(Code.NONODE, path);

        assertTrue(exception instanceof KeeperException.NoNodeException);
        assertSame(Code.NONODE, exception.code());
        assertEquals(path, exception.getPath());
        assertEquals("KeeperErrorCode = NoNode for " + path, exception.getMessage());
    }

    @Test
    public void nullAndEmptyPathsUseTheMessageWithoutForSuffix() {
        KeeperException nullPath = KeeperException.create(Code.NODEEXISTS, null);
        KeeperException emptyPath = KeeperException.create(Code.NODEEXISTS, "");

        assertEquals("KeeperErrorCode = NodeExists", nullPath.getMessage());
        assertEquals("KeeperErrorCode = NodeExists", emptyPath.getMessage());
        assertNull(nullPath.getPath());
        assertEquals("", emptyPath.getPath());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void deprecatedIntegerFactoriesDelegateToCodeLookup() {
        KeeperException withoutPath = KeeperException.create(Code.BADVERSION.intValue());
        KeeperException withPath = KeeperException.create(Code.BADVERSION.intValue(), "/versioned");

        assertTrue(withoutPath instanceof KeeperException.BadVersionException);
        assertSame(Code.BADVERSION, withoutPath.code());
        assertNull(withoutPath.getPath());

        assertTrue(withPath instanceof KeeperException.BadVersionException);
        assertSame(Code.BADVERSION, withPath.code());
        assertEquals("/versioned", withPath.getPath());
    }

    @Test
    public void factoryRejectsCodesThatDoNotRepresentConstructibleFactoryExceptions() {
        assertFactoryRejects(Code.OK);
        assertFactoryRejects(Code.UNKNOWNSESSION);
    }

    private static void assertFactoryRejects(Code code) {
        try {
            KeeperException.create(code);
            fail("Expected IllegalArgumentException for " + code);
        } catch (IllegalArgumentException expected) {
            assertEquals("Invalid exception code:" + code.intValue(), expected.getMessage());
        }
    }

    @Test
    public void codeLookupRoundTripsEveryDeclaredCode() {
        for (Code code : Code.values()) {
            assertSame(code, Code.get(code.intValue()));
        }
    }

    @Test
    public void codeLookupRejectsUnknownInteger() {
        int unknown = Integer.MAX_VALUE;
        try {
            Code.get(unknown);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(
                "The current client version cannot lookup this code:" + unknown,
                expected.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void setCodeUpdatesBothCodeAccessorsAndTheRenderedMessage() {
        KeeperException exception = new KeeperException.NoNodeException("/mutable");

        exception.setCode(Code.BADVERSION.intValue());

        assertSame(Code.BADVERSION, exception.code());
        assertEquals(Code.BADVERSION.intValue(), exception.getCode());
        assertEquals("KeeperErrorCode = BadVersion for /mutable", exception.getMessage());
    }

    @Test
    public void directPathConstructorsPreserveCodePathAndMessage() {
        String path = "/direct";
        KeeperException[] exceptions = {
            new KeeperException.BadArgumentsException(path),
            new KeeperException.BadVersionException(path),
            new KeeperException.InvalidACLException(path),
            new KeeperException.NoChildrenForEphemeralsException(path),
            new KeeperException.NodeExistsException(path),
            new KeeperException.NoNodeException(path),
            new KeeperException.NotEmptyException(path),
            new KeeperException.NoWatcherException(path),
            new KeeperException.ReconfigDisabledException(path),
            new KeeperException.SessionClosedRequireAuthException(path),
            new KeeperException.QuotaExceededException(path)
        };
        Code[] expectedCodes = {
            Code.BADARGUMENTS,
            Code.BADVERSION,
            Code.INVALIDACL,
            Code.NOCHILDRENFOREPHEMERALS,
            Code.NODEEXISTS,
            Code.NONODE,
            Code.NOTEMPTY,
            Code.NOWATCHER,
            Code.RECONFIGDISABLED,
            Code.SESSIONCLOSEDREQUIRESASLAUTH,
            Code.QUOTAEXCEEDED
        };

        assertEquals(expectedCodes.length, exceptions.length);
        for (int i = 0; i < exceptions.length; i++) {
            assertSame(expectedCodes[i], exceptions[i].code());
            assertEquals(path, exceptions[i].getPath());
            assertTrue(exceptions[i].getMessage().endsWith(" for " + path));
        }
    }

    @Test
    public void specializedConstructorsExposeExpectedHumanReadableMessages() {
        Object[][] cases = {
            { new KeeperException.SystemErrorException(), "SystemError" },
            { new KeeperException.RuntimeInconsistencyException(), "RuntimeInconsistency" },
            { new KeeperException.DataInconsistencyException(), "DataInconsistency" },
            { new KeeperException.ConnectionLossException(), "ConnectionLoss" },
            { new KeeperException.MarshallingErrorException(), "MarshallingError" },
            { new KeeperException.NewConfigNoQuorum(), "NewConfigNoQuorum" },
            { new KeeperException.ReconfigInProgress(), "ReconfigInProgress" },
            { new KeeperException.UnimplementedException(), "Unimplemented" },
            { new KeeperException.OperationTimeoutException(), "OperationTimeout" },
            { new KeeperException.BadArgumentsException(), "BadArguments" },
            { new KeeperException.APIErrorException(), "APIError" },
            { new KeeperException.NoNodeException(), "NoNode" },
            { new KeeperException.NoAuthException(), "NoAuth" },
            { new KeeperException.BadVersionException(), "BadVersion" },
            { new KeeperException.NoChildrenForEphemeralsException(), "NoChildrenForEphemerals" },
            { new KeeperException.NodeExistsException(), "NodeExists" },
            { new KeeperException.InvalidACLException(), "InvalidACL" },
            { new KeeperException.AuthFailedException(), "AuthFailed" },
            { new KeeperException.NotEmptyException(), "Directory not empty" },
            { new KeeperException.SessionExpiredException(), "Session expired" },
            { new KeeperException.InvalidCallbackException(), "Invalid callback" },
            { new KeeperException.SessionMovedException(), "Session moved" },
            { new KeeperException.NotReadOnlyException(), "Not a read-only call" },
            { new KeeperException.EphemeralOnLocalSessionException(), "Ephemeral node on local session" },
            { new KeeperException.NoWatcherException(), "No such watcher" },
            { new KeeperException.ReconfigDisabledException(), "Reconfig is disabled" },
            { new KeeperException.SessionClosedRequireAuthException(), "Session closed because client failed to authenticate" },
            { new KeeperException.QuotaExceededException(), "Quota has exceeded" },
            { new KeeperException.ThrottledOpException(), "Op throttled due to high load" }
        };

        for (Object[] testCase : cases) {
            KeeperException exception = (KeeperException) testCase[0];
            assertEquals("KeeperErrorCode = " + testCase[1], exception.getMessage());
        }
    }

    @Test
    public void codesWithoutDedicatedMessageUseUnknownErrorFallback() {
        KeeperException unknownSession = new KeeperException.UnknownSessionException();
        KeeperException requestTimeout = new KeeperException.RequestTimeoutException();

        assertEquals("KeeperErrorCode = Unknown error UNKNOWNSESSION", unknownSession.getMessage());
        assertEquals("KeeperErrorCode = Unknown error REQUESTTIMEOUT", requestTimeout.getMessage());
    }

    @Test
    public void resultsAreNullForANonMultiException() {
        KeeperException exception = new KeeperException.ConnectionLossException();
        List<OpResult> results = exception.getResults();

        assertNull(results);
    }

    @Test
    public void separateFactoryCallsReturnIndependentInstances() {
        KeeperException first = KeeperException.create(Code.NONODE, "/first");
        KeeperException second = KeeperException.create(Code.NONODE, "/second");

        assertNotSame(first, second);
        assertEquals("/first", first.getPath());
        assertEquals("/second", second.getPath());
    }
}
