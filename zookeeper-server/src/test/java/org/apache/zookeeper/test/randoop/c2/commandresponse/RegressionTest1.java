package org.apache.zookeeper.test.randoop.c2.commandresponse;
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
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 100, inputStream3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        java.lang.Object obj11 = commandResponse3.put("", (java.lang.Object) strMap10);
        java.lang.String str12 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "command" + "'", str12, "command");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        commandResponse1.addHeader("error", "error");
        java.lang.String str11 = commandResponse1.getError();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        commandResponse4.setStatusCode(35);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        int int13 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse8.setStatusCode((int) '#');
        java.lang.String str11 = commandResponse8.getCommand();
        java.lang.Object obj12 = commandResponse3.put("error", (java.lang.Object) commandResponse8);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse8.toMap();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream3);
        commandResponse4.addHeader("", "command");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.io.InputStream inputStream25 = null;
        commandResponse1.setInputStream(inputStream25);
        java.lang.String str27 = commandResponse1.getCommand();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a', inputStream3);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        java.lang.Class<?> wildcardClass22 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (-1));
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.String str31 = commandResponse1.getCommand();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        commandResponse9.addHeader("", "");
        java.lang.String str15 = commandResponse9.getError();
        commandResponse9.addHeader("hi!", "");
        java.io.InputStream inputStream19 = commandResponse9.getInputStream();
        java.io.InputStream inputStream20 = null;
        commandResponse9.setInputStream(inputStream20);
        java.lang.String str22 = commandResponse9.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse9.toMap();
        commandResponse4.putAll(strMap23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.io.InputStream inputStream21 = null;
        commandResponse10.setInputStream(inputStream21);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj10 = commandResponse7.put("", (java.lang.Object) true);
        java.io.InputStream inputStream11 = commandResponse7.getInputStream();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream16);
        commandResponse17.setStatusCode((int) (short) 1);
        java.lang.String str20 = commandResponse17.getError();
        commandResponse17.addHeader("", "error");
        int int24 = commandResponse17.getStatusCode();
        java.lang.Object obj25 = commandResponse7.put("", (java.lang.Object) commandResponse17);
        java.lang.Object obj26 = commandResponse3.put("error", (java.lang.Object) commandResponse17);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error" + "'", str20, "error");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + true + "'", obj25, true);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.lang.Class<?> wildcardClass32 = commandResponse3.getClass();
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) 'a');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 10);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.util.Map<java.lang.String, java.lang.String> strMap34 = commandResponse3.getHeaders();
        java.lang.String str35 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) ' ', inputStream11);
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream17);
        int int19 = commandResponse18.getStatusCode();
        java.io.InputStream inputStream20 = commandResponse18.getInputStream();
        commandResponse18.setStatusCode(200);
        java.io.InputStream inputStream23 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse18.toMap();
        java.lang.Object obj25 = commandResponse12.put("error", (java.lang.Object) strMap24);
        commandResponse4.putAll(strMap24);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        java.lang.Class<?> wildcardClass19 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream40 = null;
        commandResponse35.setInputStream(inputStream40);
        java.lang.String str42 = commandResponse35.getCommand();
        java.io.InputStream inputStream43 = commandResponse35.getInputStream();
        java.lang.Object obj44 = commandResponse1.put("command", (java.lang.Object) inputStream43);
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
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(inputStream43);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "hi!" + "'", obj44, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 100);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.addHeader("error", "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        int int14 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass15 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 100);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) -1);
        commandResponse3.setStatusCode((int) (byte) -1);
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        commandResponse3.setStatusCode(0);
        java.lang.Class<?> wildcardClass6 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 52);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) '4', inputStream3);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) ' ', inputStream3);
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
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        java.io.InputStream inputStream20 = commandResponse4.getInputStream();
        int int21 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass22 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 10, inputStream3);
        commandResponse4.addHeader("hi!", "hi!");
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        java.lang.String str46 = commandResponse1.getCommand();
        java.io.InputStream inputStream47 = null;
        commandResponse1.setInputStream(inputStream47);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "command" + "'", str8, "command");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse10.getHeaders();
        java.lang.Object obj12 = commandResponse4.put("", (java.lang.Object) strMap11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.String str27 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "command" + "'", str27, "command");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.lang.String str2 = commandResponse1.getCommand();
        java.io.InputStream inputStream3 = null;
        commandResponse1.setInputStream(inputStream3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "command" + "'", str2, "command");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        int int11 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream15);
        int int17 = commandResponse16.getStatusCode();
        int int18 = commandResponse16.getStatusCode();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse23.toMap();
        commandResponse23.addHeader("", "");
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.lang.Object obj37 = commandResponse33.put("", (java.lang.Object) (byte) 10);
        java.lang.String str38 = commandResponse33.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse33.toMap();
        commandResponse23.putAll(strMap39);
        commandResponse16.putAll(strMap39);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse16.toMap();
        commandResponse4.putAll(strMap42);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode(1);
        commandResponse4.addHeader("", "command");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.setStatusCode(100);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str10 = commandResponse9.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse9.toMap();
        commandResponse4.putAll(strMap12);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 35, inputStream3);
        commandResponse4.addHeader("error", "command");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode((int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.addHeader("command", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        int int14 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.lang.Object obj24 = commandResponse20.put("", (java.lang.Object) (byte) 10);
        java.lang.String str25 = commandResponse20.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse20.toMap();
        int int27 = commandResponse20.getStatusCode();
        java.lang.String str28 = commandResponse20.getError();
        java.lang.String str29 = commandResponse20.getError();
        java.lang.Object obj30 = commandResponse4.put("", (java.lang.Object) str29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.util.Map<java.lang.String, java.lang.String> strMap42 = commandResponse30.getHeaders();
        java.lang.String str43 = commandResponse30.getError();
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
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        int int11 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream16);
        commandResponse17.setStatusCode((int) (short) 1);
        java.lang.String str20 = commandResponse17.getError();
        java.io.InputStream inputStream21 = commandResponse17.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj27 = commandResponse24.put("", (java.lang.Object) true);
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse33.toMap();
        java.lang.Object obj36 = commandResponse24.put("", (java.lang.Object) strMap35);
        java.io.InputStream inputStream37 = commandResponse24.getInputStream();
        commandResponse24.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj45 = commandResponse42.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj50 = commandResponse47.put("", (java.lang.Object) true);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream57 = commandResponse56.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse56.toMap();
        java.lang.Object obj59 = commandResponse47.put("", (java.lang.Object) strMap58);
        commandResponse42.putAll(strMap58);
        commandResponse24.putAll(strMap58);
        java.lang.Object obj62 = commandResponse17.put("command", (java.lang.Object) commandResponse24);
        java.lang.String str63 = commandResponse17.getError();
        java.lang.Class<?> wildcardClass64 = commandResponse17.getClass();
        java.lang.Object obj65 = commandResponse4.put("hi!", (java.lang.Object) commandResponse17);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = commandResponse17.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error" + "'", str20, "error");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + true + "'", obj59, true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "error" + "'", str63, "error");
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(strMap66);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream8 = commandResponse3.getInputStream();
        java.lang.String str9 = commandResponse3.getCommand();
        commandResponse3.addHeader("error", "error");
        java.lang.String str13 = commandResponse3.getCommand();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        commandResponse4.addHeader("command", "hi!");
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = commandResponse4.put("command", obj29);
        commandResponse4.addHeader("error", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 1, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass26 = strMap25.getClass();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        int int5 = commandResponse3.getStatusCode();
        commandResponse3.setStatusCode((int) (short) 0);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 100, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.lang.String str7 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "");
        java.lang.String str12 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.io.InputStream inputStream25 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        commandResponse4.setStatusCode((-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 1);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = inputStream6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        java.lang.String str6 = commandResponse3.getCommand();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getError();
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 52);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        java.io.InputStream inputStream42 = null;
        commandResponse4.setInputStream(inputStream42);
        java.lang.Class<?> wildcardClass44 = commandResponse4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        int int13 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        java.util.Map<java.lang.String, java.lang.String> strMap34 = commandResponse3.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse38.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        commandResponse3.putAll(strMap40);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode(200);
        java.lang.String str16 = commandResponse4.getCommand();
        int int17 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        int int11 = commandResponse4.getStatusCode();
        java.lang.String str12 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream9);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream14);
        int int16 = commandResponse15.getStatusCode();
        java.io.InputStream inputStream17 = commandResponse15.getInputStream();
        commandResponse15.setStatusCode(200);
        java.io.InputStream inputStream20 = commandResponse15.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse24.toMap();
        commandResponse15.putAll(strMap25);
        commandResponse10.putAll(strMap25);
        java.lang.Object obj28 = commandResponse4.put("", (java.lang.Object) commandResponse10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) ' ', inputStream3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream29);
        commandResponse30.addHeader("hi!", "command");
        int int34 = commandResponse30.getStatusCode();
        java.lang.Object obj35 = commandResponse4.put("error", (java.lang.Object) commandResponse30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 200, inputStream3);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        java.lang.String str16 = commandResponse4.getError();
        java.io.InputStream inputStream17 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode(1);
        java.lang.String str14 = commandResponse4.getCommand();
        int int15 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj21 = commandResponse18.put("", (java.lang.Object) true);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        java.lang.Object obj30 = commandResponse18.put("", (java.lang.Object) strMap29);
        java.lang.Object obj33 = commandResponse18.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.lang.Object obj42 = commandResponse38.put("", (java.lang.Object) (byte) 10);
        java.lang.String str43 = commandResponse38.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse38.toMap();
        commandResponse18.putAll(strMap44);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream49);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream55);
        int int57 = commandResponse56.getStatusCode();
        java.lang.Object obj58 = commandResponse50.put("error", (java.lang.Object) int57);
        int int59 = commandResponse50.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse50.toMap();
        commandResponse18.putAll(strMap60);
        java.lang.String str62 = commandResponse18.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap63 = commandResponse18.getHeaders();
        java.lang.Object obj64 = commandResponse4.put("hi!", (java.lang.Object) strMap63);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        java.io.InputStream inputStream20 = commandResponse11.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNull(inputStream20);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = commandResponse4.put("error", obj9);
        java.lang.String str11 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse1.toMap();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        commandResponse3.addHeader("command", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        java.lang.String str8 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        int int7 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 100);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.Class<?> wildcardClass3 = commandResponse1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = null;
        commandResponse1.setInputStream(inputStream2);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        int int11 = commandResponse9.getStatusCode();
        commandResponse9.setStatusCode(0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 100);
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.lang.String str15 = commandResponse10.getCommand();
        java.io.InputStream inputStream16 = null;
        commandResponse10.setInputStream(inputStream16);
        java.lang.String str18 = commandResponse10.getCommand();
        java.lang.Object obj19 = commandResponse3.put("", (java.lang.Object) commandResponse10);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse3.getHeaders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        commandResponse4.addHeader("error", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.lang.String str13 = commandResponse4.getError();
        commandResponse4.setStatusCode((-1));
        java.lang.String str16 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.String str26 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.io.InputStream inputStream32 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream32);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 0, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4', inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse7.getHeaders();
        java.lang.Object obj9 = commandResponse4.put("hi!", (java.lang.Object) commandResponse7);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse15.toMap();
        java.lang.Object obj17 = commandResponse7.put("error", (java.lang.Object) strMap16);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.lang.String str7 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 35, inputStream3);
        commandResponse4.setStatusCode((int) (byte) 100);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        java.io.InputStream inputStream63 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse64 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream63);
        java.io.InputStream inputStream65 = commandResponse64.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse64.toMap();
        commandResponse4.putAll(strMap66);
        java.io.InputStream inputStream72 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream72);
        java.io.InputStream inputStream74 = commandResponse73.getInputStream();
        java.lang.Object obj77 = commandResponse73.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream78 = null;
        commandResponse73.setInputStream(inputStream78);
        java.lang.String str80 = commandResponse73.getCommand();
        commandResponse73.addHeader("", "error");
        java.io.InputStream inputStream84 = commandResponse73.getInputStream();
        java.lang.String str85 = commandResponse73.getError();
        java.lang.Object obj86 = commandResponse4.put("error", (java.lang.Object) str85);
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
        org.junit.Assert.assertNull(inputStream65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(inputStream74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNull(inputStream84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + "command" + "'", obj86, "command");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode(1);
        java.lang.String str14 = commandResponse10.getError();
        java.lang.String str15 = commandResponse10.getCommand();
        java.lang.Object obj16 = commandResponse1.put("", (java.lang.Object) commandResponse10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.lang.Object obj22 = commandResponse1.put("", (java.lang.Object) commandResponse21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "command" + "'", str15, "command");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        commandResponse3.addHeader("error", "hi!");
        commandResponse3.addHeader("command", "error");
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        int int16 = commandResponse14.getStatusCode();
        commandResponse14.setStatusCode((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj28 = commandResponse25.put("", (java.lang.Object) true);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse34.toMap();
        java.lang.Object obj37 = commandResponse25.put("", (java.lang.Object) strMap36);
        java.io.InputStream inputStream38 = commandResponse25.getInputStream();
        commandResponse25.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj46 = commandResponse43.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj51 = commandResponse48.put("", (java.lang.Object) true);
        java.io.InputStream inputStream56 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream56);
        java.io.InputStream inputStream58 = commandResponse57.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse57.toMap();
        java.lang.Object obj60 = commandResponse48.put("", (java.lang.Object) strMap59);
        commandResponse43.putAll(strMap59);
        commandResponse25.putAll(strMap59);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = commandResponse25.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse25.toMap();
        commandResponse4.putAll(strMap64);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(inputStream58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + true + "'", obj60, true);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNotNull(strMap64);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
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
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse8.toMap();
        commandResponse3.putAll(strMap29);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj35 = commandResponse32.put("", (java.lang.Object) true);
        java.lang.Object obj38 = commandResponse32.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        commandResponse32.putAll(strMap45);
        java.io.InputStream inputStream47 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse32.toMap();
        commandResponse3.putAll(strMap48);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + true + "'", obj38, true);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        commandResponse4.setStatusCode((int) '4');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 100);
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.String str12 = commandResponse4.getError();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "command" + "'", str12, "command");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 100);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.String str7 = commandResponse4.getCommand();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.lang.Object obj28 = commandResponse24.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream29 = null;
        commandResponse24.setInputStream(inputStream29);
        java.lang.String str31 = commandResponse24.getCommand();
        commandResponse24.addHeader("", "error");
        int int35 = commandResponse24.getStatusCode();
        java.lang.String str36 = commandResponse24.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse24.toMap();
        commandResponse1.putAll(strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
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
        commandResponse8.putAll(strMap29);
        java.lang.String str32 = commandResponse8.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse8.toMap();
        commandResponse4.putAll(strMap33);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(35);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream15);
        commandResponse16.addHeader("", "error");
        commandResponse16.setStatusCode(10);
        java.lang.String str22 = commandResponse16.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse16.getHeaders();
        java.lang.Object obj24 = commandResponse4.put("", (java.lang.Object) strMap23);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 100);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.String str37 = commandResponse4.getError();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) ' ', inputStream3);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.String str21 = commandResponse10.getCommand();
        java.lang.Class<?> wildcardClass22 = commandResponse10.getClass();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 0, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("command", "command");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        commandResponse4.setStatusCode((int) (short) 1);
        java.io.InputStream inputStream45 = null;
        commandResponse4.setInputStream(inputStream45);
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass13 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse1.addHeader("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse1.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        java.lang.Object obj49 = commandResponse34.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream53 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream53);
        java.io.InputStream inputStream55 = commandResponse54.getInputStream();
        java.lang.Object obj58 = commandResponse54.put("", (java.lang.Object) (byte) 10);
        java.lang.String str59 = commandResponse54.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse54.toMap();
        commandResponse34.putAll(strMap60);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream65);
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream71);
        int int73 = commandResponse72.getStatusCode();
        java.lang.Object obj74 = commandResponse66.put("error", (java.lang.Object) int73);
        int int75 = commandResponse66.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = commandResponse66.toMap();
        commandResponse34.putAll(strMap76);
        java.lang.Object obj78 = commandResponse20.put("hi!", (java.lang.Object) commandResponse34);
        commandResponse20.setStatusCode(1);
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
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 100, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse4.putAll(strMap10);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.io.InputStream inputStream20 = commandResponse4.getInputStream();
        int int21 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        commandResponse4.addHeader("", "");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 200, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1);
        commandResponse9.addHeader("", "error");
        java.lang.Object obj13 = commandResponse4.put("hi!", (java.lang.Object) "error");
        java.lang.String str14 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 10);
        commandResponse3.addHeader("error", "hi!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) -1, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass22 = strMap21.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        commandResponse1.addHeader("", "hi!");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        commandResponse4.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 35, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.io.InputStream inputStream46 = null;
        commandResponse1.setInputStream(inputStream46);
        java.io.InputStream inputStream51 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream51);
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse52.toMap();
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        int int60 = commandResponse58.getStatusCode();
        commandResponse58.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap63 = commandResponse58.getHeaders();
        java.io.InputStream inputStream67 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream67);
        java.io.InputStream inputStream69 = commandResponse68.getInputStream();
        java.lang.Object obj72 = commandResponse68.put("", (java.lang.Object) (byte) 10);
        java.lang.String str73 = commandResponse68.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse68.toMap();
        commandResponse58.putAll(strMap74);
        commandResponse52.putAll(strMap74);
        commandResponse1.putAll(strMap74);
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
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(inputStream69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(strMap74);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        commandResponse3.setStatusCode(100);
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("", (java.lang.Object) (byte) 10);
        java.lang.String str22 = commandResponse17.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse17.toMap();
        java.lang.String str24 = commandResponse17.getError();
        java.lang.Object obj25 = commandResponse9.put("hi!", (java.lang.Object) str24);
        commandResponse9.setStatusCode((-1));
        java.io.InputStream inputStream28 = null;
        commandResponse9.setInputStream(inputStream28);
        int int30 = commandResponse9.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse9.toMap();
        commandResponse3.putAll(strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse3.getHeaders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        int int9 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.String str23 = commandResponse12.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) 'a');
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 10);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.io.InputStream inputStream16 = commandResponse1.getInputStream();
        java.lang.String str17 = commandResponse1.getError();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = obj22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream54);
        java.io.InputStream inputStream56 = commandResponse55.getInputStream();
        int int57 = commandResponse55.getStatusCode();
        commandResponse55.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = commandResponse55.getHeaders();
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream65);
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream71);
        java.io.InputStream inputStream73 = commandResponse72.getInputStream();
        int int74 = commandResponse72.getStatusCode();
        commandResponse72.setStatusCode((int) (short) 100);
        java.lang.Object obj79 = commandResponse72.put("command", (java.lang.Object) 10.0f);
        java.lang.String str80 = commandResponse72.getError();
        java.lang.Object obj81 = commandResponse66.put("command", (java.lang.Object) commandResponse72);
        java.lang.String str82 = commandResponse66.getError();
        java.lang.Object obj83 = commandResponse55.put("hi!", (java.lang.Object) commandResponse66);
        java.lang.Class<?> wildcardClass84 = commandResponse55.getClass();
        java.lang.Object obj85 = commandResponse10.put("command", (java.lang.Object) wildcardClass84);
        java.lang.String str86 = commandResponse10.getCommand();
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
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(inputStream73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "command" + "'", str82, "command");
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 10.0f + "'", obj85, 10.0f);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.setStatusCode(10);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '4');
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse1.getHeaders();
        java.lang.String str6 = commandResponse1.getCommand();
        commandResponse1.setStatusCode((int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse1.toMap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertNotNull(strMap38);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        java.lang.String str16 = commandResponse4.getError();
        int int17 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 10, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = commandResponse4.put("", obj7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.io.InputStream inputStream16 = null;
        commandResponse4.setInputStream(inputStream16);
        commandResponse4.addHeader("", "command");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) ' ');
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse8.setStatusCode((int) '#');
        java.lang.String str11 = commandResponse8.getCommand();
        java.lang.Object obj12 = commandResponse3.put("error", (java.lang.Object) commandResponse8);
        commandResponse3.setStatusCode((int) (byte) 1);
        java.io.InputStream inputStream15 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        commandResponse1.setStatusCode((int) '#');
        java.io.InputStream inputStream21 = null;
        commandResponse1.setInputStream(inputStream21);
        java.lang.String str23 = commandResponse1.getError();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.Class<?> wildcardClass25 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 35, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse3.setStatusCode(0);
        java.lang.String str6 = commandResponse3.getCommand();
        java.lang.String str7 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.lang.String str13 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.lang.String str7 = commandResponse4.getError();
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream12);
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream17);
        int int19 = commandResponse18.getStatusCode();
        java.io.InputStream inputStream20 = commandResponse18.getInputStream();
        commandResponse18.setStatusCode(200);
        java.io.InputStream inputStream23 = commandResponse18.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse27.toMap();
        commandResponse18.putAll(strMap28);
        commandResponse13.putAll(strMap28);
        commandResponse4.putAll(strMap28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse27.toMap();
        java.lang.Object obj33 = commandResponse27.put("", (java.lang.Object) false);
        commandResponse27.setStatusCode((int) (short) 10);
        int int36 = commandResponse27.getStatusCode();
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream40);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream46);
        int int48 = commandResponse47.getStatusCode();
        java.lang.Object obj49 = commandResponse41.put("error", (java.lang.Object) int48);
        int int50 = commandResponse41.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = commandResponse41.toMap();
        commandResponse27.putAll(strMap51);
        commandResponse3.putAll(strMap51);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(strMap51);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.io.InputStream inputStream16 = null;
        commandResponse4.setInputStream(inputStream16);
        java.io.InputStream inputStream18 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNull(inputStream18);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        commandResponse16.addHeader("", "");
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.Object obj30 = commandResponse26.put("", (java.lang.Object) (byte) 10);
        java.lang.String str31 = commandResponse26.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse26.toMap();
        commandResponse16.putAll(strMap32);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.String str37 = commandResponse35.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj42 = commandResponse39.put("", (java.lang.Object) true);
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream47);
        java.io.InputStream inputStream49 = commandResponse48.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse48.toMap();
        java.lang.Object obj51 = commandResponse39.put("", (java.lang.Object) strMap50);
        commandResponse35.putAll(strMap50);
        commandResponse16.putAll(strMap50);
        commandResponse4.putAll(strMap50);
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream59);
        java.util.Map<java.lang.String, java.lang.String> strMap61 = commandResponse60.getHeaders();
        java.lang.Object obj62 = commandResponse4.put("error", (java.lang.Object) strMap61);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + true + "'", obj51, true);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "hi!" + "'", obj62, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        int int10 = commandResponse4.getStatusCode();
        int int11 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = commandResponse4.put("hi!", obj22);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        java.lang.Object obj27 = commandResponse15.put("", (java.lang.Object) strMap26);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse15.toMap();
        commandResponse4.putAll(strMap28);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.lang.Object obj20 = commandResponse16.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream21 = null;
        commandResponse16.setInputStream(inputStream21);
        java.lang.String str23 = commandResponse16.getCommand();
        commandResponse16.addHeader("", "error");
        java.lang.Object obj27 = commandResponse4.put("hi!", (java.lang.Object) "error");
        java.lang.String str28 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.lang.Object obj33 = commandResponse29.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse29.toMap();
        int int35 = commandResponse29.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse29.toMap();
        commandResponse1.putAll(strMap36);
        commandResponse1.setStatusCode((int) ' ');
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
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) 'a');
        java.lang.String str4 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(10);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse10.toMap();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        int int21 = commandResponse19.getStatusCode();
        commandResponse19.setStatusCode((int) (short) 100);
        java.lang.Object obj26 = commandResponse19.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj27 = commandResponse10.put("hi!", obj26);
        java.lang.Object obj30 = commandResponse10.put("", (java.lang.Object) "error");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = commandResponse10.getHeaders();
        java.lang.Object obj32 = commandResponse4.put("hi!", (java.lang.Object) commandResponse10);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        int int50 = commandResponse4.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        int int29 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        int int3 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse1.toMap();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("", (java.lang.Object) (byte) 10);
        java.lang.String str22 = commandResponse17.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse17.toMap();
        java.lang.String str24 = commandResponse17.getError();
        java.lang.Object obj25 = commandResponse9.put("hi!", (java.lang.Object) str24);
        commandResponse9.setStatusCode((-1));
        java.io.InputStream inputStream28 = null;
        commandResponse9.setInputStream(inputStream28);
        int int30 = commandResponse9.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse9.toMap();
        commandResponse4.putAll(strMap31);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        commandResponse4.addHeader("", "");
        java.lang.String str48 = commandResponse4.getCommand();
        java.io.InputStream inputStream53 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream53);
        java.io.InputStream inputStream55 = commandResponse54.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse54.toMap();
        commandResponse54.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap60 = commandResponse54.getHeaders();
        java.lang.String str61 = commandResponse54.getError();
        java.io.InputStream inputStream66 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse67 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream66);
        java.io.InputStream inputStream68 = commandResponse67.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = commandResponse67.toMap();
        java.lang.Object obj72 = commandResponse67.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = commandResponse67.getHeaders();
        java.lang.String str74 = commandResponse67.getError();
        java.lang.Object obj75 = commandResponse54.put("", (java.lang.Object) commandResponse67);
        java.lang.String str76 = commandResponse54.getError();
        java.lang.Object obj77 = commandResponse4.put("command", (java.lang.Object) str76);
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(inputStream55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNull(inputStream68);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 100);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        commandResponse4.setStatusCode(0);
        java.lang.String str29 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj10 = commandResponse7.put("", (java.lang.Object) true);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        java.lang.Object obj19 = commandResponse7.put("", (java.lang.Object) strMap18);
        java.lang.Object obj22 = commandResponse7.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.lang.Object obj31 = commandResponse27.put("", (java.lang.Object) (byte) 10);
        java.lang.String str32 = commandResponse27.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse27.toMap();
        commandResponse7.putAll(strMap33);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream38);
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream44);
        int int46 = commandResponse45.getStatusCode();
        java.lang.Object obj47 = commandResponse39.put("error", (java.lang.Object) int46);
        int int48 = commandResponse39.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse39.toMap();
        commandResponse7.putAll(strMap49);
        commandResponse4.putAll(strMap49);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 32, inputStream3);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        commandResponse22.addHeader("", "");
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.lang.Object obj36 = commandResponse32.put("", (java.lang.Object) (byte) 10);
        java.lang.String str37 = commandResponse32.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse32.toMap();
        commandResponse22.putAll(strMap38);
        commandResponse17.putAll(strMap38);
        java.lang.String str41 = commandResponse17.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = commandResponse17.getHeaders();
        java.lang.Object obj43 = commandResponse4.put("error", (java.lang.Object) strMap42);
        java.lang.String str44 = commandResponse4.getCommand();
        int int45 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        java.lang.String str5 = commandResponse3.getCommand();
        java.lang.Class<?> wildcardClass6 = commandResponse3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse12.toMap();
        int int18 = commandResponse12.getStatusCode();
        java.lang.String str19 = commandResponse12.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse12.toMap();
        java.lang.String str21 = commandResponse12.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse12.toMap();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream26);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        java.lang.Object obj34 = commandResponse27.put("error", (java.lang.Object) strMap33);
        commandResponse12.putAll(strMap33);
        commandResponse7.putAll(strMap33);
        commandResponse3.putAll(strMap33);
        int int38 = commandResponse3.getStatusCode();
        commandResponse3.setStatusCode(35);
        java.lang.String str41 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.String str20 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        java.lang.Object obj38 = commandResponse23.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.lang.Object obj47 = commandResponse43.put("", (java.lang.Object) (byte) 10);
        java.lang.String str48 = commandResponse43.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse43.toMap();
        commandResponse23.putAll(strMap49);
        java.lang.String str51 = commandResponse23.getCommand();
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = commandResponse23.put("error", obj53);
        commandResponse23.setStatusCode(32);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = commandResponse23.getHeaders();
        java.lang.Object obj58 = commandResponse4.put("", (java.lang.Object) strMap57);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + "hi!" + "'", obj54, "hi!");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        int int6 = commandResponse4.getStatusCode();
        int int7 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
        int int14 = commandResponse4.getStatusCode();
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
        commandResponse4.putAll(strMap29);
        commandResponse4.addHeader("command", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse24.toMap();
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        int int35 = commandResponse33.getStatusCode();
        commandResponse33.setStatusCode((int) (short) 100);
        java.lang.Object obj40 = commandResponse33.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj41 = commandResponse24.put("error", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream42 = commandResponse24.getInputStream();
        commandResponse24.addHeader("hi!", "error");
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse50.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse50.toMap();
        java.lang.Object obj56 = commandResponse50.put("", (java.lang.Object) false);
        commandResponse50.setStatusCode((int) (short) 10);
        int int59 = commandResponse50.getStatusCode();
        java.io.InputStream inputStream63 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse64 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream63);
        java.io.InputStream inputStream69 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse70 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream69);
        int int71 = commandResponse70.getStatusCode();
        java.lang.Object obj72 = commandResponse64.put("error", (java.lang.Object) int71);
        int int73 = commandResponse64.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse64.toMap();
        commandResponse50.putAll(strMap74);
        commandResponse24.putAll(strMap74);
        commandResponse1.putAll(strMap74);
        java.io.InputStream inputStream78 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNull(inputStream78);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        commandResponse3.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (short) -1);
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode((int) '#');
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse1.getHeaders();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        int int12 = commandResponse10.getStatusCode();
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
        commandResponse10.putAll(strMap33);
        commandResponse1.putAll(strMap33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        java.lang.String str12 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 100);
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.lang.String str15 = commandResponse10.getCommand();
        java.io.InputStream inputStream16 = null;
        commandResponse10.setInputStream(inputStream16);
        java.lang.String str18 = commandResponse10.getCommand();
        java.lang.Object obj19 = commandResponse3.put("", (java.lang.Object) commandResponse10);
        java.lang.Class<?> wildcardClass20 = commandResponse10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getError();
        int int5 = commandResponse3.getStatusCode();
        java.lang.Class<?> wildcardClass6 = commandResponse3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.lang.Object obj24 = commandResponse20.put("", (java.lang.Object) (byte) 10);
        java.lang.String str25 = commandResponse20.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse20.toMap();
        java.io.InputStream inputStream27 = null;
        commandResponse20.setInputStream(inputStream27);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj34 = commandResponse31.put("", (java.lang.Object) true);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse40.toMap();
        java.lang.Object obj43 = commandResponse31.put("", (java.lang.Object) strMap42);
        java.lang.Object obj46 = commandResponse31.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream50);
        java.io.InputStream inputStream52 = commandResponse51.getInputStream();
        java.lang.Object obj55 = commandResponse51.put("", (java.lang.Object) (byte) 10);
        java.lang.String str56 = commandResponse51.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse51.toMap();
        commandResponse31.putAll(strMap57);
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream62);
        java.io.InputStream inputStream68 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream68);
        int int70 = commandResponse69.getStatusCode();
        java.lang.Object obj71 = commandResponse63.put("error", (java.lang.Object) int70);
        int int72 = commandResponse63.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = commandResponse63.toMap();
        commandResponse31.putAll(strMap73);
        java.lang.Object obj75 = commandResponse20.put("", (java.lang.Object) strMap73);
        java.lang.Object obj76 = commandResponse4.put("command", obj75);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (byte) 10 + "'", obj75, (byte) 10);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 35);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass10 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.lang.String str50 = commandResponse4.getError();
        java.io.InputStream inputStream51 = commandResponse4.getInputStream();
        java.io.InputStream inputStream52 = null;
        commandResponse4.setInputStream(inputStream52);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap54);
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
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "error" + "'", str50, "error");
        org.junit.Assert.assertNull(inputStream51);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ', inputStream3);
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (short) 1, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.util.Map<java.lang.String, java.lang.String> strMap37 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.lang.Class<?> wildcardClass25 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 35, inputStream3);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.String str14 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) (byte) 1);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.io.InputStream inputStream19 = null;
        commandResponse4.setInputStream(inputStream19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 200);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.io.InputStream inputStream16 = commandResponse1.getInputStream();
        commandResponse1.addHeader("", "error");
        java.lang.String str20 = commandResponse1.getError();
        int int21 = commandResponse1.getStatusCode();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        java.lang.String str42 = commandResponse4.getError();
        java.io.InputStream inputStream43 = commandResponse4.getInputStream();
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
        org.junit.Assert.assertNull(inputStream43);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("command", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 200, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 1);
        java.lang.String str4 = commandResponse3.getError();
        int int5 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.lang.String str15 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) 'a', inputStream17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream24);
        java.io.InputStream inputStream26 = null;
        commandResponse25.setInputStream(inputStream26);
        java.lang.Object obj28 = commandResponse18.put("error", (java.lang.Object) commandResponse25);
        java.lang.Object obj29 = commandResponse4.put("error", (java.lang.Object) commandResponse25);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse12.toMap();
        int int18 = commandResponse12.getStatusCode();
        java.lang.String str19 = commandResponse12.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse12.toMap();
        java.lang.String str21 = commandResponse12.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse12.toMap();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream26);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        java.lang.Object obj34 = commandResponse27.put("error", (java.lang.Object) strMap33);
        commandResponse12.putAll(strMap33);
        commandResponse7.putAll(strMap33);
        commandResponse3.putAll(strMap33);
        int int38 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 0);
        java.io.InputStream inputStream42 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(inputStream42);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        int int18 = commandResponse17.getStatusCode();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse17);
        commandResponse4.setStatusCode((int) '4');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) -1);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) 10, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) 'a', inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse10.toMap();
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
        commandResponse10.putAll(strMap51);
        commandResponse4.putAll(strMap51);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strMap15);
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
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream8 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 1, inputStream3);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.util.Map<java.lang.String, java.lang.String> strMap38 = commandResponse10.getHeaders();
        commandResponse10.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(strMap38);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 52);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        int int23 = commandResponse10.getStatusCode();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.lang.Object obj20 = commandResponse16.put("", (java.lang.Object) (byte) 10);
        java.lang.String str21 = commandResponse16.getCommand();
        java.io.InputStream inputStream22 = null;
        commandResponse16.setInputStream(inputStream22);
        java.lang.Object obj24 = commandResponse10.put("error", (java.lang.Object) inputStream22);
        java.lang.Object obj25 = commandResponse3.put("", (java.lang.Object) "error");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 100, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        java.lang.String str20 = commandResponse4.getError();
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        commandResponse19.addHeader("", "");
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.lang.Object obj33 = commandResponse29.put("", (java.lang.Object) (byte) 10);
        java.lang.String str34 = commandResponse29.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse29.toMap();
        commandResponse19.putAll(strMap35);
        commandResponse4.putAll(strMap35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse3.setStatusCode((int) '#');
        java.lang.String str6 = commandResponse3.getCommand();
        int int7 = commandResponse3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse4.toMap();
        int int17 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        java.lang.String str35 = commandResponse4.getError();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200);
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream7);
        commandResponse8.addHeader("hi!", "");
        java.io.InputStream inputStream12 = commandResponse8.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse16.toMap();
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
        commandResponse16.putAll(strMap35);
        commandResponse8.putAll(strMap35);
        java.io.InputStream inputStream40 = null;
        commandResponse8.setInputStream(inputStream40);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream45);
        java.io.InputStream inputStream47 = commandResponse46.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse46.toMap();
        commandResponse46.addHeader("", "");
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream57 = commandResponse56.getInputStream();
        java.lang.Object obj60 = commandResponse56.put("", (java.lang.Object) (byte) 10);
        java.lang.String str61 = commandResponse56.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = commandResponse56.toMap();
        commandResponse46.putAll(strMap62);
        commandResponse8.putAll(strMap62);
        commandResponse3.putAll(strMap62);
        java.io.InputStream inputStream66 = null;
        commandResponse3.setInputStream(inputStream66);
        int int68 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + true + "'", obj36, true);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 200 + "'", int68 == 200);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 100, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.lang.String str6 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (byte) 1);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0);
        commandResponse3.addHeader("", "error");
        int int7 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 32, inputStream3);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) ' ', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getError();
        int int5 = commandResponse3.getStatusCode();
        java.lang.String str6 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj12 = commandResponse9.put("", (java.lang.Object) true);
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        java.lang.Object obj21 = commandResponse9.put("", (java.lang.Object) strMap20);
        java.lang.Object obj24 = commandResponse9.put("", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = commandResponse4.put("command", (java.lang.Object) wildcardClass25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse4.toMap();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) 'a', inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        commandResponse10.addHeader("", "");
        java.lang.String str16 = commandResponse10.getCommand();
        int int17 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse10.toMap();
        int int21 = commandResponse10.getStatusCode();
        java.lang.Object obj22 = commandResponse4.put("", (java.lang.Object) int21);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj11 = commandResponse8.put("", (java.lang.Object) true);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        java.lang.Object obj20 = commandResponse8.put("", (java.lang.Object) strMap19);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        java.io.InputStream inputStream36 = commandResponse23.getInputStream();
        java.lang.String str37 = commandResponse23.getCommand();
        java.lang.Object obj38 = commandResponse8.put("", (java.lang.Object) str37);
        java.lang.Object obj39 = commandResponse3.put("hi!", obj38);
        java.lang.Class<?> wildcardClass40 = commandResponse3.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.io.InputStream inputStream34 = commandResponse4.getInputStream();
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream38);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse39.toMap();
        commandResponse4.putAll(strMap40);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.lang.Object obj47 = commandResponse4.put("command", (java.lang.Object) "");
        java.util.Map<java.lang.String, java.lang.String> strMap48 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "command" + "'", obj33, "command");
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + "error" + "'", obj47, "error");
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(32);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 200, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj10 = commandResponse7.put("", (java.lang.Object) true);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        java.lang.Object obj19 = commandResponse7.put("", (java.lang.Object) strMap18);
        java.lang.Object obj22 = commandResponse7.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.lang.Object obj31 = commandResponse27.put("", (java.lang.Object) (byte) 10);
        java.lang.String str32 = commandResponse27.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse27.toMap();
        commandResponse7.putAll(strMap33);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        int int42 = commandResponse40.getStatusCode();
        commandResponse40.setStatusCode((int) (short) 100);
        commandResponse40.setStatusCode(0);
        commandResponse40.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj58 = commandResponse55.put("", (java.lang.Object) true);
        java.io.InputStream inputStream63 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse64 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream63);
        java.io.InputStream inputStream65 = commandResponse64.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse64.toMap();
        java.lang.Object obj67 = commandResponse55.put("", (java.lang.Object) strMap66);
        commandResponse50.putAll(strMap66);
        commandResponse40.putAll(strMap66);
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = commandResponse40.toMap();
        java.lang.String str71 = commandResponse40.getCommand();
        int int72 = commandResponse40.getStatusCode();
        java.lang.String str73 = commandResponse40.getCommand();
        java.lang.Object obj74 = commandResponse7.put("error", (java.lang.Object) commandResponse40);
        java.lang.Object obj75 = commandResponse4.put("command", (java.lang.Object) commandResponse40);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(inputStream65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + true + "'", obj67, true);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "hi!" + "'", obj74, "hi!");
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        commandResponse4.setStatusCode(0);
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.lang.Object obj11 = commandResponse3.put("command", (java.lang.Object) int10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse3.toMap();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        int int9 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.lang.String str9 = commandResponse3.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse3.setInputStream(inputStream10);
        commandResponse3.setStatusCode((int) '#');
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.lang.String str4 = commandResponse1.getError();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        int int15 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.lang.Object obj26 = commandResponse22.put("hi!", (java.lang.Object) 10L);
        commandResponse22.setStatusCode((int) (short) 1);
        java.lang.Object obj29 = commandResponse4.put("command", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        commandResponse4.addHeader("error", "error");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse20.getHeaders();
        int int22 = commandResponse20.getStatusCode();
        java.lang.Object obj23 = commandResponse4.put("hi!", (java.lang.Object) int22);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 0, inputStream3);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 200, inputStream3);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        commandResponse4.addHeader("", "command");
        int int11 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        java.lang.String str20 = commandResponse4.getError();
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj11 = commandResponse8.put("", (java.lang.Object) true);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        java.lang.Object obj20 = commandResponse8.put("", (java.lang.Object) strMap19);
        java.lang.Object obj23 = commandResponse8.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream27);
        java.io.InputStream inputStream29 = commandResponse28.getInputStream();
        java.lang.Object obj32 = commandResponse28.put("", (java.lang.Object) (byte) 10);
        java.lang.String str33 = commandResponse28.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse28.toMap();
        commandResponse8.putAll(strMap34);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream39);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream45);
        int int47 = commandResponse46.getStatusCode();
        java.lang.Object obj48 = commandResponse40.put("error", (java.lang.Object) int47);
        int int49 = commandResponse40.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse40.toMap();
        commandResponse8.putAll(strMap50);
        java.lang.String str52 = commandResponse8.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse8.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap54 = commandResponse8.getHeaders();
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream58);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream62 = commandResponse61.getInputStream();
        java.lang.String str63 = commandResponse61.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj68 = commandResponse65.put("", (java.lang.Object) true);
        java.io.InputStream inputStream73 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse74 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream73);
        java.io.InputStream inputStream75 = commandResponse74.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = commandResponse74.toMap();
        java.lang.Object obj77 = commandResponse65.put("", (java.lang.Object) strMap76);
        commandResponse61.putAll(strMap76);
        commandResponse59.putAll(strMap76);
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = commandResponse59.toMap();
        commandResponse8.putAll(strMap80);
        commandResponse3.putAll(strMap80);
        java.util.Map<java.lang.String, java.lang.String> strMap83 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(inputStream62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(inputStream75);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + true + "'", obj77, true);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertNotNull(strMap83);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getCommand();
        commandResponse4.addHeader("error", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        commandResponse4.addHeader("command", "hi!");
        commandResponse4.setStatusCode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.lang.Object obj12 = commandResponse8.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse8.toMap();
        int int14 = commandResponse8.getStatusCode();
        java.lang.String str15 = commandResponse8.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse8.toMap();
        java.lang.String str17 = commandResponse8.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse8.toMap();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream22);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse28.toMap();
        java.lang.Object obj30 = commandResponse23.put("error", (java.lang.Object) strMap29);
        commandResponse8.putAll(strMap29);
        commandResponse3.putAll(strMap29);
        int int33 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 35);
        java.lang.Object obj24 = commandResponse3.put("command", (java.lang.Object) commandResponse23);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        commandResponse1.setStatusCode((int) (byte) 0);
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        commandResponse17.addHeader("", "");
        java.lang.String str23 = commandResponse17.getError();
        commandResponse17.addHeader("hi!", "");
        java.io.InputStream inputStream27 = commandResponse17.getInputStream();
        java.io.InputStream inputStream28 = null;
        commandResponse17.setInputStream(inputStream28);
        java.lang.String str30 = commandResponse17.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse17.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap34 = commandResponse33.getHeaders();
        java.lang.String str35 = commandResponse33.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse33.toMap();
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream40);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse41.toMap();
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream46);
        java.io.InputStream inputStream52 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream52);
        int int54 = commandResponse53.getStatusCode();
        java.lang.Object obj55 = commandResponse47.put("error", (java.lang.Object) int54);
        int int56 = commandResponse47.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse47.toMap();
        commandResponse41.putAll(strMap57);
        commandResponse33.putAll(strMap57);
        commandResponse17.putAll(strMap57);
        java.lang.Object obj61 = commandResponse4.put("", (java.lang.Object) strMap57);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) 10 + "'", obj61, (byte) 10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 10);
        java.lang.Object obj19 = commandResponse4.put("", (java.lang.Object) (short) 10);
        commandResponse4.addHeader("error", "error");
        commandResponse4.setStatusCode(32);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '4', inputStream3);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        int int24 = commandResponse22.getStatusCode();
        commandResponse22.setStatusCode((int) (short) 100);
        java.lang.Object obj29 = commandResponse22.put("command", (java.lang.Object) 10.0f);
        java.lang.String str30 = commandResponse22.getError();
        java.lang.Object obj31 = commandResponse4.put("error", (java.lang.Object) str30);
        java.io.InputStream inputStream32 = commandResponse4.getInputStream();
        commandResponse4.addHeader("command", "");
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse41.toMap();
        int int44 = commandResponse41.getStatusCode();
        java.lang.Object obj45 = commandResponse4.put("", (java.lang.Object) int44);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.lang.Object obj14 = commandResponse10.put("", (java.lang.Object) (byte) 10);
        java.lang.String str15 = commandResponse10.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse10.toMap();
        java.lang.Object obj19 = commandResponse10.put("", (java.lang.Object) (-1));
        java.lang.String str20 = commandResponse10.getError();
        java.io.InputStream inputStream21 = null;
        commandResponse10.setInputStream(inputStream21);
        commandResponse10.addHeader("", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse10.toMap();
        commandResponse3.putAll(strMap26);
        java.lang.Class<?> wildcardClass28 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream36);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse37.toMap();
        commandResponse37.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = commandResponse37.getHeaders();
        java.lang.String str44 = commandResponse37.getError();
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse50.toMap();
        java.lang.Object obj55 = commandResponse50.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = commandResponse50.getHeaders();
        java.lang.String str57 = commandResponse50.getError();
        java.lang.Object obj58 = commandResponse37.put("", (java.lang.Object) commandResponse50);
        commandResponse50.setStatusCode((int) (byte) 10);
        commandResponse50.setStatusCode(32);
        java.io.InputStream inputStream63 = commandResponse50.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse50.toMap();
        commandResponse4.putAll(strMap64);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.lang.String str13 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.util.Map<java.lang.String, java.lang.String> strMap25 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getCommand();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode((int) (byte) -1);
        commandResponse4.addHeader("hi!", "error");
        java.lang.Class<?> wildcardClass21 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4', inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse7.getHeaders();
        java.lang.Object obj9 = commandResponse4.put("hi!", (java.lang.Object) commandResponse7);
        commandResponse4.addHeader("error", "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.Object obj16 = commandResponse12.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse12.toMap();
        int int18 = commandResponse12.getStatusCode();
        java.lang.String str19 = commandResponse12.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse12.toMap();
        java.lang.String str21 = commandResponse12.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse12.toMap();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream26);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        java.lang.Object obj34 = commandResponse27.put("error", (java.lang.Object) strMap33);
        commandResponse12.putAll(strMap33);
        commandResponse7.putAll(strMap33);
        commandResponse3.putAll(strMap33);
        int int38 = commandResponse3.getStatusCode();
        commandResponse3.addHeader("hi!", "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) -1, inputStream3);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.util.Map<java.lang.String, java.lang.String> strMap25 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) '#');
        java.io.InputStream inputStream28 = null;
        commandResponse4.setInputStream(inputStream28);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        int int4 = commandResponse3.getStatusCode();
        int int5 = commandResponse3.getStatusCode();
        int int6 = commandResponse3.getStatusCode();
        java.lang.Class<?> wildcardClass7 = commandResponse3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) -1, inputStream3);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.io.InputStream inputStream29 = commandResponse17.getInputStream();
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
        org.junit.Assert.assertNull(inputStream29);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 32, inputStream3);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        java.lang.Class<?> wildcardClass14 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse16.getHeaders();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse27.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj33 = commandResponse30.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj38 = commandResponse35.put("", (java.lang.Object) true);
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse44.toMap();
        java.lang.Object obj47 = commandResponse35.put("", (java.lang.Object) strMap46);
        commandResponse30.putAll(strMap46);
        commandResponse27.putAll(strMap46);
        commandResponse22.putAll(strMap46);
        commandResponse16.putAll(strMap46);
        java.lang.Object obj52 = commandResponse4.put("command", (java.lang.Object) strMap46);
        int int53 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + true + "'", obj47, true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.io.InputStream inputStream64 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (short) 10, inputStream64);
        java.io.InputStream inputStream66 = null;
        commandResponse65.setInputStream(inputStream66);
        java.lang.Object obj68 = commandResponse4.put("", (java.lang.Object) commandResponse65);
        java.io.InputStream inputStream69 = null;
        commandResponse65.setInputStream(inputStream69);
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
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) -1, inputStream3);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = commandResponse4.put("error", obj6);
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.lang.Object obj17 = commandResponse13.put("", (java.lang.Object) (byte) 10);
        java.lang.String str18 = commandResponse13.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse13.toMap();
        java.io.InputStream inputStream20 = commandResponse13.getInputStream();
        commandResponse13.setStatusCode(10);
        java.io.InputStream inputStream23 = null;
        commandResponse13.setInputStream(inputStream23);
        java.lang.Object obj25 = commandResponse4.put("", (java.lang.Object) commandResponse13);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        java.io.InputStream inputStream64 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (short) 10, inputStream64);
        java.io.InputStream inputStream66 = null;
        commandResponse65.setInputStream(inputStream66);
        java.lang.Object obj68 = commandResponse4.put("", (java.lang.Object) commandResponse65);
        commandResponse65.addHeader("", "error");
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
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        int int24 = commandResponse22.getStatusCode();
        commandResponse22.setStatusCode((int) (short) 100);
        java.lang.Object obj29 = commandResponse22.put("command", (java.lang.Object) 10.0f);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse40.toMap();
        commandResponse40.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap46 = commandResponse40.getHeaders();
        java.lang.String str47 = commandResponse40.getCommand();
        java.lang.Object obj48 = commandResponse34.put("", (java.lang.Object) str47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse34.toMap();
        commandResponse22.putAll(strMap49);
        commandResponse4.putAll(strMap49);
        java.io.InputStream inputStream52 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(inputStream52);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 100, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse9.getHeaders();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse10.toMap();
        commandResponse10.addHeader("command", "command");
        java.io.InputStream inputStream15 = commandResponse10.getInputStream();
        java.lang.String str16 = commandResponse10.getCommand();
        commandResponse10.setStatusCode(32);
        java.lang.Object obj19 = commandResponse4.put("hi!", (java.lang.Object) 32);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse5 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj8 = commandResponse5.put("", (java.lang.Object) true);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse5.put("", (java.lang.Object) strMap16);
        java.io.InputStream inputStream18 = commandResponse5.getInputStream();
        commandResponse5.addHeader("command", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse5.toMap();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream26);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse27.toMap();
        commandResponse5.putAll(strMap28);
        commandResponse3.putAll(strMap28);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        int int18 = commandResponse17.getStatusCode();
        java.lang.Object obj19 = commandResponse4.put("command", (java.lang.Object) commandResponse17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream23);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream29);
        int int31 = commandResponse30.getStatusCode();
        java.lang.Object obj32 = commandResponse24.put("error", (java.lang.Object) int31);
        int int33 = commandResponse24.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse24.toMap();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream39);
        int int41 = commandResponse40.getStatusCode();
        java.lang.Object obj42 = commandResponse24.put("", (java.lang.Object) int41);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse24.toMap();
        commandResponse17.putAll(strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = commandResponse17.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = commandResponse17.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream10);
        int int12 = commandResponse11.getStatusCode();
        java.io.InputStream inputStream13 = commandResponse11.getInputStream();
        commandResponse11.setStatusCode(200);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream20);
        java.lang.Object obj22 = commandResponse11.put("", (java.lang.Object) commandResponse21);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj28 = commandResponse25.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj33 = commandResponse30.put("", (java.lang.Object) true);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream38);
        java.io.InputStream inputStream40 = commandResponse39.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse39.toMap();
        java.lang.Object obj42 = commandResponse30.put("", (java.lang.Object) strMap41);
        commandResponse25.putAll(strMap41);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj48 = commandResponse45.put("", (java.lang.Object) true);
        java.io.InputStream inputStream53 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream53);
        java.io.InputStream inputStream55 = commandResponse54.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse54.toMap();
        java.lang.Object obj57 = commandResponse45.put("", (java.lang.Object) strMap56);
        java.lang.Object obj60 = commandResponse45.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream64 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream64);
        java.io.InputStream inputStream66 = commandResponse65.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap67 = commandResponse65.toMap();
        commandResponse45.putAll(strMap67);
        commandResponse25.putAll(strMap67);
        java.lang.Object obj70 = commandResponse21.put("command", (java.lang.Object) strMap67);
        commandResponse4.putAll(strMap67);
        java.io.InputStream inputStream76 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse77 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream76);
        int int78 = commandResponse77.getStatusCode();
        java.io.InputStream inputStream79 = commandResponse77.getInputStream();
        commandResponse77.setStatusCode(200);
        java.io.InputStream inputStream82 = commandResponse77.getInputStream();
        java.io.InputStream inputStream83 = null;
        commandResponse77.setInputStream(inputStream83);
        java.lang.String str85 = commandResponse77.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap86 = commandResponse77.getHeaders();
        java.lang.Class<?> wildcardClass87 = commandResponse77.getClass();
        java.lang.Object obj88 = commandResponse4.put("hi!", (java.lang.Object) wildcardClass87);
        java.io.InputStream inputStream89 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(inputStream55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + true + "'", obj57, true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNull(inputStream79);
        org.junit.Assert.assertNull(inputStream82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(strMap86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(inputStream89);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream10);
        commandResponse11.addHeader("", "error");
        commandResponse11.setStatusCode(10);
        java.lang.String str17 = commandResponse11.getError();
        java.io.InputStream inputStream18 = commandResponse11.getInputStream();
        java.lang.Object obj19 = commandResponse4.put("hi!", (java.lang.Object) inputStream18);
        java.io.InputStream inputStream20 = null;
        commandResponse4.setInputStream(inputStream20);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ', inputStream26);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream31);
        int int33 = commandResponse32.getStatusCode();
        java.io.InputStream inputStream34 = commandResponse32.getInputStream();
        commandResponse32.setStatusCode(200);
        java.io.InputStream inputStream37 = commandResponse32.getInputStream();
        java.io.InputStream inputStream38 = null;
        commandResponse32.setInputStream(inputStream38);
        java.lang.String str40 = commandResponse32.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = commandResponse32.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream53 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream53);
        java.io.InputStream inputStream55 = commandResponse54.getInputStream();
        java.lang.Object obj58 = commandResponse54.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse54.toMap();
        int int60 = commandResponse54.getStatusCode();
        java.lang.String str61 = commandResponse54.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = commandResponse54.toMap();
        java.lang.String str63 = commandResponse54.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse54.toMap();
        java.io.InputStream inputStream68 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream68);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse74 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = commandResponse74.toMap();
        java.lang.Object obj76 = commandResponse69.put("error", (java.lang.Object) strMap75);
        commandResponse54.putAll(strMap75);
        commandResponse49.putAll(strMap75);
        commandResponse45.putAll(strMap75);
        commandResponse32.putAll(strMap75);
        commandResponse27.putAll(strMap75);
        java.lang.Object obj82 = commandResponse4.put("hi!", (java.lang.Object) strMap75);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(inputStream55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        java.io.InputStream inputStream18 = null;
        commandResponse4.setInputStream(inputStream18);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse12.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse12.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        java.lang.String str38 = commandResponse4.getCommand();
        java.io.InputStream inputStream39 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(inputStream39);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.Class<?> wildcardClass28 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ', inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (short) 10);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.io.InputStream inputStream16 = commandResponse1.getInputStream();
        commandResponse1.addHeader("", "error");
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse24.toMap();
        commandResponse1.putAll(strMap25);
        java.io.InputStream inputStream27 = null;
        commandResponse1.setInputStream(inputStream27);
        java.lang.String str29 = commandResponse1.getCommand();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        int int10 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        commandResponse15.addHeader("", "");
        java.lang.String str21 = commandResponse15.getError();
        commandResponse15.addHeader("hi!", "");
        java.io.InputStream inputStream25 = commandResponse15.getInputStream();
        java.io.InputStream inputStream26 = null;
        commandResponse15.setInputStream(inputStream26);
        java.lang.String str28 = commandResponse15.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse15.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse31.getHeaders();
        java.lang.String str33 = commandResponse31.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse31.toMap();
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream38);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse39.toMap();
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream44);
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream50);
        int int52 = commandResponse51.getStatusCode();
        java.lang.Object obj53 = commandResponse45.put("error", (java.lang.Object) int52);
        int int54 = commandResponse45.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse45.toMap();
        commandResponse39.putAll(strMap55);
        commandResponse31.putAll(strMap55);
        commandResponse15.putAll(strMap55);
        commandResponse4.putAll(strMap55);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(strMap55);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 10, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 97, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        int int19 = commandResponse17.getStatusCode();
        commandResponse17.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse17.getHeaders();
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.lang.Object obj31 = commandResponse27.put("", (java.lang.Object) (byte) 10);
        java.lang.String str32 = commandResponse27.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse27.toMap();
        commandResponse17.putAll(strMap33);
        commandResponse17.addHeader("command", "hi!");
        java.io.InputStream inputStream38 = commandResponse17.getInputStream();
        java.lang.Object obj39 = commandResponse4.put("command", (java.lang.Object) commandResponse17);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.lang.String str5 = commandResponse1.getError();
        java.lang.String str6 = commandResponse1.getError();
        java.io.InputStream inputStream7 = null;
        commandResponse1.setInputStream(inputStream7);
        commandResponse1.addHeader("error", "error");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 1, inputStream3);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        int int15 = commandResponse13.getStatusCode();
        commandResponse13.setStatusCode((int) (short) 100);
        commandResponse13.setStatusCode(0);
        java.io.InputStream inputStream20 = null;
        commandResponse13.setInputStream(inputStream20);
        java.lang.Object obj22 = commandResponse4.put("command", (java.lang.Object) inputStream20);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse4.toMap();
        java.lang.String str24 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (short) -1, inputStream3);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) -1, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse11.toMap();
        java.lang.Object obj17 = commandResponse11.put("", (java.lang.Object) false);
        commandResponse11.setStatusCode((int) (short) 10);
        int int20 = commandResponse11.getStatusCode();
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream24);
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream30);
        int int32 = commandResponse31.getStatusCode();
        java.lang.Object obj33 = commandResponse25.put("error", (java.lang.Object) int32);
        int int34 = commandResponse25.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse25.toMap();
        commandResponse11.putAll(strMap35);
        commandResponse11.setStatusCode((int) (short) 0);
        java.lang.Object obj39 = commandResponse3.put("hi!", (java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        commandResponse3.addHeader("error", "hi!");
        java.lang.Class<?> wildcardClass30 = commandResponse3.getClass();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        commandResponse10.addHeader("command", "error");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.lang.String str4 = commandResponse3.getError();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass11 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        int int13 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.String str32 = commandResponse4.getCommand();
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 200, inputStream37);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1);
        commandResponse43.addHeader("", "error");
        java.lang.Object obj47 = commandResponse38.put("hi!", (java.lang.Object) "error");
        java.lang.Object obj48 = commandResponse4.put("command", (java.lang.Object) commandResponse38);
        java.lang.Object obj51 = commandResponse38.put("command", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse4.getHeaders();
        java.lang.String str20 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.lang.String str6 = commandResponse4.getError();
        commandResponse4.setStatusCode(32);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse17.toMap();
        commandResponse4.putAll(strMap22);
        commandResponse4.setStatusCode((int) (byte) 100);
        java.io.InputStream inputStream26 = null;
        commandResponse4.setInputStream(inputStream26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(35);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        commandResponse32.addHeader("", "");
        java.io.InputStream inputStream41 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream41);
        java.io.InputStream inputStream43 = commandResponse42.getInputStream();
        java.lang.Object obj46 = commandResponse42.put("", (java.lang.Object) (byte) 10);
        java.lang.String str47 = commandResponse42.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse42.toMap();
        commandResponse32.putAll(strMap48);
        commandResponse27.putAll(strMap48);
        java.lang.String str51 = commandResponse27.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse27.toMap();
        commandResponse4.putAll(strMap52);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "command" + "'", str51, "command");
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass14 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        commandResponse4.addHeader("", "");
        int int48 = commandResponse4.getStatusCode();
        java.lang.String str49 = commandResponse4.getCommand();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream36);
        commandResponse37.addHeader("command", "");
        java.io.InputStream inputStream41 = null;
        commandResponse37.setInputStream(inputStream41);
        java.lang.Object obj43 = commandResponse4.put("command", (java.lang.Object) commandResponse37);
        java.io.InputStream inputStream44 = null;
        commandResponse37.setInputStream(inputStream44);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        int int38 = commandResponse10.getStatusCode();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 10);
        java.lang.String str13 = commandResponse4.getError();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.lang.String str16 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        java.lang.String str12 = commandResponse4.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse21.toMap();
        int int27 = commandResponse21.getStatusCode();
        java.lang.String str28 = commandResponse21.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse21.toMap();
        java.lang.String str30 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse21.toMap();
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream35);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse41.toMap();
        java.lang.Object obj43 = commandResponse36.put("error", (java.lang.Object) strMap42);
        commandResponse21.putAll(strMap42);
        commandResponse16.putAll(strMap42);
        commandResponse4.putAll(strMap42);
        java.lang.String str47 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.lang.String str15 = commandResponse4.getError();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream20);
        int int22 = commandResponse21.getStatusCode();
        commandResponse21.setStatusCode(1);
        java.lang.Object obj25 = commandResponse4.put("error", (java.lang.Object) commandResponse21);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.io.InputStream inputStream26 = null;
        commandResponse4.setInputStream(inputStream26);
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse1.toMap();
        java.io.InputStream inputStream43 = null;
        commandResponse1.setInputStream(inputStream43);
        java.io.InputStream inputStream45 = null;
        commandResponse1.setInputStream(inputStream45);
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
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (-1), inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        commandResponse4.setStatusCode((-1));
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse14.toMap();
        commandResponse4.putAll(strMap15);
        java.lang.String str17 = commandResponse4.getCommand();
        java.lang.String str18 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) ' ');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj19 = commandResponse16.put("", (java.lang.Object) true);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        java.lang.Object obj28 = commandResponse16.put("", (java.lang.Object) strMap27);
        java.lang.Object obj31 = commandResponse16.put("", (java.lang.Object) '#');
        commandResponse16.addHeader("error", "error");
        java.lang.String str35 = commandResponse16.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse16.toMap();
        commandResponse3.putAll(strMap36);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        java.io.InputStream inputStream17 = commandResponse4.getInputStream();
        java.lang.String str18 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.String str20 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "command");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 100, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 1);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.Object obj13 = commandResponse4.put("", (java.lang.Object) (-1));
        java.lang.String str14 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "error");
        commandResponse4.setStatusCode(97);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.Class<?> wildcardClass39 = commandResponse1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        int int6 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        commandResponse4.addHeader("command", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        commandResponse10.addHeader("hi!", "");
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        commandResponse4.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "command");
        int int25 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream7);
        java.io.InputStream inputStream9 = null;
        commandResponse8.setInputStream(inputStream9);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse14.setStatusCode(0);
        java.lang.String str17 = commandResponse14.getError();
        java.lang.String str18 = commandResponse14.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse14.toMap();
        commandResponse8.putAll(strMap19);
        commandResponse3.putAll(strMap19);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "command" + "'", str18, "command");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 100);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 0, inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse3.putAll(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse3.setStatusCode((int) '#');
        java.lang.String str6 = commandResponse3.getCommand();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream11);
        java.io.InputStream inputStream13 = null;
        commandResponse12.setInputStream(inputStream13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse12.getHeaders();
        java.lang.Object obj16 = commandResponse3.put("error", (java.lang.Object) commandResponse12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 200);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        int int11 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream12 = null;
        commandResponse9.setInputStream(inputStream12);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 0, inputStream9);
        java.io.InputStream inputStream11 = null;
        commandResponse10.setInputStream(inputStream11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse10.toMap();
        commandResponse3.putAll(strMap13);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 0, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 97, inputStream3);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 10, inputStream3);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '4', inputStream3);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 10);
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse21.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = commandResponse21.getHeaders();
        java.lang.String str28 = commandResponse21.getError();
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse34.toMap();
        java.lang.Object obj39 = commandResponse34.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = commandResponse34.getHeaders();
        java.lang.String str41 = commandResponse34.getError();
        java.lang.Object obj42 = commandResponse21.put("", (java.lang.Object) commandResponse34);
        commandResponse34.setStatusCode((int) (byte) 10);
        commandResponse34.setStatusCode(32);
        java.io.InputStream inputStream47 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse34.toMap();
        java.lang.Object obj49 = commandResponse4.put("command", (java.lang.Object) commandResponse34);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream51 = commandResponse50.getInputStream();
        java.lang.Object obj54 = commandResponse50.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj57 = commandResponse50.put("hi!", (java.lang.Object) 100.0f);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.lang.String str61 = commandResponse59.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj66 = commandResponse63.put("", (java.lang.Object) true);
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream71);
        java.io.InputStream inputStream73 = commandResponse72.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse72.toMap();
        java.lang.Object obj75 = commandResponse63.put("", (java.lang.Object) strMap74);
        commandResponse59.putAll(strMap74);
        commandResponse50.putAll(strMap74);
        commandResponse1.putAll(strMap74);
        java.io.InputStream inputStream83 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse84 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream83);
        java.util.Map<java.lang.String, java.lang.Object> strMap85 = commandResponse84.toMap();
        java.lang.Object obj86 = commandResponse1.put("command", (java.lang.Object) strMap85);
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
        org.junit.Assert.assertNull(inputStream51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(inputStream73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + true + "'", obj75, true);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + "hi!" + "'", obj86, "hi!");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (byte) 1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0);
        commandResponse3.addHeader("", "error");
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.lang.Object obj15 = commandResponse11.put("", (java.lang.Object) (byte) 10);
        java.lang.String str16 = commandResponse11.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse11.toMap();
        int int18 = commandResponse11.getStatusCode();
        commandResponse11.setStatusCode((int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse11.toMap();
        commandResponse3.putAll(strMap21);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        java.lang.Object obj27 = commandResponse15.put("", (java.lang.Object) strMap26);
        java.lang.Object obj30 = commandResponse15.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("", (java.lang.Object) (byte) 10);
        java.lang.String str40 = commandResponse35.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse35.toMap();
        commandResponse15.putAll(strMap41);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream46);
        java.io.InputStream inputStream52 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream52);
        int int54 = commandResponse53.getStatusCode();
        java.lang.Object obj55 = commandResponse47.put("error", (java.lang.Object) int54);
        int int56 = commandResponse47.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse47.toMap();
        commandResponse15.putAll(strMap57);
        java.lang.Object obj59 = commandResponse4.put("", (java.lang.Object) strMap57);
        commandResponse4.addHeader("", "command");
        java.lang.String str63 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.io.InputStream inputStream21 = commandResponse12.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str16 = commandResponse15.getCommand();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.lang.String str27 = commandResponse21.getCommand();
        java.lang.String str28 = commandResponse21.getCommand();
        int int29 = commandResponse21.getStatusCode();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = commandResponse21.put("command", obj31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse21.toMap();
        commandResponse15.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        java.lang.String str15 = commandResponse1.getCommand();
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
        commandResponse1.putAll(strMap35);
        commandResponse1.addHeader("error", "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (-1));
        org.apache.zookeeper.server.admin.CommandResponse commandResponse5 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj8 = commandResponse5.put("", (java.lang.Object) true);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse5.put("", (java.lang.Object) strMap16);
        java.lang.Object obj20 = commandResponse5.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.lang.Object obj29 = commandResponse25.put("", (java.lang.Object) (byte) 10);
        java.lang.String str30 = commandResponse25.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse25.toMap();
        commandResponse5.putAll(strMap31);
        commandResponse3.putAll(strMap31);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 35);
        commandResponse3.addHeader("error", "error");
        java.io.InputStream inputStream7 = null;
        commandResponse3.setInputStream(inputStream7);
        int int9 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 1);
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.lang.String str15 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 0);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        commandResponse9.setStatusCode(100);
        java.lang.Object obj12 = commandResponse4.put("command", (java.lang.Object) 100);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '#');
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse4.toMap();
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
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) ' ');
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.String str14 = commandResponse4.getError();
        java.lang.String str15 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj10 = commandResponse7.put("", (java.lang.Object) true);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse16.toMap();
        java.lang.Object obj19 = commandResponse7.put("", (java.lang.Object) strMap18);
        java.lang.Object obj22 = commandResponse7.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.lang.Object obj31 = commandResponse27.put("", (java.lang.Object) (byte) 10);
        java.lang.String str32 = commandResponse27.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse27.toMap();
        commandResponse7.putAll(strMap33);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream38);
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream44);
        int int46 = commandResponse45.getStatusCode();
        java.lang.Object obj47 = commandResponse39.put("error", (java.lang.Object) int46);
        int int48 = commandResponse39.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse39.toMap();
        commandResponse7.putAll(strMap49);
        java.lang.Object obj51 = commandResponse4.put("hi!", (java.lang.Object) strMap49);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        int int16 = commandResponse4.getStatusCode();
        int int17 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.io.InputStream inputStream39 = null;
        commandResponse1.setInputStream(inputStream39);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.lang.String str45 = commandResponse43.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj50 = commandResponse47.put("", (java.lang.Object) true);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream57 = commandResponse56.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse56.toMap();
        java.lang.Object obj59 = commandResponse47.put("", (java.lang.Object) strMap58);
        commandResponse43.putAll(strMap58);
        java.lang.Class<?> wildcardClass61 = commandResponse43.getClass();
        java.lang.Object obj62 = commandResponse1.put("command", (java.lang.Object) wildcardClass61);
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = commandResponse1.toMap();
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
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + true + "'", obj59, true);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "hi!" + "'", obj62, "hi!");
        org.junit.Assert.assertNotNull(strMap63);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.io.InputStream inputStream30 = null;
        commandResponse1.setInputStream(inputStream30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse1.toMap();
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
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        java.lang.String str13 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error" + "'", str13, "error");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        java.lang.String str12 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.io.InputStream inputStream20 = null;
        commandResponse4.setInputStream(inputStream20);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 32);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse4.toMap();
        java.io.InputStream inputStream17 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.lang.String str5 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse1.getHeaders();
        commandResponse1.addHeader("command", "command");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.io.InputStream inputStream20 = commandResponse4.getInputStream();
        int int21 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        commandResponse26.addHeader("", "");
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.lang.Object obj40 = commandResponse36.put("", (java.lang.Object) (byte) 10);
        java.lang.String str41 = commandResponse36.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse36.toMap();
        commandResponse26.putAll(strMap42);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        java.lang.String str47 = commandResponse45.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj52 = commandResponse49.put("", (java.lang.Object) true);
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse58.toMap();
        java.lang.Object obj61 = commandResponse49.put("", (java.lang.Object) strMap60);
        commandResponse45.putAll(strMap60);
        commandResponse26.putAll(strMap60);
        java.io.InputStream inputStream67 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream67);
        java.io.InputStream inputStream73 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse74 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream73);
        int int75 = commandResponse74.getStatusCode();
        java.lang.Object obj76 = commandResponse68.put("error", (java.lang.Object) int75);
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = commandResponse68.toMap();
        commandResponse26.putAll(strMap77);
        commandResponse4.putAll(strMap77);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 100);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) 'a', inputStream3);
        commandResponse4.setStatusCode((int) (short) -1);
        java.lang.String str7 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass36 = strMap35.getClass();
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
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream36);
        commandResponse37.addHeader("command", "");
        java.io.InputStream inputStream41 = null;
        commandResponse37.setInputStream(inputStream41);
        java.lang.Object obj43 = commandResponse4.put("command", (java.lang.Object) commandResponse37);
        commandResponse37.addHeader("command", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + true + "'", obj29, true);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.String str5 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.lang.String str15 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse1.getHeaders();
        java.lang.String str6 = commandResponse1.getCommand();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.lang.Object obj15 = commandResponse11.put("", (java.lang.Object) (byte) 10);
        java.lang.String str16 = commandResponse11.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse11.toMap();
        int int18 = commandResponse11.getStatusCode();
        java.lang.String str19 = commandResponse11.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse21.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse11.putAll(strMap23);
        commandResponse1.putAll(strMap23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 100, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.lang.Object obj19 = commandResponse15.put("", (java.lang.Object) (byte) 10);
        java.lang.String str20 = commandResponse15.getCommand();
        java.io.InputStream inputStream21 = null;
        commandResponse15.setInputStream(inputStream21);
        java.lang.Object obj23 = commandResponse9.put("error", (java.lang.Object) inputStream21);
        commandResponse9.setStatusCode(10);
        java.io.InputStream inputStream26 = null;
        commandResponse9.setInputStream(inputStream26);
        java.lang.Object obj28 = commandResponse4.put("hi!", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 32, inputStream3);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse4.getHeaders();
        java.io.InputStream inputStream16 = null;
        commandResponse4.setInputStream(inputStream16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        java.lang.String str15 = commandResponse1.getCommand();
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
        commandResponse1.putAll(strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        java.lang.String str12 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        int int38 = commandResponse36.getStatusCode();
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.lang.Object obj48 = commandResponse44.put("", (java.lang.Object) (byte) 10);
        java.lang.String str49 = commandResponse44.getCommand();
        java.lang.Object obj50 = commandResponse36.put("command", (java.lang.Object) commandResponse44);
        java.lang.String str51 = commandResponse44.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = commandResponse44.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse44.toMap();
        commandResponse4.putAll(strMap53);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        int int26 = commandResponse4.getStatusCode();
        java.lang.String str27 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse4.getHeaders();
        java.io.InputStream inputStream29 = null;
        commandResponse4.setInputStream(inputStream29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        commandResponse4.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream38);
        java.io.InputStream inputStream40 = commandResponse39.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse39.toMap();
        commandResponse39.addHeader("", "");
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream48);
        java.io.InputStream inputStream50 = commandResponse49.getInputStream();
        java.lang.Object obj53 = commandResponse49.put("", (java.lang.Object) (byte) 10);
        java.lang.String str54 = commandResponse49.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse49.toMap();
        commandResponse39.putAll(strMap55);
        commandResponse34.putAll(strMap55);
        java.lang.String str58 = commandResponse34.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse34.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse34.toMap();
        commandResponse4.putAll(strMap60);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "command");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 0, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse3.setStatusCode((int) '#');
        java.lang.String str6 = commandResponse3.getCommand();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream11);
        java.io.InputStream inputStream13 = null;
        commandResponse12.setInputStream(inputStream13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse12.getHeaders();
        java.lang.Object obj16 = commandResponse3.put("error", (java.lang.Object) commandResponse12);
        int int17 = commandResponse3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) -1, inputStream3);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 35, inputStream3);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.lang.String str25 = commandResponse4.getCommand();
        java.io.InputStream inputStream26 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "command" + "'", str25, "command");
        org.junit.Assert.assertNull(inputStream26);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        commandResponse4.addHeader("", "error");
        java.lang.Class<?> wildcardClass11 = commandResponse4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        commandResponse4.addHeader("", "hi!");
        commandResponse4.addHeader("error", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.lang.Object obj47 = commandResponse43.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream48 = commandResponse43.getInputStream();
        java.io.InputStream inputStream49 = commandResponse43.getInputStream();
        java.lang.String str50 = commandResponse43.getError();
        java.lang.Object obj51 = commandResponse4.put("error", (java.lang.Object) str50);
        java.io.InputStream inputStream52 = null;
        commandResponse4.setInputStream(inputStream52);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "hi!" + "'", obj51, "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0);
        commandResponse3.addHeader("", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.lang.String str5 = commandResponse3.getError();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) -1, inputStream3);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getError();
        java.lang.String str6 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        int int6 = commandResponse4.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 97, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse8.toMap();
        java.io.InputStream inputStream12 = null;
        commandResponse8.setInputStream(inputStream12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse8.toMap();
        commandResponse3.putAll(strMap14);
        commandResponse3.setStatusCode((int) '4');
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 10, inputStream22);
        java.lang.Object obj24 = commandResponse3.put("hi!", (java.lang.Object) "error");
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        int int9 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) 'a');
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getCommand();
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream17);
        commandResponse18.setStatusCode((int) (short) 1);
        java.lang.String str21 = commandResponse18.getError();
        java.io.InputStream inputStream22 = commandResponse18.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj28 = commandResponse25.put("", (java.lang.Object) true);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse34.toMap();
        java.lang.Object obj37 = commandResponse25.put("", (java.lang.Object) strMap36);
        java.io.InputStream inputStream38 = commandResponse25.getInputStream();
        commandResponse25.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj46 = commandResponse43.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj51 = commandResponse48.put("", (java.lang.Object) true);
        java.io.InputStream inputStream56 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream56);
        java.io.InputStream inputStream58 = commandResponse57.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse57.toMap();
        java.lang.Object obj60 = commandResponse48.put("", (java.lang.Object) strMap59);
        commandResponse43.putAll(strMap59);
        commandResponse25.putAll(strMap59);
        java.lang.Object obj63 = commandResponse18.put("command", (java.lang.Object) commandResponse25);
        java.lang.String str64 = commandResponse18.getError();
        java.io.InputStream inputStream65 = commandResponse18.getInputStream();
        java.io.InputStream inputStream69 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse70 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream69);
        java.io.InputStream inputStream71 = commandResponse70.getInputStream();
        java.lang.Object obj74 = commandResponse70.put("", (java.lang.Object) (byte) 10);
        java.lang.String str75 = commandResponse70.getCommand();
        java.lang.String str76 = commandResponse70.getCommand();
        java.lang.String str77 = commandResponse70.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse80 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int81 = commandResponse80.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap82 = commandResponse80.toMap();
        java.lang.Object obj83 = commandResponse70.put("error", (java.lang.Object) strMap82);
        commandResponse18.putAll(strMap82);
        commandResponse4.putAll(strMap82);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "error" + "'", str21, "error");
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(inputStream58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + true + "'", obj60, true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "error" + "'", str64, "error");
        org.junit.Assert.assertNull(inputStream65);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 200 + "'", int81 == 200);
        org.junit.Assert.assertNotNull(strMap82);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        int int6 = commandResponse4.getStatusCode();
        java.lang.Class<?> wildcardClass7 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) 'a', inputStream3);
        commandResponse4.addHeader("", "command");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj12 = commandResponse9.put("", (java.lang.Object) true);
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        java.lang.Object obj21 = commandResponse9.put("", (java.lang.Object) strMap20);
        java.lang.Object obj24 = commandResponse9.put("", (java.lang.Object) '#');
        commandResponse9.addHeader("error", "error");
        java.lang.String str28 = commandResponse9.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse9.toMap();
        commandResponse4.putAll(strMap29);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + true + "'", obj21, true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.Class<?> wildcardClass43 = strMap40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.lang.String str18 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(97);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 35);
        commandResponse3.addHeader("", "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 1, inputStream3);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) -1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 200, inputStream3);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.String str5 = commandResponse3.getError();
        int int6 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        int int49 = commandResponse4.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 0, inputStream3);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.lang.Object obj17 = commandResponse13.put("", (java.lang.Object) (byte) 10);
        java.lang.String str18 = commandResponse13.getCommand();
        java.lang.String str19 = commandResponse13.getCommand();
        java.lang.String str20 = commandResponse13.getCommand();
        int int21 = commandResponse13.getStatusCode();
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.Object obj30 = commandResponse26.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse26.toMap();
        commandResponse13.putAll(strMap31);
        java.lang.Class<?> wildcardClass33 = commandResponse13.getClass();
        java.lang.Object obj34 = commandResponse4.put("", (java.lang.Object) commandResponse13);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.lang.String str7 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse5 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj8 = commandResponse5.put("", (java.lang.Object) true);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse5.put("", (java.lang.Object) strMap16);
        java.io.InputStream inputStream18 = commandResponse5.getInputStream();
        commandResponse5.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj31 = commandResponse28.put("", (java.lang.Object) true);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream36);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse37.toMap();
        java.lang.Object obj40 = commandResponse28.put("", (java.lang.Object) strMap39);
        commandResponse23.putAll(strMap39);
        commandResponse5.putAll(strMap39);
        java.io.InputStream inputStream43 = null;
        commandResponse5.setInputStream(inputStream43);
        java.lang.Object obj45 = commandResponse1.put("", (java.lang.Object) inputStream43);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        commandResponse22.addHeader("", "");
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.lang.Object obj36 = commandResponse32.put("", (java.lang.Object) (byte) 10);
        java.lang.String str37 = commandResponse32.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse32.toMap();
        commandResponse22.putAll(strMap38);
        commandResponse17.putAll(strMap38);
        java.lang.String str41 = commandResponse17.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = commandResponse17.getHeaders();
        java.lang.Object obj43 = commandResponse4.put("error", (java.lang.Object) strMap42);
        java.lang.String str44 = commandResponse4.getCommand();
        java.lang.String str45 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        int int7 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 1);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 32);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse1.toMap();
        java.io.InputStream inputStream41 = null;
        commandResponse1.setInputStream(inputStream41);
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        commandResponse1.addHeader("error", "");
        java.io.InputStream inputStream8 = commandResponse1.getInputStream();
        java.io.InputStream inputStream9 = commandResponse1.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse1.getHeaders();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        int int17 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (byte) 10);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        java.io.InputStream inputStream18 = null;
        commandResponse4.setInputStream(inputStream18);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        int int24 = commandResponse22.getStatusCode();
        commandResponse22.setStatusCode((int) (short) 100);
        java.lang.Object obj29 = commandResponse22.put("command", (java.lang.Object) 10.0f);
        java.lang.String str30 = commandResponse22.getError();
        java.lang.Object obj31 = commandResponse4.put("error", (java.lang.Object) str30);
        int int32 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream33 = null;
        commandResponse4.setInputStream(inputStream33);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.lang.String str11 = commandResponse4.getCommand();
        int int12 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.lang.String str15 = commandResponse4.getError();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream19);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse25.toMap();
        java.lang.Object obj27 = commandResponse20.put("error", (java.lang.Object) strMap26);
        commandResponse20.setStatusCode(1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str34 = commandResponse33.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse33.toMap();
        commandResponse20.putAll(strMap35);
        commandResponse4.putAll(strMap35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "error" + "'", str34, "error");
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj18 = commandResponse15.put("", (java.lang.Object) true);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        java.lang.Object obj27 = commandResponse15.put("", (java.lang.Object) strMap26);
        java.lang.Object obj30 = commandResponse15.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("", (java.lang.Object) (byte) 10);
        java.lang.String str40 = commandResponse35.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse35.toMap();
        commandResponse15.putAll(strMap41);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream46);
        java.io.InputStream inputStream52 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream52);
        int int54 = commandResponse53.getStatusCode();
        java.lang.Object obj55 = commandResponse47.put("error", (java.lang.Object) int54);
        int int56 = commandResponse47.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse47.toMap();
        commandResponse15.putAll(strMap57);
        java.lang.Object obj59 = commandResponse4.put("", (java.lang.Object) strMap57);
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + true + "'", obj27, true);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (byte) 10 + "'", obj59, (byte) 10);
    }
}

