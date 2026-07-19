package org.apache.zookeeper.test.randoop.c3.commandresponse;
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 100);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) 'a', inputStream3);
        commandResponse4.setStatusCode((int) (short) -1);
        java.lang.String str7 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.String str5 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 32, inputStream3);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "command");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 0, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) -1, inputStream3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 35, inputStream3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.lang.String str7 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("command", "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0);
        commandResponse3.addHeader("", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.lang.String str5 = commandResponse3.getError();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getError();
        java.lang.String str6 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        int int6 = commandResponse4.getStatusCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 97, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) 'a');
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getCommand();
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        int int7 = commandResponse4.getStatusCode();
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.lang.Object obj18 = commandResponse14.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream19 = null;
        commandResponse14.setInputStream(inputStream19);
        java.lang.String str21 = commandResponse14.getCommand();
        commandResponse14.addHeader("", "error");
        java.io.InputStream inputStream25 = commandResponse14.getInputStream();
        java.lang.String str26 = commandResponse14.getError();
        java.lang.Object obj27 = commandResponse4.put("", (java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 35);
        commandResponse3.addHeader("", "hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 1, inputStream3);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) -1);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 200, inputStream3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 0, inputStream3);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        int int7 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse19.setStatusCode(0);
        java.lang.String str22 = commandResponse19.getError();
        java.lang.String str23 = commandResponse19.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse19.toMap();
        commandResponse1.putAll(strMap24);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "command" + "'", str23, "command");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 1);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 32);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 10);
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
        java.io.InputStream inputStream34 = null;
        commandResponse16.setInputStream(inputStream34);
        commandResponse16.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse16.getHeaders();
        java.lang.Object obj40 = commandResponse10.put("", (java.lang.Object) commandResponse16);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = commandResponse10.getHeaders();
        java.io.InputStream inputStream42 = null;
        commandResponse10.setInputStream(inputStream42);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse47.setStatusCode(0);
        java.lang.String str50 = commandResponse47.getError();
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream54);
        java.io.InputStream inputStream56 = commandResponse55.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse55.toMap();
        commandResponse55.addHeader("", "");
        java.io.InputStream inputStream64 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream64);
        java.io.InputStream inputStream66 = commandResponse65.getInputStream();
        java.lang.Object obj69 = commandResponse65.put("", (java.lang.Object) (byte) 10);
        java.lang.String str70 = commandResponse65.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse65.toMap();
        commandResponse55.putAll(strMap71);
        java.io.InputStream inputStream73 = null;
        commandResponse55.setInputStream(inputStream73);
        commandResponse55.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = commandResponse55.toMap();
        commandResponse47.putAll(strMap78);
        commandResponse10.putAll(strMap78);
        commandResponse4.putAll(strMap78);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(inputStream66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(strMap78);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        int int4 = commandResponse1.getStatusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 200, inputStream3);
        commandResponse4.setStatusCode(100);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '#', inputStream3);
        commandResponse4.setStatusCode(100);
        int int7 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        int int43 = commandResponse1.getStatusCode();
        commandResponse1.addHeader("hi!", "");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj24 = commandResponse17.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        int int31 = commandResponse30.getStatusCode();
        java.lang.Object obj32 = commandResponse17.put("command", (java.lang.Object) commandResponse30);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream36);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream42);
        int int44 = commandResponse43.getStatusCode();
        java.lang.Object obj45 = commandResponse37.put("error", (java.lang.Object) int44);
        int int46 = commandResponse37.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse37.toMap();
        java.io.InputStream inputStream52 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream52);
        int int54 = commandResponse53.getStatusCode();
        java.lang.Object obj55 = commandResponse37.put("", (java.lang.Object) int54);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse37.toMap();
        commandResponse30.putAll(strMap56);
        commandResponse4.putAll(strMap56);
        java.lang.String str59 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ');
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.setStatusCode(0);
        java.lang.String str9 = commandResponse3.getCommand();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 100, inputStream13);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        commandResponse20.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj30 = commandResponse27.put("", (java.lang.Object) true);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        java.lang.Object obj39 = commandResponse27.put("", (java.lang.Object) strMap38);
        java.io.InputStream inputStream40 = commandResponse27.getInputStream();
        commandResponse27.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj48 = commandResponse45.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse59.toMap();
        java.lang.Object obj62 = commandResponse50.put("", (java.lang.Object) strMap61);
        commandResponse45.putAll(strMap61);
        commandResponse27.putAll(strMap61);
        commandResponse20.putAll(strMap61);
        java.lang.Object obj66 = commandResponse14.put("", (java.lang.Object) strMap61);
        commandResponse3.putAll(strMap61);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + true + "'", obj39, true);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode((int) (short) 0);
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        java.lang.String str9 = commandResponse4.getError();
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse3.setStatusCode(0);
        java.lang.String str6 = commandResponse3.getError();
        java.lang.String str7 = commandResponse3.getCommand();
        java.io.InputStream inputStream8 = null;
        commandResponse3.setInputStream(inputStream8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "command" + "'", str7, "command");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode(1);
        java.lang.String str14 = commandResponse4.getCommand();
        int int15 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        commandResponse25.addHeader("", "");
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("", (java.lang.Object) (byte) 10);
        java.lang.String str40 = commandResponse35.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse35.toMap();
        commandResponse25.putAll(strMap41);
        commandResponse20.putAll(strMap41);
        java.lang.String str44 = commandResponse20.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = commandResponse20.getHeaders();
        java.lang.Object obj46 = commandResponse4.put("command", (java.lang.Object) strMap45);
        java.lang.String str47 = commandResponse4.getError();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "command" + "'", str44, "command");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        java.io.InputStream inputStream36 = null;
        commandResponse4.setInputStream(inputStream36);
        java.lang.String str38 = commandResponse4.getError();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        int int68 = commandResponse4.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100, inputStream3);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        commandResponse4.setStatusCode((-1));
        int int7 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.setStatusCode(10);
        int int7 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.Class<?> wildcardClass28 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        java.lang.String str33 = commandResponse1.getCommand();
        java.lang.String str34 = commandResponse1.getError();
        int int35 = commandResponse1.getStatusCode();
        java.io.InputStream inputStream36 = null;
        commandResponse1.setInputStream(inputStream36);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream42);
        commandResponse43.setStatusCode((int) (short) 1);
        java.lang.String str46 = commandResponse43.getError();
        commandResponse43.addHeader("", "error");
        java.io.InputStream inputStream50 = null;
        commandResponse43.setInputStream(inputStream50);
        java.io.InputStream inputStream52 = commandResponse43.getInputStream();
        java.lang.Object obj53 = commandResponse1.put("", (java.lang.Object) inputStream52);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "error" + "'", str46, "error");
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + "" + "'", obj53, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        commandResponse4.addHeader("hi!", "command");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.lang.Class<?> wildcardClass7 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.String str17 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.lang.String str33 = commandResponse1.getCommand();
        java.lang.String str34 = commandResponse1.getError();
        java.lang.String str35 = commandResponse1.getCommand();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream39);
        java.lang.String str41 = commandResponse40.getCommand();
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = commandResponse46.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse46.toMap();
        commandResponse40.putAll(strMap48);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse40.toMap();
        commandResponse1.putAll(strMap50);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "error" + "'", str41, "error");
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        commandResponse4.addHeader("", "error");
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.io.InputStream inputStream15 = null;
        commandResponse9.setInputStream(inputStream15);
        java.lang.Object obj17 = commandResponse3.put("error", (java.lang.Object) inputStream15);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream28 = null;
        commandResponse23.setInputStream(inputStream28);
        java.lang.String str30 = commandResponse23.getCommand();
        commandResponse23.addHeader("", "error");
        int int34 = commandResponse23.getStatusCode();
        java.lang.Object obj35 = commandResponse3.put("error", (java.lang.Object) int34);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        int int13 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass17 = strMap16.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 200);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse34.toMap();
        commandResponse34.addHeader("", "");
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.lang.Object obj48 = commandResponse44.put("", (java.lang.Object) (byte) 10);
        java.lang.String str49 = commandResponse44.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse44.toMap();
        commandResponse34.putAll(strMap50);
        commandResponse29.putAll(strMap50);
        commandResponse25.putAll(strMap50);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream66 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse67 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream66);
        java.io.InputStream inputStream68 = commandResponse67.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = commandResponse67.toMap();
        commandResponse67.addHeader("", "");
        java.io.InputStream inputStream76 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse77 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream76);
        java.io.InputStream inputStream78 = commandResponse77.getInputStream();
        java.lang.Object obj81 = commandResponse77.put("", (java.lang.Object) (byte) 10);
        java.lang.String str82 = commandResponse77.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap83 = commandResponse77.toMap();
        commandResponse67.putAll(strMap83);
        commandResponse62.putAll(strMap83);
        commandResponse58.putAll(strMap83);
        java.lang.Object obj87 = commandResponse25.put("", (java.lang.Object) strMap83);
        commandResponse12.putAll(strMap83);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(inputStream68);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNull(inputStream78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (byte) 10 + "'", obj87, (byte) 10);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) ' ', inputStream11);
        java.lang.Object obj13 = commandResponse1.put("hi!", (java.lang.Object) "command");
        java.lang.String str14 = commandResponse1.getCommand();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "command" + "'", str14, "command");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.addHeader("command", "error");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) '#');
        commandResponse4.setStatusCode(100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (short) -1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        java.lang.String str10 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse14.toMap();
        java.io.InputStream inputStream16 = commandResponse14.getInputStream();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        java.lang.Object obj30 = commandResponse21.put("", (java.lang.Object) (-1));
        java.lang.String str31 = commandResponse21.getError();
        java.io.InputStream inputStream32 = null;
        commandResponse21.setInputStream(inputStream32);
        commandResponse21.addHeader("", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse21.toMap();
        commandResponse14.putAll(strMap37);
        commandResponse4.putAll(strMap37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '#', inputStream3);
        commandResponse4.setStatusCode(100);
        commandResponse4.addHeader("command", "command");
        java.lang.Class<?> wildcardClass10 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 1, inputStream3);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        int int33 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.lang.Object obj26 = commandResponse11.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse31.toMap();
        commandResponse11.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        java.lang.String str36 = commandResponse4.getCommand();
        java.lang.String str37 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.addHeader("error", "command");
        java.lang.String str8 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.lang.String str10 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "error" + "'", str10, "error");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.String str43 = commandResponse4.getCommand();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream35);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse36.toMap();
        java.io.InputStream inputStream38 = null;
        commandResponse36.setInputStream(inputStream38);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse36.toMap();
        java.lang.Object obj41 = commandResponse3.put("hi!", (java.lang.Object) strMap40);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + true + "'", obj26, true);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream13);
        java.lang.Object obj15 = commandResponse4.put("", (java.lang.Object) commandResponse14);
        int int16 = commandResponse14.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse21.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj27 = commandResponse24.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        java.lang.Object obj41 = commandResponse29.put("", (java.lang.Object) strMap40);
        commandResponse24.putAll(strMap40);
        commandResponse21.putAll(strMap40);
        java.lang.Class<?> wildcardClass44 = strMap40.getClass();
        java.lang.Object obj45 = commandResponse14.put("", (java.lang.Object) strMap40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + true + "'", obj41, true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 10);
        commandResponse4.addHeader("command", "command");
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "hi!");
        java.lang.Object obj17 = commandResponse4.put("hi!", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.util.Map<java.lang.String, java.lang.String> strMap38 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass39 = strMap38.getClass();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        int int19 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.io.InputStream inputStream23 = null;
        commandResponse21.setInputStream(inputStream23);
        commandResponse21.addHeader("error", "");
        java.lang.Object obj28 = commandResponse4.put("command", (java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) ' ', inputStream11);
        java.lang.Object obj13 = commandResponse1.put("hi!", (java.lang.Object) "command");
        java.io.InputStream inputStream14 = null;
        commandResponse1.setInputStream(inputStream14);
        java.io.InputStream inputStream16 = null;
        commandResponse1.setInputStream(inputStream16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse23.toMap();
        commandResponse1.putAll(strMap24);
        java.lang.Class<?> wildcardClass26 = commandResponse1.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.io.InputStream inputStream20 = null;
        commandResponse4.setInputStream(inputStream20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 0);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse32.toMap();
        commandResponse1.putAll(strMap33);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.Object obj12 = commandResponse3.put("", (java.lang.Object) "error");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str17 = commandResponse16.getCommand();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.lang.Object obj26 = commandResponse22.put("", (java.lang.Object) (byte) 10);
        java.lang.String str27 = commandResponse22.getCommand();
        java.lang.String str28 = commandResponse22.getCommand();
        java.lang.String str29 = commandResponse22.getCommand();
        int int30 = commandResponse22.getStatusCode();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = commandResponse22.put("command", obj32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse22.toMap();
        commandResponse16.putAll(strMap34);
        commandResponse3.putAll(strMap34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10, inputStream3);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        commandResponse3.setStatusCode(10);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "command" + "'", str27, "command");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.lang.String str9 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) 'a', inputStream3);
        commandResponse4.setStatusCode((int) ' ');
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (byte) 10, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream9);
        commandResponse10.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse17.getHeaders();
        java.io.InputStream inputStream19 = null;
        commandResponse17.setInputStream(inputStream19);
        java.io.InputStream inputStream21 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse17.toMap();
        commandResponse10.putAll(strMap22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = commandResponse10.getHeaders();
        java.lang.String str25 = commandResponse10.getError();
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        int int33 = commandResponse31.getStatusCode();
        commandResponse31.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = commandResponse31.getHeaders();
        commandResponse31.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse31.getHeaders();
        java.lang.Object obj40 = commandResponse10.put("", (java.lang.Object) commandResponse31);
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse10.toMap();
        commandResponse4.putAll(strMap41);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) 1, inputStream3);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getError();
        java.lang.Class<?> wildcardClass13 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.lang.String str28 = commandResponse4.getError();
        int int29 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 1);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        commandResponse4.setStatusCode(35);
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream16);
        java.io.InputStream inputStream18 = commandResponse17.getInputStream();
        java.lang.Object obj21 = commandResponse17.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj24 = commandResponse17.put("hi!", (java.lang.Object) 100.0f);
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        int int31 = commandResponse30.getStatusCode();
        java.lang.Object obj32 = commandResponse17.put("command", (java.lang.Object) commandResponse30);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream36);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream42);
        int int44 = commandResponse43.getStatusCode();
        java.lang.Object obj45 = commandResponse37.put("error", (java.lang.Object) int44);
        int int46 = commandResponse37.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse37.toMap();
        java.io.InputStream inputStream52 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream52);
        int int54 = commandResponse53.getStatusCode();
        java.lang.Object obj55 = commandResponse37.put("", (java.lang.Object) int54);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse37.toMap();
        commandResponse30.putAll(strMap56);
        commandResponse4.putAll(strMap56);
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (short) 1, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.lang.Class<?> wildcardClass19 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.io.InputStream inputStream28 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(inputStream28);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (-1));
        commandResponse3.addHeader("error", "error");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 1, inputStream18);
        java.lang.Object obj20 = commandResponse4.put("", (java.lang.Object) "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + false + "'", obj20, false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 100);
        java.lang.String str10 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(32);
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse28.toMap();
        commandResponse4.putAll(strMap29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 100);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.setStatusCode(0);
        java.lang.Class<?> wildcardClass9 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        int int11 = commandResponse4.getStatusCode();
        java.lang.String str12 = commandResponse4.getCommand();
        commandResponse4.setStatusCode(200);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 1, inputStream3);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 35, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getCommand();
        int int6 = commandResponse3.getStatusCode();
        java.lang.String str7 = commandResponse3.getError();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse13.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse13.toMap();
        java.lang.Object obj19 = commandResponse13.put("", (java.lang.Object) false);
        commandResponse13.setStatusCode((int) (byte) 10);
        java.io.InputStream inputStream22 = null;
        commandResponse13.setInputStream(inputStream22);
        java.lang.Object obj24 = commandResponse3.put("hi!", (java.lang.Object) inputStream22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        java.io.InputStream inputStream12 = null;
        commandResponse4.setInputStream(inputStream12);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 10, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse1.addHeader("hi!", "error");
        commandResponse1.setStatusCode((int) (byte) 10);
        java.io.InputStream inputStream7 = null;
        commandResponse1.setInputStream(inputStream7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse1.getHeaders();
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) ' ', inputStream3);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
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
        java.lang.String str43 = commandResponse15.getCommand();
        int int44 = commandResponse15.getStatusCode();
        java.lang.String str45 = commandResponse15.getCommand();
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) -1, inputStream50);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream61);
        java.io.InputStream inputStream63 = commandResponse62.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse62.toMap();
        commandResponse62.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap68 = commandResponse62.getHeaders();
        java.lang.String str69 = commandResponse62.getCommand();
        java.lang.Object obj70 = commandResponse56.put("", (java.lang.Object) str69);
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse56.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse56.toMap();
        commandResponse51.putAll(strMap72);
        java.lang.Object obj74 = commandResponse15.put("error", (java.lang.Object) strMap72);
        commandResponse4.putAll(strMap72);
        commandResponse4.addHeader("", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "hi!" + "'", obj74, "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) 'a');
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        int int28 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream46);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream50 = commandResponse49.getInputStream();
        java.lang.String str51 = commandResponse49.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse53 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj56 = commandResponse53.put("", (java.lang.Object) true);
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream61);
        java.io.InputStream inputStream63 = commandResponse62.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse62.toMap();
        java.lang.Object obj65 = commandResponse53.put("", (java.lang.Object) strMap64);
        commandResponse49.putAll(strMap64);
        commandResponse47.putAll(strMap64);
        commandResponse41.putAll(strMap64);
        java.io.InputStream inputStream73 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse74 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream73);
        java.io.InputStream inputStream79 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse80 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream79);
        int int81 = commandResponse80.getStatusCode();
        java.lang.Object obj82 = commandResponse74.put("error", (java.lang.Object) int81);
        java.util.Map<java.lang.String, java.lang.Object> strMap83 = commandResponse74.toMap();
        java.lang.Object obj84 = commandResponse41.put("command", (java.lang.Object) commandResponse74);
        java.lang.Object obj85 = commandResponse4.put("error", (java.lang.Object) commandResponse41);
        java.util.Map<java.lang.String, java.lang.Object> strMap86 = commandResponse41.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "command" + "'", obj33, "command");
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + true + "'", obj65, true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + "hi!" + "'", obj84, "hi!");
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(strMap86);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) ' ', inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.Class<?> wildcardClass40 = strMap39.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        commandResponse4.setStatusCode((int) (byte) 0);
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 100);
        java.lang.String str4 = commandResponse3.getError();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.String str17 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse4.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse20.getHeaders();
        java.lang.String str22 = commandResponse20.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse20.toMap();
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse28.toMap();
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream33);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream39);
        int int41 = commandResponse40.getStatusCode();
        java.lang.Object obj42 = commandResponse34.put("error", (java.lang.Object) int41);
        int int43 = commandResponse34.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse34.toMap();
        commandResponse28.putAll(strMap44);
        commandResponse20.putAll(strMap44);
        commandResponse4.putAll(strMap44);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream57 = commandResponse56.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse56.toMap();
        commandResponse56.addHeader("", "");
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream65);
        java.io.InputStream inputStream67 = commandResponse66.getInputStream();
        java.lang.Object obj70 = commandResponse66.put("", (java.lang.Object) (byte) 10);
        java.lang.String str71 = commandResponse66.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse66.toMap();
        commandResponse56.putAll(strMap72);
        commandResponse51.putAll(strMap72);
        java.lang.String str75 = commandResponse51.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap76 = commandResponse51.getHeaders();
        java.io.InputStream inputStream80 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse81 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream80);
        java.io.InputStream inputStream82 = commandResponse81.getInputStream();
        java.lang.Object obj85 = commandResponse81.put("", (java.lang.Object) (byte) 10);
        java.lang.String str86 = commandResponse81.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap87 = commandResponse81.toMap();
        int int88 = commandResponse81.getStatusCode();
        commandResponse81.setStatusCode((int) (byte) 10);
        commandResponse81.setStatusCode((int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap93 = commandResponse81.toMap();
        commandResponse51.putAll(strMap93);
        commandResponse4.putAll(strMap93);
        java.util.Map<java.lang.String, java.lang.Object> strMap96 = commandResponse4.toMap();
        java.io.InputStream inputStream97 = null;
        commandResponse4.setInputStream(inputStream97);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNull(inputStream67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNull(inputStream82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(strMap87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertNotNull(strMap93);
        org.junit.Assert.assertNotNull(strMap96);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        commandResponse3.putAll(strMap10);
        java.io.InputStream inputStream12 = commandResponse3.getInputStream();
        int int13 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.lang.Object obj22 = commandResponse18.put("", (java.lang.Object) (byte) 10);
        java.lang.String str23 = commandResponse18.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse18.toMap();
        java.lang.Object obj27 = commandResponse18.put("", (java.lang.Object) (-1));
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int30 = commandResponse29.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        commandResponse18.putAll(strMap31);
        commandResponse18.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = commandResponse18.getHeaders();
        java.lang.String str36 = commandResponse18.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream44);
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        java.lang.Object obj49 = commandResponse45.put("", (java.lang.Object) (byte) 10);
        java.lang.String str50 = commandResponse45.getCommand();
        java.lang.String str51 = commandResponse45.getCommand();
        java.lang.String str52 = commandResponse45.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int56 = commandResponse55.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse55.toMap();
        java.lang.Object obj58 = commandResponse45.put("error", (java.lang.Object) strMap57);
        commandResponse40.putAll(strMap57);
        commandResponse18.putAll(strMap57);
        commandResponse3.putAll(strMap57);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.Class<?> wildcardClass49 = commandResponse4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) ' ');
        java.lang.String str15 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "command" + "'", str15, "command");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        java.lang.Object obj12 = commandResponse3.put("command", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        commandResponse4.addHeader("command", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) -1, inputStream3);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (short) 10);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        commandResponse20.addHeader("", "hi!");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse41.toMap();
        commandResponse41.addHeader("command", "command");
        java.io.InputStream inputStream46 = commandResponse41.getInputStream();
        java.lang.String str47 = commandResponse41.getCommand();
        commandResponse41.addHeader("error", "error");
        java.lang.Object obj51 = commandResponse20.put("", (java.lang.Object) "error");
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
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        commandResponse4.setStatusCode((-1));
        java.io.InputStream inputStream47 = commandResponse4.getInputStream();
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
        org.junit.Assert.assertNull(inputStream47);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.String str45 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse1.toMap();
        commandResponse1.addHeader("", "");
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse11.toMap();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        int int22 = commandResponse20.getStatusCode();
        commandResponse20.setStatusCode((int) (short) 100);
        java.lang.Object obj27 = commandResponse20.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj28 = commandResponse11.put("hi!", obj27);
        commandResponse11.addHeader("", "");
        commandResponse11.addHeader("command", "hi!");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.lang.Object obj48 = commandResponse44.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse44.toMap();
        int int50 = commandResponse44.getStatusCode();
        java.lang.String str51 = commandResponse44.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse44.toMap();
        java.lang.String str53 = commandResponse44.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse44.toMap();
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream58);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse64 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse64.toMap();
        java.lang.Object obj66 = commandResponse59.put("error", (java.lang.Object) strMap65);
        commandResponse44.putAll(strMap65);
        commandResponse39.putAll(strMap65);
        java.lang.Object obj69 = commandResponse11.put("error", (java.lang.Object) strMap65);
        int int70 = commandResponse11.getStatusCode();
        java.lang.Object obj71 = commandResponse4.put("", (java.lang.Object) commandResponse11);
        java.io.InputStream inputStream72 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap73 = commandResponse4.toMap();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(inputStream72);
        org.junit.Assert.assertNotNull(strMap73);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        int int7 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode(32);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse1.toMap();
        java.io.InputStream inputStream15 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        commandResponse4.setStatusCode((int) (short) 1);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.addHeader("hi!", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse1.toMap();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.io.InputStream inputStream16 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.lang.String str7 = commandResponse4.getCommand();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.lang.String str9 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 100, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) commandResponse9);
        int int12 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.io.InputStream inputStream65 = null;
        commandResponse14.setInputStream(inputStream65);
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
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream10 = null;
        commandResponse9.setInputStream(inputStream10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse15.toMap();
        commandResponse9.putAll(strMap16);
        java.io.InputStream inputStream18 = null;
        commandResponse9.setInputStream(inputStream18);
        java.io.InputStream inputStream20 = commandResponse9.getInputStream();
        java.lang.Object obj21 = commandResponse4.put("", (java.lang.Object) inputStream20);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 97, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 1);
        java.lang.Object obj21 = commandResponse4.put("hi!", (java.lang.Object) commandResponse20);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        commandResponse10.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse10.getHeaders();
        java.lang.String str17 = commandResponse10.getCommand();
        java.lang.Object obj18 = commandResponse4.put("", (java.lang.Object) str17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a');
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream7);
        java.io.InputStream inputStream9 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse8.toMap();
        java.lang.Object obj13 = commandResponse8.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse8.getHeaders();
        java.lang.String str15 = commandResponse8.getError();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        commandResponse20.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj30 = commandResponse27.put("", (java.lang.Object) true);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        java.lang.Object obj39 = commandResponse27.put("", (java.lang.Object) strMap38);
        java.io.InputStream inputStream40 = commandResponse27.getInputStream();
        commandResponse27.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj48 = commandResponse45.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse59.toMap();
        java.lang.Object obj62 = commandResponse50.put("", (java.lang.Object) strMap61);
        commandResponse45.putAll(strMap61);
        commandResponse27.putAll(strMap61);
        commandResponse20.putAll(strMap61);
        commandResponse8.putAll(strMap61);
        commandResponse3.putAll(strMap61);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + true + "'", obj39, true);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 97);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 100, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse3.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 10);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream36);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        java.lang.Object obj41 = commandResponse37.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse37.toMap();
        int int43 = commandResponse37.getStatusCode();
        java.lang.String str44 = commandResponse37.getError();
        java.lang.String str45 = commandResponse37.getError();
        commandResponse37.addHeader("error", "error");
        java.io.InputStream inputStream49 = null;
        commandResponse37.setInputStream(inputStream49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = commandResponse37.getHeaders();
        commandResponse37.setStatusCode((int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse37.toMap();
        commandResponse32.putAll(strMap54);
        commandResponse3.putAll(strMap54);
        java.lang.Class<?> wildcardClass57 = strMap54.getClass();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.lang.String str25 = commandResponse4.getCommand();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        int int26 = commandResponse4.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        int int4 = commandResponse1.getStatusCode();
        int int5 = commandResponse1.getStatusCode();
        java.lang.Class<?> wildcardClass6 = commandResponse1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '#');
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        int int36 = commandResponse34.getStatusCode();
        commandResponse34.setStatusCode((int) (short) 100);
        commandResponse34.setStatusCode(0);
        commandResponse34.setStatusCode((int) (byte) 1);
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
        commandResponse34.putAll(strMap60);
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse34.toMap();
        java.lang.String str65 = commandResponse34.getCommand();
        int int66 = commandResponse34.getStatusCode();
        java.lang.String str67 = commandResponse34.getCommand();
        java.lang.Object obj68 = commandResponse1.put("error", (java.lang.Object) commandResponse34);
        java.io.InputStream inputStream73 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse74 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream73);
        java.io.InputStream inputStream75 = commandResponse74.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = commandResponse74.toMap();
        java.lang.Object obj79 = commandResponse74.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap80 = commandResponse74.getHeaders();
        commandResponse74.addHeader("", "hi!");
        java.lang.Object obj84 = commandResponse1.put("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
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
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + true + "'", obj61, true);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "hi!" + "'", obj68, "hi!");
        org.junit.Assert.assertNull(inputStream75);
        org.junit.Assert.assertNotNull(strMap76);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (byte) 10 + "'", obj84, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj39 = commandResponse36.put("", (java.lang.Object) true);
        java.lang.Object obj42 = commandResponse36.put("", (java.lang.Object) "command");
        java.lang.String str43 = commandResponse36.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse36.toMap();
        commandResponse9.putAll(strMap44);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + true + "'", obj42, true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.Class<?> wildcardClass5 = commandResponse3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.lang.Object obj26 = commandResponse22.put("", (java.lang.Object) (byte) 10);
        java.lang.String str27 = commandResponse22.getCommand();
        java.io.InputStream inputStream28 = null;
        commandResponse22.setInputStream(inputStream28);
        java.lang.String str30 = commandResponse22.getCommand();
        java.lang.String str31 = commandResponse22.getCommand();
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream36);
        commandResponse37.setStatusCode(1);
        java.lang.Class<?> wildcardClass40 = commandResponse37.getClass();
        java.lang.Object obj41 = commandResponse22.put("hi!", (java.lang.Object) commandResponse37);
        java.lang.Object obj42 = commandResponse4.put("error", (java.lang.Object) commandResponse37);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse3.putAll(strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0, inputStream3);
        commandResponse4.setStatusCode((int) ' ');
        java.lang.String str7 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj11 = commandResponse4.put("hi!", (java.lang.Object) 100.0f);
        commandResponse4.setStatusCode(1);
        commandResponse4.setStatusCode((int) (short) 0);
        commandResponse4.setStatusCode(100);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
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
        java.lang.String str51 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.String str26 = commandResponse3.getError();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.lang.String str20 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 10, inputStream3);
        commandResponse4.addHeader("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 0, inputStream3);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10);
        commandResponse3.addHeader("command", "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str45 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse1.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = commandResponse1.getHeaders();
        java.lang.Class<?> wildcardClass48 = commandResponse1.getClass();
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
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) -1);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) 'a', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.String str45 = commandResponse4.getCommand();
        java.io.InputStream inputStream46 = commandResponse4.getInputStream();
        java.io.InputStream inputStream47 = null;
        commandResponse4.setInputStream(inputStream47);
        java.lang.String str49 = commandResponse4.getError();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = commandResponse4.put("error", obj9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 1);
        java.lang.String str13 = commandResponse4.getCommand();
        java.lang.String str14 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse4.toMap();
        java.io.InputStream inputStream16 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.String str20 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        java.lang.String str20 = commandResponse1.getCommand();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        commandResponse1.addHeader("error", "error");
        int int11 = commandResponse1.getStatusCode();
        commandResponse1.addHeader("", "error");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        commandResponse20.addHeader("", "hi!");
        java.io.InputStream inputStream37 = null;
        commandResponse20.setInputStream(inputStream37);
        commandResponse20.setStatusCode((int) (short) 100);
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
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        int int27 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200);
        java.lang.Object obj10 = commandResponse3.put("command", (java.lang.Object) commandResponse9);
        int int11 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        java.lang.String str12 = commandResponse4.getCommand();
        java.lang.String str13 = commandResponse4.getCommand();
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.String str16 = commandResponse3.getError();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "error" + "'", str16, "error");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse29.toMap();
        java.io.InputStream inputStream33 = null;
        commandResponse29.setInputStream(inputStream33);
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse29.toMap();
        commandResponse24.putAll(strMap35);
        commandResponse4.putAll(strMap35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.lang.String str26 = commandResponse12.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 35, inputStream3);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse1.addHeader("hi!", "error");
        commandResponse1.setStatusCode((int) (byte) 10);
        java.io.InputStream inputStream7 = null;
        commandResponse1.setInputStream(inputStream7);
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream12);
        java.lang.String str14 = commandResponse13.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse13.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj21 = commandResponse18.put("", (java.lang.Object) true);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        java.lang.Object obj30 = commandResponse18.put("", (java.lang.Object) strMap29);
        java.lang.Object obj33 = commandResponse18.put("", (java.lang.Object) '#');
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = commandResponse13.put("command", (java.lang.Object) wildcardClass34);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse13.toMap();
        commandResponse1.putAll(strMap36);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error" + "'", str14, "error");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + true + "'", obj30, true);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.lang.String str19 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse4.getHeaders();
        java.lang.String str22 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.String str46 = commandResponse1.getError();
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
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass15 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4', inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse7.getHeaders();
        java.lang.Object obj9 = commandResponse4.put("hi!", (java.lang.Object) commandResponse7);
        java.io.InputStream inputStream10 = commandResponse7.getInputStream();
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream10);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse13.toMap();
        commandResponse4.putAll(strMap14);
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
        commandResponse4.putAll(strMap51);
        java.lang.Object obj58 = commandResponse4.put("", (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap14);
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
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) -1, inputStream3);
        commandResponse4.addHeader("hi!", "command");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 1, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) 'a');
        int int4 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) (byte) 1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        commandResponse3.setStatusCode((int) (short) 100);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        commandResponse4.setStatusCode(35);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        int int26 = commandResponse24.getStatusCode();
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse31.toMap();
        commandResponse31.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = commandResponse31.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse31.toMap();
        commandResponse24.putAll(strMap38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = commandResponse24.getHeaders();
        java.lang.Object obj41 = commandResponse4.put("hi!", (java.lang.Object) commandResponse24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.Class<?> wildcardClass28 = commandResponse4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) -1);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        commandResponse1.addHeader("command", "error");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse23.setStatusCode(0);
        java.io.InputStream inputStream26 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse4.put("hi!", (java.lang.Object) commandResponse23);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.io.InputStream inputStream33 = commandResponse12.getInputStream();
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
        org.junit.Assert.assertNull(inputStream33);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str27 = commandResponse26.getError();
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream31);
        int int33 = commandResponse32.getStatusCode();
        java.io.InputStream inputStream34 = commandResponse32.getInputStream();
        commandResponse32.setStatusCode(200);
        java.io.InputStream inputStream37 = commandResponse32.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse41.toMap();
        commandResponse32.putAll(strMap42);
        commandResponse26.putAll(strMap42);
        commandResponse3.putAll(strMap42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "error" + "'", str27, "error");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream49);
        int int51 = commandResponse50.getStatusCode();
        java.io.InputStream inputStream52 = null;
        commandResponse50.setInputStream(inputStream52);
        java.lang.Object obj54 = commandResponse14.put("", (java.lang.Object) inputStream52);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = commandResponse14.getHeaders();
        java.lang.String str56 = commandResponse14.getCommand();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 10 + "'", obj54, (byte) 10);
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse1.toMap();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        commandResponse10.addHeader("", "hi!");
        java.lang.String str42 = commandResponse10.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse46.toMap();
        commandResponse10.putAll(strMap47);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strMap47);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 32, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse12.toMap();
        java.lang.Object obj18 = commandResponse12.put("", (java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse12.getHeaders();
        java.lang.Object obj20 = commandResponse4.put("command", (java.lang.Object) strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 100, inputStream3);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 35, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        commandResponse4.setStatusCode(200);
        commandResponse4.setStatusCode(52);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.lang.String str4 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.lang.Class<?> wildcardClass43 = commandResponse4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse15.toMap();
        java.io.InputStream inputStream19 = null;
        commandResponse15.setInputStream(inputStream19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse15.toMap();
        commandResponse4.putAll(strMap21);
        java.lang.String str23 = commandResponse4.getError();
        java.io.InputStream inputStream24 = commandResponse4.getInputStream();
        java.lang.String str25 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 100);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        commandResponse4.setStatusCode(35);
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse19.toMap();
        commandResponse19.setStatusCode(0);
        commandResponse19.setStatusCode((int) (byte) 100);
        java.lang.String str25 = commandResponse19.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj31 = commandResponse28.put("", (java.lang.Object) true);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream36);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse37.toMap();
        java.lang.Object obj40 = commandResponse28.put("", (java.lang.Object) strMap39);
        java.io.InputStream inputStream41 = commandResponse28.getInputStream();
        commandResponse28.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj49 = commandResponse46.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj54 = commandResponse51.put("", (java.lang.Object) true);
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream59);
        java.io.InputStream inputStream61 = commandResponse60.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = commandResponse60.toMap();
        java.lang.Object obj63 = commandResponse51.put("", (java.lang.Object) strMap62);
        commandResponse46.putAll(strMap62);
        commandResponse28.putAll(strMap62);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = commandResponse28.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap67 = commandResponse28.toMap();
        java.lang.Object obj68 = commandResponse19.put("command", (java.lang.Object) strMap67);
        commandResponse4.putAll(strMap67);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(inputStream61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + true + "'", obj63, true);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.io.InputStream inputStream25 = null;
        commandResponse4.setInputStream(inputStream25);
        java.io.InputStream inputStream27 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse4.toMap();
        commandResponse4.addHeader("command", "hi!");
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        commandResponse4.addHeader("error", "hi!");
        java.lang.String str9 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 0, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a');
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj28 = commandResponse25.put("", (java.lang.Object) true);
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse34.toMap();
        java.lang.Object obj37 = commandResponse25.put("", (java.lang.Object) strMap36);
        java.lang.Object obj40 = commandResponse25.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream44);
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        java.lang.Object obj49 = commandResponse45.put("", (java.lang.Object) (byte) 10);
        java.lang.String str50 = commandResponse45.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = commandResponse45.toMap();
        commandResponse25.putAll(strMap51);
        java.io.InputStream inputStream53 = commandResponse25.getInputStream();
        java.io.InputStream inputStream54 = null;
        commandResponse25.setInputStream(inputStream54);
        java.lang.Object obj56 = commandResponse1.put("hi!", (java.lang.Object) commandResponse25);
        commandResponse1.addHeader("command", "command");
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + true + "'", obj37, true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("command", "command");
        commandResponse3.setStatusCode((int) (short) 10);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        java.lang.String str16 = commandResponse4.getError();
        commandResponse4.setStatusCode(97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.String str40 = commandResponse4.getCommand();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        commandResponse3.addHeader("command", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        int int8 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse14.toMap();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        int int25 = commandResponse23.getStatusCode();
        commandResponse23.setStatusCode((int) (short) 100);
        java.lang.Object obj30 = commandResponse23.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj31 = commandResponse14.put("hi!", obj30);
        commandResponse14.addHeader("", "");
        commandResponse14.addHeader("command", "hi!");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.lang.Object obj51 = commandResponse47.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse47.toMap();
        int int53 = commandResponse47.getStatusCode();
        java.lang.String str54 = commandResponse47.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse47.toMap();
        java.lang.String str56 = commandResponse47.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse47.toMap();
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream61);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse67 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap68 = commandResponse67.toMap();
        java.lang.Object obj69 = commandResponse62.put("error", (java.lang.Object) strMap68);
        commandResponse47.putAll(strMap68);
        commandResponse42.putAll(strMap68);
        java.lang.Object obj72 = commandResponse14.put("error", (java.lang.Object) strMap68);
        java.io.InputStream inputStream73 = commandResponse14.getInputStream();
        java.lang.Object obj74 = commandResponse3.put("command", (java.lang.Object) inputStream73);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(inputStream73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (-1), inputStream3);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 32, inputStream3);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 35, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ', inputStream3);
        commandResponse4.addHeader("error", "");
        int int8 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        java.lang.String str5 = commandResponse3.getError();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 35, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse3.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.lang.String str35 = commandResponse34.getCommand();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.lang.Object obj44 = commandResponse40.put("", (java.lang.Object) (byte) 10);
        java.lang.String str45 = commandResponse40.getCommand();
        java.lang.String str46 = commandResponse40.getCommand();
        java.lang.String str47 = commandResponse40.getCommand();
        int int48 = commandResponse40.getStatusCode();
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = commandResponse40.put("command", obj50);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse40.toMap();
        commandResponse34.putAll(strMap52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = commandResponse34.getHeaders();
        java.lang.Object obj55 = commandResponse3.put("", (java.lang.Object) strMap54);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "command" + "'", str27, "command");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (byte) 10 + "'", obj55, (byte) 10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 97, inputStream3);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.lang.String str19 = commandResponse4.getCommand();
        java.io.InputStream inputStream20 = null;
        commandResponse4.setInputStream(inputStream20);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        int int11 = commandResponse4.getStatusCode();
        java.lang.String str12 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse14.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        commandResponse4.putAll(strMap16);
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        commandResponse4.addHeader("", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        commandResponse3.setStatusCode(97);
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse3.toMap();
        java.io.InputStream inputStream28 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream28);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.lang.String str5 = commandResponse1.getError();
        java.lang.String str6 = commandResponse1.getError();
        int int7 = commandResponse1.getStatusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.io.InputStream inputStream20 = null;
        commandResponse1.setInputStream(inputStream20);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0);
        commandResponse3.setStatusCode((int) (byte) 100);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) ' ', inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 200);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        java.lang.String str66 = commandResponse17.getError();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "error" + "'", str66, "error");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        commandResponse1.addHeader("error", "error");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        commandResponse1.setStatusCode((int) (byte) 1);
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
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        int int34 = commandResponse20.getStatusCode();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 10, inputStream39);
        commandResponse40.addHeader("hi!", "hi!");
        java.lang.Object obj44 = commandResponse20.put("hi!", (java.lang.Object) commandResponse40);
        int int45 = commandResponse40.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.io.InputStream inputStream35 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(35);
        java.lang.String str38 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse4.getHeaders();
        java.io.InputStream inputStream40 = null;
        commandResponse4.setInputStream(inputStream40);
        java.io.InputStream inputStream42 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + true + "'", obj31, true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(inputStream42);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        java.lang.Object obj21 = commandResponse6.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        commandResponse6.putAll(strMap28);
        java.io.InputStream inputStream30 = null;
        commandResponse6.setInputStream(inputStream30);
        java.lang.Object obj32 = commandResponse3.put("command", (java.lang.Object) commandResponse6);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse3.getHeaders();
        java.io.InputStream inputStream34 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream34);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        commandResponse11.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream18);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse19.toMap();
        java.lang.Object obj21 = commandResponse11.put("", (java.lang.Object) commandResponse19);
        java.lang.Object obj22 = commandResponse3.put("error", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.lang.String str6 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 0, inputStream3);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.io.InputStream inputStream16 = commandResponse1.getInputStream();
        commandResponse1.setStatusCode((int) (byte) 100);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        java.lang.String str58 = commandResponse3.getCommand();
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        java.io.InputStream inputStream20 = null;
        commandResponse4.setInputStream(inputStream20);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.Object obj30 = commandResponse26.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream31 = commandResponse26.getInputStream();
        java.io.InputStream inputStream32 = commandResponse26.getInputStream();
        java.lang.String str33 = commandResponse26.getError();
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        commandResponse38.addHeader("", "");
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream47);
        java.io.InputStream inputStream49 = commandResponse48.getInputStream();
        java.lang.Object obj52 = commandResponse48.put("", (java.lang.Object) (byte) 10);
        java.lang.String str53 = commandResponse48.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse48.toMap();
        commandResponse38.putAll(strMap54);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream58 = commandResponse57.getInputStream();
        java.lang.String str59 = commandResponse57.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj64 = commandResponse61.put("", (java.lang.Object) true);
        java.io.InputStream inputStream69 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse70 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream69);
        java.io.InputStream inputStream71 = commandResponse70.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse70.toMap();
        java.lang.Object obj73 = commandResponse61.put("", (java.lang.Object) strMap72);
        commandResponse57.putAll(strMap72);
        commandResponse38.putAll(strMap72);
        commandResponse26.putAll(strMap72);
        commandResponse4.putAll(strMap72);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(inputStream58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + true + "'", obj73, true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "hi!");
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        commandResponse4.setStatusCode((int) ' ');
        java.lang.String str19 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getCommand();
        commandResponse4.addHeader("error", "command");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 97, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.util.Map<java.lang.String, java.lang.String> strMap31 = commandResponse1.getHeaders();
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
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse54.toMap();
        commandResponse34.putAll(strMap56);
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream62);
        java.io.InputStream inputStream64 = commandResponse63.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse63.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse63.toMap();
        java.lang.Object obj69 = commandResponse63.put("", (java.lang.Object) false);
        commandResponse63.setStatusCode((int) (short) 10);
        int int72 = commandResponse63.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap73 = commandResponse63.getHeaders();
        java.lang.Object obj74 = commandResponse34.put("", (java.lang.Object) commandResponse63);
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = commandResponse34.toMap();
        java.lang.Object obj76 = commandResponse1.put("command", (java.lang.Object) strMap75);
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
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(inputStream64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + '#' + "'", obj74, '#');
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "hi!" + "'", obj76, "hi!");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        commandResponse3.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        commandResponse4.setStatusCode(0);
        commandResponse4.setStatusCode((int) (byte) 1);
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        int int22 = commandResponse20.getStatusCode();
        commandResponse20.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = commandResponse20.getHeaders();
        commandResponse20.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse20.getHeaders();
        int int29 = commandResponse20.getStatusCode();
        commandResponse20.setStatusCode((int) 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse20.getHeaders();
        java.lang.Object obj33 = commandResponse4.put("", (java.lang.Object) strMap32);
        java.io.InputStream inputStream34 = commandResponse4.getInputStream();
        java.io.InputStream inputStream35 = null;
        commandResponse4.setInputStream(inputStream35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream34);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.Class<?> wildcardClass16 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.lang.Object obj38 = commandResponse34.put("", (java.lang.Object) (byte) 10);
        java.lang.String str39 = commandResponse34.getCommand();
        java.lang.String str40 = commandResponse34.getCommand();
        java.lang.String str41 = commandResponse34.getCommand();
        int int42 = commandResponse34.getStatusCode();
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.lang.Object obj51 = commandResponse47.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse47.toMap();
        commandResponse34.putAll(strMap52);
        commandResponse1.putAll(strMap52);
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
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        java.io.InputStream inputStream23 = commandResponse4.getInputStream();
        java.lang.String str24 = commandResponse4.getCommand();
        java.lang.String str25 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "command" + "'", str25, "command");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        int int27 = commandResponse25.getStatusCode();
        commandResponse25.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = commandResponse25.getHeaders();
        commandResponse25.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse25.getHeaders();
        java.lang.Object obj34 = commandResponse4.put("", (java.lang.Object) commandResponse25);
        int int35 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 35);
        int int4 = commandResponse3.getStatusCode();
        java.lang.String str5 = commandResponse3.getCommand();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) (byte) 10);
        commandResponse4.addHeader("command", "command");
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse20.toMap();
        commandResponse20.setStatusCode(0);
        commandResponse20.setStatusCode((int) (byte) 100);
        java.lang.String str26 = commandResponse20.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        java.lang.Object obj41 = commandResponse29.put("", (java.lang.Object) strMap40);
        java.io.InputStream inputStream42 = commandResponse29.getInputStream();
        commandResponse29.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj50 = commandResponse47.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj55 = commandResponse52.put("", (java.lang.Object) true);
        java.io.InputStream inputStream60 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream60);
        java.io.InputStream inputStream62 = commandResponse61.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = commandResponse61.toMap();
        java.lang.Object obj64 = commandResponse52.put("", (java.lang.Object) strMap63);
        commandResponse47.putAll(strMap63);
        commandResponse29.putAll(strMap63);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = commandResponse29.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap68 = commandResponse29.toMap();
        java.lang.Object obj69 = commandResponse20.put("command", (java.lang.Object) strMap68);
        commandResponse4.putAll(strMap68);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + true + "'", obj41, true);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(inputStream62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + true + "'", obj64, true);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(1);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        commandResponse3.addHeader("command", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 97, inputStream11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse12.toMap();
        commandResponse3.putAll(strMap13);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '#', inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        java.lang.String str16 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream2 = commandResponse1.getInputStream();
        java.lang.String str3 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse1.toMap();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream17);
        int int19 = commandResponse18.getStatusCode();
        java.io.InputStream inputStream20 = commandResponse18.getInputStream();
        commandResponse18.setStatusCode(200);
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream27);
        java.lang.Object obj29 = commandResponse18.put("", (java.lang.Object) commandResponse28);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj35 = commandResponse32.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj40 = commandResponse37.put("", (java.lang.Object) true);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream45);
        java.io.InputStream inputStream47 = commandResponse46.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse46.toMap();
        java.lang.Object obj49 = commandResponse37.put("", (java.lang.Object) strMap48);
        commandResponse32.putAll(strMap48);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj55 = commandResponse52.put("", (java.lang.Object) true);
        java.io.InputStream inputStream60 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream60);
        java.io.InputStream inputStream62 = commandResponse61.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = commandResponse61.toMap();
        java.lang.Object obj64 = commandResponse52.put("", (java.lang.Object) strMap63);
        java.lang.Object obj67 = commandResponse52.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream71);
        java.io.InputStream inputStream73 = commandResponse72.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse72.toMap();
        commandResponse52.putAll(strMap74);
        commandResponse32.putAll(strMap74);
        java.lang.Object obj77 = commandResponse28.put("command", (java.lang.Object) strMap74);
        commandResponse11.putAll(strMap74);
        java.io.InputStream inputStream79 = null;
        commandResponse11.setInputStream(inputStream79);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = commandResponse11.getHeaders();
        java.lang.Object obj82 = commandResponse1.put("command", (java.lang.Object) commandResponse11);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + true + "'", obj49, true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(inputStream62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + true + "'", obj64, true);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        commandResponse1.setStatusCode((-1));
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 0, inputStream3);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.lang.String str34 = commandResponse32.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj39 = commandResponse36.put("", (java.lang.Object) true);
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream44);
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse45.toMap();
        java.lang.Object obj48 = commandResponse36.put("", (java.lang.Object) strMap47);
        commandResponse32.putAll(strMap47);
        commandResponse13.putAll(strMap47);
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream54);
        java.io.InputStream inputStream60 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream60);
        int int62 = commandResponse61.getStatusCode();
        java.lang.Object obj63 = commandResponse55.put("error", (java.lang.Object) int62);
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse55.toMap();
        commandResponse13.putAll(strMap64);
        commandResponse4.putAll(strMap64);
        java.lang.Class<?> wildcardClass67 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + true + "'", obj48, true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        int int8 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 1);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        commandResponse3.addHeader("hi!", "error");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (byte) 10 + "'", obj19, (byte) 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.io.InputStream inputStream8 = null;
        commandResponse4.setInputStream(inputStream8);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj14 = commandResponse11.put("", (java.lang.Object) true);
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse20.toMap();
        java.lang.Object obj23 = commandResponse11.put("", (java.lang.Object) strMap22);
        java.lang.Object obj26 = commandResponse11.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse31.toMap();
        commandResponse11.putAll(strMap33);
        commandResponse4.putAll(strMap33);
        java.lang.String str36 = commandResponse4.getCommand();
        commandResponse4.addHeader("error", "error");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream25);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse31.toMap();
        java.lang.Object obj33 = commandResponse26.put("error", (java.lang.Object) strMap32);
        commandResponse26.setStatusCode(1);
        java.lang.String str36 = commandResponse26.getCommand();
        java.lang.Object obj37 = commandResponse4.put("hi!", (java.lang.Object) str36);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        commandResponse10.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse10.getHeaders();
        java.lang.String str17 = commandResponse10.getCommand();
        java.lang.Object obj18 = commandResponse4.put("", (java.lang.Object) str17);
        java.io.InputStream inputStream23 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.lang.Object obj28 = commandResponse24.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse24.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj34 = commandResponse31.put("", (java.lang.Object) true);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse40.toMap();
        java.lang.Object obj43 = commandResponse31.put("", (java.lang.Object) strMap42);
        java.io.InputStream inputStream44 = commandResponse31.getInputStream();
        commandResponse31.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj52 = commandResponse49.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj57 = commandResponse54.put("", (java.lang.Object) true);
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream62);
        java.io.InputStream inputStream64 = commandResponse63.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse63.toMap();
        java.lang.Object obj66 = commandResponse54.put("", (java.lang.Object) strMap65);
        commandResponse49.putAll(strMap65);
        commandResponse31.putAll(strMap65);
        commandResponse24.putAll(strMap65);
        int int70 = commandResponse24.getStatusCode();
        java.lang.Class<?> wildcardClass71 = commandResponse24.getClass();
        java.lang.Object obj72 = commandResponse4.put("command", (java.lang.Object) commandResponse24);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(inputStream64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + true + "'", obj66, true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream13);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        java.lang.String str18 = commandResponse16.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj23 = commandResponse20.put("", (java.lang.Object) true);
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.lang.Object obj32 = commandResponse20.put("", (java.lang.Object) strMap31);
        commandResponse16.putAll(strMap31);
        commandResponse14.putAll(strMap31);
        java.io.InputStream inputStream35 = null;
        commandResponse14.setInputStream(inputStream35);
        java.io.InputStream inputStream37 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse14.toMap();
        commandResponse4.putAll(strMap38);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) 'a', inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse13.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse13.toMap();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        int int24 = commandResponse22.getStatusCode();
        commandResponse22.setStatusCode((int) (short) 100);
        java.lang.Object obj29 = commandResponse22.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj30 = commandResponse13.put("hi!", obj29);
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        int int37 = commandResponse35.getStatusCode();
        commandResponse35.setStatusCode((int) (short) 100);
        commandResponse35.setStatusCode(0);
        commandResponse35.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj48 = commandResponse45.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse59.toMap();
        java.lang.Object obj62 = commandResponse50.put("", (java.lang.Object) strMap61);
        commandResponse45.putAll(strMap61);
        commandResponse35.putAll(strMap61);
        commandResponse13.putAll(strMap61);
        java.lang.Object obj66 = commandResponse4.put("error", (java.lang.Object) strMap61);
        java.util.Map<java.lang.String, java.lang.Object> strMap67 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = commandResponse4.getHeaders();
        java.lang.String str69 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(strMap67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(35);
        commandResponse4.setStatusCode(1);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.io.InputStream inputStream52 = null;
        commandResponse4.setInputStream(inputStream52);
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
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.io.InputStream inputStream85 = null;
        commandResponse4.setInputStream(inputStream85);
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = inputStream11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        int int20 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) -1);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        commandResponse12.setStatusCode(0);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        int int21 = commandResponse19.getStatusCode();
        commandResponse19.setStatusCode((int) (short) 100);
        java.lang.Object obj26 = commandResponse19.put("command", (java.lang.Object) 10.0f);
        java.lang.String str27 = commandResponse19.getError();
        int int28 = commandResponse19.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse19.toMap();
        commandResponse12.putAll(strMap29);
        commandResponse4.putAll(strMap29);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) ' ');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        int int14 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (byte) -1);
        commandResponse4.addHeader("", "command");
        java.lang.String str20 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error" + "'", str20, "error");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        java.lang.String str20 = commandResponse4.getError();
        java.lang.String str21 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 97);
        commandResponse3.addHeader("", "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        commandResponse4.addHeader("", "command");
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = commandResponse4.put("command", obj28);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = commandResponse1.getInputStream();
        java.lang.String str5 = commandResponse1.getCommand();
        java.lang.String str6 = commandResponse1.getCommand();
        java.io.InputStream inputStream7 = commandResponse1.getInputStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode(1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str18 = commandResponse17.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse17.toMap();
        commandResponse4.putAll(strMap19);
        java.io.InputStream inputStream21 = commandResponse4.getInputStream();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "error" + "'", str18, "error");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream21);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.lang.String str2 = commandResponse1.getCommand();
        java.lang.String str3 = commandResponse1.getError();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        java.io.InputStream inputStream6 = null;
        commandResponse1.setInputStream(inputStream6);
        java.lang.String str8 = commandResponse1.getError();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) '4', inputStream3);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.io.InputStream inputStream27 = commandResponse15.getInputStream();
        int int28 = commandResponse15.getStatusCode();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        int int5 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 1, inputStream10);
        java.lang.String str12 = commandResponse11.getError();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse18.toMap();
        commandResponse18.addHeader("", "");
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
        commandResponse18.putAll(strMap59);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse67 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap68 = commandResponse67.getHeaders();
        java.io.InputStream inputStream69 = null;
        commandResponse67.setInputStream(inputStream69);
        java.io.InputStream inputStream71 = commandResponse67.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse67.toMap();
        commandResponse18.putAll(strMap72);
        java.lang.Object obj74 = commandResponse11.put("", (java.lang.Object) strMap72);
        commandResponse3.putAll(strMap72);
        commandResponse3.setStatusCode((int) (byte) 10);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error" + "'", str12, "error");
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
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
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.lang.String str4 = commandResponse3.getCommand();
        int int5 = commandResponse3.getStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 32, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse12.toMap();
        java.lang.Object obj18 = commandResponse12.put("", (java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse12.getHeaders();
        java.lang.Object obj20 = commandResponse4.put("command", (java.lang.Object) strMap19);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse26.toMap();
        java.lang.Object obj32 = commandResponse26.put("", (java.lang.Object) false);
        commandResponse26.setStatusCode((int) (byte) 10);
        java.lang.Object obj35 = commandResponse4.put("hi!", (java.lang.Object) commandResponse26);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) 'a', inputStream3);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "command");
        java.lang.Class<?> wildcardClass9 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap13 = commandResponse12.getHeaders();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) ' ', inputStream17);
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse23.toMap();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj29 = commandResponse26.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj34 = commandResponse31.put("", (java.lang.Object) true);
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse40.toMap();
        java.lang.Object obj43 = commandResponse31.put("", (java.lang.Object) strMap42);
        commandResponse26.putAll(strMap42);
        commandResponse23.putAll(strMap42);
        commandResponse18.putAll(strMap42);
        commandResponse12.putAll(strMap42);
        commandResponse4.putAll(strMap42);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + true + "'", obj43, true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream21);
        java.io.InputStream inputStream23 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse22.toMap();
        commandResponse22.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse22.getHeaders();
        java.lang.String str29 = commandResponse22.getError();
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse35.toMap();
        java.lang.Object obj40 = commandResponse35.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = commandResponse35.getHeaders();
        java.lang.String str42 = commandResponse35.getError();
        java.lang.Object obj43 = commandResponse22.put("", (java.lang.Object) commandResponse35);
        commandResponse35.addHeader("hi!", "");
        commandResponse35.addHeader("command", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = commandResponse35.getHeaders();
        java.lang.Object obj51 = commandResponse4.put("", (java.lang.Object) commandResponse35);
        int int52 = commandResponse4.getStatusCode();
        int int53 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 200 + "'", int52 == 200);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 200 + "'", int53 == 200);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 0);
        java.lang.Object obj27 = commandResponse4.put("command", (java.lang.Object) commandResponse26);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        java.io.InputStream inputStream15 = null;
        commandResponse1.setInputStream(inputStream15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.String str36 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + true + "'", obj31, true);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        java.lang.String str15 = commandResponse1.getCommand();
        java.io.InputStream inputStream16 = null;
        commandResponse1.setInputStream(inputStream16);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        java.io.InputStream inputStream16 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream16);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse22.toMap();
        java.lang.Object obj24 = commandResponse17.put("error", (java.lang.Object) strMap23);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str30 = commandResponse29.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        java.lang.Object obj32 = commandResponse17.put("hi!", (java.lang.Object) strMap31);
        commandResponse4.putAll(strMap31);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        java.lang.Object obj13 = commandResponse1.put("", (java.lang.Object) strMap12);
        java.io.InputStream inputStream14 = commandResponse1.getInputStream();
        java.lang.String str15 = commandResponse1.getCommand();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        int int25 = commandResponse23.getStatusCode();
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.lang.Object obj35 = commandResponse31.put("", (java.lang.Object) (byte) 10);
        java.lang.String str36 = commandResponse31.getCommand();
        java.lang.Object obj37 = commandResponse23.put("command", (java.lang.Object) commandResponse31);
        java.io.InputStream inputStream38 = null;
        commandResponse31.setInputStream(inputStream38);
        java.lang.String str40 = commandResponse31.getCommand();
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream44);
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        java.lang.Object obj49 = commandResponse45.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse45.toMap();
        int int51 = commandResponse45.getStatusCode();
        java.lang.String str52 = commandResponse45.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse45.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse45.toMap();
        commandResponse31.putAll(strMap54);
        commandResponse1.putAll(strMap54);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        commandResponse1.setStatusCode(32);
        int int35 = commandResponse1.getStatusCode();
        commandResponse1.setStatusCode((int) (byte) 0);
        commandResponse1.addHeader("command", "hi!");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream38);
        java.io.InputStream inputStream40 = commandResponse39.getInputStream();
        int int41 = commandResponse39.getStatusCode();
        commandResponse39.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = commandResponse39.getHeaders();
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream48);
        java.io.InputStream inputStream50 = commandResponse49.getInputStream();
        java.lang.Object obj53 = commandResponse49.put("", (java.lang.Object) (byte) 10);
        java.lang.String str54 = commandResponse49.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse49.toMap();
        commandResponse39.putAll(strMap55);
        commandResponse39.addHeader("command", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = commandResponse39.toMap();
        commandResponse20.putAll(strMap60);
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
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        commandResponse3.setStatusCode(100);
        java.lang.String str6 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse1.toMap();
        java.lang.String str7 = commandResponse1.getCommand();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "command" + "'", str7, "command");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        commandResponse4.setStatusCode(1);
        int int14 = commandResponse4.getStatusCode();
        java.lang.String str15 = commandResponse4.getError();
        java.io.InputStream inputStream16 = commandResponse4.getInputStream();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(inputStream16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (short) 10);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse4.toMap();
        java.lang.String str58 = commandResponse4.getError();
        java.lang.String str59 = commandResponse4.getError();
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
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        int int7 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse3.getHeaders();
        java.lang.String str9 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "command" + "'", str9, "command");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (byte) 0, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) '#', inputStream9);
        commandResponse10.setStatusCode(100);
        commandResponse10.addHeader("command", "command");
        java.lang.String str16 = commandResponse10.getCommand();
        java.lang.String str17 = commandResponse10.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse10.toMap();
        java.lang.Object obj19 = commandResponse4.put("hi!", (java.lang.Object) strMap18);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap24 = commandResponse23.getHeaders();
        java.io.InputStream inputStream25 = null;
        commandResponse23.setInputStream(inputStream25);
        commandResponse23.addHeader("", "command");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse33.toMap();
        java.io.InputStream inputStream35 = null;
        commandResponse33.setInputStream(inputStream35);
        commandResponse33.setStatusCode(1);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.lang.Object obj47 = commandResponse43.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse43.toMap();
        commandResponse33.putAll(strMap48);
        commandResponse23.putAll(strMap48);
        commandResponse4.putAll(strMap48);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.io.InputStream inputStream19 = null;
        commandResponse12.setInputStream(inputStream19);
        java.lang.String str21 = commandResponse12.getCommand();
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.Object obj30 = commandResponse26.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse26.toMap();
        int int32 = commandResponse26.getStatusCode();
        java.lang.String str33 = commandResponse26.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse26.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse26.toMap();
        commandResponse12.putAll(strMap35);
        int int37 = commandResponse12.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 35, inputStream3);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        int int25 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#');
        int int32 = commandResponse31.getStatusCode();
        java.lang.Object obj33 = commandResponse4.put("error", (java.lang.Object) commandResponse31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 100);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 100, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        java.lang.Object obj21 = commandResponse6.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        commandResponse6.putAll(strMap28);
        java.io.InputStream inputStream30 = null;
        commandResponse6.setInputStream(inputStream30);
        java.lang.Object obj32 = commandResponse3.put("command", (java.lang.Object) commandResponse6);
        java.io.InputStream inputStream33 = null;
        commandResponse3.setInputStream(inputStream33);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream38);
        int int40 = commandResponse39.getStatusCode();
        java.io.InputStream inputStream41 = commandResponse39.getInputStream();
        commandResponse39.setStatusCode(200);
        java.io.InputStream inputStream44 = commandResponse39.getInputStream();
        java.io.InputStream inputStream45 = null;
        commandResponse39.setInputStream(inputStream45);
        java.lang.String str47 = commandResponse39.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = commandResponse39.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse39.toMap();
        commandResponse4.putAll(strMap49);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 10);
        int int4 = commandResponse3.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream12);
        java.io.InputStream inputStream14 = commandResponse13.getInputStream();
        java.lang.Object obj17 = commandResponse13.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse13.toMap();
        int int19 = commandResponse13.getStatusCode();
        java.lang.String str20 = commandResponse13.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse13.toMap();
        java.lang.String str22 = commandResponse13.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse13.toMap();
        java.io.InputStream inputStream27 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse28 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream27);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse33.toMap();
        java.lang.Object obj35 = commandResponse28.put("error", (java.lang.Object) strMap34);
        commandResponse13.putAll(strMap34);
        commandResponse8.putAll(strMap34);
        commandResponse3.putAll(strMap34);
        java.io.InputStream inputStream39 = commandResponse3.getInputStream();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(inputStream39);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        int int11 = commandResponse4.getStatusCode();
        int int12 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream13 = null;
        commandResponse4.setInputStream(inputStream13);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) ' ', inputStream3);
        commandResponse4.setStatusCode((-1));
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream6 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream6);
        java.io.InputStream inputStream8 = commandResponse7.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse7.toMap();
        java.lang.Object obj13 = commandResponse7.put("", (java.lang.Object) false);
        java.lang.Object obj14 = commandResponse1.put("error", (java.lang.Object) "");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse1.toMap();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        commandResponse3.setStatusCode((int) 'a');
        java.io.InputStream inputStream59 = null;
        commandResponse3.setInputStream(inputStream59);
        commandResponse3.setStatusCode(0);
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
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        commandResponse4.setInputStream(inputStream11);
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse4.putAll(strMap19);
        commandResponse4.setStatusCode((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        int int24 = commandResponse3.getStatusCode();
        java.lang.String str25 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "error" + "'", str25, "error");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 0, inputStream3);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        commandResponse4.setStatusCode((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.util.Map<java.lang.String, java.lang.String> strMap32 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getCommand();
        int int6 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream10);
        java.io.InputStream inputStream12 = commandResponse11.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse11.toMap();
        commandResponse11.addHeader("", "");
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse21.toMap();
        commandResponse11.putAll(strMap27);
        commandResponse4.putAll(strMap27);
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = commandResponse4.put("", obj33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.lang.String str2 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = commandResponse1.getHeaders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse24 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream23);
        java.io.InputStream inputStream25 = commandResponse24.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse24.toMap();
        commandResponse24.addHeader("", "");
        java.io.InputStream inputStream33 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream33);
        java.io.InputStream inputStream35 = commandResponse34.getInputStream();
        java.lang.Object obj38 = commandResponse34.put("", (java.lang.Object) (byte) 10);
        java.lang.String str39 = commandResponse34.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse34.toMap();
        commandResponse24.putAll(strMap40);
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
        commandResponse24.putAll(strMap58);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream65);
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream71);
        int int73 = commandResponse72.getStatusCode();
        java.lang.Object obj74 = commandResponse66.put("error", (java.lang.Object) int73);
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = commandResponse66.toMap();
        commandResponse24.putAll(strMap75);
        commandResponse17.putAll(strMap75);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(inputStream35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + true + "'", obj59, true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(strMap75);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse21.toMap();
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        int int32 = commandResponse30.getStatusCode();
        commandResponse30.setStatusCode((int) (short) 100);
        java.lang.Object obj37 = commandResponse30.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj38 = commandResponse21.put("hi!", obj37);
        java.io.InputStream inputStream39 = commandResponse21.getInputStream();
        java.lang.String str40 = commandResponse21.getCommand();
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream44);
        int int46 = commandResponse45.getStatusCode();
        java.io.InputStream inputStream47 = commandResponse45.getInputStream();
        commandResponse45.setStatusCode(200);
        java.io.InputStream inputStream50 = commandResponse45.getInputStream();
        java.io.InputStream inputStream51 = null;
        commandResponse45.setInputStream(inputStream51);
        java.lang.String str53 = commandResponse45.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse45.toMap();
        commandResponse21.putAll(strMap54);
        java.lang.Object obj56 = commandResponse4.put("command", (java.lang.Object) commandResponse21);
        java.lang.Class<?> wildcardClass57 = commandResponse21.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
        int int24 = commandResponse4.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 1);
        java.io.InputStream inputStream30 = null;
        commandResponse29.setInputStream(inputStream30);
        java.lang.Object obj32 = commandResponse4.put("", (java.lang.Object) commandResponse29);
        java.lang.String str33 = commandResponse29.getError();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.io.InputStream inputStream35 = null;
        commandResponse3.setInputStream(inputStream35);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse40.setStatusCode(0);
        java.lang.String str43 = commandResponse40.getError();
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream47);
        java.io.InputStream inputStream49 = commandResponse48.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse48.toMap();
        commandResponse48.addHeader("", "");
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.lang.Object obj62 = commandResponse58.put("", (java.lang.Object) (byte) 10);
        java.lang.String str63 = commandResponse58.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse58.toMap();
        commandResponse48.putAll(strMap64);
        java.io.InputStream inputStream66 = null;
        commandResponse48.setInputStream(inputStream66);
        commandResponse48.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse48.toMap();
        commandResponse40.putAll(strMap71);
        commandResponse3.putAll(strMap71);
        java.io.InputStream inputStream74 = null;
        commandResponse3.setInputStream(inputStream74);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        commandResponse9.setStatusCode((int) '#');
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) 10);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int2 = commandResponse1.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        commandResponse1.addHeader("command", "");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) ' ', inputStream11);
        java.lang.Object obj13 = commandResponse1.put("hi!", (java.lang.Object) "command");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse1.getHeaders();
        java.io.InputStream inputStream15 = commandResponse1.getInputStream();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) -1);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        java.io.InputStream inputStream25 = null;
        commandResponse4.setInputStream(inputStream25);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        commandResponse17.setStatusCode((int) (byte) 10);
        commandResponse17.setStatusCode(32);
        java.io.InputStream inputStream30 = commandResponse17.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse17.toMap();
        java.lang.Class<?> wildcardClass32 = commandResponse17.getClass();
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
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        commandResponse4.addHeader("hi!", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getCommand();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.lang.String str10 = commandResponse4.getCommand();
        int int11 = commandResponse4.getStatusCode();
        commandResponse4.addHeader("", "hi!");
        java.lang.Object obj17 = commandResponse4.put("hi!", (java.lang.Object) false);
        commandResponse4.setStatusCode((int) '#');
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getCommand();
        int int6 = commandResponse3.getStatusCode();
        java.lang.String str7 = commandResponse3.getError();
        commandResponse3.setStatusCode((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.lang.String str41 = commandResponse10.getError();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse12.toMap();
        java.lang.Object obj18 = commandResponse12.put("", (java.lang.Object) false);
        java.lang.String str19 = commandResponse12.getError();
        commandResponse12.addHeader("", "");
        java.lang.Object obj23 = commandResponse4.put("command", (java.lang.Object) "");
        java.io.InputStream inputStream24 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream24);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.lang.String str9 = commandResponse4.getCommand();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 10, inputStream3);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream21);
        int int23 = commandResponse22.getStatusCode();
        java.io.InputStream inputStream24 = commandResponse22.getInputStream();
        commandResponse22.setStatusCode(200);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream31);
        java.lang.Object obj33 = commandResponse22.put("", (java.lang.Object) commandResponse32);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse22.toMap();
        commandResponse4.putAll(strMap34);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream45);
        java.lang.Object obj47 = commandResponse40.put("", (java.lang.Object) commandResponse46);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = commandResponse40.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse40.toMap();
        java.lang.Object obj50 = commandResponse4.put("", (java.lang.Object) strMap49);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        java.io.InputStream inputStream34 = null;
        commandResponse3.setInputStream(inputStream34);
        java.io.InputStream inputStream36 = commandResponse3.getInputStream();
        java.io.InputStream inputStream37 = null;
        commandResponse3.setInputStream(inputStream37);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream36);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream9);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.lang.String str14 = commandResponse12.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj19 = commandResponse16.put("", (java.lang.Object) true);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream24);
        java.io.InputStream inputStream26 = commandResponse25.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse25.toMap();
        java.lang.Object obj28 = commandResponse16.put("", (java.lang.Object) strMap27);
        commandResponse12.putAll(strMap27);
        commandResponse10.putAll(strMap27);
        commandResponse4.putAll(strMap27);
        java.io.InputStream inputStream32 = null;
        commandResponse4.setInputStream(inputStream32);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + true + "'", obj28, true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        java.io.InputStream inputStream69 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse70 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream69);
        java.io.InputStream inputStream71 = commandResponse70.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse70.toMap();
        commandResponse14.putAll(strMap72);
        java.lang.String str74 = commandResponse14.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = commandResponse14.toMap();
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
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(strMap75);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode(200);
        java.lang.String str16 = commandResponse4.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse4.getHeaders();
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream22);
        commandResponse23.addHeader("", "error");
        commandResponse23.setStatusCode(10);
        java.lang.String str29 = commandResponse23.getError();
        java.lang.Object obj30 = commandResponse4.put("error", (java.lang.Object) str29);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0, inputStream3);
        commandResponse4.addHeader("error", "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream3);
        commandResponse4.setStatusCode((int) '4');
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        commandResponse4.addHeader("hi!", "hi!");
        java.io.InputStream inputStream18 = null;
        commandResponse4.setInputStream(inputStream18);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        int int36 = commandResponse35.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse35.toMap();
        commandResponse35.addHeader("command", "");
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) ' ', inputStream45);
        java.lang.Object obj47 = commandResponse35.put("hi!", (java.lang.Object) "command");
        java.io.InputStream inputStream48 = null;
        commandResponse35.setInputStream(inputStream48);
        java.lang.Object obj50 = commandResponse3.put("", (java.lang.Object) commandResponse35);
        commandResponse35.addHeader("hi!", "");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 52, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse9.toMap();
        java.lang.Object obj15 = commandResponse9.put("", (java.lang.Object) false);
        int int16 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream21 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream21);
        commandResponse22.setStatusCode((int) (short) 1);
        java.lang.String str25 = commandResponse22.getError();
        java.io.InputStream inputStream26 = commandResponse22.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj32 = commandResponse29.put("", (java.lang.Object) true);
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        java.lang.Object obj41 = commandResponse29.put("", (java.lang.Object) strMap40);
        java.io.InputStream inputStream42 = commandResponse29.getInputStream();
        commandResponse29.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj50 = commandResponse47.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj55 = commandResponse52.put("", (java.lang.Object) true);
        java.io.InputStream inputStream60 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream60);
        java.io.InputStream inputStream62 = commandResponse61.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = commandResponse61.toMap();
        java.lang.Object obj64 = commandResponse52.put("", (java.lang.Object) strMap63);
        commandResponse47.putAll(strMap63);
        commandResponse29.putAll(strMap63);
        java.lang.Object obj67 = commandResponse22.put("command", (java.lang.Object) commandResponse29);
        java.lang.String str68 = commandResponse22.getError();
        java.lang.Class<?> wildcardClass69 = commandResponse22.getClass();
        java.lang.Object obj70 = commandResponse9.put("hi!", (java.lang.Object) commandResponse22);
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse22.toMap();
        commandResponse4.putAll(strMap71);
        java.io.InputStream inputStream77 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse78 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", 1, inputStream77);
        java.lang.String str79 = commandResponse78.getError();
        java.lang.Object obj80 = commandResponse4.put("", (java.lang.Object) commandResponse78);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "error" + "'", str25, "error");
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + true + "'", obj41, true);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(inputStream62);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + true + "'", obj64, true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "error" + "'", str68, "error");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "command" + "'", str79, "command");
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
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
        java.lang.String str43 = commandResponse15.getCommand();
        int int44 = commandResponse15.getStatusCode();
        java.lang.String str45 = commandResponse15.getCommand();
        java.io.InputStream inputStream50 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) -1, inputStream50);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream61);
        java.io.InputStream inputStream63 = commandResponse62.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse62.toMap();
        commandResponse62.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap68 = commandResponse62.getHeaders();
        java.lang.String str69 = commandResponse62.getCommand();
        java.lang.Object obj70 = commandResponse56.put("", (java.lang.Object) str69);
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse56.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse56.toMap();
        commandResponse51.putAll(strMap72);
        java.lang.Object obj74 = commandResponse15.put("error", (java.lang.Object) strMap72);
        commandResponse4.putAll(strMap72);
        java.io.InputStream inputStream76 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "hi!" + "'", obj74, "hi!");
        org.junit.Assert.assertNull(inputStream76);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream6 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream6);
        java.io.InputStream inputStream8 = commandResponse7.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse7.toMap();
        java.lang.Object obj13 = commandResponse7.put("", (java.lang.Object) false);
        java.lang.Object obj14 = commandResponse1.put("error", (java.lang.Object) "");
        java.lang.String str15 = commandResponse1.getError();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream13);
        java.io.InputStream inputStream15 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse14.toMap();
        java.lang.Object obj17 = commandResponse4.put("error", (java.lang.Object) strMap16);
        java.lang.String str18 = commandResponse4.getError();
        int int19 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        commandResponse3.addHeader("command", "error");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse3.getHeaders();
        java.lang.String str8 = commandResponse3.getCommand();
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        java.io.InputStream inputStream18 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(inputStream18);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.lang.String str8 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse1.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse1.getHeaders();
        java.io.InputStream inputStream11 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 10, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) 'a');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse6 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj9 = commandResponse6.put("", (java.lang.Object) true);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.lang.Object obj18 = commandResponse6.put("", (java.lang.Object) strMap17);
        java.lang.Object obj21 = commandResponse6.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        commandResponse6.putAll(strMap28);
        java.io.InputStream inputStream30 = null;
        commandResponse6.setInputStream(inputStream30);
        java.lang.Object obj32 = commandResponse3.put("command", (java.lang.Object) commandResponse6);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse3.getHeaders();
        commandResponse3.addHeader("hi!", "hi!");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + true + "'", obj18, true);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(strMap33);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.util.Map<java.lang.String, java.lang.String> strMap41 = commandResponse1.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap41);
    }
}

