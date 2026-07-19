package org.apache.zookeeper.test.randoop.c4.keeperexception;
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
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADARGUMENTS;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.AUTHFAILED;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.AUTHFAILED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.AUTHFAILED));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.zookeeper.KeeperException.UnimplementedException unimplementedException0 = new org.apache.zookeeper.KeeperException.UnimplementedException();
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.zookeeper.KeeperException.SessionMovedException sessionMovedException0 = new org.apache.zookeeper.KeeperException.SessionMovedException();
        java.lang.String str1 = sessionMovedException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str1, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.APIERROR;
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.APIERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.APIERROR));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.zookeeper.KeeperException.ReconfigInProgress reconfigInProgress0 = new org.apache.zookeeper.KeeperException.ReconfigInProgress();
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.zookeeper.KeeperException.UnknownSessionException unknownSessionException0 = new org.apache.zookeeper.KeeperException.UnknownSessionException();
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        int int2 = newConfigNoQuorum0.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = newConfigNoQuorum0.getResults();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-110) + "'", int1 == (-110));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException0 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException();
        java.lang.String str1 = sessionClosedRequireAuthException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        int int2 = newConfigNoQuorum0.getCode();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum5 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str6 = newConfigNoQuorum5.getPath();
        newConfigNoQuorum5.setCode(0);
        newConfigNoQuorum3.addSuppressed((java.lang.Throwable) newConfigNoQuorum5);
        java.lang.String str10 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.util.List<org.apache.zookeeper.OpResult> opResultList12 = newConfigNoQuorum3.getResults();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(opResultList12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.zookeeper.KeeperException.ThrottledOpException throttledOpException0 = new org.apache.zookeeper.KeeperException.ThrottledOpException();
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        // The following exception was thrown during execution in test generation
        try {
            requestTimeoutException0.setCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass2 = noWatcherException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 10, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) -1);
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        int int2 = newConfigNoQuorum0.getCode();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum5 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str6 = newConfigNoQuorum5.getPath();
        newConfigNoQuorum5.setCode(0);
        newConfigNoQuorum3.addSuppressed((java.lang.Throwable) newConfigNoQuorum5);
        java.lang.String str10 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.lang.Class<?> wildcardClass12 = newConfigNoQuorum3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.CONNECTIONLOSS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum2.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok" + "'", str7, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        java.lang.String str2 = newConfigNoQuorum0.getPath();
        java.lang.Class<?> wildcardClass3 = newConfigNoQuorum0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        noChildrenForEphemeralsException1.setCode(0);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-112));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        // The following exception was thrown during execution in test generation
        try {
            requestTimeoutException0.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        java.lang.String str1 = runtimeInconsistencyException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str1, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode(0);
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException5 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException5);
        int int7 = noChildrenForEphemeralsException5.getCode();
        java.lang.String str8 = noChildrenForEphemeralsException5.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-108) + "'", int7 == (-108));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str8, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = keeperException1.getClass();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) '#', "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        int int2 = newConfigNoQuorum0.getCode();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum5 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str6 = newConfigNoQuorum5.getPath();
        newConfigNoQuorum5.setCode(0);
        newConfigNoQuorum3.addSuppressed((java.lang.Throwable) newConfigNoQuorum5);
        java.lang.String str10 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.lang.String str12 = newConfigNoQuorum0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str12, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OK;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass2 = quotaExceededException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.Throwable[] throwableArray1 = authFailedException0.getSuppressed();
        java.lang.Class<?> wildcardClass2 = authFailedException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.Class<?> wildcardClass3 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.zookeeper.KeeperException.ConnectionLossException connectionLossException0 = new org.apache.zookeeper.KeeperException.ConnectionLossException();
        java.lang.Class<?> wildcardClass1 = connectionLossException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.zookeeper.KeeperException.APIErrorException aPIErrorException0 = new org.apache.zookeeper.KeeperException.APIErrorException();
        // The following exception was thrown during execution in test generation
        try {
            aPIErrorException0.setCode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        java.lang.String str3 = reconfigDisabledException1.getPath();
        java.lang.String str4 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str4, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        java.lang.String str2 = requestTimeoutException0.getPath();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        org.apache.zookeeper.KeeperException.Code code4 = requestTimeoutException0.code();
        java.lang.Class<?> wildcardClass5 = code4.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException0 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        int int1 = invalidACLException0.getCode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114) + "'", int1 == (-114));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Throwable[] throwableArray2 = noNodeException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException();
        invalidCallbackException0.addSuppressed((java.lang.Throwable) badVersionException1);
        java.lang.String str3 = invalidCallbackException0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str3, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException0.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.zookeeper.KeeperException.OperationTimeoutException operationTimeoutException0 = new org.apache.zookeeper.KeeperException.OperationTimeoutException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = operationTimeoutException0.getResults();
        int int2 = operationTimeoutException0.getCode();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        java.lang.String str1 = invalidCallbackException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str1, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        int int1 = code0.intValue();
        java.lang.Class<?> wildcardClass2 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-102) + "'", int1 == (-102));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        int int2 = notEmptyException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-120));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        java.lang.String str2 = newConfigNoQuorum0.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = newConfigNoQuorum0.getResults();
        java.lang.String str4 = newConfigNoQuorum0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str4, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-111));
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) keeperException3);
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-121));
        java.lang.String str2 = keeperException1.getPath();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException0 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        java.lang.String str1 = noChildrenForEphemeralsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str1, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("hi!");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("hi!");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-114));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        java.lang.String str3 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str3, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.getPath();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException();
        invalidCallbackException0.addSuppressed((java.lang.Throwable) badVersionException1);
        java.lang.Class<?> wildcardClass3 = badVersionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException3 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum4 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        runtimeInconsistencyException3.addSuppressed((java.lang.Throwable) newConfigNoQuorum4);
        badArgumentsException1.addSuppressed((java.lang.Throwable) newConfigNoQuorum4);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        java.lang.String str3 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str3, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        // The following exception was thrown during execution in test generation
        try {
            noAuthException0.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        java.lang.String str1 = authFailedException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed" + "'", str1, "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        // The following exception was thrown during execution in test generation
        try {
            noChildrenForEphemeralsException1.setCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode(0);
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException5 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException5);
        int int7 = noChildrenForEphemeralsException5.getCode();
        int int8 = noChildrenForEphemeralsException5.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-108) + "'", int7 == (-108));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-108) + "'", int8 == (-108));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException0 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException0.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-111));
        java.lang.Throwable[] throwableArray2 = keeperException1.getSuppressed();
        java.lang.String str3 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty" + "'", str3, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OK;
        int int1 = code0.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        java.lang.String str5 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-121));
        int int2 = keeperException1.getCode();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.String str2 = badVersionException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str2, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass7 = keeperException6.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        // The following exception was thrown during execution in test generation
        try {
            sessionClosedRequireAuthException1.setCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        int int3 = badArgumentsException1.getCode();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        java.lang.String str3 = nodeExistsException1.toString();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-121));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int4 = sessionClosedRequireAuthException3.getCode();
        quotaExceededException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
        java.lang.Class<?> wildcardClass6 = quotaExceededException1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException0 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException2 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code3 = noNodeException2.code();
        invalidACLException0.addSuppressed((java.lang.Throwable) noNodeException2);
        java.lang.Throwable[] throwableArray5 = invalidACLException0.getSuppressed();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        // The following exception was thrown during execution in test generation
        try {
            nodeExistsException1.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        java.lang.String str2 = nodeExistsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.String str2 = noChildrenForEphemeralsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str2, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        java.lang.Class<?> wildcardClass5 = keeperException4.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        int int2 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = noAuthException0.getResults();
        org.junit.Assert.assertNull(opResultList1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        java.lang.Class<?> wildcardClass3 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str2, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int4 = sessionClosedRequireAuthException3.getCode();
        quotaExceededException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException7 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException1.addSuppressed((java.lang.Throwable) badVersionException7);
        // The following exception was thrown during execution in test generation
        try {
            badVersionException7.setCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        notEmptyException1.setCode(0);
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            notEmptyException1.addSuppressed(throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException1.setCode((int) (short) 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        java.lang.String str3 = nodeExistsException1.getPath();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException3 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        quotaExceededException1.addSuppressed((java.lang.Throwable) noNodeException3);
        quotaExceededException1.setCode((int) (byte) 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "hi!");
        int int5 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        java.lang.Class<?> wildcardClass2 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException2 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        badArgumentsException1.addSuppressed((java.lang.Throwable) sessionExpiredException2);
        // The following exception was thrown during execution in test generation
        try {
            sessionExpiredException2.setCode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-14));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.lang.Class<?> wildcardClass2 = quotaExceededException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException();
        invalidCallbackException0.addSuppressed((java.lang.Throwable) badVersionException1);
        org.apache.zookeeper.KeeperException.Code code3 = badVersionException1.code();
        int int4 = code3.intValue();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-103) + "'", int4 == (-103));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException();
        invalidCallbackException0.addSuppressed((java.lang.Throwable) badVersionException1);
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = invalidCallbackException0.getResults();
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-120));
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session" + "'", str2, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-114));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass2 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        quotaExceededException1.setCode((-7));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = keeperException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("");
        java.lang.Throwable[] throwableArray2 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-13));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OK;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        java.lang.String str2 = invalidACLException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException5 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum6 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        runtimeInconsistencyException5.addSuppressed((java.lang.Throwable) newConfigNoQuorum6);
        java.lang.Throwable[] throwableArray8 = newConfigNoQuorum6.getSuppressed();
        keeperException3.addSuppressed((java.lang.Throwable) newConfigNoQuorum6);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = nodeExistsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.String str3 = noWatcherException1.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str3, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int2 = nodeExistsException1.getCode();
        int int3 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        int int4 = noChildrenForEphemeralsException1.getCode();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code6 = quotaExceededException5.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code6);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6);
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) keeperException8);
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = keeperException8.getResults();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create((-111));
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) keeperException3);
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-14));
        java.lang.Class<?> wildcardClass2 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("");
        nodeExistsException1.setCode((-110));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        java.lang.Class<?> wildcardClass2 = notEmptyException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        reconfigDisabledException1.setCode((-14));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        invalidACLException1.addSuppressed((java.lang.Throwable) badVersionException3);
        java.lang.Class<?> wildcardClass5 = badVersionException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("hi!");
        sessionClosedRequireAuthException1.setCode((-120));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = opResultList2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        // The following exception was thrown during execution in test generation
        try {
            badVersionException1.setCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        int int4 = noChildrenForEphemeralsException1.getCode();
        noChildrenForEphemeralsException1.setCode(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum1);
        java.lang.String str3 = newConfigNoQuorum1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str3, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(1, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.addSuppressed(throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException0 = new org.apache.zookeeper.KeeperException.NotEmptyException();
        java.lang.String str1 = notEmptyException0.getPath();
        int int2 = notEmptyException0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        java.lang.Throwable[] throwableArray1 = noAuthException0.getSuppressed();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        int int4 = newConfigNoQuorum2.getCode();
        noAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str6 = noAuthException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth" + "'", str6, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        // The following exception was thrown during execution in test generation
        try {
            nodeExistsException1.setCode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException2 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        badArgumentsException1.addSuppressed((java.lang.Throwable) sessionExpiredException2);
        java.lang.String str4 = sessionExpiredException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired" + "'", str4, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        // The following exception was thrown during execution in test generation
        try {
            keeperException1.setCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get(0);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException0 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.lang.Class<?> wildcardClass1 = ephemeralOnLocalSessionException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OK;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 10, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = reconfigDisabledException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(10, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-101));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-123));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray4 = quotaExceededException3.getSuppressed();
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str5 = sessionClosedRequireAuthException4.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = sessionClosedRequireAuthException4.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        // The following exception was thrown during execution in test generation
        try {
            sessionClosedRequireAuthException4.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str5, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        java.lang.String str2 = sessionClosedRequireAuthException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        int int2 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException4.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-123) + "'", int3 == (-123));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        int int5 = keeperException4.getCode();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-7) + "'", int5 == (-7));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            keeperException4.addSuppressed(throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
        java.lang.Class<?> wildcardClass2 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        keeperException2.setCode((-121));
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = noNodeException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass2 = badVersionException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        org.apache.zookeeper.KeeperException.Code code5 = requestTimeoutException0.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = keeperException8.getResults();
        java.lang.Throwable[] throwableArray10 = keeperException8.getSuppressed();
        java.lang.String str11 = keeperException8.getPath();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-122) + "'", int6 == (-122));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertArrayEquals(throwableArray10, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str11, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-1));
        int int2 = keeperException1.getCode();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-102), "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONMOVED;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str2 = keeperException1.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONMOVED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONMOVED));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        org.apache.zookeeper.KeeperException.Code code4 = noChildrenForEphemeralsException1.code();
        int int5 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-108) + "'", int5 == (-108));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-122));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-125));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int2 = reconfigDisabledException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-123) + "'", int2 == (-123));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.zookeeper.KeeperException.DataInconsistencyException dataInconsistencyException0 = new org.apache.zookeeper.KeeperException.DataInconsistencyException();
        // The following exception was thrown during execution in test generation
        try {
            dataInconsistencyException0.setCode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.lang.Throwable[] throwableArray1 = nodeExistsException0.getSuppressed();
        java.lang.Class<?> wildcardClass2 = nodeExistsException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "hi!");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.Class<?> wildcardClass7 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-114), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-103));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = quotaExceededException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.String str2 = reconfigDisabledException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException0 = new org.apache.zookeeper.KeeperException.BadArgumentsException();
        java.lang.String str1 = badArgumentsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str1, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        notEmptyException1.setCode(0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        int int7 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-3));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        java.lang.String str2 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode((-7));
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray7 = noChildrenForEphemeralsException6.getSuppressed();
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create((-3), "hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList11 = keeperException10.getResults();
        noChildrenForEphemeralsException6.addSuppressed((java.lang.Throwable) keeperException10);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) keeperException10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertNull(opResultList11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        // The following exception was thrown during execution in test generation
        try {
            noWatcherException1.setCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = keeperException3.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-113) + "'", int4 == (-113));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.zookeeper.KeeperException.AuthFailedException authFailedException0 = new org.apache.zookeeper.KeeperException.AuthFailedException();
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.String str5 = keeperException4.getPath();
        authFailedException0.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException3 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        sessionClosedRequireAuthException1.addSuppressed((java.lang.Throwable) invalidACLException3);
        java.lang.Class<?> wildcardClass5 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-123), "");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException0 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.lang.Throwable[] throwableArray1 = ephemeralOnLocalSessionException0.getSuppressed();
        java.lang.String str2 = ephemeralOnLocalSessionException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session" + "'", str2, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 1, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADVERSION;
        java.lang.Class<?> wildcardClass1 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException3.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADVERSION;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-103) + "'", int1 == (-103));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        keeperException1.setCode((-123));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.String str2 = noWatcherException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1);
        java.lang.String str4 = keeperException3.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError" + "'", str4, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum0.getPath();
        java.lang.String str8 = newConfigNoQuorum0.getPath();
        java.lang.Class<?> wildcardClass9 = newConfigNoQuorum0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        keeperException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int2 = noWatcherException1.getCode();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum3.setCode(0);
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException8 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        newConfigNoQuorum3.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException8);
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = noChildrenForEphemeralsException8.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(opResultList10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException0 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException2 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code3 = noNodeException2.code();
        invalidACLException0.addSuppressed((java.lang.Throwable) noNodeException2);
        java.lang.String str5 = noNodeException2.toString();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.Throwable[] throwableArray2 = noNodeException1.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            noNodeException1.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.Class<?> wildcardClass2 = noWatcherException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        int int6 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-120) + "'", int6 == (-120));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        java.lang.Class<?> wildcardClass3 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        java.lang.Throwable[] throwableArray3 = sessionClosedRequireAuthException1.getSuppressed();
        java.lang.String str4 = sessionClosedRequireAuthException1.getPath();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok" + "'", str4, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass2 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.zookeeper.KeeperException.InvalidCallbackException invalidCallbackException0 = new org.apache.zookeeper.KeeperException.InvalidCallbackException();
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException();
        invalidCallbackException0.addSuppressed((java.lang.Throwable) badVersionException1);
        int int3 = badVersionException1.getCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        int int5 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 100, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.lang.Class<?> wildcardClass2 = sessionClosedRequireAuthException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.DataInconsistencyException dataInconsistencyException2 = new org.apache.zookeeper.KeeperException.DataInconsistencyException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = dataInconsistencyException2.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) dataInconsistencyException2);
        java.lang.Throwable[] throwableArray5 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-121), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException2.setCode((int) (short) 0);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.OK));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = quotaExceededException1.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = quotaExceededException1.getResults();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badVersionException1.getResults();
        java.lang.Throwable[] throwableArray3 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.String str4 = keeperException3.getPath();
        // The following exception was thrown during execution in test generation
        try {
            keeperException3.setCode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        java.lang.String str2 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode((-7));
        java.lang.Throwable[] throwableArray5 = newConfigNoQuorum0.getSuppressed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.zookeeper.KeeperException.MarshallingErrorException marshallingErrorException0 = new org.apache.zookeeper.KeeperException.MarshallingErrorException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = marshallingErrorException0.getResults();
        java.lang.String str2 = marshallingErrorException0.toString();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str2, "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-110), "org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        java.lang.String str2 = noWatcherException1.getPath();
        int int3 = noWatcherException1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        java.lang.Throwable[] throwableArray1 = noAuthException0.getSuppressed();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        int int4 = newConfigNoQuorum2.getCode();
        noAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = newConfigNoQuorum2.getResults();
        java.lang.String str7 = newConfigNoQuorum2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str7, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.Class<?> wildcardClass2 = quotaExceededException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code4);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int7 = keeperException6.getCode();
        keeperException6.setCode((int) (byte) 0);
        int int10 = keeperException6.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-124) + "'", int7 == (-124));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str4 = quotaExceededException2.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str4, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 10, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        int int3 = keeperException2.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-110) + "'", int3 == (-110));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str4 = quotaExceededException2.getPath();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException6);
        java.lang.String str8 = quotaExceededException2.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str8, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        java.lang.String str2 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode((-7));
        org.apache.zookeeper.KeeperException.Code code5 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.Code code8 = keeperException7.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code8);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) keeperException9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) -1, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        int int2 = quotaExceededException0.getCode();
        java.lang.Throwable[] throwableArray3 = quotaExceededException0.getSuppressed();
        // The following exception was thrown during execution in test generation
        try {
            quotaExceededException0.setCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-125) + "'", int2 == (-125));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-102));
        java.lang.String str2 = keeperException1.getPath();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        org.apache.zookeeper.KeeperException.Code code4 = requestTimeoutException0.code();
        java.lang.String str5 = requestTimeoutException0.getPath();
        java.lang.String str6 = requestTimeoutException0.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str6, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        reconfigDisabledException1.setCode((-13));
        org.apache.zookeeper.KeeperException.Code code4 = reconfigDisabledException1.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = reconfigDisabledException1.getResults();
        java.lang.Throwable[] throwableArray4 = reconfigDisabledException1.getSuppressed();
        int int5 = reconfigDisabledException1.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = reconfigDisabledException1.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = reconfigDisabledException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-123) + "'", int5 == (-123));
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNull(opResultList7);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int2 = notEmptyException1.getCode();
        java.lang.Class<?> wildcardClass3 = notEmptyException1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = keeperException1.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        // The following exception was thrown during execution in test generation
        try {
            badVersionException1.setCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int4 = sessionClosedRequireAuthException3.getCode();
        quotaExceededException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException7 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException1.addSuppressed((java.lang.Throwable) badVersionException7);
        java.lang.String str9 = badVersionException7.getPath();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str9, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        java.lang.String str4 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str4, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        badArgumentsException1.setCode((-112));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = reconfigDisabledException1.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = reconfigDisabledException1.getResults();
        java.lang.Throwable[] throwableArray4 = reconfigDisabledException1.getSuppressed();
        java.lang.String str5 = reconfigDisabledException1.toString();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!" + "'", str5, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        int int6 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-120) + "'", int4 == (-120));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-120) + "'", int6 == (-120));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        runtimeInconsistencyException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum1);
        runtimeInconsistencyException0.setCode((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException0 = new org.apache.zookeeper.KeeperException.NoWatcherException();
        noWatcherException0.setCode((int) (short) -1);
        java.lang.Throwable[] throwableArray3 = noWatcherException0.getSuppressed();
        noWatcherException0.setCode((-7));
        java.lang.String str6 = noWatcherException0.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout" + "'", str6, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.String str3 = keeperException2.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session" + "'", str3, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str4 = quotaExceededException2.getPath();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException6);
        java.lang.String str8 = noChildrenForEphemeralsException6.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str8, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException5 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        quotaExceededException3.addSuppressed((java.lang.Throwable) noNodeException5);
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException7 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        noNodeException5.addSuppressed((java.lang.Throwable) runtimeInconsistencyException7);
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) runtimeInconsistencyException7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str3, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badVersionException1.getResults();
        java.lang.String str3 = badVersionException1.getPath();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str3, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.Code code1 = runtimeInconsistencyException0.code();
        // The following exception was thrown during execution in test generation
        try {
            runtimeInconsistencyException0.setCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-110));
        int int2 = code1.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str3, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        notEmptyException1.setCode(0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = notEmptyException1.getResults();
        org.junit.Assert.assertNull(opResultList4);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        reconfigDisabledException1.setCode((-112));
        java.lang.Class<?> wildcardClass4 = reconfigDisabledException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int5 = keeperException4.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-123) + "'", int5 == (-123));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = badArgumentsException1.getResults();
        badArgumentsException1.setCode((-120));
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        java.lang.Class<?> wildcardClass1 = quotaExceededException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException6 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException4.addSuppressed((java.lang.Throwable) badArgumentsException6);
        org.apache.zookeeper.KeeperException.Code code8 = badArgumentsException6.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code8);
        keeperException2.addSuppressed((java.lang.Throwable) keeperException9);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        java.lang.String str1 = requestTimeoutException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str1, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException0 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        noChildrenForEphemeralsException0.setCode((-112));
        int int3 = noChildrenForEphemeralsException0.getCode();
        java.lang.String str4 = noChildrenForEphemeralsException0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-112) + "'", int3 == (-112));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = Session expired" + "'", str4, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Class<?> wildcardClass2 = nodeExistsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-3), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-124));
        keeperException1.setCode((-3));
        org.junit.Assert.assertNotNull(keeperException1);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        org.apache.zookeeper.KeeperException.Code code4 = noChildrenForEphemeralsException1.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        int int7 = code4.intValue();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-108) + "'", int7 == (-108));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-113));
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        int int5 = requestTimeoutException0.getCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-122) + "'", int5 == (-122));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException6.setCode((-110));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException0 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code1 = quotaExceededException0.code();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        keeperException2.setCode((-121));
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noNodeException1.setCode(0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-125));
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = keeperException1.getResults();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException0 = new org.apache.zookeeper.KeeperException.NodeExistsException();
        java.lang.Throwable[] throwableArray1 = nodeExistsException0.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException0.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 10, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-1), "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code4 = noWatcherException3.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "");
        badVersionException1.addSuppressed((java.lang.Throwable) keeperException6);
        org.apache.zookeeper.KeeperException.Code code8 = keeperException6.code();
        java.lang.Throwable[] throwableArray9 = keeperException6.getSuppressed();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (short) 100, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }
}

