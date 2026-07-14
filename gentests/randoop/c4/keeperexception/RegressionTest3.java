package org.apache.zookeeper.test.randoop.c4.keeperexception;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        int int4 = noWatcherException2.getCode();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        keeperException7.setCode((-123));
        org.apache.zookeeper.KeeperException.Code code10 = keeperException7.code();
        int int11 = code10.intValue();
        int int12 = code10.intValue();
        org.apache.zookeeper.KeeperException keeperException14 = org.apache.zookeeper.KeeperException.create(code10, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = Session expired");
        noWatcherException2.addSuppressed((java.lang.Throwable) keeperException14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-123) + "'", int12 == (-123));
        org.junit.Assert.assertNotNull(keeperException14);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum0.getPath();
        java.lang.String str8 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.Code code9 = newConfigNoQuorum0.code();
        int int10 = code9.intValue();
        org.apache.zookeeper.KeeperException keeperException12 = org.apache.zookeeper.KeeperException.create(code9, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int13 = code9.intValue();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-13) + "'", int10 == (-13));
        org.junit.Assert.assertNotNull(keeperException12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-13) + "'", int13 == (-13));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        int int3 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.zookeeper.KeeperException.Code code0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
        badVersionException1.setCode((-112));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.Class<?> wildcardClass2 = noNodeException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        int int4 = noChildrenForEphemeralsException1.getCode();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException5 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        org.apache.zookeeper.KeeperException.Code code6 = quotaExceededException5.code();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code6);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6);
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) keeperException8);
        java.lang.String str10 = noChildrenForEphemeralsException1.getPath();
        java.lang.Class<?> wildcardClass11 = noChildrenForEphemeralsException1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-108) + "'", int4 == (-108));
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "hi!");
        java.lang.Class<?> wildcardClass5 = code1.getClass();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = quotaExceededException1.getResults();
        java.lang.Class<?> wildcardClass3 = quotaExceededException1.getClass();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.Code code1 = runtimeInconsistencyException0.code();
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        int int5 = keeperException4.getCode();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int2 = nodeExistsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-110) + "'", int2 == (-110));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        // The following exception was thrown during execution in test generation
        try {
            badVersionException1.setCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("");
        // The following exception was thrown during execution in test generation
        try {
            reconfigDisabledException1.setCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114) + "'", int1 == (-114));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-114), "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        int int7 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-101) + "'", int7 == (-101));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session for hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        int int3 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-112) + "'", int2 == (-112));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-112) + "'", int3 == (-112));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.Class<?> wildcardClass2 = invalidACLException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-5), "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        org.apache.zookeeper.KeeperException.Code code4 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "");
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        reconfigDisabledException2.addSuppressed((java.lang.Throwable) keeperException8);
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = reconfigDisabledException2.getResults();
        int int11 = reconfigDisabledException2.getCode();
        java.util.List<org.apache.zookeeper.OpResult> opResultList12 = reconfigDisabledException2.getResults();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-123) + "'", int11 == (-123));
        org.junit.Assert.assertNull(opResultList12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-122));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = keeperException6.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNull(opResultList7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        keeperException1.setCode((-3));
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException4 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        keeperException1.addSuppressed((java.lang.Throwable) invalidACLException4);
        int int6 = invalidACLException4.getCode();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int3 = keeperException2.getCode();
        keeperException2.setCode((-122));
        java.lang.Class<?> wildcardClass6 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102) + "'", int3 == (-102));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.String str2 = noNodeException1.getPath();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException4 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        java.lang.String str5 = notEmptyException4.getPath();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException7 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        notEmptyException7.setCode((-121));
        notEmptyException4.addSuppressed((java.lang.Throwable) notEmptyException7);
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException12 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        notEmptyException4.addSuppressed((java.lang.Throwable) nodeExistsException12);
        noNodeException1.addSuppressed((java.lang.Throwable) notEmptyException4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("hi!");
        int int2 = badVersionException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-103) + "'", int2 == (-103));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code5 = keeperException4.code();
        java.lang.String str6 = keeperException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum" + "'", str6, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.zookeeper.KeeperException.RuntimeInconsistencyException runtimeInconsistencyException0 = new org.apache.zookeeper.KeeperException.RuntimeInconsistencyException();
        org.apache.zookeeper.KeeperException.Code code1 = runtimeInconsistencyException0.code();
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = Session expired");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.RUNTIMEINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException8 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        keeperException6.addSuppressed((java.lang.Throwable) reconfigDisabledException8);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str2 = newConfigNoQuorum1.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum3.setCode(0);
        newConfigNoQuorum1.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.lang.Throwable[] throwableArray8 = newConfigNoQuorum3.getSuppressed();
        systemErrorException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        int int10 = systemErrorException0.getCode();
        java.lang.String str11 = systemErrorException0.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError" + "'", str11, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        org.apache.zookeeper.KeeperException.Code code5 = requestTimeoutException0.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = keeperException8.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList10 = keeperException8.getResults();
        int int11 = keeperException8.getCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-122) + "'", int6 == (-122));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList9);
        org.junit.Assert.assertNull(opResultList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-122) + "'", int11 == (-122));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.String str2 = notEmptyException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!" + "'", str2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        keeperException1.setCode((-3));
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException4 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        keeperException1.addSuppressed((java.lang.Throwable) invalidACLException4);
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = invalidACLException4.getResults();
        java.lang.String str7 = invalidACLException4.getPath();
        int int8 = invalidACLException4.getCode();
        java.lang.Class<?> wildcardClass9 = invalidACLException4.getClass();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-114) + "'", int8 == (-114));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
        java.lang.String str5 = keeperException4.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-112) + "'", int1 == (-112));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-112) + "'", int2 == (-112));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok" + "'", str5, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException2 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) reconfigDisabledException2);
        java.lang.String str4 = noChildrenForEphemeralsException1.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = noChildrenForEphemeralsException1.getResults();
        int int6 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(opResultList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-108) + "'", int6 == (-108));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        org.apache.zookeeper.KeeperException.Code code5 = badArgumentsException3.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = keeperException8.getResults();
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.Throwable[] throwableArray2 = badVersionException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.apache.zookeeper.KeeperException.Code code2 = nodeExistsException1.code();
        java.lang.String str3 = nodeExistsException1.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str3, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDACL;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        java.lang.Class<?> wildcardClass3 = keeperException2.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-114) + "'", int1 == (-114));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-121), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException2.setCode((int) (short) 0);
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException2.getResults();
        keeperException2.setCode((-111));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code4 = noWatcherException3.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "");
        badVersionException1.addSuppressed((java.lang.Throwable) keeperException6);
        org.apache.zookeeper.KeeperException.Code code8 = keeperException6.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code8);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = SystemError");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.Code code8 = newConfigNoQuorum0.code();
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code8, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException12 = org.apache.zookeeper.KeeperException.create(code8, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertNotNull(keeperException12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int5 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-123) + "'", int5 == (-123));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "hi!");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = Session expired");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException3 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) badArgumentsException3);
        org.apache.zookeeper.KeeperException.Code code5 = badArgumentsException3.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        keeperException8.setCode((-13));
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        int int2 = code1.intValue();
        int int3 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException0 = new org.apache.zookeeper.KeeperException.NoWatcherException();
        noWatcherException0.setCode((int) (short) -1);
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException4 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        noWatcherException0.addSuppressed((java.lang.Throwable) badArgumentsException4);
        java.lang.Throwable[] throwableArray6 = badArgumentsException4.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum0.getPath();
        java.lang.String str8 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.Code code9 = newConfigNoQuorum0.code();
        int int10 = code9.intValue();
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code9);
        org.apache.zookeeper.KeeperException keeperException12 = org.apache.zookeeper.KeeperException.create(code9);
        java.lang.Throwable[] throwableArray13 = keeperException12.getSuppressed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-13) + "'", int10 == (-13));
        org.junit.Assert.assertNotNull(keeperException11);
        org.junit.Assert.assertNotNull(keeperException12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertArrayEquals(throwableArray13, new java.lang.Throwable[] {});
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        int int2 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        keeperException1.setCode((-3));
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException4 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        keeperException1.addSuppressed((java.lang.Throwable) invalidACLException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException1.code();
        int int7 = keeperException1.getCode();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = noNodeException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("");
        org.apache.zookeeper.KeeperException.SessionExpiredException sessionExpiredException2 = new org.apache.zookeeper.KeeperException.SessionExpiredException();
        badArgumentsException1.addSuppressed((java.lang.Throwable) sessionExpiredException2);
        java.lang.String str4 = sessionExpiredException2.getPath();
        org.apache.zookeeper.KeeperException.Code code5 = sessionExpiredException2.code();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int3 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        int int2 = noNodeException1.getCode();
        noNodeException1.setCode((-101));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        int int2 = noNodeException1.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-101) + "'", int2 == (-101));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("hi!");
        noChildrenForEphemeralsException1.setCode((-5));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        int int4 = code3.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.String str7 = keeperException6.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str7, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        java.lang.String str1 = requestTimeoutException0.getPath();
        int int2 = requestTimeoutException0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-122) + "'", int2 == (-122));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        int int2 = badVersionException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-103) + "'", int2 == (-103));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code3 = org.apache.zookeeper.KeeperException.Code.get((-127));
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code3);
        reconfigDisabledException1.addSuppressed((java.lang.Throwable) keeperException4);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException3 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        java.lang.String str4 = notEmptyException3.getPath();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException6 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        notEmptyException6.setCode((-121));
        notEmptyException3.addSuppressed((java.lang.Throwable) notEmptyException6);
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException11 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        notEmptyException3.addSuppressed((java.lang.Throwable) nodeExistsException11);
        quotaExceededException1.addSuppressed((java.lang.Throwable) notEmptyException3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session for hi!");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.String str2 = quotaExceededException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str2, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        int int2 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        badArgumentsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        java.lang.String str5 = badVersionException3.getPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.SYSTEMERROR;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int5 = code0.intValue();
        int int6 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        org.apache.zookeeper.KeeperException.Code code4 = requestTimeoutException0.code();
        int int5 = requestTimeoutException0.getCode();
        int int6 = requestTimeoutException0.getCode();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-122) + "'", int5 == (-122));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-122) + "'", int6 == (-122));
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        java.lang.String str4 = keeperException2.getPath();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout" + "'", str4, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = nodeExistsException1.getResults();
        java.lang.Throwable[] throwableArray3 = nodeExistsException1.getSuppressed();
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException5 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        notEmptyException5.setCode(0);
        nodeExistsException1.addSuppressed((java.lang.Throwable) notEmptyException5);
        notEmptyException5.setCode((-7));
        java.lang.Throwable[] throwableArray11 = notEmptyException5.getSuppressed();
        java.lang.String str12 = notEmptyException5.toString();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = OperationTimeout" + "'", str12, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = noWatcherException1.getSuppressed();
        int int3 = noWatcherException1.getCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = SystemError");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        int int4 = newConfigNoQuorum2.getCode();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum5 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str6 = newConfigNoQuorum5.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum7 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str8 = newConfigNoQuorum7.getPath();
        newConfigNoQuorum7.setCode(0);
        newConfigNoQuorum5.addSuppressed((java.lang.Throwable) newConfigNoQuorum7);
        java.lang.String str12 = newConfigNoQuorum5.getPath();
        newConfigNoQuorum2.addSuppressed((java.lang.Throwable) newConfigNoQuorum5);
        noNodeException1.addSuppressed((java.lang.Throwable) newConfigNoQuorum5);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException8 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException10 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        sessionClosedRequireAuthException8.addSuppressed((java.lang.Throwable) invalidACLException10);
        invalidACLException10.setCode((-111));
        keeperException6.addSuppressed((java.lang.Throwable) invalidACLException10);
        keeperException6.setCode((-2));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = SystemError");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-121) + "'", int4 == (-121));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = noNodeException1.getSuppressed();
        java.lang.String str3 = noNodeException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str3, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException3 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session for hi!");
        notEmptyException1.addSuppressed((java.lang.Throwable) reconfigDisabledException3);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        int int3 = badArgumentsException1.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException0 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = ephemeralOnLocalSessionException0.getResults();
        ephemeralOnLocalSessionException0.setCode((-102));
        org.apache.zookeeper.KeeperException.Code code4 = ephemeralOnLocalSessionException0.code();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code4);
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        badArgumentsException1.setCode((-125));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        badArgumentsException1.setCode((-112));
        org.apache.zookeeper.KeeperException.Code code4 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code7 = keeperException6.code();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code7);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str2 = newConfigNoQuorum1.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum3.setCode(0);
        newConfigNoQuorum1.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.lang.Throwable[] throwableArray8 = newConfigNoQuorum3.getSuppressed();
        systemErrorException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException11 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        int int12 = noNodeException11.getCode();
        systemErrorException0.addSuppressed((java.lang.Throwable) noNodeException11);
        java.lang.Throwable[] throwableArray14 = noNodeException11.getSuppressed();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-101) + "'", int12 == (-101));
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertArrayEquals(throwableArray14, new java.lang.Throwable[] {});
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-14), "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray3 = keeperException2.getSuppressed();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException5 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code6 = noWatcherException5.code();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException2.addSuppressed((java.lang.Throwable) keeperException8);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass2 = badArgumentsException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noNodeException1.setCode((-111));
        org.apache.zookeeper.KeeperException.Code code4 = noNodeException1.code();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = invalidACLException1.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        int int6 = keeperException5.getCode();
        int int7 = keeperException5.getCode();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDACL + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.INVALIDACL));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-114) + "'", int3 == (-114));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-114) + "'", int6 == (-114));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-114) + "'", int7 == (-114));
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException5.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = keeperException5.getResults();
        org.apache.zookeeper.KeeperException.Code code8 = keeperException5.code();
        int int9 = code8.intValue();
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code8, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNull(opResultList6);
        org.junit.Assert.assertNull(opResultList7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-120) + "'", int9 == (-120));
        org.junit.Assert.assertNotNull(keeperException11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        int int2 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        int int2 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int5 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-14) + "'", int2 == (-14));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-14) + "'", int5 == (-14));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.String str2 = noChildrenForEphemeralsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        keeperException6.setCode((-124));
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        java.lang.Throwable[] throwableArray2 = notEmptyException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        java.lang.Class<?> wildcardClass2 = noWatcherException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.apache.zookeeper.KeeperException.Code code5 = keeperException2.code();
        int int6 = code5.intValue();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments" + "'", str3, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.lang.String str2 = badVersionException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled" + "'", str2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        java.lang.Class<?> wildcardClass3 = code2.getClass();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-7));
        keeperException1.setCode((-3));
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException4 = new org.apache.zookeeper.KeeperException.InvalidACLException();
        keeperException1.addSuppressed((java.lang.Throwable) invalidACLException4);
        org.apache.zookeeper.KeeperException.Code code6 = keeperException1.code();
        java.lang.String str7 = keeperException1.toString();
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = DataInconsistency" + "'", str7, "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.Class<?> wildcardClass4 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noWatcherException1.getResults();
        org.apache.zookeeper.KeeperException.Code code3 = noWatcherException1.code();
        org.junit.Assert.assertNull(opResultList2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        java.lang.Throwable[] throwableArray2 = quotaExceededException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        java.lang.Throwable[] throwableArray2 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException0 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList1 = ephemeralOnLocalSessionException0.getResults();
        ephemeralOnLocalSessionException0.setCode((-102));
        org.apache.zookeeper.KeeperException.Code code4 = ephemeralOnLocalSessionException0.code();
        java.lang.String str5 = ephemeralOnLocalSessionException0.toString();
        org.junit.Assert.assertNull(opResultList1);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = NoAuth" + "'", str5, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        java.lang.Class<?> wildcardClass2 = invalidACLException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = sessionClosedRequireAuthException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int7 = keeperException6.getCode();
        java.lang.String str8 = keeperException6.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-124) + "'", int4 == (-124));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-124) + "'", int7 == (-124));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str8, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        java.lang.String str2 = notEmptyException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session" + "'", str2, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-121) + "'", int3 == (-121));
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str4 = quotaExceededException2.getPath();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException6);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = noChildrenForEphemeralsException6.getResults();
        java.util.List<org.apache.zookeeper.OpResult> opResultList9 = noChildrenForEphemeralsException6.getResults();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(opResultList8);
        org.junit.Assert.assertNull(opResultList9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException0 = new org.apache.zookeeper.KeeperException.NoNodeException();
        java.lang.Throwable[] throwableArray1 = noNodeException0.getSuppressed();
        java.lang.String str2 = noNodeException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.Code code2 = badVersionException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.THROTTLEDOP;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        int int5 = keeperException4.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-127) + "'", int5 == (-127));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        int int4 = keeperException3.getCode();
        java.lang.String str5 = keeperException3.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str5, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        java.lang.Throwable[] throwableArray5 = requestTimeoutException0.getSuppressed();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "");
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = keeperException4.getResults();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        newConfigNoQuorum0.setCode(0);
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException5 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("");
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException5);
        int int7 = noChildrenForEphemeralsException5.getCode();
        // The following exception was thrown during execution in test generation
        try {
            noChildrenForEphemeralsException5.setCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-108) + "'", int7 == (-108));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-127));
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        int int3 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-127) + "'", int3 == (-127));
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.Throwable[] throwableArray2 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException6 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        keeperException3.addSuppressed((java.lang.Throwable) nodeExistsException6);
        java.lang.String str8 = keeperException3.getPath();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-14) + "'", int1 == (-14));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGINPROGRESS));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-7), "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        int int4 = code3.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        java.lang.Throwable[] throwableArray7 = keeperException6.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertArrayEquals(throwableArray7, new java.lang.Throwable[] {});
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.zookeeper.KeeperException.NoAuthException noAuthException0 = new org.apache.zookeeper.KeeperException.NoAuthException();
        java.lang.Throwable[] throwableArray1 = noAuthException0.getSuppressed();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        int int4 = newConfigNoQuorum2.getCode();
        noAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum6 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str7 = newConfigNoQuorum6.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum8 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str9 = newConfigNoQuorum8.getPath();
        newConfigNoQuorum8.setCode(0);
        newConfigNoQuorum6.addSuppressed((java.lang.Throwable) newConfigNoQuorum8);
        java.util.List<org.apache.zookeeper.OpResult> opResultList13 = newConfigNoQuorum6.getResults();
        noAuthException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum6);
        org.apache.zookeeper.KeeperException keeperException17 = org.apache.zookeeper.KeeperException.create((-121), "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException17.setCode((int) (short) 0);
        org.apache.zookeeper.KeeperException.Code code20 = keeperException17.code();
        noAuthException0.addSuppressed((java.lang.Throwable) keeperException17);
        int int22 = noAuthException0.getCode();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertArrayEquals(throwableArray1, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-13) + "'", int4 == (-13));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(opResultList13);
        org.junit.Assert.assertNotNull(keeperException17);
        org.junit.Assert.assertTrue("'" + code20 + "' != '" + org.apache.zookeeper.KeeperException.Code.OK + "'", code20.equals(org.apache.zookeeper.KeeperException.Code.OK));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-102) + "'", int22 == (-102));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code2);
        java.lang.String str9 = keeperException8.toString();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode" + "'", str9, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTREADONLY;
        int int1 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTREADONLY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTREADONLY));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-119) + "'", int1 == (-119));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        int int2 = noWatcherException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-121) + "'", int2 == (-121));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-3), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        int int4 = quotaExceededException3.getCode();
        notEmptyException1.addSuppressed((java.lang.Throwable) quotaExceededException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-125) + "'", int4 == (-125));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        int int6 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-123) + "'", int6 == (-123));
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) -1, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "");
        java.lang.Throwable[] throwableArray5 = keeperException4.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = keeperException4.getResults();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOTEMPTY;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-125), "org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        java.lang.String str3 = keeperException2.toString();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.UNIMPLEMENTED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!" + "'", str3, "org.apache.zookeeper.KeeperException$UnimplementedException: KeeperErrorCode = Unimplemented for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        noChildrenForEphemeralsException1.setCode((-114));
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        int int1 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-7) + "'", int1 == (-7));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-127));
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        keeperException4.setCode((-5));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.THROTTLEDOP + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.THROTTLEDOP));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session for hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.Code code1 = requestTimeoutException0.code();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException2 = new org.apache.zookeeper.KeeperException.QuotaExceededException();
        requestTimeoutException0.addSuppressed((java.lang.Throwable) quotaExceededException2);
        java.lang.String str4 = quotaExceededException2.getPath();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException6 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        quotaExceededException2.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException6);
        java.lang.Throwable[] throwableArray8 = noChildrenForEphemeralsException6.getSuppressed();
        java.lang.String str9 = noChildrenForEphemeralsException6.toString();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved" + "'", str9, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "");
        org.apache.zookeeper.KeeperException.Code code4 = keeperException3.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertNotNull(keeperException7);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        java.lang.Throwable[] throwableArray3 = quotaExceededException1.getSuppressed();
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException5 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        quotaExceededException1.addSuppressed((java.lang.Throwable) noNodeException5);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertArrayEquals(throwableArray3, new java.lang.Throwable[] {});
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = quotaExceededException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException1 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create((-112), "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        quotaExceededException1.addSuppressed((java.lang.Throwable) keeperException4);
        java.lang.Throwable[] throwableArray6 = keeperException4.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) noWatcherException3);
        java.lang.String str5 = noWatcherException3.getPath();
        int int6 = noWatcherException3.getCode();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-121) + "'", int6 == (-121));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        org.apache.zookeeper.KeeperException.Code code5 = requestTimeoutException0.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        keeperException8.setCode((int) (short) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-122) + "'", int6 == (-122));
        org.junit.Assert.assertNotNull(keeperException8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-3), "hi!");
        java.util.List<org.apache.zookeeper.OpResult> opResultList3 = keeperException2.getResults();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException2.code();
        java.lang.Throwable[] throwableArray5 = keeperException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList3);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.DATAINCONSISTENCY));
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertArrayEquals(throwableArray5, new java.lang.Throwable[] {});
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        newConfigNoQuorum0.setCode((-7));
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create((-121), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) keeperException5);
        int int7 = newConfigNoQuorum0.getCode();
        java.lang.Throwable[] throwableArray8 = newConfigNoQuorum0.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$EphemeralOnLocalSessionException: KeeperErrorCode = Ephemeral node on local session");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException3 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
        org.apache.zookeeper.KeeperException.Code code4 = sessionClosedRequireAuthException3.code();
        nodeExistsException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException3);
        int int6 = sessionClosedRequireAuthException3.getCode();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-124) + "'", int6 == (-124));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException0 = new org.apache.zookeeper.KeeperException.NotEmptyException();
        java.lang.String str1 = notEmptyException0.getPath();
        org.apache.zookeeper.KeeperException.QuotaExceededException quotaExceededException3 = new org.apache.zookeeper.KeeperException.QuotaExceededException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code4 = quotaExceededException3.code();
        notEmptyException0.addSuppressed((java.lang.Throwable) quotaExceededException3);
        int int6 = notEmptyException0.getCode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-111) + "'", int6 == (-111));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = ok");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(100, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) (byte) 0, "org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-111), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException ephemeralOnLocalSessionException3 = new org.apache.zookeeper.KeeperException.EphemeralOnLocalSessionException();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = ephemeralOnLocalSessionException3.getResults();
        ephemeralOnLocalSessionException3.setCode((-102));
        org.apache.zookeeper.KeeperException.Code code7 = ephemeralOnLocalSessionException3.code();
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code7, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException2.addSuppressed((java.lang.Throwable) keeperException9);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException9);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.QUOTAEXCEEDED));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-125) + "'", int4 == (-125));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = reconfigDisabledException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = Unknown error REQUESTTIMEOUT for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException1 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty");
        java.lang.Throwable[] throwableArray2 = noNodeException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum2 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str3 = newConfigNoQuorum2.getPath();
        newConfigNoQuorum2.setCode(0);
        newConfigNoQuorum0.addSuppressed((java.lang.Throwable) newConfigNoQuorum2);
        java.lang.String str7 = newConfigNoQuorum0.getPath();
        java.lang.String str8 = newConfigNoQuorum0.getPath();
        org.apache.zookeeper.KeeperException.Code code9 = newConfigNoQuorum0.code();
        newConfigNoQuorum0.setCode((-102));
        java.lang.String str12 = newConfigNoQuorum0.getPath();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + code9 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code9.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NONODE;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-113), "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        java.lang.String str2 = noChildrenForEphemeralsException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded" + "'", str2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-13), "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = DataInconsistency");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-120), "org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.zookeeper.KeeperException.SystemErrorException systemErrorException0 = new org.apache.zookeeper.KeeperException.SystemErrorException();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum1 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str2 = newConfigNoQuorum1.getPath();
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum3 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str4 = newConfigNoQuorum3.getPath();
        newConfigNoQuorum3.setCode(0);
        newConfigNoQuorum1.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        java.lang.Throwable[] throwableArray8 = newConfigNoQuorum3.getSuppressed();
        systemErrorException0.addSuppressed((java.lang.Throwable) newConfigNoQuorum3);
        org.apache.zookeeper.KeeperException.Code code10 = systemErrorException0.code();
        int int11 = code10.intValue();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertArrayEquals(throwableArray8, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        int int2 = notEmptyException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-111) + "'", int2 == (-111));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = OperationTimeout");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError");
        // The following exception was thrown during execution in test generation
        try {
            noNodeException1.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        java.util.List<org.apache.zookeeper.OpResult> opResultList4 = keeperException2.getResults();
        org.apache.zookeeper.KeeperException.Code code6 = org.apache.zookeeper.KeeperException.Code.get((int) (byte) -1);
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code6);
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code6, "hi!");
        org.apache.zookeeper.KeeperException keeperException11 = org.apache.zookeeper.KeeperException.create(code6, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException13 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException15 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        noChildrenForEphemeralsException13.addSuppressed((java.lang.Throwable) badArgumentsException15);
        keeperException11.addSuppressed((java.lang.Throwable) badArgumentsException15);
        keeperException2.addSuppressed((java.lang.Throwable) badArgumentsException15);
        org.apache.zookeeper.KeeperException.Code code19 = keeperException2.code();
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNull(opResultList4);
        org.junit.Assert.assertTrue("'" + code6 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code6.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException11);
        org.junit.Assert.assertTrue("'" + code19 + "' != '" + org.apache.zookeeper.KeeperException.Code.SYSTEMERROR + "'", code19.equals(org.apache.zookeeper.KeeperException.Code.SYSTEMERROR));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = DataInconsistency");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for hi!");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException3 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code4 = noNodeException3.code();
        int int5 = code4.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4);
        notEmptyException1.addSuppressed((java.lang.Throwable) keeperException6);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = keeperException6.getResults();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-101) + "'", int5 == (-101));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNull(opResultList8);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-5));
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code1);
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.MARSHALLINGERROR));
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException3 = new org.apache.zookeeper.KeeperException.InvalidACLException("hi!");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException5 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        invalidACLException3.addSuppressed((java.lang.Throwable) badVersionException5);
        keeperException1.addSuppressed((java.lang.Throwable) invalidACLException3);
        java.util.List<org.apache.zookeeper.OpResult> opResultList8 = invalidACLException3.getResults();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException10 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code11 = noWatcherException10.code();
        org.apache.zookeeper.KeeperException keeperException13 = org.apache.zookeeper.KeeperException.create(code11, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException keeperException14 = org.apache.zookeeper.KeeperException.create(code11);
        invalidACLException3.addSuppressed((java.lang.Throwable) keeperException14);
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.OPERATIONTIMEOUT));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNull(opResultList8);
        org.junit.Assert.assertTrue("'" + code11 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code11.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException13);
        org.junit.Assert.assertNotNull(keeperException14);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("");
        java.lang.String str2 = notEmptyException1.getPath();
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException4 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        notEmptyException1.addSuppressed((java.lang.Throwable) noChildrenForEphemeralsException4);
        java.lang.Class<?> wildcardClass6 = noChildrenForEphemeralsException4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-112), "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray2 = noChildrenForEphemeralsException1.getSuppressed();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) noWatcherException3);
        java.util.List<org.apache.zookeeper.OpResult> opResultList5 = noWatcherException3.getResults();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList5);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        java.util.List<org.apache.zookeeper.OpResult> opResultList2 = noChildrenForEphemeralsException1.getResults();
        org.junit.Assert.assertNull(opResultList2);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        int int2 = sessionClosedRequireAuthException1.getCode();
        java.lang.String str3 = sessionClosedRequireAuthException1.getPath();
        org.apache.zookeeper.KeeperException.Code code4 = sessionClosedRequireAuthException1.code();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-124) + "'", int2 == (-124));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str3, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONCLOSEDREQUIRESASLAUTH));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.apache.zookeeper.KeeperException.Code code2 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADARGUMENTS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADARGUMENTS));
        org.junit.Assert.assertNotNull(keeperException3);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NOAUTH;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Class<?> wildcardClass3 = code0.getClass();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NODEEXISTS;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.Code code3 = keeperException2.code();
        org.apache.zookeeper.KeeperException.Code code4 = keeperException2.code();
        java.lang.String str5 = keeperException2.getPath();
        java.lang.Throwable[] throwableArray6 = keeperException2.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.NODEEXISTS + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.NODEEXISTS));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals" + "'", str5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException4 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str5 = sessionClosedRequireAuthException4.getPath();
        java.util.List<org.apache.zookeeper.OpResult> opResultList6 = sessionClosedRequireAuthException4.getResults();
        noWatcherException1.addSuppressed((java.lang.Throwable) sessionClosedRequireAuthException4);
        // The following exception was thrown during execution in test generation
        try {
            sessionClosedRequireAuthException4.setCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str5, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        org.junit.Assert.assertNull(opResultList6);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.apache.zookeeper.KeeperException.Code code2 = noChildrenForEphemeralsException1.code();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOCHILDRENFOREPHEMERALS));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code2);
        int int4 = code2.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-111) + "'", int4 == (-111));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create((-118));
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
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code2 = notEmptyException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOTEMPTY + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOTEMPTY));
        org.junit.Assert.assertNotNull(keeperException4);
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) ' ', "org.apache.zookeeper.KeeperException$OperationTimeoutException: KeeperErrorCode = OperationTimeout for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-8), "org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        int int3 = keeperException2.getCode();
        java.lang.Throwable[] throwableArray4 = keeperException2.getSuppressed();
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException keeperException5 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        int int6 = code0.intValue();
        int int7 = code0.intValue();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(keeperException5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-13) + "'", int6 == (-13));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-13) + "'", int7 == (-13));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException0 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException();
        noChildrenForEphemeralsException0.setCode((-112));
        org.apache.zookeeper.KeeperException.Code code3 = noChildrenForEphemeralsException0.code();
        int int4 = code3.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code3, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        int int7 = code3.intValue();
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-112) + "'", int4 == (-112));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-112) + "'", int7 == (-112));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = reconfigDisabledException1.code();
        reconfigDisabledException1.setCode(0);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.RECONFIGDISABLED));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        noWatcherException1.setCode((-102));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-2), "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(0, "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = ok for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid exception code:0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        int int2 = noChildrenForEphemeralsException1.getCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-108) + "'", int2 == (-108));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException5 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray6 = badVersionException5.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = badVersionException5.getResults();
        keeperException3.addSuppressed((java.lang.Throwable) badVersionException5);
        java.lang.Throwable[] throwableArray9 = badVersionException5.getSuppressed();
        org.apache.zookeeper.KeeperException.Code code10 = badVersionException5.code();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + code10 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code10.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        java.lang.String str2 = nodeExistsException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency" + "'", str2, "org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.apache.zookeeper.KeeperException.Code code2 = noWatcherException1.code();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for hi!");
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOWATCHER + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NOWATCHER));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException3 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        badArgumentsException1.addSuppressed((java.lang.Throwable) badVersionException3);
        org.apache.zookeeper.KeeperException.Code code5 = badVersionException3.code();
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-119), "org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$QuotaExceededException: KeeperErrorCode = Quota has exceeded");
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = NewConfigNoQuorum");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.BadVersionException badVersionException5 = new org.apache.zookeeper.KeeperException.BadVersionException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray6 = badVersionException5.getSuppressed();
        java.util.List<org.apache.zookeeper.OpResult> opResultList7 = badVersionException5.getResults();
        keeperException3.addSuppressed((java.lang.Throwable) badVersionException5);
        java.lang.Throwable[] throwableArray9 = badVersionException5.getSuppressed();
        int int10 = badVersionException5.getCode();
        java.lang.Throwable[] throwableArray11 = badVersionException5.getSuppressed();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.INVALIDCALLBACK));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertArrayEquals(throwableArray6, new java.lang.Throwable[] {});
        org.junit.Assert.assertNull(opResultList7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertArrayEquals(throwableArray9, new java.lang.Throwable[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-103) + "'", int10 == (-103));
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertArrayEquals(throwableArray11, new java.lang.Throwable[] {});
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        badArgumentsException1.setCode((-112));
        org.apache.zookeeper.KeeperException.Code code4 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        org.apache.zookeeper.KeeperException.Code code7 = keeperException6.code();
        java.lang.String str8 = keeperException6.toString();
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + code7 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code7.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate" + "'", str8, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((-103), "org.apache.zookeeper.KeeperException$ThrottledOpException: KeeperErrorCode = Op throttled due to high load for org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$RuntimeInconsistencyException: KeeperErrorCode = RuntimeInconsistency");
        // The following exception was thrown during execution in test generation
        try {
            keeperException2.setCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(keeperException2);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.zookeeper.KeeperException.NotEmptyException notEmptyException1 = new org.apache.zookeeper.KeeperException.NotEmptyException("org.apache.zookeeper.KeeperException$BadArgumentsException: KeeperErrorCode = BadArguments for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.zookeeper.KeeperException.Code code1 = org.apache.zookeeper.KeeperException.Code.get((-102));
        int int2 = code1.intValue();
        org.apache.zookeeper.KeeperException keeperException4 = org.apache.zookeeper.KeeperException.create(code1, "org.apache.zookeeper.KeeperException$NodeExistsException: KeeperErrorCode = NodeExists for org.apache.zookeeper.KeeperException$MarshallingErrorException: KeeperErrorCode = MarshallingError");
        org.junit.Assert.assertTrue("'" + code1 + "' != '" + org.apache.zookeeper.KeeperException.Code.NOAUTH + "'", code1.equals(org.apache.zookeeper.KeeperException.Code.NOAUTH));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-102) + "'", int2 == (-102));
        org.junit.Assert.assertNotNull(keeperException4);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.getPath();
        org.apache.zookeeper.KeeperException.Code code5 = requestTimeoutException0.code();
        int int6 = code5.intValue();
        org.apache.zookeeper.KeeperException keeperException8 = org.apache.zookeeper.KeeperException.create(code5, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException9 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException keeperException10 = org.apache.zookeeper.KeeperException.create(code5);
        org.apache.zookeeper.KeeperException.Code code11 = keeperException10.code();
        int int12 = code11.intValue();
        org.apache.zookeeper.KeeperException keeperException13 = org.apache.zookeeper.KeeperException.create(code11);
        int int14 = code11.intValue();
        org.apache.zookeeper.KeeperException keeperException16 = org.apache.zookeeper.KeeperException.create(code11, "org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + code5 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code5.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-122) + "'", int6 == (-122));
        org.junit.Assert.assertNotNull(keeperException8);
        org.junit.Assert.assertNotNull(keeperException9);
        org.junit.Assert.assertNotNull(keeperException10);
        org.junit.Assert.assertTrue("'" + code11 + "' != '" + org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT + "'", code11.equals(org.apache.zookeeper.KeeperException.Code.REQUESTTIMEOUT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-122) + "'", int12 == (-122));
        org.junit.Assert.assertNotNull(keeperException13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-122) + "'", int14 == (-122));
        org.junit.Assert.assertNotNull(keeperException16);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.apache.zookeeper.KeeperException.NoNodeException noNodeException1 = new org.apache.zookeeper.KeeperException.NoNodeException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException.Code code2 = noNodeException1.code();
        int int3 = code2.intValue();
        int int4 = code2.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code2, "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException keeperException7 = org.apache.zookeeper.KeeperException.create(code2);
        org.apache.zookeeper.KeeperException.Code code8 = keeperException7.code();
        int int9 = code8.intValue();
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-101) + "'", int3 == (-101));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-101) + "'", int4 == (-101));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertNotNull(keeperException7);
        org.junit.Assert.assertTrue("'" + code8 + "' != '" + org.apache.zookeeper.KeeperException.Code.NONODE + "'", code8.equals(org.apache.zookeeper.KeeperException.Code.NONODE));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-101) + "'", int9 == (-101));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoWatcherException: KeeperErrorCode = No such watcher for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.zookeeper.KeeperException.NodeExistsException nodeExistsException1 = new org.apache.zookeeper.KeeperException.NodeExistsException("org.apache.zookeeper.KeeperException$AuthFailedException: KeeperErrorCode = AuthFailed");
        java.lang.Throwable[] throwableArray2 = nodeExistsException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertArrayEquals(throwableArray2, new java.lang.Throwable[] {});
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.zookeeper.KeeperException.InvalidACLException invalidACLException1 = new org.apache.zookeeper.KeeperException.InvalidACLException("org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException sessionClosedRequireAuthException1 = new org.apache.zookeeper.KeeperException.SessionClosedRequireAuthException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException noChildrenForEphemeralsException1 = new org.apache.zookeeper.KeeperException.NoChildrenForEphemeralsException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException3 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$ReconfigDisabledException: KeeperErrorCode = Reconfig is disabled for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        java.lang.Throwable[] throwableArray4 = noWatcherException3.getSuppressed();
        noChildrenForEphemeralsException1.addSuppressed((java.lang.Throwable) noWatcherException3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertArrayEquals(throwableArray4, new java.lang.Throwable[] {});
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION;
        org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        org.apache.zookeeper.KeeperException keeperException3 = org.apache.zookeeper.KeeperException.create(code0);
        int int4 = code0.intValue();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code0, "org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        int int7 = keeperException6.getCode();
        // The following exception was thrown during execution in test generation
        try {
            keeperException6.setCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.EPHEMERALONLOCALSESSION));
        org.junit.Assert.assertNotNull(keeperException2);
        org.junit.Assert.assertNotNull(keeperException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-120) + "'", int4 == (-120));
        org.junit.Assert.assertNotNull(keeperException6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-120) + "'", int7 == (-120));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("");
        java.lang.String str2 = noWatcherException1.getPath();
        java.lang.Class<?> wildcardClass3 = noWatcherException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.zookeeper.KeeperException keeperException2 = org.apache.zookeeper.KeeperException.create((int) 'a', "org.apache.zookeeper.KeeperException$NoChildrenForEphemeralsException: KeeperErrorCode = NoChildrenForEphemerals for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The current client version cannot lookup this code:97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate for org.apache.zookeeper.KeeperException$NoAuthException: KeeperErrorCode = NoAuth");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.zookeeper.KeeperException.NewConfigNoQuorum newConfigNoQuorum0 = new org.apache.zookeeper.KeeperException.NewConfigNoQuorum();
        java.lang.String str1 = newConfigNoQuorum0.getPath();
        int int2 = newConfigNoQuorum0.getCode();
        org.apache.zookeeper.KeeperException.Code code3 = newConfigNoQuorum0.code();
        java.lang.Class<?> wildcardClass4 = code3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-13) + "'", int2 == (-13));
        org.junit.Assert.assertTrue("'" + code3 + "' != '" + org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM + "'", code3.equals(org.apache.zookeeper.KeeperException.Code.NEWCONFIGNOQUORUM));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.zookeeper.KeeperException.Code code0 = org.apache.zookeeper.KeeperException.Code.BADVERSION;
        org.apache.zookeeper.KeeperException keeperException1 = org.apache.zookeeper.KeeperException.create(code0);
        org.apache.zookeeper.KeeperException.Code code2 = keeperException1.code();
        int int3 = keeperException1.getCode();
        org.junit.Assert.assertTrue("'" + code0 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code0.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertNotNull(keeperException1);
        org.junit.Assert.assertTrue("'" + code2 + "' != '" + org.apache.zookeeper.KeeperException.Code.BADVERSION + "'", code2.equals(org.apache.zookeeper.KeeperException.Code.BADVERSION));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException1 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        java.lang.String str2 = noWatcherException1.getPath();
        noWatcherException1.setCode((-110));
        java.lang.String str5 = noWatcherException1.getPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str2, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback" + "'", str5, "org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for org.apache.zookeeper.KeeperException$InvalidCallbackException: KeeperErrorCode = Invalid callback");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.apache.zookeeper.KeeperException.RequestTimeoutException requestTimeoutException0 = new org.apache.zookeeper.KeeperException.RequestTimeoutException();
        org.apache.zookeeper.KeeperException.NoWatcherException noWatcherException2 = new org.apache.zookeeper.KeeperException.NoWatcherException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        requestTimeoutException0.addSuppressed((java.lang.Throwable) noWatcherException2);
        java.lang.String str4 = requestTimeoutException0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT" + "'", str4, "org.apache.zookeeper.KeeperException$RequestTimeoutException: KeeperErrorCode = Unknown error REQUESTTIMEOUT");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.apache.zookeeper.KeeperException.BadArgumentsException badArgumentsException1 = new org.apache.zookeeper.KeeperException.BadArgumentsException("org.apache.zookeeper.KeeperException$SessionMovedException: KeeperErrorCode = Session moved");
        badArgumentsException1.setCode((-112));
        org.apache.zookeeper.KeeperException.Code code4 = badArgumentsException1.code();
        org.apache.zookeeper.KeeperException keeperException6 = org.apache.zookeeper.KeeperException.create(code4, "org.apache.zookeeper.KeeperException$InvalidACLException: KeeperErrorCode = InvalidACL for org.apache.zookeeper.KeeperException$SessionClosedRequireAuthException: KeeperErrorCode = Session closed because client failed to authenticate");
        keeperException6.setCode(0);
        org.junit.Assert.assertTrue("'" + code4 + "' != '" + org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED + "'", code4.equals(org.apache.zookeeper.KeeperException.Code.SESSIONEXPIRED));
        org.junit.Assert.assertNotNull(keeperException6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.zookeeper.KeeperException.ReconfigDisabledException reconfigDisabledException1 = new org.apache.zookeeper.KeeperException.ReconfigDisabledException("org.apache.zookeeper.KeeperException$SystemErrorException: KeeperErrorCode = SystemError for org.apache.zookeeper.KeeperException$NewConfigNoQuorum: KeeperErrorCode = ok");
    }
}

