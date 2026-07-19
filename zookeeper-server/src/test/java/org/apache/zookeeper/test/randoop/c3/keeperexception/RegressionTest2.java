package org.apache.zookeeper.test.randoop.c3.keeperexception;
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
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        notEmptyException1.setCode(0);
        java.lang.String str4 = notEmptyException1.getPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str4, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = keeperException3.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-13));
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException3 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        keeperException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException3);
        java.lang.String str5 = noChildrenForEphemeralsException3.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        noChildrenForEphemeralsException1.setCode((-12));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-127));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str3, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        java.lang.Throwable[] throwableArray3 = badVersionException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-124));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        int int2 = nodeExistsException1.getCode();
        java.lang.String str3 = nodeExistsException1.getPath();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str3, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        noChildrenForEphemeralsException1.setCode((-102));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException.Code code3 = noChildrenForEphemeralsException1.code();
        java.lang.Class<?> wildcardClass4 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
        noNodeException1.setCode((-113));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-114), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        int int3 = noWatcherException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        int int4 = noWatcherException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException4 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        keeperException2.addSuppressed((java.lang.Throwable) badVersionException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code6);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-6), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-6));
        keeperException1.setCode((-3));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        badArgumentsException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        invalidACLException1.setCode((-113));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.String str3 = noWatcherException1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str3, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        authFailedException0.setCode((-119));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-5));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-115) + "'", int3 == (-115));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        java.lang.Throwable[] throwableArray2 = notEmptyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        java.lang.Class<?> wildcardClass2 = badArgumentsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        noWatcherException1.setCode((-3));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException.Code code2 = reconfigDisabledException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noChildrenForEphemeralsException1.setCode(0);
        org.apache.zookeeper.KeeperException.Code code4 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        badArgumentsException1.setCode((-111));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113) + "'", int3 == (-113));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        int int7 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        int int2 = badArgumentsException0.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = badArgumentsException0.code();
        int int4 = code3.intValue();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-100));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-100) + "'", int2 == (-100));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = nodeExistsException0.getResults();
        org.junit.Assert.assertNull(opResultList1);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + code12 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code12.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = ConnectionLoss for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-4), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = sessionClosedRequireAuthException1.code();
        int int4 = code3.intValue();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        java.lang.Throwable[] throwableArray3 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        java.lang.String str2 = badArgumentsException0.getPath();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-120));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-120) + "'", int3 == (-120));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        badVersionException1.setCode((int) (byte) -1);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.Class<?> wildcardClass4 = authFailedException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-120));
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException2 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        keeperException1.addSuppressed((java.lang.Throwable) sessionMovedException2);
        java.lang.Throwable[] throwableArray4 = sessionMovedException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-103));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        int int3 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = invalidACLException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        int int4 = notEmptyException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noNodeException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        noNodeException1.setCode((-2));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = nodeExistsException1.getPath();
        nodeExistsException1.setCode(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noNodeException1.setCode((-8));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = reconfigDisabledException1.code();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        int int2 = quotaExceededException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125) + "'", int2 == (-125));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException0 = new org.apache.zookeeper.KeeperException.NoNodeException();
        int int1 = noNodeException0.getCode();
        int int2 = noNodeException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-101) + "'", int1 == (-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-123));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        keeperException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        int int2 = invalidACLException1.getCode();
        invalidACLException1.setCode((-121));
        java.lang.String str5 = invalidACLException1.getPath();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str5, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        badVersionException1.setCode((-113));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = invalidACLException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-114) + "'", int2 == (-114));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-112));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int4 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-112) + "'", int4 == (-112));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-101), "");
        java.lang.String str3 = keeperException2.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Throwable[] throwableArray2 = keeperException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-6));
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-113) + "'", int2 == (-113));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-6));
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        java.lang.String str3 = invalidACLException1.getPath();
        java.lang.String str4 = invalidACLException1.getPath();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str4, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException3 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) invalidACLException3);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str2 = badVersionException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-119));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int2 = noNodeException1.getCode();
        noNodeException1.setCode((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException3.getResults();
        badArgumentsException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.apache.zookeeper.KeeperException.Code code6 = badArgumentsException1.code();
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.String str3 = keeperException2.getPath();
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException4 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = systemErrorException4.getResults();
        org.apache.zookeeper.KeeperException.Code code6 = systemErrorException4.code();
        org.apache.zookeeper.KeeperException.Code code7 = systemErrorException4.code();
        keeperException2.addSuppressed((java.lang.Throwable) systemErrorException4);
        int int9 = systemErrorException4.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-103), "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-14));
        java.lang.String str2 = keeperException1.getPath();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = sessionClosedRequireAuthException1.getResults();
        java.lang.Throwable[] throwableArray3 = sessionClosedRequireAuthException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noWatcherException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = noNodeException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = Unknown error UNKNOWNSESSION");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        org.apache.zookeeper.KeeperException.Code code4 = nodeExistsException1.code();
        int int5 = code4.intValue();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Throwable[] throwableArray4 = badArgumentsException3.getSuppressed();
        noNodeException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-102));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
}

