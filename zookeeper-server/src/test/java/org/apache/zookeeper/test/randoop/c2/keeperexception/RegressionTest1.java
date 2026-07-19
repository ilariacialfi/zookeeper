package org.apache.zookeeper.test.randoop.c2.keeperexception;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-112), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException3 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noChildrenForEphemeralsException3.getResults();
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        quotaExceededException1.addSuppressed((java.lang.Throwable) badVersionException3);
        int int5 = badVersionException3.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-103) + "'", int5 == (-103));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.String str2 = badArgumentsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = badArgumentsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        java.lang.String str2 = requestTimeoutException0.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str2, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noNodeException1.getResults();
        int int3 = noNodeException1.getCode();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        int int3 = badArgumentsException1.getCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = noNodeException1.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-108) + "'", int3 == (-108));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Throwable[] throwableArray3 = newConfigNoQuorum2.getSuppressed();
        int int4 = newConfigNoQuorum2.getCode();
        noWatcherException1.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        int int6 = noWatcherException1.getCode();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-121) + "'", int6 == (-121));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-112), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code4);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) badVersionException3);
        sessionClosedRequireAuthException1.setCode((-119));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.lang.String str1 = badArgumentsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-14));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.lang.String str1 = runtimeInconsistencyException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str1, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        int int8 = code5.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-114) + "'", int8 == (-114));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.AUTHFAILED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str3, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        org.apache.zookeeper.KeeperException.Code code6 = sessionClosedRequireAuthException4.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        java.lang.String str2 = sessionClosedRequireAuthException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError" + "'", str2, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) '4', "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-4));
        keeperException1.setCode((-12));
        java.lang.String str4 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION" + "'", str4, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        nodeExistsException0.addSuppressed((java.lang.Throwable) keeperException4);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = nodeExistsException0.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int5 = noNodeException4.getCode();
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-3));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException0 = new org.apache.zookeeper.KeeperException.BadVersionException();
        badVersionException0.setCode((-13));
        java.lang.String str3 = badVersionException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum" + "'", str3, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        int int6 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.Class<?> wildcardClass5 = keeperException4.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-100), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = quotaExceededException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = quotaExceededException1.code();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 100, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        java.lang.String str2 = authFailedException0.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = authFailedException0.getResults();
        // The following exception was thrown during execution in test generation
        try {
            authFailedException0.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noNodeException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Class<?> wildcardClass2 = runtimeInconsistencyException0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-2), "");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) -1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 10, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(0);
        int int2 = code1.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-8));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = runtimeInconsistencyException0.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = runtimeInconsistencyException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = runtimeInconsistencyException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(10, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-4));
        keeperException1.setCode((-120));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int2 = noWatcherException1.getCode();
        noWatcherException1.setCode((-108));
        org.apache.zookeeper.KeeperException.Code code5 = noWatcherException1.code();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-102), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badVersionException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = quotaExceededException5.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNull(opResultList8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = runtimeInconsistencyException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = runtimeInconsistencyException0.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.AUTHFAILED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-114));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException2 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int3 = nodeExistsException2.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException5 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException2.addSuppressed((java.lang.Throwable) nodeExistsException5);
        nodeExistsException1.addSuppressed((java.lang.Throwable) nodeExistsException5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = invalidACLException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3);
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException4.getResults();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) '#', "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 10, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = sessionClosedRequireAuthException1.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = sessionClosedRequireAuthException1.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.Class<?> wildcardClass4 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-114) + "'", int3 == (-114));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        java.lang.String str4 = notEmptyException1.getPath();
        java.lang.Class<?> wildcardClass5 = notEmptyException1.getClass();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-100));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError" + "'", str2, "org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = noChildrenForEphemeralsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-115), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        int int8 = quotaExceededException5.getCode();
        java.lang.Throwable[] throwableArray9 = quotaExceededException5.getSuppressed();
        int int10 = quotaExceededException5.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-125) + "'", int10 == (-125));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        sessionClosedRequireAuthException1.setCode((-4));
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = sessionClosedRequireAuthException1.getResults();
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        int int5 = nodeExistsException0.getCode();
        int int6 = nodeExistsException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-110) + "'", int6 == (-110));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-112));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass6 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("hi!");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = quotaExceededException1.code();
        java.lang.Throwable[] throwableArray4 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
        java.lang.Throwable[] throwableArray2 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = runtimeInconsistencyException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = runtimeInconsistencyException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        int int5 = code2.intValue();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        keeperException2.setCode((-108));
        java.lang.String str5 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!" + "'", str5, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        java.lang.Throwable[] throwableArray3 = notEmptyException1.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException1.getResults();
        // The following exception was thrown during execution in test generation
        try {
            notEmptyException1.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        notEmptyException1.addSuppressed((java.lang.Throwable) noWatcherException3);
        java.lang.Throwable[] throwableArray5 = notEmptyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.zookeeper.KeeperException.UnimplementedException unimplementedException0 = new org.apache.zookeeper.KeeperException.UnimplementedException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        unimplementedException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        org.apache.zookeeper.KeeperException.Code code6 = badArgumentsException4.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        int int2 = sessionClosedRequireAuthException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-120));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
        java.lang.Class<?> wildcardClass4 = keeperException3.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION;
        int int1 = code0.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-125) + "'", int3 == (-125));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-12));
        int int2 = code1.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        java.lang.Throwable[] throwableArray3 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException0 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Throwable[] throwableArray2 = newConfigNoQuorum1.getSuppressed();
        sessionClosedRequireAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum1);
        org.apache.zookeeper.KeeperException.Code code4 = sessionClosedRequireAuthException0.code();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        keeperException3.setCode((-8));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        reconfigDisabledException1.setCode((-112));
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        int int9 = invalidACLException7.getCode();
        int int10 = invalidACLException7.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-114) + "'", int10 == (-114));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        int int2 = quotaExceededException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125) + "'", int2 == (-125));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Throwable[] throwableArray1 = newConfigNoQuorum0.getSuppressed();
        int int2 = newConfigNoQuorum0.getCode();
        java.lang.String str3 = newConfigNoQuorum0.getPath();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = reconfigDisabledException1.getCode();
        int int3 = reconfigDisabledException1.getCode();
        int int4 = reconfigDisabledException1.getCode();
        java.lang.String str5 = reconfigDisabledException1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-123) + "'", int3 == (-123));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-123) + "'", int4 == (-123));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str5, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException0 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        java.lang.Throwable[] throwableArray1 = sessionMovedException0.getSuppressed();
        java.lang.String str2 = sessionMovedException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        java.lang.Class<?> wildcardClass1 = quotaExceededException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException1 = new org.apache.zookeeper.KeeperException.NoAuthException();
        marshallingErrorException0.addSuppressed((java.lang.Throwable) noAuthException1);
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = noAuthException1.getResults();
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        int int2 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = sessionClosedRequireAuthException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-114));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        int int3 = badVersionException1.getCode();
        java.lang.String str4 = badVersionException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str4, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("hi!");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            noNodeException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int5 = noNodeException4.getCode();
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        org.apache.zookeeper.KeeperException.Code code7 = noNodeException4.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-118));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONMOVED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONMOVED));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.String str4 = keeperException3.getPath();
        java.lang.String str5 = keeperException3.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str4, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str5, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException4 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        keeperException2.addSuppressed((java.lang.Throwable) badVersionException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException10 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
        keeperException8.addSuppressed((java.lang.Throwable) badVersionException10);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-103));
        keeperException1.setCode((-4));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        java.lang.String str3 = notEmptyException1.getPath();
        notEmptyException1.setCode((-14));
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102) + "'", int1 == (-102));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-127), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Throwable[] throwableArray3 = newConfigNoQuorum2.getSuppressed();
        int int4 = newConfigNoQuorum2.getCode();
        noWatcherException1.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str6 = noWatcherException1.getPath();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str6, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = invalidACLException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.get((-2));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) keeperException5);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        int int3 = quotaExceededException1.getCode();
        java.lang.String str4 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-125) + "'", int3 == (-125));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str4, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException8 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException6.addSuppressed((java.lang.Throwable) quotaExceededException8);
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException8);
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) quotaExceededException8);
        int int12 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-123) + "'", int12 == (-123));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        badArgumentsException0.setCode((-8));
        org.junit.Assert.assertNull(opResultList1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        org.apache.zookeeper.KeeperException.Code code9 = runtimeInconsistencyException0.code();
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        noNodeException1.setCode((-124));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        int int5 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-12));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int8 = keeperException7.getCode();
        keeperException4.addSuppressed((java.lang.Throwable) keeperException7);
        org.apache.zookeeper.KeeperException.Code code10 = keeperException4.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException6);
        java.lang.Throwable[] throwableArray9 = quotaExceededException6.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        java.lang.Throwable[] throwableArray2 = invalidACLException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        java.lang.String str2 = noChildrenForEphemeralsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-13) + "'", int1 == (-13));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = noNodeException1.getPath();
        java.lang.String str3 = noNodeException1.getPath();
        noNodeException1.setCode((-101));
        noNodeException1.setCode((-112));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str3, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-112));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int6 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-112) + "'", int6 == (-112));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = sessionClosedRequireAuthException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException0 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        java.lang.Throwable[] throwableArray1 = sessionMovedException0.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionMovedException0.getResults();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int5 = nodeExistsException4.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException7 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException4.addSuppressed((java.lang.Throwable) nodeExistsException7);
        invalidCallbackException2.addSuppressed((java.lang.Throwable) nodeExistsException7);
        invalidCallbackException2.setCode(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-121), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        java.lang.Throwable[] throwableArray5 = keeperException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = badArgumentsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-110), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        // The following exception was thrown during execution in test generation
        try {
            sessionClosedRequireAuthException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException3 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code4 = noNodeException3.code();
        invalidACLException1.addSuppressed((java.lang.Throwable) noNodeException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        int int2 = keeperException1.getCode();
        keeperException1.setCode((-8));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Throwable[] throwableArray6 = keeperException5.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        keeperException2.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        java.lang.Class<?> wildcardClass6 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        keeperException2.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code7 = keeperException6.code();
        int int8 = code7.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        badArgumentsException1.setCode((-120));
        java.lang.Throwable[] throwableArray4 = badArgumentsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        java.lang.String str1 = marshallingErrorException0.getPath();
        marshallingErrorException0.setCode((-110));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int4 = keeperException3.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-110), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        int int4 = keeperException2.getCode();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-110) + "'", int4 == (-110));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-124), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str3, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException1.setCode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str4 = keeperException3.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Class<?> wildcardClass2 = badVersionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.String str3 = keeperException2.getPath();
        int int4 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        noChildrenForEphemeralsException1.setCode((-5));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-120) + "'", int1 == (-120));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-118), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        int int2 = sessionClosedRequireAuthException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-121));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int2 = badArgumentsException1.getCode();
        badArgumentsException1.setCode((-118));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        badArgumentsException1.addSuppressed((java.lang.Throwable) quotaExceededException6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
        org.apache.zookeeper.KeeperException.Code code1 = reconfigInProgress0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        keeperException2.setCode((-12));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException2.code();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-12), "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        badArgumentsException1.setCode((-120));
        int int4 = badArgumentsException1.getCode();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException8 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noChildrenForEphemeralsException6.addSuppressed((java.lang.Throwable) badVersionException8);
        int int10 = badVersionException8.getCode();
        badArgumentsException1.addSuppressed((java.lang.Throwable) badVersionException8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-120) + "'", int4 == (-120));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-103) + "'", int10 == (-103));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = quotaExceededException2.getResults();
        throttledOpException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        throttledOpException0.setCode((int) (byte) 0);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = quotaExceededException1.code();
        int int4 = quotaExceededException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-125) + "'", int4 == (-125));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
        org.apache.zookeeper.KeeperException.Code code1 = reconfigInProgress0.code();
        int int2 = code1.intValue();
        int int3 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-124) + "'", int1 == (-124));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        keeperException2.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-3), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code5 = noChildrenForEphemeralsException4.code();
        keeperException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        java.lang.String str7 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str7, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        java.lang.String str3 = keeperException1.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException1 = new org.apache.zookeeper.KeeperException.NoAuthException();
        marshallingErrorException0.addSuppressed((java.lang.Throwable) noAuthException1);
        marshallingErrorException0.setCode((-7));
        int int5 = marshallingErrorException0.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-13));
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        keeperException3.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException3);
        int int7 = noNodeException1.getCode();
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        int int1 = authFailedException0.getCode();
        java.lang.Class<?> wildcardClass2 = authFailedException0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115) + "'", int1 == (-115));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
        org.apache.zookeeper.KeeperException.Code code1 = reconfigInProgress0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        int int3 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1);
        int int5 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-14) + "'", int5 == (-14));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        org.apache.zookeeper.KeeperException.Code code5 = keeperException3.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        java.lang.Throwable[] throwableArray4 = keeperException2.getSuppressed();
        java.lang.Class<?> wildcardClass5 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        notEmptyException1.setCode((-122));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code7 = keeperException6.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7, "hi!");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int2 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException3.getResults();
        invalidACLException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        java.lang.Class<?> wildcardClass6 = invalidACLException1.getClass();
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-6), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str3, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-100), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
        nodeExistsException1.setCode((-2));
        java.lang.Class<?> wildcardClass4 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        int int2 = noNodeException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-119));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int5 = keeperException4.getCode();
        keeperException4.setCode((-119));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        java.lang.String str4 = nodeExistsException1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str4, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.Class<?> wildcardClass3 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException0 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Throwable[] throwableArray2 = newConfigNoQuorum1.getSuppressed();
        sessionClosedRequireAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum1);
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = newConfigNoQuorum1.getResults();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-108) + "'", int1 == (-108));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException0 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        java.lang.Throwable[] throwableArray1 = sessionMovedException0.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code2 = sessionMovedException0.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONMOVED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONMOVED));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException0 = new org.apache.zookeeper.KeeperException.NoNodeException();
        int int1 = noNodeException0.getCode();
        noNodeException0.setCode((-121));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101) + "'", int1 == (-101));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-14));
        int int2 = code1.intValue();
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        java.lang.String str2 = noNodeException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-127));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        badVersionException1.setCode((-112));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        int int2 = nodeExistsException1.getCode();
        java.lang.Throwable[] throwableArray3 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException6);
        int int9 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-13));
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        keeperException3.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException3);
        org.apache.zookeeper.KeeperException.Code code7 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code7);
        keeperException3.addSuppressed((java.lang.Throwable) keeperException10);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.String str3 = keeperException2.getPath();
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException4 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        keeperException2.addSuppressed((java.lang.Throwable) sessionExpiredException4);
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException7 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        sessionExpiredException4.addSuppressed((java.lang.Throwable) badArgumentsException7);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-13));
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException3 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        keeperException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException1.code();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = invalidACLException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        quotaExceededException1.addSuppressed((java.lang.Throwable) nodeExistsException4);
        org.apache.zookeeper.KeeperException.Code code6 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException10 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException8.addSuppressed((java.lang.Throwable) badArgumentsException10);
        int int12 = badArgumentsException10.getCode();
        nodeExistsException4.addSuppressed((java.lang.Throwable) badArgumentsException10);
        java.lang.String str14 = badArgumentsException10.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) badVersionException3);
        java.lang.String str5 = badVersionException3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str5, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        noAuthException0.setCode(0);
        java.lang.Throwable[] throwableArray8 = noAuthException0.getSuppressed();
        java.lang.String str9 = noAuthException0.getPath();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        java.lang.Class<?> wildcardClass5 = keeperException4.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException5.getResults();
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException5);
        org.apache.zookeeper.KeeperException.Code code8 = invalidACLException1.code();
        java.lang.Throwable[] throwableArray9 = invalidACLException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        int int3 = quotaExceededException1.getCode();
        quotaExceededException1.setCode((-100));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-125) + "'", int3 == (-125));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        int int4 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-12));
        int int2 = code1.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12) + "'", int2 == (-12));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-124), "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Class<?> wildcardClass2 = invalidACLException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int2 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-6));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-3), "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int5 = noNodeException4.getCode();
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        java.lang.String str7 = noNodeException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str7, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        noAuthException0.setCode(0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = noAuthException0.getResults();
        java.lang.Throwable[] throwableArray9 = noAuthException0.getSuppressed();
        java.lang.String str10 = noAuthException0.getPath();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = keeperException2.getClass();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = quotaExceededException1.getResults();
        java.lang.Throwable[] throwableArray3 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = badArgumentsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = keeperException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty" + "'", str3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        notEmptyException1.setCode(0);
        java.lang.String str4 = notEmptyException1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str4, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-13));
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException3 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        keeperException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException3);
        java.lang.String str5 = noChildrenForEphemeralsException3.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        noChildrenForEphemeralsException1.setCode((-12));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.String str6 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str6, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        quotaExceededException1.addSuppressed((java.lang.Throwable) nodeExistsException4);
        quotaExceededException1.setCode((-125));
        java.lang.String str8 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str8, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str3, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException3 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.Code code4 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "");
        java.lang.String str7 = keeperException6.getPath();
        invalidACLException3.addSuppressed((java.lang.Throwable) keeperException6);
        java.lang.Throwable[] throwableArray9 = invalidACLException3.getSuppressed();
        notEmptyException1.addSuppressed((java.lang.Throwable) invalidACLException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        java.lang.Throwable[] throwableArray3 = badVersionException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        int int2 = nodeExistsException1.getCode();
        java.lang.String str3 = nodeExistsException1.getPath();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str3, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        int int4 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4) + "'", int4 == (-4));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException.Code code3 = noChildrenForEphemeralsException1.code();
        java.lang.Class<?> wildcardClass4 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
        noNodeException1.setCode((-113));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        int int2 = badArgumentsException0.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = badArgumentsException0.code();
        java.lang.Class<?> wildcardClass4 = code3.getClass();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException7 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        invalidACLException1.addSuppressed((java.lang.Throwable) noNodeException7);
        invalidACLException1.setCode((-14));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-114), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        int int3 = noWatcherException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
        java.lang.Class<?> wildcardClass4 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str8 = keeperException7.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str8, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        int int4 = noWatcherException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        sessionClosedRequireAuthException4.setCode((-4));
        keeperException2.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = sessionClosedRequireAuthException4.getResults();
        java.lang.String str9 = sessionClosedRequireAuthException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str9, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        java.lang.String str5 = keeperException4.getPath();
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        java.lang.Throwable[] throwableArray7 = invalidACLException1.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code8 = invalidACLException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-6), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-6));
        keeperException1.setCode((-3));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        badArgumentsException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-102));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        int int6 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-102) + "'", int6 == (-102));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        invalidACLException1.setCode((-113));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.String str3 = noWatcherException1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str3, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        authFailedException0.setCode((-119));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        quotaExceededException1.addSuppressed((java.lang.Throwable) nodeExistsException4);
        org.apache.zookeeper.KeeperException.Code code6 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException10 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException8.addSuppressed((java.lang.Throwable) badArgumentsException10);
        int int12 = badArgumentsException10.getCode();
        nodeExistsException4.addSuppressed((java.lang.Throwable) badArgumentsException10);
        java.lang.Throwable[] throwableArray14 = badArgumentsException10.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException10.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-5));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException2 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        java.lang.Throwable[] throwableArray3 = noChildrenForEphemeralsException2.getSuppressed();
        notEmptyException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException2);
        int int5 = noChildrenForEphemeralsException2.getCode();
        java.lang.Class<?> wildcardClass6 = noChildrenForEphemeralsException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        java.lang.Throwable[] throwableArray2 = notEmptyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        int int6 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-111) + "'", int3 == (-111));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-111) + "'", int6 == (-111));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.Class<?> wildcardClass2 = badArgumentsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }
}

