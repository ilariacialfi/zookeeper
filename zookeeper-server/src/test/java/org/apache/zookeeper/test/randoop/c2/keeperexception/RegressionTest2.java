package org.apache.zookeeper.test.randoop.c2.keeperexception;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = badArgumentsException4.getResults();
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException8 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        badArgumentsException4.addSuppressed((java.lang.Throwable) noNodeException8);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException6);
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        noWatcherException1.setCode((-3));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException.Code code2 = reconfigDisabledException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noChildrenForEphemeralsException1.setCode(0);
        org.apache.zookeeper.KeeperException.Code code4 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        badArgumentsException1.setCode((-111));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        java.lang.String str2 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = authFailedException0.code();
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException5 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        authFailedException0.addSuppressed((java.lang.Throwable) invalidACLException5);
        authFailedException0.setCode((-127));
        java.lang.Throwable[] throwableArray9 = authFailedException0.getSuppressed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113) + "'", int3 == (-113));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException6 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        keeperException4.addSuppressed((java.lang.Throwable) badVersionException6);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        int int7 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-8) + "'", int7 == (-8));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int5 = noNodeException4.getCode();
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        java.lang.Throwable[] throwableArray7 = keeperException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-100));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = nodeExistsException0.getResults();
        org.junit.Assert.assertNull(opResultList1);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException1.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int5 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3) + "'", int5 == (-3));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        int int6 = badArgumentsException4.getCode();
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException8 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Throwable[] throwableArray9 = badArgumentsException8.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = badArgumentsException8.getResults();
        badArgumentsException4.addSuppressed((java.lang.Throwable) badArgumentsException8);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.String str6 = badArgumentsException4.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str6, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-4), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = keeperException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = sessionClosedRequireAuthException1.code();
        int int4 = code3.intValue();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        int int5 = code3.intValue();
        int int6 = code3.intValue();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-111) + "'", int5 == (-111));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-111) + "'", int6 == (-111));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        java.lang.Throwable[] throwableArray3 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        int int5 = nodeExistsException0.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = nodeExistsException0.getResults();
        java.lang.String str7 = nodeExistsException0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str7, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        // The following exception was thrown during execution in test generation
        try {
            quotaExceededException1.setCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException6 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        keeperException4.addSuppressed((java.lang.Throwable) noWatcherException6);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-122) + "'", int2 == (-122));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        java.lang.String str2 = badArgumentsException0.getPath();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-120));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-120) + "'", int3 == (-120));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        badVersionException1.setCode((int) (byte) -1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.Class<?> wildcardClass4 = authFailedException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-120));
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException2 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        keeperException1.addSuppressed((java.lang.Throwable) sessionMovedException2);
        java.lang.Throwable[] throwableArray4 = sessionMovedException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.Throwable[] throwableArray6 = keeperException2.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNull(opResultList7);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-103));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        keeperException1.setCode((-12));
        java.lang.Throwable[] throwableArray4 = keeperException1.getSuppressed();
        java.lang.String str5 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION" + "'", str5, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = invalidACLException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5);
        java.lang.Throwable[] throwableArray9 = keeperException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noNodeException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        noNodeException1.setCode((-2));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        java.lang.String str9 = runtimeInconsistencyException0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str9, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        java.lang.Class<?> wildcardClass7 = code5.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        int int9 = invalidACLException7.getCode();
        java.lang.Throwable[] throwableArray10 = invalidACLException7.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code11 = invalidACLException7.code();
        int int12 = code11.intValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code11 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code11.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-114) + "'", int12 == (-114));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException5.getResults();
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException5);
        org.apache.zookeeper.KeeperException.Code code8 = invalidACLException1.code();
        invalidACLException1.setCode((-6));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = nodeExistsException1.getPath();
        nodeExistsException1.setCode(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = keeperException7.getResults();
        org.apache.zookeeper.KeeperException.Code code9 = keeperException7.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNull(opResultList8);
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noNodeException1.setCode((-8));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3);
        java.lang.Throwable[] throwableArray7 = keeperException6.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = reconfigDisabledException1.code();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        int int2 = quotaExceededException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125) + "'", int2 == (-125));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException0 = new org.apache.zookeeper.KeeperException.NoNodeException();
        int int1 = noNodeException0.getCode();
        int int2 = noNodeException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101) + "'", int1 == (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        // The following exception was thrown during execution in test generation
        try {
            notEmptyException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = systemErrorException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = systemErrorException0.code();
        org.apache.zookeeper.KeeperException.Code code3 = systemErrorException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        int int5 = code3.intValue();
        int int6 = code3.intValue();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException3 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException3.code();
        authFailedException3.setCode((-7));
        keeperException2.addSuppressed((java.lang.Throwable) authFailedException3);
        authFailedException3.setCode((-103));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
        org.apache.zookeeper.KeeperException.Code code1 = reconfigInProgress0.code();
        int int2 = code1.intValue();
        int int3 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        int int6 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-14) + "'", int6 == (-14));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.Class<?> wildcardClass5 = keeperException4.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        java.lang.String str5 = keeperException3.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency" + "'", str5, "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int3 = keeperException2.getCode();
        java.lang.Class<?> wildcardClass4 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-123));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OK;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code5);
        java.lang.String str11 = keeperException10.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str11, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3);
        java.lang.String str7 = keeperException6.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str8 = keeperException7.getPath();
        java.lang.String str9 = keeperException7.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigInProgress: KeeperErrorCode = ReconfigInProgress" + "'", str9, "org.apache.zookeeper.KeeperException$ReconfigInProgress: KeeperErrorCode = ReconfigInProgress");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        noAuthException0.setCode(0);
        int int8 = noAuthException0.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        badVersionException1.setCode((-113));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = invalidACLException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-112));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int4 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-112) + "'", int4 == (-112));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        int int4 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-101), "");
        java.lang.String str3 = keeperException2.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Throwable[] throwableArray2 = keeperException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-6));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = quotaExceededException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3);
        int int7 = code3.intValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-125) + "'", int7 == (-125));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-6));
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        int int8 = quotaExceededException5.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = quotaExceededException5.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-125) + "'", int8 == (-125));
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.AUTHFAILED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        int int6 = code5.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-115) + "'", int6 == (-115));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.util.List<org.apache.zookeeper.OpResult> opResultList15 = badArgumentsException10.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList15);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = keeperException1.code();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException5.getResults();
        keeperException5.setCode((-3));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        java.lang.String str3 = invalidACLException1.getPath();
        java.lang.String str4 = invalidACLException1.getPath();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str4, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int5 = noNodeException4.getCode();
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException8 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException10 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        badArgumentsException8.addSuppressed((java.lang.Throwable) noWatcherException10);
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException8);
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        quotaExceededException1.addSuppressed((java.lang.Throwable) nodeExistsException4);
        java.lang.String str6 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.Code code7 = quotaExceededException1.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        quotaExceededException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        java.lang.Throwable[] throwableArray4 = invalidCallbackException2.getSuppressed();
        int int5 = invalidCallbackException2.getCode();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-113) + "'", int5 == (-113));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException3 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) invalidACLException3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str2 = badVersionException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException4 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "");
        noNodeException4.addSuppressed((java.lang.Throwable) keeperException7);
        keeperException2.addSuppressed((java.lang.Throwable) noNodeException4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int2 = noNodeException1.getCode();
        noNodeException1.setCode((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException3.getResults();
        badArgumentsException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.apache.zookeeper.KeeperException.Code code6 = badArgumentsException1.code();
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        keeperException2.setCode((-112));
        java.lang.Class<?> wildcardClass5 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-108) + "'", int1 == (-108));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-103), "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        int int3 = runtimeInconsistencyException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("hi!");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        int int3 = reconfigDisabledException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = reconfigDisabledException1.getResults();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-123) + "'", int3 == (-123));
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException2 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str3 = authFailedException2.getPath();
        int int4 = authFailedException2.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = authFailedException2.getResults();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) authFailedException2);
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = noChildrenForEphemeralsException1.getResults();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-115) + "'", int4 == (-115));
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertNull(opResultList7);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-14));
        java.lang.String str2 = keeperException1.getPath();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-111));
        java.lang.Throwable[] throwableArray2 = keeperException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = keeperException1.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        java.lang.Throwable[] throwableArray3 = sessionClosedRequireAuthException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = keeperException9.getResults();
        // The following exception was thrown during execution in test generation
        try {
            keeperException9.setCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNull(opResultList10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noWatcherException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = noNodeException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.String str4 = authFailedException1.getPath();
        authFailedException1.setCode((int) (byte) 0);
        org.apache.zookeeper.KeeperException.Code code7 = authFailedException1.code();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        org.apache.zookeeper.KeeperException.Code code4 = nodeExistsException1.code();
        int int5 = code4.intValue();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Throwable[] throwableArray4 = badArgumentsException3.getSuppressed();
        noNodeException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        int int4 = notEmptyException1.getCode();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException6 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        notEmptyException1.addSuppressed((java.lang.Throwable) reconfigDisabledException6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-102));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) badVersionException3);
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException9 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code10 = noChildrenForEphemeralsException9.code();
        keeperException7.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException9);
        badVersionException3.addSuppressed((java.lang.Throwable) keeperException7);
        keeperException7.setCode((-1));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        int int10 = code5.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-114) + "'", int10 == (-114));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code5);
        java.lang.String str7 = keeperException6.getPath();
        java.lang.Throwable[] throwableArray8 = keeperException6.getSuppressed();
        keeperException4.addSuppressed((java.lang.Throwable) keeperException6);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        noAuthException0.setCode(0);
        noAuthException0.setCode((int) (short) -1);
        noAuthException0.setCode((-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.String str2 = runtimeInconsistencyException0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = sessionClosedRequireAuthException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-124) + "'", int3 == (-124));
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        keeperException4.setCode((-100));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-119), "");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = nodeExistsException3.getResults();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.String str6 = keeperException2.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 100, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        int int4 = notEmptyException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = notEmptyException1.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException2 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int3 = nodeExistsException2.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException5 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException2.addSuppressed((java.lang.Throwable) nodeExistsException5);
        int int7 = nodeExistsException2.getCode();
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) nodeExistsException2);
        int int9 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-110) + "'", int7 == (-110));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-123) + "'", int9 == (-123));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        badArgumentsException0.setCode((-127));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException1.setCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        java.lang.String str5 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        java.lang.Throwable[] throwableArray3 = sessionClosedRequireAuthException1.getSuppressed();
        sessionClosedRequireAuthException1.setCode((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        int int2 = notEmptyException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-124));
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException4.getResults();
        // The following exception was thrown during execution in test generation
        try {
            keeperException4.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-119), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        reconfigDisabledException1.setCode((-123));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException6);
        java.lang.String str9 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency" + "'", str9, "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-119) + "'", int3 == (-119));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-119), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) -1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.Class<?> wildcardClass4 = keeperException3.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str6 = noAuthException0.getPath();
        java.lang.String str7 = noAuthException0.getPath();
        org.apache.zookeeper.KeeperException.Code code8 = noAuthException0.code();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        org.apache.zookeeper.KeeperException.Code code5 = keeperException3.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        keeperException7.setCode((-111));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-120));
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException2 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        keeperException1.addSuppressed((java.lang.Throwable) sessionMovedException2);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            keeperException1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        int int2 = badArgumentsException0.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = badArgumentsException0.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        sessionClosedRequireAuthException1.setCode((-120));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        org.apache.zookeeper.KeeperException.Code code8 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code8);
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code8, "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-119));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5);
        int int9 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException4 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException6 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        quotaExceededException4.addSuppressed((java.lang.Throwable) badArgumentsException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException4);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5);
        int int9 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        // The following exception was thrown during execution in test generation
        try {
            keeperException11.setCode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        java.lang.Throwable[] throwableArray5 = keeperException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-118), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException7 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        invalidACLException1.addSuppressed((java.lang.Throwable) noNodeException7);
        int int9 = noNodeException7.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        int int2 = invalidACLException1.getCode();
        invalidACLException1.setCode((-121));
        java.lang.String str5 = invalidACLException1.getPath();
        java.lang.String str6 = invalidACLException1.getPath();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str5, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str6, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.Class<?> wildcardClass4 = keeperException3.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 1, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        badVersionException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-127));
        java.lang.Class<?> wildcardClass2 = keeperException1.getClass();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-7));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = runtimeInconsistencyException0.getResults();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        java.lang.String str3 = runtimeInconsistencyException0.getPath();
        java.lang.String str4 = runtimeInconsistencyException0.getPath();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass8 = code5.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException5.getResults();
        java.lang.Throwable[] throwableArray7 = keeperException5.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        int int2 = badArgumentsException0.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = badArgumentsException0.code();
        int int4 = code3.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3);
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int5 = nodeExistsException4.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException7 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException4.addSuppressed((java.lang.Throwable) nodeExistsException7);
        invalidCallbackException2.addSuppressed((java.lang.Throwable) nodeExistsException7);
        java.lang.Throwable[] throwableArray10 = invalidCallbackException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        java.lang.Throwable[] throwableArray6 = keeperException5.getSuppressed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-115) + "'", int3 == (-115));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = keeperException8.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-113));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException4 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) noWatcherException4);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException7 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException9 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        quotaExceededException7.addSuppressed((java.lang.Throwable) badVersionException9);
        keeperException5.addSuppressed((java.lang.Throwable) quotaExceededException7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-115) + "'", int3 == (-115));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException5 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException4.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException5);
        org.apache.zookeeper.KeeperException.Code code7 = keeperException4.code();
        int int8 = code7.intValue();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7);
        org.apache.zookeeper.KeeperException.Code code10 = keeperException9.code();
        keeperException9.setCode((-127));
        badVersionException1.addSuppressed((java.lang.Throwable) keeperException9);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-114) + "'", int8 == (-114));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str3 = keeperException2.getPath();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException5 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        keeperException2.addSuppressed((java.lang.Throwable) notEmptyException5);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.lang.String str2 = quotaExceededException1.getPath();
        int int3 = quotaExceededException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-125) + "'", int3 == (-125));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        keeperException3.setCode((-7));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code5 = noChildrenForEphemeralsException4.code();
        keeperException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        org.apache.zookeeper.KeeperException.Code code7 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int2 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-119));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException3.getResults();
        invalidACLException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.apache.zookeeper.KeeperException.Code code6 = invalidACLException1.code();
        int int7 = invalidACLException1.getCode();
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-114) + "'", int7 == (-114));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int2 = sessionClosedRequireAuthException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-112));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        java.lang.Class<?> wildcardClass8 = keeperException7.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-123) + "'", int1 == (-123));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        int int5 = badVersionException3.getCode();
        org.apache.zookeeper.KeeperException.Code code6 = badVersionException3.code();
        int int7 = code6.intValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-103) + "'", int5 == (-103));
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-103) + "'", int7 == (-103));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.String str3 = keeperException2.getPath();
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException4 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = systemErrorException4.getResults();
        org.apache.zookeeper.KeeperException.Code code6 = systemErrorException4.code();
        org.apache.zookeeper.KeeperException.Code code7 = systemErrorException4.code();
        keeperException2.addSuppressed((java.lang.Throwable) systemErrorException4);
        int int9 = systemErrorException4.getCode();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException11 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        systemErrorException4.addSuppressed((java.lang.Throwable) notEmptyException11);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-122));
        int int2 = code1.intValue();
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-122) + "'", int2 == (-122));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-122) + "'", int3 == (-122));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        keeperException2.setCode(0);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = sessionClosedRequireAuthException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        int int2 = badArgumentsException1.getCode();
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException1.setCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-14));
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-108) + "'", int3 == (-108));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.Throwable[] throwableArray2 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 10, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        java.lang.String str2 = invalidACLException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented" + "'", str2, "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = quotaExceededException1.code();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException5 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        badVersionException5.setCode((-5));
        quotaExceededException1.addSuppressed((java.lang.Throwable) badVersionException5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = noWatcherException2.getResults();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException5);
        java.lang.String str7 = keeperException5.getPath();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("hi!");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        quotaExceededException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        int int2 = noWatcherException1.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = noWatcherException1.code();
        int int4 = noWatcherException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        noChildrenForEphemeralsException1.setCode((-3));
        java.lang.String str4 = noChildrenForEphemeralsException1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-114));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        keeperException2.setCode((-120));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-115));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-111) + "'", int1 == (-111));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-125));
        java.lang.Class<?> wildcardClass2 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badVersionException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        nodeExistsException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = keeperException3.getCode();
        int int5 = keeperException3.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        int int9 = invalidACLException7.getCode();
        java.lang.Throwable[] throwableArray10 = invalidACLException7.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code11 = invalidACLException7.code();
        org.apache.zookeeper.KeeperException keeperException13 = org.apache.zookeeper.KeeperException.create(code11, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-114) + "'", int9 == (-114));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code11 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code11.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException13);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-100), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = keeperException2.getCode();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-100) + "'", int3 == (-100));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.String str2 = badVersionException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException4 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        keeperException2.addSuppressed((java.lang.Throwable) badVersionException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code6);
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int12 = code6.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = reconfigDisabledException1.getCode();
        java.lang.Throwable[] throwableArray3 = reconfigDisabledException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str9 = keeperException8.getPath();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str9, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = keeperException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noNodeException1.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = noNodeException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = badArgumentsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create((-124), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) keeperException7);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException4 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        keeperException2.addSuppressed((java.lang.Throwable) badVersionException4);
        org.apache.zookeeper.KeeperException.Code code6 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "");
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code6, "hi!");
        org.apache.zookeeper.KeeperException.Code code11 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException13 = org.apache.zookeeper.KeeperException.create(code11, "");
        java.lang.String str14 = keeperException13.getPath();
        keeperException10.addSuppressed((java.lang.Throwable) keeperException13);
        keeperException10.setCode((-123));
        java.lang.String str18 = keeperException10.getPath();
        java.lang.String str19 = keeperException10.getPath();
        badVersionException4.addSuppressed((java.lang.Throwable) keeperException10);
        java.lang.Throwable[] throwableArray21 = keeperException10.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertTrue("'" + code11 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code11.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException2 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str3 = authFailedException2.getPath();
        int int4 = authFailedException2.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = authFailedException2.getResults();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) authFailedException2);
        java.lang.Class<?> wildcardClass7 = authFailedException2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-115) + "'", int4 == (-115));
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = sessionClosedRequireAuthException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        reconfigDisabledException1.setCode((-101));
        int int4 = reconfigDisabledException1.getCode();
        org.apache.zookeeper.KeeperException.Code code5 = reconfigDisabledException1.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException7 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int8 = noWatcherException7.getCode();
        java.lang.Throwable[] throwableArray9 = noWatcherException7.getSuppressed();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException11 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        org.apache.zookeeper.KeeperException.Code code12 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int13 = code12.intValue();
        org.apache.zookeeper.KeeperException keeperException15 = org.apache.zookeeper.KeeperException.create(code12, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noWatcherException11.addSuppressed((java.lang.Throwable) keeperException15);
        noWatcherException7.addSuppressed((java.lang.Throwable) noWatcherException11);
        noWatcherException11.setCode((-111));
        keeperException5.addSuppressed((java.lang.Throwable) noWatcherException11);
        org.apache.zookeeper.KeeperException.Code code21 = noWatcherException11.code();
        java.util.List<org.apache.zookeeper.OpResult> opResultList22 = noWatcherException11.getResults();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-121) + "'", int8 == (-121));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code12 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code12.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-123) + "'", int13 == (-123));
        org.junit.Assert.assertNotNull(keeperException15);
        org.junit.Assert.assertTrue("'" + code21 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code21.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNull(opResultList22);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-113) + "'", int2 == (-113));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113) + "'", int3 == (-113));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        int int7 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = keeperException9.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNull(opResultList10);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = nodeExistsException3.getResults();
        int int5 = nodeExistsException3.getCode();
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) nodeExistsException3);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-6), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException.Code code3 = badArgumentsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException6 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        keeperException4.addSuppressed((java.lang.Throwable) invalidACLException6);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-112));
        java.lang.Class<?> wildcardClass2 = keeperException1.getClass();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        java.lang.String str3 = badArgumentsException1.toString();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        sessionClosedRequireAuthException4.setCode((-4));
        keeperException2.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        int int8 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException.Code code8 = keeperException7.code();
        java.lang.String str9 = keeperException7.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = quotaExceededException2.getResults();
        throttledOpException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "hi!");
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code10 = keeperException9.code();
        quotaExceededException2.addSuppressed((java.lang.Throwable) keeperException9);
        org.apache.zookeeper.KeeperException.Code code12 = quotaExceededException2.code();
        int int13 = code12.intValue();
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + code12 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code12.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-125) + "'", int13 == (-125));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        noChildrenForEphemeralsException1.setCode((-102));
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noChildrenForEphemeralsException1.getResults();
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        java.lang.String str2 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = authFailedException0.code();
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException5 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        authFailedException0.addSuppressed((java.lang.Throwable) invalidACLException5);
        authFailedException0.setCode((-127));
        java.lang.String str9 = authFailedException0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.String str6 = keeperException5.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-123) + "'", int1 == (-123));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!" + "'", str6, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException3 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code4 = noNodeException3.code();
        quotaExceededException1.addSuppressed((java.lang.Throwable) noNodeException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        java.lang.String str3 = badVersionException1.getPath();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException.Code code8 = keeperException7.code();
        keeperException7.setCode((-127));
        java.lang.String str11 = keeperException7.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = quotaExceededException2.getResults();
        throttledOpException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str5 = quotaExceededException2.toString();
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str5, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = noWatcherException1.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNull(opResultList8);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = invalidACLException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        authFailedException1.setCode((-112));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int3 = keeperException2.getCode();
        int int4 = keeperException2.getCode();
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-119) + "'", int3 == (-119));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-119) + "'", int4 == (-119));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        reconfigDisabledException1.setCode((-8));
        int int4 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noWatcherException1.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = noWatcherException1.getResults();
        java.lang.String str6 = noWatcherException1.getPath();
        int int7 = noWatcherException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str6, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-121) + "'", int7 == (-121));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException5 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException4.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException5);
        org.apache.zookeeper.KeeperException.Code code7 = keeperException4.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code7, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException11);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-119));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException2 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int3 = nodeExistsException2.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException5 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException2.addSuppressed((java.lang.Throwable) nodeExistsException5);
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) nodeExistsException5);
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        nodeExistsException5.addSuppressed((java.lang.Throwable) keeperException10);
        int int12 = keeperException10.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        java.lang.String str4 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code5);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14) + "'", int4 == (-14));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        java.lang.String str2 = notEmptyException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException5 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
        authFailedException0.addSuppressed((java.lang.Throwable) reconfigDisabledException5);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = sessionClosedRequireAuthException3.getResults();
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        int int8 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-14) + "'", int8 == (-14));
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        int int5 = badVersionException3.getCode();
        java.lang.String str6 = badVersionException3.getPath();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-103) + "'", int5 == (-103));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str6, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.String str4 = authFailedException1.getPath();
        authFailedException1.setCode((int) (byte) 0);
        int int7 = authFailedException1.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        org.apache.zookeeper.KeeperException.Code code5 = quotaExceededException3.code();
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("");
        org.apache.zookeeper.KeeperException.Code code8 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code8);
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code8, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList12 = keeperException11.getResults();
        invalidACLException7.addSuppressed((java.lang.Throwable) keeperException11);
        org.apache.zookeeper.KeeperException.Code code14 = invalidACLException7.code();
        quotaExceededException3.addSuppressed((java.lang.Throwable) invalidACLException7);
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException11);
        org.junit.Assert.assertNull(opResultList12);
        org.junit.Assert.assertTrue("'" + code14 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code14.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        java.lang.String str3 = badArgumentsException1.getPath();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        int int1 = authFailedException0.getCode();
        java.lang.Throwable[] throwableArray2 = authFailedException0.getSuppressed();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-115) + "'", int1 == (-115));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int8 = keeperException7.getCode();
        keeperException4.addSuppressed((java.lang.Throwable) keeperException7);
        java.lang.Throwable[] throwableArray10 = keeperException7.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        java.lang.String str3 = invalidACLException1.getPath();
        int int4 = invalidACLException1.getCode();
        org.apache.zookeeper.KeeperException.Code code5 = invalidACLException1.code();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-114) + "'", int4 == (-114));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-121), "");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        java.lang.Throwable[] throwableArray3 = notEmptyException1.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException1.getResults();
        int int5 = notEmptyException1.getCode();
        org.apache.zookeeper.KeeperException.Code code6 = notEmptyException1.code();
        java.lang.Class<?> wildcardClass7 = code6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-111) + "'", int5 == (-111));
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        int int2 = noWatcherException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException3.getResults();
        badArgumentsException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.apache.zookeeper.KeeperException.Code code6 = notEmptyException3.code();
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException0 = new org.apache.zookeeper.KeeperException.NotEmptyException();
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException1 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = quotaExceededException3.getResults();
        throttledOpException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        notEmptyException0.addSuppressed((java.lang.Throwable) quotaExceededException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        badVersionException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        int int5 = badArgumentsException3.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0);
        int int7 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-123) + "'", int1 == (-123));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-123) + "'", int7 == (-123));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        notEmptyException1.setCode((-111));
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }
}

