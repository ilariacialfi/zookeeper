package org.apache.zookeeper.test.randoop.c1.commandresponse;
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
        java.lang.String str0 = org.apache.zookeeper.server.admin.CommandResponse.KEY_COMMAND;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "command" + "'", str0, "command");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.apache.zookeeper.server.admin.CommandResponse.KEY_ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error" + "'", str0, "error");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream6 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream6);
        java.io.InputStream inputStream8 = commandResponse7.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse7.toMap();
        java.lang.Object obj13 = commandResponse7.put("", (java.lang.Object) false);
        java.lang.Object obj14 = commandResponse1.put("error", (java.lang.Object) "");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass13 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        java.lang.Class<?> wildcardClass10 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.lang.String str29 = commandResponse1.getCommand();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = commandResponse1.put("error", obj31);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        java.lang.Class<?> wildcardClass18 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        commandResponse1.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        int int29 = commandResponse1.getStatusCode();
        java.lang.Class<?> wildcardClass30 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        int int12 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass14 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '#', inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 0, inputStream3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        java.lang.String str3 = commandResponse1.getError();
        commandResponse1.addHeader("error", "command");
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int2 = commandResponse1.getStatusCode();
        java.lang.Class<?> wildcardClass3 = commandResponse1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass11 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass13 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        java.lang.Class<?> wildcardClass3 = commandResponse1.getClass();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 10, inputStream3);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.addHeader("", "command");
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) ' ');
        java.lang.Class<?> wildcardClass17 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '#', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        commandResponse3.addHeader("", "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        java.lang.String str20 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj22 = commandResponse19.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj27 = commandResponse24.put("", (java.lang.Object) true);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse33.toMap();
        java.lang.Object obj36 = commandResponse24.put("", (java.lang.Object) strMap35);
        commandResponse19.putAll(strMap35);
        commandResponse1.putAll(strMap35);
        commandResponse1.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        int int29 = commandResponse1.getStatusCode();
        java.lang.Object obj32 = commandResponse1.put("hi!", (java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass50 = obj49.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse3.setStatusCode((int) (short) -1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse7.addHeader("hi!", "error");
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        commandResponse3.addHeader("hi!", "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) '#', inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream8);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream14);
        int int16 = commandResponse15.getStatusCode();
        java.lang.Object obj17 = commandResponse9.put("error", (java.lang.Object) int16);
        int int18 = commandResponse9.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse9.toMap();
        commandResponse4.putAll(strMap19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream23);
        int int25 = commandResponse24.getStatusCode();
        java.lang.Object obj26 = commandResponse18.put("error", (java.lang.Object) int25);
        int int27 = commandResponse18.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse18.toMap();
        commandResponse4.putAll(strMap28);
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode(1);
        java.lang.Class<?> wildcardClass8 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = inputStream6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) 'a');
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        commandResponse3.setStatusCode((int) (short) 100);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (byte) -1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.io.InputStream inputStream15 = null;
        commandResponse9.setInputStream(inputStream15);
        java.lang.Object obj17 = commandResponse3.put("error", (java.lang.Object) inputStream15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 10, inputStream3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        java.lang.String str14 = commandResponse4.getError();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode(1);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.lang.String str8 = commandResponse1.getCommand();
        java.lang.Class<?> wildcardClass9 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "error");
        java.lang.String str18 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream22 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream22);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.lang.String str19 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        commandResponse4.putAll(strMap20);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.String str25 = commandResponse23.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj30 = commandResponse27.put("", (java.lang.Object) true);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        java.lang.Object obj39 = commandResponse27.put("", (java.lang.Object) strMap38);
        commandResponse23.putAll(strMap38);
        commandResponse4.putAll(strMap38);
        java.lang.String str42 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + true + "'", obj39, true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream18 = null;
        commandResponse1.setInputStream(inputStream18);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.lang.String str8 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse28.toMap();
        commandResponse20.putAll(strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse20.getHeaders();
        java.lang.Object obj33 = commandResponse4.put("command", (java.lang.Object) commandResponse20);
        java.lang.String str34 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.lang.Object obj26 = commandResponse20.put("", (java.lang.Object) false);
        commandResponse20.setStatusCode((int) (short) 10);
        int int29 = commandResponse20.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = commandResponse20.getHeaders();
        java.lang.Object obj31 = commandResponse4.put("command", (java.lang.Object) commandResponse20);
        java.io.InputStream inputStream32 = null;
        commandResponse4.setInputStream(inputStream32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.lang.String str19 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        commandResponse4.putAll(strMap20);
        java.io.InputStream inputStream22 = null;
        commandResponse4.setInputStream(inputStream22);
        commandResponse4.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass28 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (byte) 100);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.io.InputStream inputStream29 = commandResponse1.getInputStream();
        java.lang.String str30 = commandResponse1.getCommand();
        java.lang.Class<?> wildcardClass31 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = commandResponse3.getInputStream();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        commandResponse18.addHeader("", "");
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.lang.Object obj32 = commandResponse28.put("", (java.lang.Object) (byte) 10);
        java.lang.String str33 = commandResponse28.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse28.toMap();
        commandResponse18.putAll(strMap34);
        java.io.InputStream inputStream36 = null;
        commandResponse18.setInputStream(inputStream36);
        commandResponse18.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.String> strMap41 = commandResponse18.getHeaders();
        java.lang.Object obj42 = commandResponse3.put("", (java.lang.Object) strMap41);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 10, inputStream3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.lang.String str19 = commandResponse12.getCommand();
        commandResponse12.addHeader("command", "");
        java.lang.Class<?> wildcardClass23 = commandResponse12.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(inputStream2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        commandResponse4.putAll(strMap45);
        java.lang.Class<?> wildcardClass50 = strMap45.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 100);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse11);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.addHeader("command", "command");
        commandResponse3.setStatusCode(0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        java.lang.Class<?> wildcardClass12 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.lang.String str8 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.lang.String str10 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse3.getHeaders();
        int int10 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        commandResponse1.putAll(strMap17);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj24 = commandResponse21.put("", (java.lang.Object) true);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        java.lang.Object obj33 = commandResponse21.put("", (java.lang.Object) strMap32);
        java.lang.Object obj36 = commandResponse21.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        commandResponse21.putAll(strMap43);
        commandResponse1.putAll(strMap43);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse50.toMap();
        commandResponse50.addHeader("", "");
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream59);
        java.io.InputStream inputStream61 = commandResponse60.getInputStream();
        java.lang.Object obj64 = commandResponse60.put("", (java.lang.Object) (byte) 10);
        java.lang.String str65 = commandResponse60.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse60.toMap();
        commandResponse50.putAll(strMap66);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream70 = commandResponse69.getInputStream();
        java.lang.String str71 = commandResponse69.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj76 = commandResponse73.put("", (java.lang.Object) true);
        java.io.InputStream inputStream81 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse82 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream81);
        java.io.InputStream inputStream83 = commandResponse82.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse82.toMap();
        java.lang.Object obj85 = commandResponse73.put("", (java.lang.Object) strMap84);
        commandResponse69.putAll(strMap84);
        commandResponse50.putAll(strMap84);
        commandResponse1.putAll(strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap89 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(inputStream61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(inputStream70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
        org.junit.Assert.assertNotNull(strMap89);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '#', inputStream3);
        commandResponse4.setStatusCode(100);
        commandResponse4.addHeader("command", "command");
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass11 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 0, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.addHeader("command", "command");
        java.lang.String str7 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 35, inputStream3);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass13 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("command", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.Class<?> wildcardClass10 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = inputStream4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        commandResponse1.putAll(strMap17);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj24 = commandResponse21.put("", (java.lang.Object) true);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        java.lang.Object obj33 = commandResponse21.put("", (java.lang.Object) strMap32);
        java.lang.Object obj36 = commandResponse21.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        commandResponse21.putAll(strMap43);
        commandResponse1.putAll(strMap43);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse50.toMap();
        commandResponse50.addHeader("", "");
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream59);
        java.io.InputStream inputStream61 = commandResponse60.getInputStream();
        java.lang.Object obj64 = commandResponse60.put("", (java.lang.Object) (byte) 10);
        java.lang.String str65 = commandResponse60.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse60.toMap();
        commandResponse50.putAll(strMap66);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream70 = commandResponse69.getInputStream();
        java.lang.String str71 = commandResponse69.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj76 = commandResponse73.put("", (java.lang.Object) true);
        java.io.InputStream inputStream81 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse82 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream81);
        java.io.InputStream inputStream83 = commandResponse82.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse82.toMap();
        java.lang.Object obj85 = commandResponse73.put("", (java.lang.Object) strMap84);
        commandResponse69.putAll(strMap84);
        commandResponse50.putAll(strMap84);
        commandResponse1.putAll(strMap84);
        java.io.InputStream inputStream89 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(inputStream61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(inputStream70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
        org.junit.Assert.assertNull(inputStream89);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        int int11 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream23);
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream28);
        int int30 = commandResponse29.getStatusCode();
        java.io.InputStream inputStream31 = commandResponse29.getInputStream();
        commandResponse29.setStatusCode(200);
        java.io.InputStream inputStream34 = commandResponse29.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse38.toMap();
        commandResponse29.putAll(strMap39);
        commandResponse24.putAll(strMap39);
        commandResponse10.putAll(strMap39);
        java.lang.Class<?> wildcardClass43 = strMap39.getClass();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 10);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        commandResponse9.addHeader("", "");
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.lang.Object obj23 = commandResponse19.put("", (java.lang.Object) (byte) 10);
        java.lang.String str24 = commandResponse19.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse19.toMap();
        commandResponse9.putAll(strMap25);
        java.io.InputStream inputStream27 = null;
        commandResponse9.setInputStream(inputStream27);
        commandResponse9.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse9.getHeaders();
        java.lang.Object obj33 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.lang.Class<?> wildcardClass34 = commandResponse9.getClass();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse4.putAll(strMap19);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse12.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj23 = commandResponse20.put("", (java.lang.Object) true);
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.lang.Object obj32 = commandResponse20.put("", (java.lang.Object) strMap31);
        commandResponse15.putAll(strMap31);
        commandResponse12.putAll(strMap31);
        commandResponse4.putAll(strMap31);
        java.io.InputStream inputStream36 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertNull(inputStream36);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 100, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse11.getHeaders();
        java.io.InputStream inputStream13 = null;
        commandResponse11.setInputStream(inputStream13);
        java.io.InputStream inputStream15 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse11.toMap();
        commandResponse4.putAll(strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        java.io.InputStream inputStream19 = null;
        commandResponse4.setInputStream(inputStream19);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream25);
        int int27 = commandResponse26.getStatusCode();
        commandResponse26.setStatusCode(1);
        java.lang.String str30 = commandResponse26.getError();
        java.lang.Object obj31 = commandResponse4.put("", (java.lang.Object) str30);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        java.lang.String str15 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4', inputStream3);
        commandResponse4.setStatusCode(10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.lang.Class<?> wildcardClass9 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream8 = commandResponse3.getInputStream();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse14.toMap();
        int int20 = commandResponse14.getStatusCode();
        java.lang.String str21 = commandResponse14.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse14.toMap();
        java.lang.String str23 = commandResponse14.getCommand();
        java.lang.Object obj24 = commandResponse3.put("command", (java.lang.Object) str23);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream18);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse24.toMap();
        java.lang.Object obj26 = commandResponse19.put("error", (java.lang.Object) strMap25);
        commandResponse4.putAll(strMap25);
        commandResponse4.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        commandResponse11.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse11.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse11.toMap();
        commandResponse4.putAll(strMap18);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse15.toMap();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream20);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream26);
        int int28 = commandResponse27.getStatusCode();
        java.lang.Object obj29 = commandResponse21.put("error", (java.lang.Object) int28);
        int int30 = commandResponse21.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse21.toMap();
        commandResponse15.putAll(strMap31);
        commandResponse4.putAll(strMap31);
        java.io.InputStream inputStream34 = null;
        commandResponse4.setInputStream(inputStream34);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (-1));
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) (byte) 10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (short) 10);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (byte) 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.lang.String str3 = commandResponse1.getError();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 32);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 200, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        commandResponse3.addHeader("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) '#');
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        int int9 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 10);
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.lang.Class<?> wildcardClass15 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        commandResponse3.addHeader("error", "command");
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = commandResponse3.put("command", obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 200, inputStream3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream18 = commandResponse1.getInputStream();
        java.io.InputStream inputStream19 = null;
        commandResponse1.setInputStream(inputStream19);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream18);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.addHeader("error", "error");
        java.io.InputStream inputStream16 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = inputStream16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.lang.String str19 = commandResponse12.getCommand();
        commandResponse12.addHeader("command", "");
        commandResponse12.addHeader("command", "error");
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.lang.Object obj35 = commandResponse31.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj38 = commandResponse31.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream39 = null;
        commandResponse31.setInputStream(inputStream39);
        java.lang.Class<?> wildcardClass41 = commandResponse31.getClass();
        java.lang.Object obj42 = commandResponse12.put("hi!", (java.lang.Object) commandResponse31);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        commandResponse10.addHeader("hi!", "error");
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream27);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream33);
        int int35 = commandResponse34.getStatusCode();
        java.lang.Object obj36 = commandResponse28.put("error", (java.lang.Object) int35);
        java.lang.Object obj37 = commandResponse10.put("error", (java.lang.Object) "error");
        commandResponse10.addHeader("error", "command");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getError();
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream15);
        java.lang.Object obj17 = commandResponse4.put("", (java.lang.Object) "error");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10);
        java.lang.Object obj13 = commandResponse3.put("error", (java.lang.Object) "");
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 35, inputStream3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream7 = commandResponse6.getInputStream();
        java.lang.String str8 = commandResponse6.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj13 = commandResponse10.put("", (java.lang.Object) true);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        java.lang.Object obj22 = commandResponse10.put("", (java.lang.Object) strMap21);
        commandResponse6.putAll(strMap21);
        commandResponse4.putAll(strMap21);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream29);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream35);
        int int37 = commandResponse36.getStatusCode();
        java.lang.Object obj38 = commandResponse30.put("error", (java.lang.Object) int37);
        int int39 = commandResponse30.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse30.toMap();
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream45);
        int int47 = commandResponse46.getStatusCode();
        java.lang.Object obj48 = commandResponse30.put("", (java.lang.Object) int47);
        java.lang.Object obj49 = commandResponse4.put("error", (java.lang.Object) int47);
        java.lang.Class<?> wildcardClass50 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream5 = commandResponse1.getInputStream();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream10);
        commandResponse11.setStatusCode((int) (short) 1);
        java.lang.String str14 = commandResponse11.getError();
        commandResponse11.addHeader("", "error");
        int int18 = commandResponse11.getStatusCode();
        java.lang.Object obj19 = commandResponse1.put("", (java.lang.Object) commandResponse11);
        java.lang.String str20 = commandResponse11.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse11.toMap();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        int int12 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj17 = commandResponse14.put("", (java.lang.Object) true);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.lang.Object obj26 = commandResponse14.put("", (java.lang.Object) strMap25);
        java.lang.Object obj29 = commandResponse14.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.lang.Object obj38 = commandResponse34.put("", (java.lang.Object) (byte) 10);
        java.lang.String str39 = commandResponse34.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse34.toMap();
        commandResponse14.putAll(strMap40);
        java.lang.String str42 = commandResponse14.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream47 = null;
        commandResponse46.setInputStream(inputStream47);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse52.toMap();
        commandResponse46.putAll(strMap53);
        commandResponse14.putAll(strMap53);
        commandResponse4.putAll(strMap53);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 100, inputStream3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse1.addHeader("hi!", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse1.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream3);
        commandResponse4.setStatusCode(97);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0, inputStream3);
        commandResponse4.setStatusCode((int) ' ');
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream5 = commandResponse1.getInputStream();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream10);
        commandResponse11.setStatusCode((int) (short) 1);
        java.lang.String str14 = commandResponse11.getError();
        commandResponse11.addHeader("", "error");
        int int18 = commandResponse11.getStatusCode();
        java.lang.Object obj19 = commandResponse1.put("", (java.lang.Object) commandResponse11);
        java.lang.String str20 = commandResponse11.getError();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error" + "'", str20, "error");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 200, inputStream3);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.lang.String str22 = commandResponse4.getError();
        java.io.InputStream inputStream23 = null;
        commandResponse4.setInputStream(inputStream23);
        commandResponse4.setStatusCode((-1));
        java.lang.Class<?> wildcardClass27 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 10, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj17 = commandResponse14.put("", (java.lang.Object) true);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.lang.Object obj26 = commandResponse14.put("", (java.lang.Object) strMap25);
        java.lang.Object obj29 = commandResponse14.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.lang.Object obj38 = commandResponse34.put("", (java.lang.Object) (byte) 10);
        java.lang.String str39 = commandResponse34.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse34.toMap();
        commandResponse14.putAll(strMap40);
        java.lang.String str42 = commandResponse14.getCommand();
        int int43 = commandResponse14.getStatusCode();
        java.lang.Object obj44 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        java.lang.Class<?> wildcardClass45 = commandResponse14.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.lang.String str5 = commandResponse3.getCommand();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        commandResponse11.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse11.getHeaders();
        java.lang.Object obj18 = commandResponse3.put("error", (java.lang.Object) strMap17);
        java.io.InputStream inputStream19 = null;
        commandResponse3.setInputStream(inputStream19);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 0, inputStream3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse19.toMap();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        commandResponse19.putAll(strMap29);
        commandResponse4.putAll(strMap29);
        commandResponse4.setStatusCode((int) (short) 0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        int int18 = commandResponse17.getStatusCode();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = obj19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 32, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (short) 10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj21 = commandResponse18.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        commandResponse18.putAll(strMap34);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj41 = commandResponse38.put("", (java.lang.Object) true);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse47.toMap();
        java.lang.Object obj50 = commandResponse38.put("", (java.lang.Object) strMap49);
        java.lang.Object obj53 = commandResponse38.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse58.toMap();
        commandResponse38.putAll(strMap60);
        commandResponse18.putAll(strMap60);
        java.lang.Object obj63 = commandResponse14.put("command", (java.lang.Object) strMap60);
        java.io.InputStream inputStream64 = null;
        commandResponse14.setInputStream(inputStream64);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = commandResponse14.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + true + "'", obj50, true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "error");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (short) 10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.String str14 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = commandResponse4.put("command", obj14);
        int int16 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        commandResponse4.putAll(strMap45);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap54 = commandResponse53.getHeaders();
        java.io.InputStream inputStream55 = null;
        commandResponse53.setInputStream(inputStream55);
        java.io.InputStream inputStream57 = commandResponse53.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse53.toMap();
        commandResponse4.putAll(strMap58);
        java.lang.Class<?> wildcardClass60 = strMap58.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        java.lang.String str14 = commandResponse4.getError();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        commandResponse4.addHeader("", "hi!");
        java.io.InputStream inputStream20 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream20);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        java.lang.String str3 = commandResponse1.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse5 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj8 = commandResponse5.put("", (java.lang.Object) true);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse5.put("", (java.lang.Object) strMap16);
        commandResponse1.putAll(strMap16);
        commandResponse1.addHeader("hi!", "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse1.toMap();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass11 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        int int11 = commandResponse4.getStatusCode();
        int int12 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse11);
        int int50 = commandResponse4.getStatusCode();
        int int51 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse4.toMap();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int23 = commandResponse22.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        java.lang.Object obj25 = commandResponse10.put("", (java.lang.Object) strMap24);
        java.lang.Class<?> wildcardClass26 = commandResponse10.getClass();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse3.putAll(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse1.putAll(strMap23);
        commandResponse1.setStatusCode((int) 'a');
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) 'a', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        commandResponse1.addHeader("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        commandResponse1.addHeader("", "error");
        java.lang.String str5 = commandResponse1.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream3);
        commandResponse4.addHeader("error", "command");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse10.getHeaders();
        commandResponse10.addHeader("error", "");
        java.lang.String str24 = commandResponse10.getCommand();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 52, inputStream3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse9.toMap();
        java.lang.Object obj18 = commandResponse9.put("", (java.lang.Object) (-1));
        java.lang.String str19 = commandResponse9.getError();
        java.io.InputStream inputStream20 = null;
        commandResponse9.setInputStream(inputStream20);
        java.lang.Object obj22 = commandResponse3.put("hi!", (java.lang.Object) inputStream20);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '#', inputStream26);
        commandResponse27.setStatusCode(100);
        commandResponse27.addHeader("command", "command");
        java.lang.String str33 = commandResponse27.getCommand();
        java.lang.String str34 = commandResponse27.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse27.toMap();
        commandResponse3.putAll(strMap35);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '4', inputStream3);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = commandResponse4.put("", obj6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse23.toMap();
        java.io.InputStream inputStream27 = null;
        commandResponse23.setInputStream(inputStream27);
        java.io.InputStream inputStream29 = commandResponse23.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj35 = commandResponse32.put("", (java.lang.Object) true);
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        java.lang.Object obj44 = commandResponse32.put("", (java.lang.Object) strMap43);
        java.lang.Object obj45 = commandResponse23.put("command", (java.lang.Object) strMap43);
        commandResponse4.putAll(strMap43);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass48 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse1.putAll(strMap23);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse30.toMap();
        java.lang.Object obj36 = commandResponse30.put("", (java.lang.Object) false);
        commandResponse30.setStatusCode((int) (short) 10);
        int int39 = commandResponse30.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = commandResponse30.getHeaders();
        java.lang.Object obj41 = commandResponse1.put("", (java.lang.Object) commandResponse30);
        java.io.InputStream inputStream42 = null;
        commandResponse1.setInputStream(inputStream42);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '#' + "'", obj41, '#');
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse3.toMap();
        int int12 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = null;
        commandResponse3.setInputStream(inputStream12);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        commandResponse4.addHeader("", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        java.lang.String str22 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream3);
        commandResponse4.addHeader("command", "command");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj19 = commandResponse16.put("", (java.lang.Object) true);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        java.lang.Object obj28 = commandResponse16.put("", (java.lang.Object) strMap27);
        java.io.InputStream inputStream29 = commandResponse16.getInputStream();
        java.lang.String str30 = commandResponse16.getCommand();
        java.lang.Object obj31 = commandResponse1.put("", (java.lang.Object) str30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj17 = commandResponse14.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj22 = commandResponse19.put("", (java.lang.Object) true);
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse28.toMap();
        java.lang.Object obj31 = commandResponse19.put("", (java.lang.Object) strMap30);
        commandResponse14.putAll(strMap30);
        commandResponse4.putAll(strMap30);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse4.toMap();
        java.lang.String str35 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass36 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + true + "'", obj31, true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        java.lang.Object obj22 = commandResponse17.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse17.getHeaders();
        java.lang.String str24 = commandResponse17.getError();
        java.lang.Object obj25 = commandResponse4.put("", (java.lang.Object) commandResponse17);
        commandResponse17.addHeader("hi!", "");
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = commandResponse17.put("command", obj30);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        commandResponse6.putAll(strMap22);
        commandResponse3.putAll(strMap22);
        int int26 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse23.toMap();
        java.io.InputStream inputStream27 = null;
        commandResponse23.setInputStream(inputStream27);
        java.io.InputStream inputStream29 = commandResponse23.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj35 = commandResponse32.put("", (java.lang.Object) true);
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        java.lang.Object obj44 = commandResponse32.put("", (java.lang.Object) strMap43);
        java.lang.Object obj45 = commandResponse23.put("command", (java.lang.Object) strMap43);
        commandResponse4.putAll(strMap43);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        commandResponse4.addHeader("hi!", "command");
        java.lang.String str17 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) -1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.lang.String str9 = commandResponse3.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse3.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse3.getError();
        commandResponse3.addHeader("", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.addHeader("error", "command");
        java.lang.String str8 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse3.toMap();
        java.io.InputStream inputStream12 = null;
        commandResponse3.setInputStream(inputStream12);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str18 = commandResponse17.getError();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream22);
        int int24 = commandResponse23.getStatusCode();
        java.io.InputStream inputStream25 = commandResponse23.getInputStream();
        commandResponse23.setStatusCode(200);
        java.io.InputStream inputStream28 = commandResponse23.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        commandResponse23.putAll(strMap33);
        commandResponse17.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        java.io.InputStream inputStream37 = null;
        commandResponse4.setInputStream(inputStream37);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "error" + "'", str18, "error");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        java.lang.Object obj24 = commandResponse4.put("", (java.lang.Object) "error");
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse29.toMap();
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        int int40 = commandResponse38.getStatusCode();
        commandResponse38.setStatusCode((int) (short) 100);
        java.lang.Object obj45 = commandResponse38.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj46 = commandResponse29.put("error", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream47 = commandResponse29.getInputStream();
        commandResponse29.addHeader("hi!", "error");
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream54);
        java.io.InputStream inputStream56 = commandResponse55.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse55.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse55.toMap();
        java.lang.Object obj61 = commandResponse55.put("", (java.lang.Object) false);
        commandResponse55.setStatusCode((int) (short) 10);
        int int64 = commandResponse55.getStatusCode();
        java.io.InputStream inputStream68 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream68);
        java.io.InputStream inputStream74 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse75 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream74);
        int int76 = commandResponse75.getStatusCode();
        java.lang.Object obj77 = commandResponse69.put("error", (java.lang.Object) int76);
        int int78 = commandResponse69.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap79 = commandResponse69.toMap();
        commandResponse55.putAll(strMap79);
        commandResponse29.putAll(strMap79);
        commandResponse4.putAll(strMap79);
        java.io.InputStream inputStream83 = commandResponse4.getInputStream();
        java.lang.String str84 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) 10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse4.putAll(strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        java.lang.String str17 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        int int27 = commandResponse24.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse24.getHeaders();
        commandResponse24.addHeader("command", "error");
        java.lang.Object obj32 = commandResponse12.put("error", (java.lang.Object) "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse12.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.setStatusCode((int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = null;
        commandResponse3.setInputStream(inputStream12);
        java.io.InputStream inputStream14 = commandResponse3.getInputStream();
        commandResponse3.addHeader("", "error");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        int int5 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse23.toMap();
        java.io.InputStream inputStream27 = null;
        commandResponse23.setInputStream(inputStream27);
        java.io.InputStream inputStream29 = commandResponse23.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj35 = commandResponse32.put("", (java.lang.Object) true);
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        java.lang.Object obj44 = commandResponse32.put("", (java.lang.Object) strMap43);
        java.lang.Object obj45 = commandResponse23.put("command", (java.lang.Object) strMap43);
        commandResponse4.putAll(strMap43);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse4.toMap();
        java.lang.String str48 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (short) -1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + true + "'", obj44, true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.lang.String str22 = commandResponse4.getError();
        java.io.InputStream inputStream23 = null;
        commandResponse4.setInputStream(inputStream23);
        java.lang.Class<?> wildcardClass25 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        commandResponse20.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = commandResponse20.getHeaders();
        java.lang.String str27 = commandResponse20.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse20.toMap();
        commandResponse4.putAll(strMap28);
        int int30 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj21 = commandResponse18.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        commandResponse18.putAll(strMap34);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj41 = commandResponse38.put("", (java.lang.Object) true);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse47.toMap();
        java.lang.Object obj50 = commandResponse38.put("", (java.lang.Object) strMap49);
        java.lang.Object obj53 = commandResponse38.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse58.toMap();
        commandResponse38.putAll(strMap60);
        commandResponse18.putAll(strMap60);
        java.lang.Object obj63 = commandResponse14.put("command", (java.lang.Object) strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = commandResponse14.getHeaders();
        java.lang.Class<?> wildcardClass65 = commandResponse14.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + true + "'", obj50, true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream7);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.String str12 = commandResponse10.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj17 = commandResponse14.put("", (java.lang.Object) true);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        java.lang.Object obj26 = commandResponse14.put("", (java.lang.Object) strMap25);
        commandResponse10.putAll(strMap25);
        commandResponse8.putAll(strMap25);
        commandResponse3.putAll(strMap25);
        commandResponse3.setStatusCode((int) (short) 100);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "command");
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 100);
        java.lang.Object obj9 = commandResponse3.put("command", (java.lang.Object) (short) 100);
        commandResponse3.addHeader("hi!", "");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) '#');
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = commandResponse3.put("hi!", obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) -1);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.lang.String str22 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) ' ');
        java.lang.String str17 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 52, inputStream3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 35, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj22 = commandResponse19.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj27 = commandResponse24.put("", (java.lang.Object) true);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse33.toMap();
        java.lang.Object obj36 = commandResponse24.put("", (java.lang.Object) strMap35);
        commandResponse19.putAll(strMap35);
        commandResponse1.putAll(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap40 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        commandResponse4.addHeader("error", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        java.lang.String str16 = commandResponse4.getError();
        int int17 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        commandResponse3.setStatusCode(100);
        java.lang.Class<?> wildcardClass6 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getCommand();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.lang.String str15 = commandResponse9.getCommand();
        java.lang.String str16 = commandResponse9.getCommand();
        int int17 = commandResponse9.getStatusCode();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = commandResponse9.put("command", obj19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse9.toMap();
        commandResponse3.putAll(strMap21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse3.getHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream23);
        int int25 = commandResponse24.getStatusCode();
        java.lang.Object obj26 = commandResponse18.put("error", (java.lang.Object) int25);
        int int27 = commandResponse18.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse18.toMap();
        commandResponse4.putAll(strMap28);
        commandResponse4.setStatusCode((int) (short) 10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream18);
        commandResponse19.setStatusCode((int) (short) 1);
        java.lang.String str22 = commandResponse19.getError();
        java.io.InputStream inputStream23 = commandResponse19.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj29 = commandResponse26.put("", (java.lang.Object) true);
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse35.toMap();
        java.lang.Object obj38 = commandResponse26.put("", (java.lang.Object) strMap37);
        java.io.InputStream inputStream39 = commandResponse26.getInputStream();
        commandResponse26.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj47 = commandResponse44.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj52 = commandResponse49.put("", (java.lang.Object) true);
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse58.toMap();
        java.lang.Object obj61 = commandResponse49.put("", (java.lang.Object) strMap60);
        commandResponse44.putAll(strMap60);
        commandResponse26.putAll(strMap60);
        java.lang.Object obj64 = commandResponse19.put("command", (java.lang.Object) commandResponse26);
        int int65 = commandResponse19.getStatusCode();
        int int66 = commandResponse19.getStatusCode();
        java.lang.Class<?> wildcardClass67 = commandResponse19.getClass();
        java.lang.Object obj68 = commandResponse4.put("", (java.lang.Object) wildcardClass67);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "error" + "'", str22, "error");
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + false + "'", obj68, false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.lang.String str19 = commandResponse12.getCommand();
        commandResponse12.addHeader("command", "");
        commandResponse12.addHeader("error", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) 'a');
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 1, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        commandResponse17.addHeader("", "");
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.lang.Object obj31 = commandResponse27.put("", (java.lang.Object) (byte) 10);
        java.lang.String str32 = commandResponse27.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse27.toMap();
        commandResponse17.putAll(strMap33);
        commandResponse12.putAll(strMap33);
        commandResponse8.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse3.setStatusCode((int) '#');
        java.lang.String str6 = commandResponse3.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.lang.Object obj23 = commandResponse19.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse19.toMap();
        int int25 = commandResponse19.getStatusCode();
        java.lang.String str26 = commandResponse19.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse19.toMap();
        java.lang.String str28 = commandResponse19.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse19.toMap();
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream33);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse39.toMap();
        java.lang.Object obj41 = commandResponse34.put("error", (java.lang.Object) strMap40);
        commandResponse19.putAll(strMap40);
        commandResponse14.putAll(strMap40);
        commandResponse10.putAll(strMap40);
        int int45 = commandResponse10.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse10.toMap();
        commandResponse3.putAll(strMap46);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        java.io.InputStream inputStream8 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        commandResponse15.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse15.toMap();
        commandResponse4.putAll(strMap19);
        java.lang.String str21 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = inputStream7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        int int23 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode((int) (short) 100);
        java.lang.Object obj28 = commandResponse21.put("command", (java.lang.Object) 10.0f);
        java.lang.String str29 = commandResponse21.getError();
        java.lang.Object obj30 = commandResponse15.put("command", (java.lang.Object) commandResponse21);
        java.lang.String str31 = commandResponse15.getError();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse15);
        java.io.InputStream inputStream33 = null;
        commandResponse4.setInputStream(inputStream33);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "command" + "'", str31, "command");
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream8);
        commandResponse9.addHeader("hi!", "");
        java.io.InputStream inputStream13 = commandResponse9.getInputStream();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        commandResponse18.addHeader("", "");
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.lang.Object obj32 = commandResponse28.put("", (java.lang.Object) (byte) 10);
        java.lang.String str33 = commandResponse28.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse28.toMap();
        commandResponse18.putAll(strMap34);
        java.io.InputStream inputStream36 = null;
        commandResponse18.setInputStream(inputStream36);
        commandResponse18.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse18.toMap();
        commandResponse9.putAll(strMap41);
        commandResponse3.putAll(strMap41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse13.toMap();
        commandResponse13.addHeader("", "");
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("", (java.lang.Object) (byte) 10);
        java.lang.String str28 = commandResponse23.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse23.toMap();
        commandResponse13.putAll(strMap29);
        java.io.InputStream inputStream31 = null;
        commandResponse13.setInputStream(inputStream31);
        commandResponse13.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse13.toMap();
        commandResponse4.putAll(strMap36);
        int int38 = commandResponse4.getStatusCode();
        int int39 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream8);
        commandResponse9.addHeader("hi!", "");
        java.io.InputStream inputStream13 = commandResponse9.getInputStream();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        commandResponse18.addHeader("", "");
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.lang.Object obj32 = commandResponse28.put("", (java.lang.Object) (byte) 10);
        java.lang.String str33 = commandResponse28.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse28.toMap();
        commandResponse18.putAll(strMap34);
        java.io.InputStream inputStream36 = null;
        commandResponse18.setInputStream(inputStream36);
        commandResponse18.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse18.toMap();
        commandResponse9.putAll(strMap41);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse9.toMap();
        java.lang.Object obj44 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode(1);
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 32);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200);
        java.lang.Object obj10 = commandResponse3.put("command", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.lang.String str16 = commandResponse1.getCommand();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int16 = commandResponse15.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        commandResponse4.putAll(strMap17);
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.String str21 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.io.InputStream inputStream15 = null;
        commandResponse9.setInputStream(inputStream15);
        java.lang.Object obj17 = commandResponse3.put("error", (java.lang.Object) inputStream15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse3.getHeaders();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        commandResponse4.addHeader("command", "error");
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse16.toMap();
        java.lang.Object obj22 = commandResponse16.put("", (java.lang.Object) false);
        commandResponse16.setStatusCode((int) (short) 10);
        int int25 = commandResponse16.getStatusCode();
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream29);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream35);
        int int37 = commandResponse36.getStatusCode();
        java.lang.Object obj38 = commandResponse30.put("error", (java.lang.Object) int37);
        int int39 = commandResponse30.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse30.toMap();
        commandResponse16.putAll(strMap40);
        commandResponse4.putAll(strMap40);
        commandResponse4.setStatusCode(100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.io.InputStream inputStream16 = commandResponse1.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse1.toMap();
        commandResponse1.setStatusCode(10);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream9);
        commandResponse10.addHeader("", "error");
        commandResponse10.setStatusCode(10);
        java.lang.Object obj16 = commandResponse3.put("hi!", (java.lang.Object) 10);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        commandResponse4.addHeader("hi!", "command");
        java.lang.Class<?> wildcardClass17 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse12.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj23 = commandResponse20.put("", (java.lang.Object) true);
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.lang.Object obj32 = commandResponse20.put("", (java.lang.Object) strMap31);
        commandResponse15.putAll(strMap31);
        commandResponse12.putAll(strMap31);
        commandResponse4.putAll(strMap31);
        java.io.InputStream inputStream36 = null;
        commandResponse4.setInputStream(inputStream36);
        java.io.InputStream inputStream41 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream41);
        java.io.InputStream inputStream43 = commandResponse42.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse42.toMap();
        commandResponse42.addHeader("", "");
        java.io.InputStream inputStream51 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream51);
        java.io.InputStream inputStream53 = commandResponse52.getInputStream();
        java.lang.Object obj56 = commandResponse52.put("", (java.lang.Object) (byte) 10);
        java.lang.String str57 = commandResponse52.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse52.toMap();
        commandResponse42.putAll(strMap58);
        commandResponse4.putAll(strMap58);
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertNull(inputStream43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(strMap58);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.lang.String str19 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        commandResponse4.putAll(strMap20);
        java.io.InputStream inputStream22 = null;
        commandResponse4.setInputStream(inputStream22);
        commandResponse4.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse4.toMap();
        java.lang.String str28 = commandResponse4.getError();
        java.io.InputStream inputStream29 = null;
        commandResponse4.setInputStream(inputStream29);
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = commandResponse4.put("error", obj9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) ' ');
        java.lang.String str10 = commandResponse4.getCommand();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse28.toMap();
        commandResponse20.putAll(strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse20.getHeaders();
        java.lang.Object obj33 = commandResponse4.put("command", (java.lang.Object) commandResponse20);
        java.io.InputStream inputStream34 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream34);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse11);
        int int50 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream51 = null;
        commandResponse4.setInputStream(inputStream51);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = inputStream9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream8 = commandResponse3.getInputStream();
        java.lang.String str9 = commandResponse3.getCommand();
        java.io.InputStream inputStream10 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 100, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        int int11 = commandResponse9.getStatusCode();
        java.lang.String str12 = commandResponse9.getError();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse12.toMap();
        java.lang.String str19 = commandResponse12.getError();
        java.lang.Object obj20 = commandResponse4.put("hi!", (java.lang.Object) str19);
        commandResponse4.setStatusCode((-1));
        java.io.InputStream inputStream23 = null;
        commandResponse4.setInputStream(inputStream23);
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        java.lang.String str5 = commandResponse3.getError();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse28.toMap();
        commandResponse20.putAll(strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse20.getHeaders();
        java.lang.Object obj33 = commandResponse4.put("command", (java.lang.Object) commandResponse20);
        java.io.InputStream inputStream34 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = commandResponse20.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) 'a');
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 10, inputStream3);
        commandResponse4.setStatusCode((int) (byte) 10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.lang.String str19 = commandResponse12.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse12.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse12.toMap();
        java.io.InputStream inputStream22 = commandResponse12.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(inputStream22);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream32);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream38);
        int int40 = commandResponse39.getStatusCode();
        java.lang.Object obj41 = commandResponse33.put("error", (java.lang.Object) int40);
        int int42 = commandResponse33.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse33.toMap();
        commandResponse1.putAll(strMap43);
        java.io.InputStream inputStream45 = commandResponse1.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = inputStream45.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream45);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.lang.Class<?> wildcardClass7 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 97, inputStream3);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        int int10 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream9);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream15);
        int int17 = commandResponse16.getStatusCode();
        java.lang.Object obj18 = commandResponse10.put("error", (java.lang.Object) int17);
        int int19 = commandResponse10.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse10.toMap();
        commandResponse4.putAll(strMap20);
        java.io.InputStream inputStream22 = commandResponse4.getInputStream();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream22);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        java.lang.String str3 = commandResponse1.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse5 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj8 = commandResponse5.put("", (java.lang.Object) true);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse5.put("", (java.lang.Object) strMap16);
        commandResponse1.putAll(strMap16);
        commandResponse1.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        java.lang.String str13 = commandResponse4.getCommand();
        int int14 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("hi!", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str18 = commandResponse17.getError();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream22);
        int int24 = commandResponse23.getStatusCode();
        java.io.InputStream inputStream25 = commandResponse23.getInputStream();
        commandResponse23.setStatusCode(200);
        java.io.InputStream inputStream28 = commandResponse23.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        commandResponse23.putAll(strMap33);
        commandResponse17.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        commandResponse4.addHeader("", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "error" + "'", str18, "error");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        commandResponse4.addHeader("", "");
        java.lang.String str25 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.lang.String str5 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse1.toMap();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        java.lang.String str14 = commandResponse4.getCommand();
        java.lang.String str15 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 35);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.String str6 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        commandResponse4.addHeader("error", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        java.lang.String str6 = commandResponse3.getError();
        java.lang.Class<?> wildcardClass7 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 32);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) 0, inputStream3);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getError();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) "command");
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.lang.Object obj28 = commandResponse24.put("", (java.lang.Object) (byte) 10);
        java.lang.String str29 = commandResponse24.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse24.toMap();
        java.io.InputStream inputStream31 = null;
        commandResponse24.setInputStream(inputStream31);
        java.lang.Object obj33 = commandResponse4.put("command", (java.lang.Object) commandResponse24);
        java.io.InputStream inputStream34 = null;
        commandResponse4.setInputStream(inputStream34);
        commandResponse4.setStatusCode((int) '#');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "command" + "'", obj33, "command");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (short) 0, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj15 = commandResponse12.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj20 = commandResponse17.put("", (java.lang.Object) true);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.lang.Object obj29 = commandResponse17.put("", (java.lang.Object) strMap28);
        commandResponse12.putAll(strMap28);
        commandResponse9.putAll(strMap28);
        commandResponse4.putAll(strMap28);
        java.lang.String str33 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "command" + "'", str33, "command");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = commandResponse3.getInputStream();
        commandResponse3.setStatusCode((int) 'a');
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass16 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int16 = commandResponse15.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        commandResponse4.putAll(strMap17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream23);
        int int25 = commandResponse24.getStatusCode();
        java.io.InputStream inputStream26 = commandResponse24.getInputStream();
        commandResponse24.setStatusCode(200);
        java.io.InputStream inputStream29 = commandResponse24.getInputStream();
        java.io.InputStream inputStream30 = null;
        commandResponse24.setInputStream(inputStream30);
        java.lang.String str32 = commandResponse24.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse24.getHeaders();
        java.io.InputStream inputStream34 = null;
        commandResponse24.setInputStream(inputStream34);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse24.toMap();
        java.lang.Object obj37 = commandResponse4.put("hi!", (java.lang.Object) commandResponse24);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse4.getHeaders();
        java.lang.String str23 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream3);
        commandResponse4.addHeader("hi!", "command");
        java.lang.String str8 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj19 = commandResponse16.put("", (java.lang.Object) true);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        java.lang.Object obj28 = commandResponse16.put("", (java.lang.Object) strMap27);
        java.io.InputStream inputStream29 = commandResponse16.getInputStream();
        java.lang.String str30 = commandResponse16.getCommand();
        java.lang.Object obj31 = commandResponse1.put("", (java.lang.Object) str30);
        java.lang.Class<?> wildcardClass32 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse1.toMap();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream20);
        int int22 = commandResponse21.getStatusCode();
        java.lang.Object obj23 = commandResponse15.put("error", (java.lang.Object) int22);
        int int24 = commandResponse15.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse15.toMap();
        commandResponse9.putAll(strMap25);
        commandResponse1.putAll(strMap25);
        java.io.InputStream inputStream28 = commandResponse1.getInputStream();
        commandResponse1.addHeader("", "command");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(inputStream28);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        commandResponse4.addHeader("", "");
        java.lang.Class<?> wildcardClass9 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getCommand();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream9);
        commandResponse10.setStatusCode((int) (short) 1);
        java.lang.String str13 = commandResponse10.getError();
        java.io.InputStream inputStream14 = commandResponse10.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj20 = commandResponse17.put("", (java.lang.Object) true);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.lang.Object obj29 = commandResponse17.put("", (java.lang.Object) strMap28);
        java.io.InputStream inputStream30 = commandResponse17.getInputStream();
        commandResponse17.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj38 = commandResponse35.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj43 = commandResponse40.put("", (java.lang.Object) true);
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream48);
        java.io.InputStream inputStream50 = commandResponse49.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = commandResponse49.toMap();
        java.lang.Object obj52 = commandResponse40.put("", (java.lang.Object) strMap51);
        commandResponse35.putAll(strMap51);
        commandResponse17.putAll(strMap51);
        java.lang.Object obj55 = commandResponse10.put("command", (java.lang.Object) commandResponse17);
        java.lang.Object obj56 = commandResponse3.put("error", obj55);
        java.io.InputStream inputStream57 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error" + "'", str13, "error");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + true + "'", obj52, true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(inputStream57);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (-1), inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 1, inputStream3);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        java.lang.Class<?> wildcardClass12 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 100, inputStream3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse1.getHeaders();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.lang.Class<?> wildcardClass16 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.lang.Object obj23 = commandResponse19.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj26 = commandResponse19.put("hi!", (java.lang.Object) 100.0f);
        commandResponse19.setStatusCode((int) (short) 0);
        java.lang.Object obj29 = commandResponse4.put("hi!", (java.lang.Object) commandResponse19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        int int23 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode((int) (short) 100);
        java.lang.Object obj28 = commandResponse21.put("command", (java.lang.Object) 10.0f);
        java.lang.String str29 = commandResponse21.getError();
        java.lang.Object obj30 = commandResponse15.put("command", (java.lang.Object) commandResponse21);
        java.lang.String str31 = commandResponse15.getError();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse15);
        java.io.InputStream inputStream33 = null;
        commandResponse15.setInputStream(inputStream33);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "command" + "'", str31, "command");
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse9.toMap();
        java.lang.Object obj18 = commandResponse9.put("", (java.lang.Object) (-1));
        java.lang.String str19 = commandResponse9.getError();
        java.io.InputStream inputStream20 = null;
        commandResponse9.setInputStream(inputStream20);
        java.lang.Object obj22 = commandResponse3.put("hi!", (java.lang.Object) inputStream20);
        java.lang.String str23 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.lang.String str13 = commandResponse4.getError();
        java.lang.String str14 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse12.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj23 = commandResponse20.put("", (java.lang.Object) true);
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.lang.Object obj32 = commandResponse20.put("", (java.lang.Object) strMap31);
        commandResponse15.putAll(strMap31);
        commandResponse12.putAll(strMap31);
        commandResponse4.putAll(strMap31);
        commandResponse4.addHeader("hi!", "hi!");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.lang.String str19 = commandResponse12.getCommand();
        commandResponse12.setStatusCode((int) (short) 10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse12.addHeader("", "");
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.lang.Object obj26 = commandResponse22.put("", (java.lang.Object) (byte) 10);
        java.lang.String str27 = commandResponse22.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse22.toMap();
        commandResponse12.putAll(strMap28);
        commandResponse7.putAll(strMap28);
        commandResponse3.putAll(strMap28);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream36);
        int int38 = commandResponse37.getStatusCode();
        java.io.InputStream inputStream39 = commandResponse37.getInputStream();
        commandResponse37.setStatusCode(200);
        java.io.InputStream inputStream42 = commandResponse37.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap43 = commandResponse37.getHeaders();
        commandResponse37.addHeader("error", "command");
        java.lang.Object obj47 = commandResponse3.put("error", (java.lang.Object) commandResponse37);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "hi!" + "'", obj47, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 32, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.lang.Class<?> wildcardClass7 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        java.lang.String str8 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream13);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        int int22 = commandResponse20.getStatusCode();
        commandResponse20.setStatusCode((int) (short) 100);
        java.lang.Object obj27 = commandResponse20.put("command", (java.lang.Object) 10.0f);
        java.lang.String str28 = commandResponse20.getError();
        java.lang.Object obj29 = commandResponse14.put("command", (java.lang.Object) commandResponse20);
        commandResponse20.addHeader("hi!", "error");
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream37);
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream43);
        int int45 = commandResponse44.getStatusCode();
        java.lang.Object obj46 = commandResponse38.put("error", (java.lang.Object) int45);
        java.lang.Object obj47 = commandResponse20.put("error", (java.lang.Object) "error");
        java.lang.Object obj48 = commandResponse4.put("command", obj47);
        java.io.InputStream inputStream49 = null;
        commandResponse4.setInputStream(inputStream49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        commandResponse1.putAll(strMap17);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj24 = commandResponse21.put("", (java.lang.Object) true);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        java.lang.Object obj33 = commandResponse21.put("", (java.lang.Object) strMap32);
        java.lang.Object obj36 = commandResponse21.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        commandResponse21.putAll(strMap43);
        commandResponse1.putAll(strMap43);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse50.toMap();
        commandResponse50.addHeader("", "");
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream59);
        java.io.InputStream inputStream61 = commandResponse60.getInputStream();
        java.lang.Object obj64 = commandResponse60.put("", (java.lang.Object) (byte) 10);
        java.lang.String str65 = commandResponse60.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse60.toMap();
        commandResponse50.putAll(strMap66);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream70 = commandResponse69.getInputStream();
        java.lang.String str71 = commandResponse69.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj76 = commandResponse73.put("", (java.lang.Object) true);
        java.io.InputStream inputStream81 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse82 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream81);
        java.io.InputStream inputStream83 = commandResponse82.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse82.toMap();
        java.lang.Object obj85 = commandResponse73.put("", (java.lang.Object) strMap84);
        commandResponse69.putAll(strMap84);
        commandResponse50.putAll(strMap84);
        commandResponse1.putAll(strMap84);
        java.io.InputStream inputStream89 = null;
        commandResponse1.setInputStream(inputStream89);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + true + "'", obj33, true);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(inputStream61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(inputStream70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.lang.String str22 = commandResponse4.getError();
        java.io.InputStream inputStream23 = null;
        commandResponse4.setInputStream(inputStream23);
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse8.setStatusCode((int) '#');
        java.lang.String str11 = commandResponse8.getCommand();
        java.lang.Object obj12 = commandResponse3.put("error", (java.lang.Object) commandResponse8);
        java.lang.String str13 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "command" + "'", str13, "command");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) "command");
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.lang.Object obj28 = commandResponse24.put("", (java.lang.Object) (byte) 10);
        java.lang.String str29 = commandResponse24.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse24.toMap();
        java.io.InputStream inputStream31 = null;
        commandResponse24.setInputStream(inputStream31);
        java.lang.Object obj33 = commandResponse4.put("command", (java.lang.Object) commandResponse24);
        java.io.InputStream inputStream34 = null;
        commandResponse4.setInputStream(inputStream34);
        java.io.InputStream inputStream36 = commandResponse4.getInputStream();
        java.io.InputStream inputStream41 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream41);
        int int43 = commandResponse42.getStatusCode();
        java.io.InputStream inputStream44 = commandResponse42.getInputStream();
        commandResponse42.setStatusCode(200);
        java.io.InputStream inputStream47 = commandResponse42.getInputStream();
        java.io.InputStream inputStream48 = commandResponse42.getInputStream();
        commandResponse42.addHeader("hi!", "hi!");
        java.io.InputStream inputStream52 = commandResponse42.getInputStream();
        int int53 = commandResponse42.getStatusCode();
        java.lang.Object obj54 = commandResponse4.put("", (java.lang.Object) int53);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "command" + "'", obj33, "command");
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int23 = commandResponse22.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        java.lang.Object obj25 = commandResponse10.put("", (java.lang.Object) strMap24);
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse31.toMap();
        commandResponse31.addHeader("", "");
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.lang.Object obj45 = commandResponse41.put("", (java.lang.Object) (byte) 10);
        java.lang.String str46 = commandResponse41.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse41.toMap();
        commandResponse31.putAll(strMap47);
        java.lang.Object obj49 = commandResponse10.put("", (java.lang.Object) commandResponse31);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.lang.Object obj55 = commandResponse10.put("hi!", (java.lang.Object) "");
        int int56 = commandResponse10.getStatusCode();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{command=command, error=null}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{command=command, error=null}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{command=command, error=null}");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.lang.String str9 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream32);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream38);
        int int40 = commandResponse39.getStatusCode();
        java.lang.Object obj41 = commandResponse33.put("error", (java.lang.Object) int40);
        int int42 = commandResponse33.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse33.toMap();
        commandResponse1.putAll(strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = commandResponse1.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse49.setStatusCode(0);
        java.lang.String str52 = commandResponse49.getError();
        java.io.InputStream inputStream56 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream56);
        java.io.InputStream inputStream58 = commandResponse57.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse57.toMap();
        commandResponse57.addHeader("", "");
        java.io.InputStream inputStream66 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse67 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream66);
        java.io.InputStream inputStream68 = commandResponse67.getInputStream();
        java.lang.Object obj71 = commandResponse67.put("", (java.lang.Object) (byte) 10);
        java.lang.String str72 = commandResponse67.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = commandResponse67.toMap();
        commandResponse57.putAll(strMap73);
        java.io.InputStream inputStream75 = null;
        commandResponse57.setInputStream(inputStream75);
        commandResponse57.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = commandResponse57.toMap();
        commandResponse49.putAll(strMap80);
        commandResponse1.putAll(strMap80);
        java.lang.Class<?> wildcardClass83 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(inputStream58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNull(inputStream68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        java.io.InputStream inputStream22 = commandResponse4.getInputStream();
        java.lang.String str23 = commandResponse4.getCommand();
        java.lang.String str24 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getError();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        commandResponse9.setStatusCode(200);
        java.io.InputStream inputStream14 = commandResponse9.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse9.putAll(strMap19);
        commandResponse3.putAll(strMap19);
        commandResponse3.setStatusCode(52);
        java.lang.String str24 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        int int15 = commandResponse4.getStatusCode();
        java.lang.String str16 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        commandResponse4.setStatusCode(100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream19);
        int int21 = commandResponse20.getStatusCode();
        java.lang.Object obj22 = commandResponse4.put("", (java.lang.Object) int21);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse4.toMap();
        java.lang.String str24 = commandResponse4.getCommand();
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) -1, inputStream3);
        commandResponse4.addHeader("hi!", "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        commandResponse1.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 97, inputStream3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getError();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        commandResponse9.setStatusCode(200);
        java.io.InputStream inputStream14 = commandResponse9.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse9.putAll(strMap19);
        commandResponse3.putAll(strMap19);
        commandResponse3.setStatusCode(52);
        commandResponse3.addHeader("error", "hi!");
        java.io.InputStream inputStream27 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream27);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        commandResponse4.setStatusCode((int) (short) 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj24 = commandResponse17.put("hi!", (java.lang.Object) 100.0f);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.String str28 = commandResponse26.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj33 = commandResponse30.put("", (java.lang.Object) true);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream38);
        java.io.InputStream inputStream40 = commandResponse39.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse39.toMap();
        java.lang.Object obj42 = commandResponse30.put("", (java.lang.Object) strMap41);
        commandResponse26.putAll(strMap41);
        commandResponse17.putAll(strMap41);
        commandResponse4.putAll(strMap41);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) ' ');
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        commandResponse8.addHeader("", "");
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.lang.Object obj22 = commandResponse18.put("", (java.lang.Object) (byte) 10);
        java.lang.String str23 = commandResponse18.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse18.toMap();
        commandResponse8.putAll(strMap24);
        commandResponse3.putAll(strMap24);
        java.lang.String str27 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse3.getHeaders();
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        int int36 = commandResponse34.getStatusCode();
        commandResponse34.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse34.getHeaders();
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream44);
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream50);
        java.io.InputStream inputStream52 = commandResponse51.getInputStream();
        int int53 = commandResponse51.getStatusCode();
        commandResponse51.setStatusCode((int) (short) 100);
        java.lang.Object obj58 = commandResponse51.put("command", (java.lang.Object) 10.0f);
        java.lang.String str59 = commandResponse51.getError();
        java.lang.Object obj60 = commandResponse45.put("command", (java.lang.Object) commandResponse51);
        java.lang.String str61 = commandResponse45.getError();
        java.lang.Object obj62 = commandResponse34.put("hi!", (java.lang.Object) commandResponse45);
        java.lang.String str63 = commandResponse34.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse34.toMap();
        java.lang.Object obj65 = commandResponse3.put("error", (java.lang.Object) strMap64);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "command" + "'", str61, "command");
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "hi!" + "'", obj65, "hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.addHeader("error", "error");
        java.lang.Class<?> wildcardClass16 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1);
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse8.toMap();
        commandResponse3.putAll(strMap9);
        int int11 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse11.getHeaders();
        java.io.InputStream inputStream13 = null;
        commandResponse11.setInputStream(inputStream13);
        java.io.InputStream inputStream15 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse11.toMap();
        commandResponse4.putAll(strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        java.lang.String str19 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass20 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        int int14 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        commandResponse19.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj29 = commandResponse26.put("", (java.lang.Object) true);
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse35.toMap();
        java.lang.Object obj38 = commandResponse26.put("", (java.lang.Object) strMap37);
        commandResponse19.putAll(strMap37);
        commandResponse4.putAll(strMap37);
        java.io.InputStream inputStream41 = null;
        commandResponse4.setInputStream(inputStream41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream18);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse24.toMap();
        java.lang.Object obj26 = commandResponse19.put("error", (java.lang.Object) strMap25);
        commandResponse4.putAll(strMap25);
        java.lang.String str28 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse13.toMap();
        commandResponse13.addHeader("", "");
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("", (java.lang.Object) (byte) 10);
        java.lang.String str28 = commandResponse23.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse23.toMap();
        commandResponse13.putAll(strMap29);
        java.io.InputStream inputStream31 = null;
        commandResponse13.setInputStream(inputStream31);
        commandResponse13.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse13.toMap();
        commandResponse4.putAll(strMap36);
        int int38 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass39 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 32, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream15 = null;
        commandResponse10.setInputStream(inputStream15);
        java.lang.String str17 = commandResponse10.getCommand();
        commandResponse10.addHeader("", "error");
        int int21 = commandResponse10.getStatusCode();
        java.lang.Object obj22 = commandResponse4.put("command", (java.lang.Object) int21);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1);
        commandResponse3.addHeader("", "error");
        commandResponse3.setStatusCode(32);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream3);
        commandResponse4.setStatusCode(1);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream23);
        int int25 = commandResponse24.getStatusCode();
        java.lang.Object obj26 = commandResponse18.put("error", (java.lang.Object) int25);
        int int27 = commandResponse18.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse18.toMap();
        commandResponse4.putAll(strMap28);
        java.lang.Class<?> wildcardClass30 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 32, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.lang.String str19 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        commandResponse4.putAll(strMap20);
        commandResponse4.addHeader("command", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse4.toMap();
        java.io.InputStream inputStream26 = null;
        commandResponse4.setInputStream(inputStream26);
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.lang.Class<?> wildcardClass16 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.String str5 = commandResponse3.getCommand();
        java.lang.String str6 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        commandResponse18.addHeader("hi!", "");
        java.lang.String str22 = commandResponse18.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse18.getHeaders();
        java.lang.Object obj24 = commandResponse4.put("hi!", (java.lang.Object) commandResponse18);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 1);
        commandResponse4.addHeader("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int15 = commandResponse14.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse4.put("error", (java.lang.Object) strMap16);
        java.io.InputStream inputStream18 = null;
        commandResponse4.setInputStream(inputStream18);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.String str14 = commandResponse4.getError();
        java.lang.String str15 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.lang.Object obj17 = commandResponse10.put("command", (java.lang.Object) 10.0f);
        java.lang.String str18 = commandResponse10.getError();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse10);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse10.getHeaders();
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse26.toMap();
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        int int37 = commandResponse35.getStatusCode();
        commandResponse35.setStatusCode((int) (short) 100);
        java.lang.Object obj42 = commandResponse35.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj43 = commandResponse26.put("error", (java.lang.Object) 10.0f);
        java.lang.String str44 = commandResponse26.getError();
        java.lang.Object obj45 = commandResponse10.put("error", (java.lang.Object) str44);
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse10.toMap();
        java.io.InputStream inputStream47 = commandResponse10.getInputStream();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNull(inputStream47);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getCommand();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        java.lang.String str12 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.lang.String str17 = commandResponse12.getCommand();
        java.lang.Object obj18 = commandResponse4.put("command", (java.lang.Object) commandResponse12);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse11.getHeaders();
        java.io.InputStream inputStream13 = null;
        commandResponse11.setInputStream(inputStream13);
        java.io.InputStream inputStream15 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse11.toMap();
        commandResponse4.putAll(strMap16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        java.io.InputStream inputStream19 = null;
        commandResponse4.setInputStream(inputStream19);
        commandResponse4.addHeader("command", "hi!");
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = commandResponse4.put("hi!", obj25);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        commandResponse1.putAll(strMap17);
        int int20 = commandResponse1.getStatusCode();
        java.io.InputStream inputStream21 = null;
        commandResponse1.setInputStream(inputStream21);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream7 = commandResponse6.getInputStream();
        java.lang.String str8 = commandResponse6.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj13 = commandResponse10.put("", (java.lang.Object) true);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        java.lang.Object obj22 = commandResponse10.put("", (java.lang.Object) strMap21);
        commandResponse6.putAll(strMap21);
        commandResponse4.putAll(strMap21);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream29);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream35);
        int int37 = commandResponse36.getStatusCode();
        java.lang.Object obj38 = commandResponse30.put("error", (java.lang.Object) int37);
        int int39 = commandResponse30.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse30.toMap();
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream45);
        int int47 = commandResponse46.getStatusCode();
        java.lang.Object obj48 = commandResponse30.put("", (java.lang.Object) int47);
        java.lang.Object obj49 = commandResponse4.put("error", (java.lang.Object) int47);
        java.io.InputStream inputStream50 = null;
        commandResponse4.setInputStream(inputStream50);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 97, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.lang.String str15 = commandResponse13.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj20 = commandResponse17.put("", (java.lang.Object) true);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.lang.Object obj29 = commandResponse17.put("", (java.lang.Object) strMap28);
        commandResponse13.putAll(strMap28);
        commandResponse4.putAll(strMap28);
        commandResponse4.setStatusCode((-1));
        int int34 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) 'a');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("", (java.lang.Object) (byte) 10);
        java.lang.String str19 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        commandResponse4.putAll(strMap20);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.String str25 = commandResponse23.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj30 = commandResponse27.put("", (java.lang.Object) true);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        java.lang.Object obj39 = commandResponse27.put("", (java.lang.Object) strMap38);
        commandResponse23.putAll(strMap38);
        commandResponse4.putAll(strMap38);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream45);
        java.io.InputStream inputStream51 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream51);
        int int53 = commandResponse52.getStatusCode();
        java.lang.Object obj54 = commandResponse46.put("error", (java.lang.Object) int53);
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse46.toMap();
        commandResponse4.putAll(strMap55);
        commandResponse4.setStatusCode(10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + true + "'", obj39, true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        commandResponse1.addHeader("error", "error");
        java.lang.Class<?> wildcardClass11 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        int int29 = commandResponse1.getStatusCode();
        int int30 = commandResponse1.getStatusCode();
        java.lang.String str31 = commandResponse1.getError();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse4.toMap();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream21);
        java.io.InputStream inputStream23 = null;
        commandResponse22.setInputStream(inputStream23);
        int int25 = commandResponse22.getStatusCode();
        java.lang.String str26 = commandResponse22.getError();
        java.lang.Object obj27 = commandResponse4.put("command", (java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.io.InputStream inputStream29 = commandResponse1.getInputStream();
        int int30 = commandResponse1.getStatusCode();
        java.io.InputStream inputStream31 = null;
        commandResponse1.setInputStream(inputStream31);
        commandResponse1.addHeader("command", "command");
        java.io.InputStream inputStream36 = null;
        commandResponse1.setInputStream(inputStream36);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0);
        commandResponse3.setStatusCode(0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1);
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse8.toMap();
        commandResponse3.putAll(strMap9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        int int12 = commandResponse4.getStatusCode();
        java.lang.String str13 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass14 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream5 = commandResponse1.getInputStream();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream10);
        commandResponse11.setStatusCode((int) (short) 1);
        java.lang.String str14 = commandResponse11.getError();
        commandResponse11.addHeader("", "error");
        int int18 = commandResponse11.getStatusCode();
        java.lang.Object obj19 = commandResponse1.put("", (java.lang.Object) commandResponse11);
        java.lang.String str20 = commandResponse11.getCommand();
        java.io.InputStream inputStream21 = commandResponse11.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 10, inputStream3);
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        int int7 = commandResponse4.getStatusCode();
        java.lang.String str8 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = commandResponse4.put("command", obj14);
        commandResponse4.setStatusCode((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        int int19 = commandResponse17.getStatusCode();
        commandResponse17.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse17.getHeaders();
        commandResponse17.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = commandResponse17.getHeaders();
        int int26 = commandResponse17.getStatusCode();
        java.io.InputStream inputStream27 = null;
        commandResponse17.setInputStream(inputStream27);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse33.toMap();
        commandResponse33.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse33.getHeaders();
        java.lang.String str40 = commandResponse33.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse33.toMap();
        commandResponse17.putAll(strMap41);
        commandResponse4.putAll(strMap41);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) ' ');
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.lang.Object obj19 = commandResponse15.put("", (java.lang.Object) (byte) 10);
        java.lang.String str20 = commandResponse15.getCommand();
        java.io.InputStream inputStream21 = null;
        commandResponse15.setInputStream(inputStream21);
        java.lang.String str23 = commandResponse15.getCommand();
        java.lang.Object obj24 = commandResponse4.put("error", (java.lang.Object) str23);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) 'a', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        commandResponse11.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse11.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse11.toMap();
        commandResponse4.putAll(strMap18);
        java.lang.String str20 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass21 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        commandResponse1.addHeader("command", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse1.toMap();
        int int19 = commandResponse1.getStatusCode();
        java.lang.Class<?> wildcardClass20 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.String str5 = commandResponse3.getError();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj17 = commandResponse10.put("hi!", (java.lang.Object) 100.0f);
        commandResponse10.setStatusCode((int) (short) 0);
        commandResponse10.addHeader("command", "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse10.toMap();
        commandResponse3.putAll(strMap23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.addHeader("error", "command");
        java.lang.String str8 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.lang.Object obj19 = commandResponse15.put("", (java.lang.Object) (byte) 10);
        java.lang.String str20 = commandResponse15.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse15.toMap();
        java.lang.Object obj24 = commandResponse15.put("", (java.lang.Object) (-1));
        java.lang.String str25 = commandResponse15.getError();
        java.lang.Object obj26 = commandResponse4.put("", (java.lang.Object) commandResponse15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        java.lang.String str12 = commandResponse4.getCommand();
        java.lang.String str13 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream22);
        int int24 = commandResponse23.getStatusCode();
        java.io.InputStream inputStream25 = commandResponse23.getInputStream();
        commandResponse23.setStatusCode(200);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream32);
        java.lang.Object obj34 = commandResponse23.put("", (java.lang.Object) commandResponse33);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj40 = commandResponse37.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj45 = commandResponse42.put("", (java.lang.Object) true);
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream50);
        java.io.InputStream inputStream52 = commandResponse51.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse51.toMap();
        java.lang.Object obj54 = commandResponse42.put("", (java.lang.Object) strMap53);
        commandResponse37.putAll(strMap53);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj60 = commandResponse57.put("", (java.lang.Object) true);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream65);
        java.io.InputStream inputStream67 = commandResponse66.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap68 = commandResponse66.toMap();
        java.lang.Object obj69 = commandResponse57.put("", (java.lang.Object) strMap68);
        java.lang.Object obj72 = commandResponse57.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream76 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse77 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream76);
        java.io.InputStream inputStream78 = commandResponse77.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap79 = commandResponse77.toMap();
        commandResponse57.putAll(strMap79);
        commandResponse37.putAll(strMap79);
        java.lang.Object obj82 = commandResponse33.put("command", (java.lang.Object) strMap79);
        commandResponse16.putAll(strMap79);
        commandResponse4.putAll(strMap79);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + true + "'", obj54, true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(inputStream67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + true + "'", obj69, true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream78);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.lang.Object obj26 = commandResponse20.put("", (java.lang.Object) false);
        commandResponse20.setStatusCode((int) (short) 10);
        int int29 = commandResponse20.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap30 = commandResponse20.getHeaders();
        java.lang.Object obj31 = commandResponse4.put("command", (java.lang.Object) commandResponse20);
        java.io.InputStream inputStream32 = commandResponse20.getInputStream();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(inputStream32);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.String str5 = commandResponse3.getError();
        int int6 = commandResponse3.getStatusCode();
        commandResponse3.addHeader("", "error");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 10);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        commandResponse9.addHeader("", "");
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.lang.Object obj23 = commandResponse19.put("", (java.lang.Object) (byte) 10);
        java.lang.String str24 = commandResponse19.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse19.toMap();
        commandResponse9.putAll(strMap25);
        java.io.InputStream inputStream27 = null;
        commandResponse9.setInputStream(inputStream27);
        commandResponse9.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse9.getHeaders();
        java.lang.Object obj33 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse9.toMap();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.lang.Class<?> wildcardClass4 = commandResponse1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (byte) 10);
        commandResponse4.setStatusCode((int) '4');
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.String str5 = commandResponse3.getError();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.lang.String str15 = commandResponse10.getCommand();
        java.lang.String str16 = commandResponse10.getCommand();
        java.lang.String str17 = commandResponse10.getCommand();
        int int18 = commandResponse10.getStatusCode();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse23.toMap();
        commandResponse10.putAll(strMap28);
        commandResponse3.putAll(strMap28);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 97, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        commandResponse22.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse22.getHeaders();
        java.lang.String str29 = commandResponse22.getCommand();
        java.lang.Object obj30 = commandResponse16.put("", (java.lang.Object) str29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse16.toMap();
        commandResponse4.putAll(strMap31);
        java.lang.String str33 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = commandResponse4.getHeaders();
        java.io.InputStream inputStream35 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream35);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.Object obj12 = commandResponse3.put("", (java.lang.Object) "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        int int23 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode((int) (short) 100);
        java.lang.Object obj28 = commandResponse21.put("command", (java.lang.Object) 10.0f);
        java.lang.String str29 = commandResponse21.getError();
        java.lang.Object obj30 = commandResponse15.put("command", (java.lang.Object) commandResponse21);
        java.lang.String str31 = commandResponse15.getError();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse15);
        java.lang.String str33 = commandResponse4.getCommand();
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        int int40 = commandResponse38.getStatusCode();
        commandResponse38.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = commandResponse38.getHeaders();
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream47);
        java.io.InputStream inputStream49 = commandResponse48.getInputStream();
        java.lang.Object obj52 = commandResponse48.put("", (java.lang.Object) (byte) 10);
        java.lang.String str53 = commandResponse48.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse48.toMap();
        commandResponse38.putAll(strMap54);
        commandResponse38.addHeader("command", "hi!");
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream62);
        int int64 = commandResponse63.getStatusCode();
        java.io.InputStream inputStream65 = commandResponse63.getInputStream();
        commandResponse63.setStatusCode(200);
        java.io.InputStream inputStream68 = commandResponse63.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = commandResponse72.toMap();
        commandResponse63.putAll(strMap73);
        commandResponse38.putAll(strMap73);
        commandResponse4.putAll(strMap73);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "command" + "'", str31, "command");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(inputStream65);
        org.junit.Assert.assertNull(inputStream68);
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        commandResponse4.addHeader("", "");
        java.lang.Class<?> wildcardClass25 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (-1), inputStream3);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.io.InputStream inputStream24 = commandResponse11.getInputStream();
        commandResponse11.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse11.putAll(strMap45);
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse11);
        int int50 = commandResponse4.getStatusCode();
        int int51 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream52 = null;
        commandResponse4.setInputStream(inputStream52);
        java.io.InputStream inputStream54 = null;
        commandResponse4.setInputStream(inputStream54);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse3.getHeaders();
        java.lang.String str10 = commandResponse3.getError();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("error", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream22 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "error");
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse30.toMap();
        java.lang.Object obj36 = commandResponse30.put("", (java.lang.Object) false);
        commandResponse30.setStatusCode((int) (short) 10);
        int int39 = commandResponse30.getStatusCode();
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream43);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream49);
        int int51 = commandResponse50.getStatusCode();
        java.lang.Object obj52 = commandResponse44.put("error", (java.lang.Object) int51);
        int int53 = commandResponse44.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse44.toMap();
        commandResponse30.putAll(strMap54);
        commandResponse4.putAll(strMap54);
        java.io.InputStream inputStream57 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(inputStream57);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        commandResponse16.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        java.io.InputStream inputStream36 = commandResponse23.getInputStream();
        commandResponse23.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj44 = commandResponse41.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj49 = commandResponse46.put("", (java.lang.Object) true);
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream54);
        java.io.InputStream inputStream56 = commandResponse55.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse55.toMap();
        java.lang.Object obj58 = commandResponse46.put("", (java.lang.Object) strMap57);
        commandResponse41.putAll(strMap57);
        commandResponse23.putAll(strMap57);
        commandResponse16.putAll(strMap57);
        commandResponse4.putAll(strMap57);
        java.io.InputStream inputStream67 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream67);
        java.lang.String str69 = commandResponse68.getCommand();
        java.lang.Object obj70 = commandResponse4.put("", (java.lang.Object) str69);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + true + "'", obj58, true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (short) 1 + "'", obj70, (short) 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj21 = commandResponse18.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        commandResponse18.putAll(strMap34);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj41 = commandResponse38.put("", (java.lang.Object) true);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse47.toMap();
        java.lang.Object obj50 = commandResponse38.put("", (java.lang.Object) strMap49);
        java.lang.Object obj53 = commandResponse38.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse58.toMap();
        commandResponse38.putAll(strMap60);
        commandResponse18.putAll(strMap60);
        java.lang.Object obj63 = commandResponse14.put("command", (java.lang.Object) strMap60);
        java.io.InputStream inputStream64 = null;
        commandResponse14.setInputStream(inputStream64);
        commandResponse14.addHeader("", "hi!");
        commandResponse14.setStatusCode((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + true + "'", obj50, true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 200, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.lang.String str2 = commandResponse1.getCommand();
        java.lang.String str3 = commandResponse1.getError();
        int int4 = commandResponse1.getStatusCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse1.toMap();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        int int23 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode((int) (short) 100);
        java.lang.Object obj28 = commandResponse21.put("command", (java.lang.Object) 10.0f);
        java.lang.String str29 = commandResponse21.getError();
        java.lang.Object obj30 = commandResponse15.put("command", (java.lang.Object) commandResponse21);
        java.lang.String str31 = commandResponse15.getError();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse15);
        java.lang.String str33 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse4.toMap();
        java.lang.String str35 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "command" + "'", str31, "command");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.io.InputStream inputStream15 = null;
        commandResponse9.setInputStream(inputStream15);
        java.lang.Object obj17 = commandResponse3.put("error", (java.lang.Object) inputStream15);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 0);
        commandResponse3.addHeader("command", "command");
        java.lang.String str24 = commandResponse3.getCommand();
        java.lang.String str25 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 32, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        int int15 = commandResponse4.getStatusCode();
        int int16 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.lang.Object obj8 = commandResponse3.put("", (java.lang.Object) 35);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse3.getHeaders();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream7 = commandResponse6.getInputStream();
        java.lang.String str8 = commandResponse6.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj13 = commandResponse10.put("", (java.lang.Object) true);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        java.lang.Object obj22 = commandResponse10.put("", (java.lang.Object) strMap21);
        commandResponse6.putAll(strMap21);
        commandResponse4.putAll(strMap21);
        commandResponse4.setStatusCode((int) (byte) 100);
        java.lang.String str27 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) 'a');
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        java.lang.String str14 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "error");
        java.io.InputStream inputStream18 = null;
        commandResponse4.setInputStream(inputStream18);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse1.toMap();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream9);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) -1, inputStream14);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        commandResponse26.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse26.getHeaders();
        java.lang.String str33 = commandResponse26.getCommand();
        java.lang.Object obj34 = commandResponse20.put("", (java.lang.Object) str33);
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse20.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse20.toMap();
        commandResponse15.putAll(strMap36);
        commandResponse10.putAll(strMap36);
        commandResponse4.putAll(strMap36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 0, inputStream3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        java.lang.Object obj20 = commandResponse13.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj21 = commandResponse4.put("hi!", obj20);
        commandResponse4.addHeader("", "");
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        commandResponse4.addHeader("error", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream7 = commandResponse6.getInputStream();
        java.lang.String str8 = commandResponse6.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj13 = commandResponse10.put("", (java.lang.Object) true);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        java.lang.Object obj22 = commandResponse10.put("", (java.lang.Object) strMap21);
        commandResponse6.putAll(strMap21);
        commandResponse4.putAll(strMap21);
        commandResponse4.setStatusCode((int) (byte) 100);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 100);
        java.lang.Object obj32 = commandResponse4.put("command", (java.lang.Object) 100);
        java.lang.String str33 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 0, inputStream3);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode(1);
        java.lang.String str8 = commandResponse4.getError();
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass10 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.lang.String str15 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "command" + "'", str15, "command");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.lang.String str7 = commandResponse4.getCommand();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse3.setStatusCode(0);
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = inputStream6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj19 = commandResponse16.put("", (java.lang.Object) true);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        java.lang.Object obj28 = commandResponse16.put("", (java.lang.Object) strMap27);
        java.io.InputStream inputStream29 = commandResponse16.getInputStream();
        java.lang.String str30 = commandResponse16.getCommand();
        java.lang.Object obj31 = commandResponse1.put("", (java.lang.Object) str30);
        java.lang.String str32 = commandResponse1.getError();
        java.io.InputStream inputStream33 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(inputStream33);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = commandResponse4.put("error", obj12);
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a', inputStream3);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        commandResponse1.addHeader("command", "");
        commandResponse1.addHeader("hi!", "command");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = null;
        commandResponse4.setInputStream(inputStream12);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream18);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse24.toMap();
        java.lang.Object obj26 = commandResponse19.put("error", (java.lang.Object) strMap25);
        commandResponse4.putAll(strMap25);
        java.lang.Class<?> wildcardClass28 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        int int23 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode((int) (short) 100);
        java.lang.Object obj28 = commandResponse21.put("command", (java.lang.Object) 10.0f);
        java.lang.String str29 = commandResponse21.getError();
        java.lang.Object obj30 = commandResponse15.put("command", (java.lang.Object) commandResponse21);
        java.lang.String str31 = commandResponse15.getError();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse15);
        java.lang.String str33 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "command" + "'", str31, "command");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.addHeader("error", "error");
        java.io.InputStream inputStream16 = null;
        commandResponse4.setInputStream(inputStream16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        int int19 = commandResponse4.getStatusCode();
        int int20 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getCommand();
        commandResponse3.addHeader("error", "command");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.lang.String str9 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = commandResponse4.put("command", obj7);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse1.toMap();
        commandResponse1.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse1.putAll(strMap27);
        java.lang.String str29 = commandResponse1.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream34 = null;
        commandResponse33.setInputStream(inputStream34);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse39.toMap();
        commandResponse33.putAll(strMap40);
        commandResponse1.putAll(strMap40);
        commandResponse1.addHeader("hi!", "");
        java.io.InputStream inputStream46 = null;
        commandResponse1.setInputStream(inputStream46);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strMap40);
    }
}

