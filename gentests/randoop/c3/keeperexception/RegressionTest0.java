package org.apache.zookeeper.test.randoop.c3.keeperexception;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.UNKNOWN_SESSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-12) + "'", int0 == (-12));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.UNIMPLEMENTED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-6) + "'", int0 == (-6));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.AUTH_FAILED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-115) + "'", int0 == (-115));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.SYSTEM_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.EPHEMERAL_ON_LOCAL_SESSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-120) + "'", int0 == (-120));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        java.lang.String str2 = authFailedException0.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.BAD_ARGUMENTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-8) + "'", int0 == (-8));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADVERSION;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NO_CHILDREN_FOR_EPHEMERALS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-108) + "'", int0 == (-108));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.lang.String str1 = nodeExistsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str1, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.RUNTIME_INCONSISTENCY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2) + "'", int0 == (-2));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str1, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.DATA_INCONSISTENCY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-3) + "'", int0 == (-3));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.OPERATION_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-7) + "'", int0 == (-7));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NODE_EXISTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-110) + "'", int0 == (-110));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException0 = new org.apache.zookeeper.KeeperException.InvalidACLException();
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.CONNECTION_LOSS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-4) + "'", int0 == (-4));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.MARSHALLING_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-5) + "'", int0 == (-5));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NEW_CONFIG_NO_QUORUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-13) + "'", int0 == (-13));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.THROTTLEDOP;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.OK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        // The following exception was thrown during execution in test generation
        try {
            keeperException1.setCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.INVALID_CALLBACK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-113) + "'", int0 == (-113));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.INVALID_ACL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-114) + "'", int0 == (-114));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOWATCHER;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.SESSION_EXPIRED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-112) + "'", int0 == (-112));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.zookeeper.KeeperException.UnknownSessionException unknownSessionException0 = new org.apache.zookeeper.KeeperException.UnknownSessionException();
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-112));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        int int2 = authFailedException0.getCode();
        java.lang.String str3 = authFailedException0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-115) + "'", int2 == (-115));
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.RECONFIG_IN_PROGRESS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-14) + "'", int0 == (-14));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("hi!");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            quotaExceededException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NO_AUTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-102) + "'", int0 == (-102));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.zookeeper.KeeperException.ConnectionLossException connectionLossException0 = new org.apache.zookeeper.KeeperException.ConnectionLossException();
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NO_NODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-101) + "'", int0 == (-101));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.NOT_EMPTY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-111) + "'", int0 == (-111));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.BAD_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-103) + "'", int0 == (-103));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = org.apache.zookeeper.KeeperException.CodeDeprecated.API_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-100) + "'", int0 == (-100));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException0 = new org.apache.zookeeper.KeeperException.BadVersionException();
        java.lang.String str1 = badVersionException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str1, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        int int1 = systemErrorException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.Throwable[] throwableArray3 = noWatcherException1.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = noWatcherException1.getResults();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        java.lang.Class<?> wildcardClass4 = authFailedException0.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-112) + "'", int2 == (-112));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        // The following exception was thrown during execution in test generation
        try {
            badVersionException1.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int1 = code0.intValue();
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-123) + "'", int1 == (-123));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.Class<?> wildcardClass4 = badArgumentsException0.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.Class<?> wildcardClass2 = quotaExceededException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = badArgumentsException0.getResults();
        java.lang.String str5 = badArgumentsException0.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str5, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        java.lang.String str5 = nodeExistsException0.getPath();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.zookeeper.KeeperException.DataInconsistencyException dataInconsistencyException0 = new org.apache.zookeeper.KeeperException.DataInconsistencyException();
        int int1 = dataInconsistencyException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            keeperException3.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-123) + "'", int1 == (-123));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException0 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        int int1 = sessionMovedException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-118) + "'", int1 == (-118));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-1));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-110));
        badArgumentsException1.addSuppressed((java.lang.Throwable) keeperException3);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        // The following exception was thrown during execution in test generation
        try {
            invalidCallbackException0.setCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass3 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("hi!");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = invalidACLException1.getResults();
        invalidACLException1.setCode((-110));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Class<?> wildcardClass2 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        java.lang.Class<?> wildcardClass2 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Throwable[] throwableArray2 = badArgumentsException1.getSuppressed();
        badArgumentsException1.setCode((-120));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        java.lang.String str2 = badArgumentsException0.toString();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.zookeeper.KeeperException.NotReadOnlyException notReadOnlyException0 = new org.apache.zookeeper.KeeperException.NotReadOnlyException();
        java.lang.String str1 = notReadOnlyException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str1, "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        java.lang.String str6 = invalidACLException1.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str6, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException0 = new org.apache.zookeeper.KeeperException.NoWatcherException();
        java.lang.String str1 = noWatcherException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher" + "'", str1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException0 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        java.lang.Class<?> wildcardClass1 = noChildrenForEphemeralsException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        // The following exception was thrown during execution in test generation
        try {
            nodeExistsException3.setCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException6 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException5.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        // The following exception was thrown during execution in test generation
        try {
            ephemeralOnLocalSessionException6.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 1, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        int int2 = authFailedException0.getCode();
        java.lang.Class<?> wildcardClass3 = authFailedException0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-115) + "'", int2 == (-115));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = notEmptyException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        int int1 = invalidCallbackException0.getCode();
        int int2 = invalidCallbackException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-113) + "'", int1 == (-113));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-113) + "'", int2 == (-113));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException2 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code3 = authFailedException2.code();
        badArgumentsException1.addSuppressed((java.lang.Throwable) authFailedException2);
        throttledOpException0.addSuppressed((java.lang.Throwable) authFailedException2);
        java.lang.String str6 = authFailedException2.getPath();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-101));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = badArgumentsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        java.lang.Throwable[] throwableArray1 = requestTimeoutException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-113) + "'", int1 == (-113));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException0.code();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-121));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        java.lang.String str1 = marshallingErrorException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str1, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 10, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.Class<?> wildcardClass1 = newConfigNoQuorum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        // The following exception was thrown during execution in test generation
        try {
            nodeExistsException1.setCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-108));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        java.lang.Throwable[] throwableArray1 = invalidCallbackException0.getSuppressed();
        java.lang.String str2 = invalidCallbackException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        int int1 = code0.intValue();
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        int int2 = noNodeException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.Throwable[] throwableArray3 = noWatcherException1.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code4 = noWatcherException1.code();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        // The following exception was thrown during execution in test generation
        try {
            badArgumentsException1.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-114));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException0 = new org.apache.zookeeper.KeeperException.NotEmptyException();
        java.lang.Throwable[] throwableArray1 = notEmptyException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.String str3 = keeperException2.getPath();
        java.lang.String str4 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str4, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Class<?> wildcardClass4 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException0 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = sessionExpiredException0.getResults();
        java.lang.String str2 = sessionExpiredException0.getPath();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "");
        java.lang.String str8 = keeperException7.getPath();
        keeperException4.addSuppressed((java.lang.Throwable) keeperException7);
        java.lang.Class<?> wildcardClass10 = keeperException7.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException6 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException5.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        java.lang.Class<?> wildcardClass9 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = systemErrorException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = systemErrorException0.code();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = systemErrorException0.getResults();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = keeperException2.getCode();
        java.lang.Class<?> wildcardClass4 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        reconfigDisabledException1.setCode((-111));
        java.lang.String str4 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str4, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        int int3 = nodeExistsException1.getCode();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        java.lang.String str6 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL" + "'", str6, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("hi!");
        java.lang.Throwable[] throwableArray2 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.zookeeper.KeeperException.UnimplementedException unimplementedException0 = new org.apache.zookeeper.KeeperException.UnimplementedException();
        java.lang.String str1 = unimplementedException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented" + "'", str1, "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.lang.String str1 = badArgumentsException0.getPath();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        // The following exception was thrown during execution in test generation
        try {
            quotaExceededException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException0 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        java.lang.Throwable[] throwableArray1 = noChildrenForEphemeralsException0.getSuppressed();
        int int2 = noChildrenForEphemeralsException0.getCode();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        // The following exception was thrown during execution in test generation
        try {
            keeperException1.setCode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        noWatcherException1.setCode((-1));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        java.lang.Throwable[] throwableArray2 = keeperException1.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException1.getResults();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException2 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int3 = nodeExistsException2.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException5 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException2.addSuppressed((java.lang.Throwable) nodeExistsException5);
        int int7 = nodeExistsException2.getCode();
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) nodeExistsException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-110) + "'", int7 == (-110));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.String str5 = keeperException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.zookeeper.KeeperException.DataInconsistencyException dataInconsistencyException0 = new org.apache.zookeeper.KeeperException.DataInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = dataInconsistencyException0.getResults();
        java.lang.String str2 = dataInconsistencyException0.getPath();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = notEmptyException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.String str3 = keeperException2.getPath();
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException4 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        keeperException2.addSuppressed((java.lang.Throwable) sessionExpiredException4);
        int int6 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        keeperException2.setCode((-1));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.zookeeper.KeeperException.DataInconsistencyException dataInconsistencyException0 = new org.apache.zookeeper.KeeperException.DataInconsistencyException();
        dataInconsistencyException0.setCode((-120));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        keeperException4.setCode((-101));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = sessionClosedRequireAuthException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) -1);
        java.lang.String str2 = keeperException1.getPath();
        java.lang.Throwable[] throwableArray3 = keeperException1.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException5);
        // The following exception was thrown during execution in test generation
        try {
            authFailedException0.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.Throwable[] throwableArray2 = sessionClosedRequireAuthException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        noChildrenForEphemeralsException1.setCode((-3));
        java.lang.Class<?> wildcardClass4 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-125));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException5);
        java.lang.Class<?> wildcardClass7 = keeperException5.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
        org.apache.zookeeper.KeeperException.Code code1 = reconfigInProgress0.code();
        java.lang.Class<?> wildcardClass2 = reconfigInProgress0.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = badVersionException1.getPath();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException();
        badVersionException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int3 = keeperException2.getCode();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113) + "'", int3 == (-113));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        noNodeException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        java.lang.String str2 = badVersionException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-115));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.Class<?> wildcardClass6 = noAuthException0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        keeperException3.addSuppressed((java.lang.Throwable) quotaExceededException5);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = invalidACLException7.getResults();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        java.lang.Class<?> wildcardClass4 = noWatcherException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        // The following exception was thrown during execution in test generation
        try {
            nodeExistsException1.setCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = badArgumentsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        org.apache.zookeeper.KeeperException.Code code3 = keeperException1.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("");
        java.lang.Throwable[] throwableArray2 = invalidACLException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.zookeeper.KeeperException.OperationTimeoutException operationTimeoutException0 = new org.apache.zookeeper.KeeperException.OperationTimeoutException();
        java.lang.Throwable throwable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            operationTimeoutException0.addSuppressed(throwable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException1 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException1.code();
        badArgumentsException0.addSuppressed((java.lang.Throwable) authFailedException1);
        java.lang.String str4 = authFailedException1.getPath();
        authFailedException1.setCode((int) (byte) 0);
        java.lang.String str7 = authFailedException1.getPath();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.lang.String str3 = keeperException2.getPath();
        java.lang.Throwable[] throwableArray4 = keeperException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        java.lang.String str5 = quotaExceededException3.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str5, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        keeperException1.setCode((-1));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.AUTHFAILED;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-123));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException5);
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = authFailedException0.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str5 = keeperException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str5, "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Throwable[] throwableArray2 = notEmptyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException4.getResults();
        int int6 = keeperException4.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-115) + "'", int6 == (-115));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        java.lang.String str3 = keeperException1.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss" + "'", str3, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException0.getResults();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-124));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-113));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-110));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        java.lang.String str3 = keeperException1.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session" + "'", str3, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = authFailedException0.getResults();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException4 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        authFailedException0.addSuppressed((java.lang.Throwable) nodeExistsException4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = systemErrorException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = systemErrorException0.code();
        int int3 = systemErrorException0.getCode();
        java.lang.String str4 = systemErrorException0.toString();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError" + "'", str4, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        int int1 = code0.intValue();
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = sessionClosedRequireAuthException1.getPath();
        sessionClosedRequireAuthException1.setCode((-100));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = invalidACLException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        noAuthException0.setCode(0);
        noAuthException0.setCode((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = runtimeInconsistencyException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = runtimeInconsistencyException0.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        int int1 = throttledOpException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-8));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = systemErrorException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = systemErrorException0.code();
        int int3 = systemErrorException0.getCode();
        java.lang.Class<?> wildcardClass4 = systemErrorException0.getClass();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(10, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONMOVED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONMOVED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONMOVED));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int3 = noWatcherException2.getCode();
        java.lang.Throwable[] throwableArray4 = noWatcherException2.getSuppressed();
        noAuthException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str6 = noAuthException0.getPath();
        java.lang.String str7 = noAuthException0.getPath();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        java.lang.Class<?> wildcardClass3 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4) + "'", int4 == (-4));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        java.lang.Throwable[] throwableArray2 = sessionClosedRequireAuthException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code3, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException6 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException5.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException6);
        java.lang.Throwable[] throwableArray9 = ephemeralOnLocalSessionException6.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = reconfigDisabledException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-123) + "'", int3 == (-123));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException2 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code3 = authFailedException2.code();
        badArgumentsException1.addSuppressed((java.lang.Throwable) authFailedException2);
        throttledOpException0.addSuppressed((java.lang.Throwable) authFailedException2);
        java.lang.String str6 = authFailedException2.toString();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str6, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str2 = sessionClosedRequireAuthException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException0 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = sessionExpiredException0.getResults();
        java.lang.String str2 = sessionExpiredException0.toString();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired" + "'", str2, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-12), "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5);
        keeperException7.setCode((-108));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.zookeeper.KeeperException.UnimplementedException unimplementedException0 = new org.apache.zookeeper.KeeperException.UnimplementedException();
        java.lang.Class<?> wildcardClass1 = unimplementedException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int8 = code5.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-114) + "'", int8 == (-114));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.Throwable[] throwableArray3 = noWatcherException1.getSuppressed();
        java.lang.Class<?> wildcardClass4 = noWatcherException1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.apache.zookeeper.KeeperException.Code code2 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        java.lang.String str5 = keeperException4.getPath();
        invalidACLException1.addSuppressed((java.lang.Throwable) keeperException4);
        java.lang.Throwable[] throwableArray7 = invalidACLException1.getSuppressed();
        java.lang.String str8 = invalidACLException1.getPath();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion" + "'", str8, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        org.apache.zookeeper.KeeperException.Code code9 = runtimeInconsistencyException0.code();
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-118));
        java.lang.String str2 = keeperException1.getPath();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException0 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.lang.Class<?> wildcardClass1 = ephemeralOnLocalSessionException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-3));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("hi!");
        int int2 = noWatcherException1.getCode();
        java.lang.Throwable[] throwableArray3 = noWatcherException1.getSuppressed();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException5 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        org.apache.zookeeper.KeeperException.Code code6 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        int int7 = code6.intValue();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        noWatcherException5.addSuppressed((java.lang.Throwable) keeperException9);
        noWatcherException1.addSuppressed((java.lang.Throwable) noWatcherException5);
        java.util.List<org.apache.zookeeper.OpResult> opResultList12 = noWatcherException1.getResults();
        org.apache.zookeeper.KeeperException keeperException15 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.Throwable[] throwableArray16 = keeperException15.getSuppressed();
        noWatcherException1.addSuppressed((java.lang.Throwable) keeperException15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-123) + "'", int7 == (-123));
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNull(opResultList12);
        org.junit.Assert.assertNotNull(keeperException15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertArrayEquals(throwableArray16, new java.lang.Throwable[] {});
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-13));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:-12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNKNOWNSESSION));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = newConfigNoQuorum0.getResults();
        java.lang.Throwable[] throwableArray2 = newConfigNoQuorum0.getSuppressed();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        keeperException4.setCode((-5));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = systemErrorException0.getResults();
        org.apache.zookeeper.KeeperException.Code code2 = systemErrorException0.code();
        java.lang.Throwable[] throwableArray3 = systemErrorException0.getSuppressed();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        int int4 = code3.intValue();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.lang.String str1 = nodeExistsException0.getPath();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException2 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        nodeExistsException1.addSuppressed((java.lang.Throwable) invalidCallbackException2);
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException5 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        int int6 = noChildrenForEphemeralsException5.getCode();
        nodeExistsException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-108) + "'", int6 == (-108));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        java.lang.Class<?> wildcardClass2 = noWatcherException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Class<?> wildcardClass2 = notEmptyException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        // The following exception was thrown during execution in test generation
        try {
            invalidACLException1.setCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException1 = new org.apache.zookeeper.KeeperException.NoAuthException();
        marshallingErrorException0.addSuppressed((java.lang.Throwable) noAuthException1);
        java.lang.String str3 = noAuthException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth" + "'", str3, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        reconfigDisabledException1.setCode((-101));
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException5 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) invalidACLException5);
        int int7 = invalidACLException5.getCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-114) + "'", int7 == (-114));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int1 = runtimeInconsistencyException0.getCode();
        java.lang.Throwable[] throwableArray2 = runtimeInconsistencyException0.getSuppressed();
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException4 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) reconfigDisabledException4);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException7 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) invalidACLException7);
        java.lang.Class<?> wildcardClass9 = invalidACLException7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.zookeeper.KeeperException.APIErrorException aPIErrorException0 = new org.apache.zookeeper.KeeperException.APIErrorException();
        java.lang.Class<?> wildcardClass1 = aPIErrorException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        int int2 = noWatcherException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = noWatcherException1.getResults();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = badArgumentsException1.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = badArgumentsException1.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        int int2 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-100));
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            keeperException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        quotaExceededException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = notEmptyException1.getResults();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int2 = noWatcherException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        java.lang.Throwable[] throwableArray2 = nodeExistsException1.getSuppressed();
        nodeExistsException1.setCode((-3));
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-2), "org.apache.zookeeper.KeeperException$DataInconsistencyException: KeeperErrorCode = DataInconsistency for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int1 = nodeExistsException0.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException0.addSuppressed((java.lang.Throwable) nodeExistsException3);
        int int5 = nodeExistsException0.getCode();
        java.lang.String str6 = nodeExistsException0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-110) + "'", int5 == (-110));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str6, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        badArgumentsException1.addSuppressed((java.lang.Throwable) noWatcherException3);
        int int5 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        java.lang.String str2 = authFailedException0.getPath();
        java.lang.String str3 = authFailedException0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            authFailedException0.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = badArgumentsException4.getResults();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException8 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str9 = badVersionException8.getPath();
        badArgumentsException4.addSuppressed((java.lang.Throwable) badVersionException8);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str9, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        int int5 = code2.intValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-115) + "'", int5 == (-115));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException4 = new org.apache.zookeeper.KeeperException.BadVersionException("");
        keeperException2.addSuppressed((java.lang.Throwable) badVersionException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException2.code();
        int int7 = code6.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-8) + "'", int7 == (-8));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        java.lang.Class<?> wildcardClass2 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-113));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException6 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException4.addSuppressed((java.lang.Throwable) quotaExceededException6);
        keeperException2.addSuppressed((java.lang.Throwable) quotaExceededException6);
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = quotaExceededException6.getResults();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = authFailedException0.code();
        authFailedException0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code4 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.zookeeper.KeeperException.OperationTimeoutException operationTimeoutException0 = new org.apache.zookeeper.KeeperException.OperationTimeoutException();
        operationTimeoutException0.setCode((-112));
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = operationTimeoutException0.getResults();
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.lang.String str2 = notEmptyException1.getPath();
        java.lang.String str3 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!" + "'", str3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode(0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3, "");
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException6 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        keeperException4.addSuppressed((java.lang.Throwable) badArgumentsException6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = notEmptyException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.getPath();
        java.lang.Throwable[] throwableArray3 = keeperException1.getSuppressed();
        java.lang.String str4 = keeperException1.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError" + "'", str4, "org.apache.zookeeper.KeeperException$APIErrorException: KeeperErrorCode = APIError");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.lang.Class<?> wildcardClass2 = noWatcherException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-101));
        keeperException1.setCode((-103));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        org.apache.zookeeper.KeeperException.Code code5 = quotaExceededException3.code();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-2));
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        keeperException3.addSuppressed((java.lang.Throwable) quotaExceededException5);
        java.lang.String str7 = keeperException3.getPath();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) keeperException3);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        java.lang.String str1 = noAuthException0.getPath();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-1));
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException3 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        keeperException1.addSuppressed((java.lang.Throwable) nodeExistsException3);
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = quotaExceededException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.apache.zookeeper.KeeperException.Code code2 = authFailedException0.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException2 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        int int3 = runtimeInconsistencyException2.getCode();
        java.lang.Throwable[] throwableArray4 = runtimeInconsistencyException2.getSuppressed();
        badArgumentsException1.addSuppressed((java.lang.Throwable) runtimeInconsistencyException2);
        int int6 = runtimeInconsistencyException2.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Throwable[] throwableArray4 = keeperException3.getSuppressed();
        java.lang.Class<?> wildcardClass5 = keeperException3.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        int int5 = badVersionException3.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = badVersionException3.getResults();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-103) + "'", int5 == (-103));
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102) + "'", int1 == (-102));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-102) + "'", int2 == (-102));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int3 = keeperException2.getCode();
        java.lang.String str4 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str4, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        java.lang.Class<?> wildcardClass2 = badArgumentsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-100), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-14) + "'", int4 == (-14));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-1));
        keeperException2.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-111));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("hi!");
        java.lang.Class<?> wildcardClass2 = notEmptyException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Throwable[] throwableArray4 = keeperException3.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        int int2 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = badArgumentsException0.getResults();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = opResultList1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(opResultList1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        reconfigDisabledException1.setCode((-101));
        int int4 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        invalidACLException1.setCode((int) (short) 0);
        java.lang.String str4 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        keeperException2.setCode((-112));
        java.lang.Class<?> wildcardClass7 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.String str3 = noWatcherException1.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = quotaExceededException5.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) quotaExceededException5);
        quotaExceededException5.setCode(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        int int3 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-119) + "'", int3 == (-119));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        badArgumentsException10.setCode((-114));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException0 = new org.apache.zookeeper.KeeperException.NoNodeException();
        java.lang.Class<?> wildcardClass1 = noNodeException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.zookeeper.KeeperException.OperationTimeoutException operationTimeoutException0 = new org.apache.zookeeper.KeeperException.OperationTimeoutException();
        java.lang.String str1 = operationTimeoutException0.getPath();
        java.lang.String str2 = operationTimeoutException0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        java.lang.String str2 = notEmptyException1.getPath();
        java.lang.Class<?> wildcardClass3 = notEmptyException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        keeperException2.addSuppressed((java.lang.Throwable) ephemeralOnLocalSessionException3);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int8 = keeperException7.getCode();
        java.lang.String str9 = keeperException7.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-114) + "'", int8 == (-114));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists" + "'", str9, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        java.lang.Class<?> wildcardClass3 = throwableArray2.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        java.lang.String str1 = marshallingErrorException0.getPath();
        java.lang.Class<?> wildcardClass2 = marshallingErrorException0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        keeperException3.setCode((-113));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException2 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        int int3 = nodeExistsException2.getCode();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException5 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        nodeExistsException2.addSuppressed((java.lang.Throwable) nodeExistsException5);
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) nodeExistsException5);
        int int8 = nodeExistsException5.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-110) + "'", int8 == (-110));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NotReadOnlyException: KeeperErrorCode = Not a read-only call");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists");
        int int2 = badVersionException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-103) + "'", int2 == (-103));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion");
        keeperException2.setCode((-121));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        int int2 = badArgumentsException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = badArgumentsException1.getResults();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        int int5 = keeperException3.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("hi!");
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.String str6 = badArgumentsException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!" + "'", str6, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = reconfigDisabledException1.getSuppressed();
        reconfigDisabledException1.setCode((int) (byte) -1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }
}

