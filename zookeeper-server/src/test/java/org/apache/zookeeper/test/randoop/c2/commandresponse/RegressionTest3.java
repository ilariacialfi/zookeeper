package org.apache.zookeeper.test.randoop.c2.commandresponse;
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) 'a');
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        commandResponse1.setStatusCode((int) (short) 100);
        java.lang.String str46 = commandResponse1.getError();
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
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse4.toMap();
        java.lang.String str21 = commandResponse4.getError();
        java.lang.String str22 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = commandResponse19.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.setStatusCode(1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) 0, inputStream3);
        commandResponse4.setStatusCode(35);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.util.Map<java.lang.String, java.lang.String> strMap27 = commandResponse3.getHeaders();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        commandResponse3.setStatusCode(100);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 52, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.lang.Object obj9 = commandResponse4.put("", (java.lang.Object) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.addHeader("command", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream32);
        int int34 = commandResponse33.getStatusCode();
        java.io.InputStream inputStream35 = null;
        commandResponse33.setInputStream(inputStream35);
        java.io.InputStream inputStream37 = commandResponse33.getInputStream();
        commandResponse33.setStatusCode(52);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream48);
        java.io.InputStream inputStream50 = commandResponse49.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap51 = commandResponse49.toMap();
        commandResponse49.addHeader("", "");
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.lang.Object obj63 = commandResponse59.put("", (java.lang.Object) (byte) 10);
        java.lang.String str64 = commandResponse59.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse59.toMap();
        commandResponse49.putAll(strMap65);
        commandResponse44.putAll(strMap65);
        java.lang.Object obj68 = commandResponse33.put("hi!", (java.lang.Object) strMap65);
        commandResponse3.putAll(strMap65);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNull(inputStream50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("", "error");
        commandResponse4.setStatusCode(10);
        int int10 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse15.toMap();
        java.lang.Object obj21 = commandResponse15.put("", (java.lang.Object) false);
        commandResponse15.setStatusCode((int) (short) 10);
        int int24 = commandResponse15.getStatusCode();
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream28);
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream34);
        int int36 = commandResponse35.getStatusCode();
        java.lang.Object obj37 = commandResponse29.put("error", (java.lang.Object) int36);
        int int38 = commandResponse29.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse29.toMap();
        commandResponse15.putAll(strMap39);
        commandResponse15.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse15.toMap();
        commandResponse4.putAll(strMap43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '#', inputStream3);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (short) 10, inputStream3);
        java.lang.Class<?> wildcardClass5 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        int int6 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse1.getHeaders();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.Class<?> wildcardClass40 = commandResponse3.getClass();
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str33 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse3.toMap();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream39);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream45);
        java.io.InputStream inputStream47 = commandResponse46.getInputStream();
        int int48 = commandResponse46.getStatusCode();
        commandResponse46.setStatusCode((int) (short) 100);
        java.lang.Object obj53 = commandResponse46.put("command", (java.lang.Object) 10.0f);
        java.lang.String str54 = commandResponse46.getError();
        java.lang.Object obj55 = commandResponse40.put("command", (java.lang.Object) commandResponse46);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = commandResponse46.getHeaders();
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream61);
        java.io.InputStream inputStream63 = commandResponse62.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse62.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse62.toMap();
        java.io.InputStream inputStream70 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse71 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream70);
        java.io.InputStream inputStream72 = commandResponse71.getInputStream();
        int int73 = commandResponse71.getStatusCode();
        commandResponse71.setStatusCode((int) (short) 100);
        java.lang.Object obj78 = commandResponse71.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj79 = commandResponse62.put("error", (java.lang.Object) 10.0f);
        java.lang.String str80 = commandResponse62.getError();
        java.lang.Object obj81 = commandResponse46.put("error", (java.lang.Object) str80);
        java.lang.String str82 = commandResponse46.getError();
        java.lang.Object obj83 = commandResponse3.put("error", (java.lang.Object) commandResponse46);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "error" + "'", str33, "error");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(inputStream72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + "command" + "'", obj83, "command");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0, inputStream3);
        commandResponse4.addHeader("error", "");
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
        commandResponse13.addHeader("", "");
        commandResponse13.addHeader("command", "hi!");
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream40);
        java.io.InputStream inputStream42 = commandResponse41.getInputStream();
        java.lang.Object obj45 = commandResponse41.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream46 = null;
        commandResponse41.setInputStream(inputStream46);
        java.lang.String str48 = commandResponse41.getCommand();
        commandResponse41.addHeader("", "error");
        java.io.InputStream inputStream52 = commandResponse41.getInputStream();
        commandResponse41.setStatusCode((int) (short) 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream62);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream66 = commandResponse65.getInputStream();
        java.lang.String str67 = commandResponse65.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj72 = commandResponse69.put("", (java.lang.Object) true);
        java.io.InputStream inputStream77 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse78 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream77);
        java.io.InputStream inputStream79 = commandResponse78.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap80 = commandResponse78.toMap();
        java.lang.Object obj81 = commandResponse69.put("", (java.lang.Object) strMap80);
        commandResponse65.putAll(strMap80);
        commandResponse63.putAll(strMap80);
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse63.toMap();
        commandResponse58.putAll(strMap84);
        commandResponse41.putAll(strMap84);
        commandResponse13.putAll(strMap84);
        java.lang.Object obj88 = commandResponse4.put("error", (java.lang.Object) commandResponse13);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(inputStream42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(inputStream52);
        org.junit.Assert.assertNull(inputStream66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(inputStream79);
        org.junit.Assert.assertNotNull(strMap80);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + true + "'", obj81, true);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.util.Map<java.lang.String, java.lang.String> strMap25 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        commandResponse3.setStatusCode((int) '#');
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        commandResponse3.setStatusCode(35);
        java.lang.Class<?> wildcardClass9 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 10);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 52, inputStream3);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.util.Map<java.lang.String, java.lang.String> strMap37 = commandResponse3.getHeaders();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        commandResponse4.setInputStream(inputStream14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) 'a');
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.io.InputStream inputStream28 = null;
        commandResponse4.setInputStream(inputStream28);
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 10);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        commandResponse9.addHeader("", "");
        java.lang.String str15 = commandResponse9.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = commandResponse9.toMap();
        java.lang.Object obj17 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        commandResponse4.setStatusCode((int) (byte) 100);
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        commandResponse4.addHeader("command", "command");
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream15);
        java.io.InputStream inputStream17 = commandResponse16.getInputStream();
        int int18 = commandResponse16.getStatusCode();
        commandResponse16.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = commandResponse16.getHeaders();
        commandResponse16.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = commandResponse16.getHeaders();
        int int25 = commandResponse16.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str30 = commandResponse29.getError();
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream34);
        int int36 = commandResponse35.getStatusCode();
        java.io.InputStream inputStream37 = commandResponse35.getInputStream();
        commandResponse35.setStatusCode(200);
        java.io.InputStream inputStream40 = commandResponse35.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse44.toMap();
        commandResponse35.putAll(strMap45);
        commandResponse29.putAll(strMap45);
        commandResponse16.putAll(strMap45);
        commandResponse4.putAll(strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "error" + "'", str30, "error");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.io.InputStream inputStream26 = null;
        commandResponse12.setInputStream(inputStream26);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse12.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (byte) -1);
        commandResponse3.addHeader("error", "hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "command" + "'", str8, "command");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj26 = commandResponse23.put("", (java.lang.Object) true);
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse32.toMap();
        java.lang.Object obj35 = commandResponse23.put("", (java.lang.Object) strMap34);
        java.lang.Object obj38 = commandResponse23.put("", (java.lang.Object) '#');
        java.lang.Object obj39 = commandResponse4.put("", (java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error" + "'", str20, "error");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + true + "'", obj35, true);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) -1, inputStream3);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 35);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.lang.Class<?> wildcardClass69 = commandResponse4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.addHeader("command", "command");
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 10);
        java.lang.Object obj13 = commandResponse3.put("error", (java.lang.Object) "");
        commandResponse3.setStatusCode((int) (byte) 0);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        commandResponse4.setStatusCode(200);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "command");
        int int14 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        int int47 = commandResponse10.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0);
        int int4 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.lang.String str4 = commandResponse3.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (short) 1);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 10);
        commandResponse3.setStatusCode((int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse3.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse4.toMap();
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream42);
        int int44 = commandResponse43.getStatusCode();
        java.io.InputStream inputStream45 = commandResponse43.getInputStream();
        commandResponse43.setStatusCode(200);
        java.io.InputStream inputStream48 = commandResponse43.getInputStream();
        java.io.InputStream inputStream49 = null;
        commandResponse43.setInputStream(inputStream49);
        java.lang.String str51 = commandResponse43.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = commandResponse43.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse43.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse43.toMap();
        commandResponse4.putAll(strMap54);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap54);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        commandResponse4.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = commandResponse4.getHeaders();
        java.lang.String str53 = commandResponse4.getCommand();
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
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (byte) 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        commandResponse4.putAll(strMap22);
        java.lang.String str25 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + true + "'", obj23, true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200);
        java.lang.Object obj44 = commandResponse37.put("command", (java.lang.Object) commandResponse43);
        int int45 = commandResponse37.getStatusCode();
        java.lang.Object obj46 = commandResponse1.put("command", (java.lang.Object) int45);
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
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "hi!" + "'", obj46, "hi!");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        int int30 = commandResponse4.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.lang.String str10 = commandResponse4.getCommand();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream14);
        commandResponse15.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse22.getHeaders();
        java.io.InputStream inputStream24 = null;
        commandResponse22.setInputStream(inputStream24);
        java.io.InputStream inputStream26 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse22.toMap();
        commandResponse15.putAll(strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = commandResponse15.getHeaders();
        java.io.InputStream inputStream30 = null;
        commandResponse15.setInputStream(inputStream30);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        commandResponse36.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj46 = commandResponse43.put("", (java.lang.Object) true);
        java.io.InputStream inputStream51 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream51);
        java.io.InputStream inputStream53 = commandResponse52.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse52.toMap();
        java.lang.Object obj55 = commandResponse43.put("", (java.lang.Object) strMap54);
        java.io.InputStream inputStream56 = commandResponse43.getInputStream();
        commandResponse43.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj64 = commandResponse61.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj69 = commandResponse66.put("", (java.lang.Object) true);
        java.io.InputStream inputStream74 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse75 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream74);
        java.io.InputStream inputStream76 = commandResponse75.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = commandResponse75.toMap();
        java.lang.Object obj78 = commandResponse66.put("", (java.lang.Object) strMap77);
        commandResponse61.putAll(strMap77);
        commandResponse43.putAll(strMap77);
        commandResponse36.putAll(strMap77);
        commandResponse15.putAll(strMap77);
        commandResponse4.putAll(strMap77);
        int int84 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream85 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + true + "'", obj55, true);
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(inputStream76);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + true + "'", obj78, true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 100 + "'", int84 == 100);
        org.junit.Assert.assertNull(inputStream85);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse1.toMap();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ');
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.String str14 = commandResponse9.getCommand();
        java.io.InputStream inputStream15 = null;
        commandResponse9.setInputStream(inputStream15);
        java.lang.Object obj17 = commandResponse3.put("error", (java.lang.Object) inputStream15);
        commandResponse3.setStatusCode(10);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) ' ', inputStream3);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = inputStream9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse4.getHeaders();
        int int18 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream28);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.lang.String str33 = commandResponse31.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj38 = commandResponse35.put("", (java.lang.Object) true);
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse44.toMap();
        java.lang.Object obj47 = commandResponse35.put("", (java.lang.Object) strMap46);
        commandResponse31.putAll(strMap46);
        commandResponse29.putAll(strMap46);
        commandResponse23.putAll(strMap46);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream55);
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream61);
        int int63 = commandResponse62.getStatusCode();
        java.lang.Object obj64 = commandResponse56.put("error", (java.lang.Object) int63);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse56.toMap();
        java.lang.Object obj66 = commandResponse23.put("command", (java.lang.Object) commandResponse56);
        java.lang.Object obj67 = commandResponse3.put("command", (java.lang.Object) commandResponse23);
        java.lang.String str68 = commandResponse23.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = commandResponse23.toMap();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + true + "'", obj47, true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "hi!" + "'", obj66, "hi!");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strMap69);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream25);
        commandResponse26.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap34 = commandResponse33.getHeaders();
        java.io.InputStream inputStream35 = null;
        commandResponse33.setInputStream(inputStream35);
        java.io.InputStream inputStream37 = commandResponse33.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse33.toMap();
        commandResponse26.putAll(strMap38);
        java.util.Map<java.lang.String, java.lang.String> strMap40 = commandResponse26.getHeaders();
        java.io.InputStream inputStream41 = null;
        commandResponse26.setInputStream(inputStream41);
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse47.toMap();
        commandResponse47.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse54 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj57 = commandResponse54.put("", (java.lang.Object) true);
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream62);
        java.io.InputStream inputStream64 = commandResponse63.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse63.toMap();
        java.lang.Object obj66 = commandResponse54.put("", (java.lang.Object) strMap65);
        java.io.InputStream inputStream67 = commandResponse54.getInputStream();
        commandResponse54.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj75 = commandResponse72.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse77 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj80 = commandResponse77.put("", (java.lang.Object) true);
        java.io.InputStream inputStream85 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse86 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream85);
        java.io.InputStream inputStream87 = commandResponse86.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap88 = commandResponse86.toMap();
        java.lang.Object obj89 = commandResponse77.put("", (java.lang.Object) strMap88);
        commandResponse72.putAll(strMap88);
        commandResponse54.putAll(strMap88);
        commandResponse47.putAll(strMap88);
        commandResponse26.putAll(strMap88);
        commandResponse4.putAll(strMap88);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "command" + "'", str20, "command");
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(inputStream64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + true + "'", obj66, true);
        org.junit.Assert.assertNull(inputStream67);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(inputStream87);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + true + "'", obj89, true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream57);
        commandResponse58.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse65 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap66 = commandResponse65.getHeaders();
        java.io.InputStream inputStream67 = null;
        commandResponse65.setInputStream(inputStream67);
        java.io.InputStream inputStream69 = commandResponse65.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = commandResponse65.toMap();
        commandResponse58.putAll(strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = commandResponse58.getHeaders();
        java.io.InputStream inputStream73 = null;
        commandResponse58.setInputStream(inputStream73);
        commandResponse58.addHeader("command", "hi!");
        java.io.InputStream inputStream78 = commandResponse58.getInputStream();
        java.lang.Object obj79 = commandResponse4.put("command", (java.lang.Object) inputStream78);
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
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertNull(inputStream69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertNull(inputStream78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "{command=hi!, error=hi!}");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) 1, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        int int48 = commandResponse4.getStatusCode();
        java.lang.String str49 = commandResponse4.getCommand();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream9);
        int int11 = commandResponse10.getStatusCode();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) int11);
        int int13 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.lang.Object obj25 = commandResponse21.put("", (java.lang.Object) (byte) 10);
        java.lang.String str26 = commandResponse21.getCommand();
        java.io.InputStream inputStream27 = null;
        commandResponse21.setInputStream(inputStream27);
        int int29 = commandResponse21.getStatusCode();
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
        java.lang.String str59 = commandResponse31.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream64 = null;
        commandResponse63.setInputStream(inputStream64);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = commandResponse69.toMap();
        commandResponse63.putAll(strMap70);
        commandResponse31.putAll(strMap70);
        commandResponse21.putAll(strMap70);
        commandResponse4.putAll(strMap70);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strMap70);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (-1));
        commandResponse3.addHeader("", "error");
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        commandResponse3.setStatusCode((int) (short) 1);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (short) 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        int int13 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        java.util.Map<java.lang.String, java.lang.String> strMap31 = commandResponse3.getHeaders();
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
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        java.io.InputStream inputStream16 = commandResponse4.getInputStream();
        java.lang.Class<?> wildcardClass17 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("", (java.lang.Object) (byte) 10);
        java.lang.String str40 = commandResponse35.getCommand();
        java.io.InputStream inputStream41 = null;
        commandResponse35.setInputStream(inputStream41);
        java.lang.String str43 = commandResponse35.getCommand();
        int int44 = commandResponse35.getStatusCode();
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream48);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse49.toMap();
        commandResponse35.putAll(strMap50);
        commandResponse4.putAll(strMap50);
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
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.lang.Class<?> wildcardClass33 = strMap31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 0, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse10.toMap();
        commandResponse10.addHeader("", "");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap60 = commandResponse59.getHeaders();
        java.io.InputStream inputStream61 = null;
        commandResponse59.setInputStream(inputStream61);
        java.io.InputStream inputStream63 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse59.toMap();
        commandResponse10.putAll(strMap64);
        java.io.InputStream inputStream70 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse71 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (short) 10, inputStream70);
        java.io.InputStream inputStream72 = null;
        commandResponse71.setInputStream(inputStream72);
        java.lang.Object obj74 = commandResponse10.put("", (java.lang.Object) commandResponse71);
        java.util.Map<java.lang.String, java.lang.Object> strMap75 = commandResponse71.toMap();
        java.lang.Object obj76 = commandResponse4.put("command", (java.lang.Object) strMap75);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
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
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "hi!");
        java.io.InputStream inputStream17 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) -1);
        commandResponse3.addHeader("error", "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse15.toMap();
        java.lang.Object obj21 = commandResponse15.put("", (java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse15.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse15.toMap();
        commandResponse4.putAll(strMap23);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", 0, inputStream3);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        commandResponse9.setStatusCode(200);
        java.io.InputStream inputStream14 = commandResponse9.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse9.putAll(strMap19);
        commandResponse4.putAll(strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = commandResponse4.toMap();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        int int12 = commandResponse10.getStatusCode();
        commandResponse10.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = commandResponse10.getHeaders();
        java.io.InputStream inputStream19 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse20 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream19);
        java.io.InputStream inputStream21 = commandResponse20.getInputStream();
        java.lang.Object obj24 = commandResponse20.put("", (java.lang.Object) (byte) 10);
        java.lang.String str25 = commandResponse20.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse20.toMap();
        commandResponse10.putAll(strMap26);
        commandResponse4.putAll(strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(inputStream21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        java.lang.String str7 = commandResponse3.getError();
        java.io.InputStream inputStream8 = null;
        commandResponse3.setInputStream(inputStream8);
        int int10 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        commandResponse4.addHeader("error", "command");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 35);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getCommand();
        int int6 = commandResponse3.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 10);
        commandResponse3.setStatusCode((int) (short) 0);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '4', inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.lang.Class<?> wildcardClass6 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.io.InputStream inputStream26 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "command" + "'", str24, "command");
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(inputStream26);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int16 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse17 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) '#');
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.lang.Object obj30 = commandResponse26.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse26.toMap();
        int int32 = commandResponse26.getStatusCode();
        java.lang.String str33 = commandResponse26.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse26.toMap();
        java.lang.String str35 = commandResponse26.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = commandResponse26.toMap();
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream40);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse46.toMap();
        java.lang.Object obj48 = commandResponse41.put("error", (java.lang.Object) strMap47);
        commandResponse26.putAll(strMap47);
        commandResponse21.putAll(strMap47);
        commandResponse17.putAll(strMap47);
        commandResponse4.putAll(strMap47);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse56.setStatusCode(0);
        java.lang.String str59 = commandResponse56.getError();
        java.lang.String str60 = commandResponse56.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse56.toMap();
        commandResponse4.putAll(strMap61);
        java.lang.Class<?> wildcardClass63 = commandResponse4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "command" + "'", str60, "command");
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.lang.String str21 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        java.io.InputStream inputStream2 = null;
        commandResponse1.setInputStream(inputStream2);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream11 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream11);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse12.toMap();
        commandResponse1.putAll(strMap14);
        java.lang.String str16 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse1.getHeaders();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        int int24 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        int int8 = commandResponse7.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        commandResponse3.putAll(strMap9);
        java.io.InputStream inputStream11 = commandResponse3.getInputStream();
        commandResponse3.addHeader("command", "error");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 10, inputStream3);
        commandResponse4.setStatusCode(32);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        commandResponse4.setStatusCode((int) (short) -1);
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
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        java.io.InputStream inputStream40 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse41 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream40);
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = commandResponse41.toMap();
        commandResponse41.setStatusCode(0);
        commandResponse41.setStatusCode((int) (byte) 100);
        java.lang.String str47 = commandResponse41.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse59.toMap();
        java.lang.Object obj62 = commandResponse50.put("", (java.lang.Object) strMap61);
        java.io.InputStream inputStream63 = commandResponse50.getInputStream();
        commandResponse50.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj71 = commandResponse68.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj76 = commandResponse73.put("", (java.lang.Object) true);
        java.io.InputStream inputStream81 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse82 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream81);
        java.io.InputStream inputStream83 = commandResponse82.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse82.toMap();
        java.lang.Object obj85 = commandResponse73.put("", (java.lang.Object) strMap84);
        commandResponse68.putAll(strMap84);
        commandResponse50.putAll(strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = commandResponse50.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap89 = commandResponse50.toMap();
        java.lang.Object obj90 = commandResponse41.put("command", (java.lang.Object) strMap89);
        java.lang.Object obj91 = commandResponse1.put("command", (java.lang.Object) strMap89);
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
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
        org.junit.Assert.assertNull(inputStream63);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + "hi!" + "'", obj91, "hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.io.InputStream inputStream84 = null;
        commandResponse4.setInputStream(inputStream84);
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
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        commandResponse12.setStatusCode(35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.io.InputStream inputStream24 = null;
        commandResponse4.setInputStream(inputStream24);
        java.lang.String str26 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "error" + "'", str26, "error");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.addHeader("", "command");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse13.toMap();
        java.io.InputStream inputStream15 = null;
        commandResponse13.setInputStream(inputStream15);
        commandResponse13.setStatusCode(1);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse23.toMap();
        commandResponse13.putAll(strMap28);
        commandResponse3.putAll(strMap28);
        java.io.InputStream inputStream31 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream31);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 100);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        commandResponse1.addHeader("error", "");
        java.io.InputStream inputStream8 = commandResponse1.getInputStream();
        java.io.InputStream inputStream9 = commandResponse1.getInputStream();
        int int10 = commandResponse1.getStatusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream67);
        java.io.InputStream inputStream69 = commandResponse68.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = commandResponse68.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap71 = commandResponse68.toMap();
        java.lang.Object obj74 = commandResponse68.put("", (java.lang.Object) false);
        commandResponse68.setStatusCode((int) (byte) 10);
        commandResponse68.addHeader("command", "command");
        java.lang.Class<?> wildcardClass80 = commandResponse68.getClass();
        java.lang.Object obj81 = commandResponse4.put("error", (java.lang.Object) commandResponse68);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = commandResponse68.put("", obj83);
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
        org.junit.Assert.assertNull(inputStream69);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + "hi!" + "'", obj81, "hi!");
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + false + "'", obj84, false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        java.lang.String str11 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.io.InputStream inputStream13 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(inputStream13);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        java.lang.Object obj11 = commandResponse4.put("error", (java.lang.Object) strMap10);
        int int12 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "command");
        int int8 = commandResponse4.getStatusCode();
        int int9 = commandResponse4.getStatusCode();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.util.Map<java.lang.String, java.lang.String> strMap71 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap71);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream22);
        java.io.InputStream inputStream24 = commandResponse23.getInputStream();
        java.lang.Object obj27 = commandResponse23.put("", (java.lang.Object) (byte) 10);
        java.lang.String str28 = commandResponse23.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse23.toMap();
        int int30 = commandResponse23.getStatusCode();
        commandResponse23.setStatusCode((int) '#');
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse23.getHeaders();
        java.io.InputStream inputStream37 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse38 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream37);
        java.io.InputStream inputStream39 = commandResponse38.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse38.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = commandResponse38.toMap();
        java.io.InputStream inputStream42 = null;
        commandResponse38.setInputStream(inputStream42);
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse38.toMap();
        commandResponse23.putAll(strMap44);
        commandResponse4.putAll(strMap44);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        int int12 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        java.io.InputStream inputStream14 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(inputStream14);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 52);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream14 = null;
        commandResponse9.setInputStream(inputStream14);
        java.lang.String str16 = commandResponse9.getCommand();
        commandResponse9.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.lang.Object obj23 = commandResponse9.put("command", (java.lang.Object) "command");
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.lang.Object obj33 = commandResponse29.put("", (java.lang.Object) (byte) 10);
        java.lang.String str34 = commandResponse29.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse29.toMap();
        java.io.InputStream inputStream36 = null;
        commandResponse29.setInputStream(inputStream36);
        java.lang.Object obj38 = commandResponse9.put("command", (java.lang.Object) commandResponse29);
        java.io.InputStream inputStream39 = commandResponse9.getInputStream();
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream43);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse44.toMap();
        commandResponse9.putAll(strMap45);
        java.lang.Object obj47 = commandResponse3.put("error", (java.lang.Object) strMap45);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse51 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse51.toMap();
        java.io.InputStream inputStream53 = commandResponse51.getInputStream();
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        java.lang.Object obj62 = commandResponse58.put("", (java.lang.Object) (byte) 10);
        java.lang.String str63 = commandResponse58.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap64 = commandResponse58.toMap();
        java.lang.Object obj67 = commandResponse58.put("", (java.lang.Object) (-1));
        java.lang.String str68 = commandResponse58.getError();
        java.io.InputStream inputStream69 = null;
        commandResponse58.setInputStream(inputStream69);
        commandResponse58.addHeader("", "hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse58.toMap();
        commandResponse51.putAll(strMap74);
        commandResponse3.putAll(strMap74);
        java.io.InputStream inputStream80 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse81 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream80);
        java.util.Map<java.lang.String, java.lang.Object> strMap82 = commandResponse81.toMap();
        commandResponse3.putAll(strMap82);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "command" + "'", obj38, "command");
        org.junit.Assert.assertNull(inputStream39);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (byte) 10 + "'", obj67, (byte) 10);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap82);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 97, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.lang.String str3 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse1.getHeaders();
        java.lang.String str5 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse1.getHeaders();
        java.lang.Class<?> wildcardClass7 = commandResponse1.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "command" + "'", str3, "command");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse4.putAll(strMap38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str26 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        java.lang.String str25 = commandResponse4.getError();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        int int12 = commandResponse4.getStatusCode();
        int int13 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        java.lang.String str7 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = commandResponse3.toMap();
        java.io.InputStream inputStream12 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse13 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream12);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        int int21 = commandResponse19.getStatusCode();
        commandResponse19.setStatusCode((int) (short) 100);
        java.lang.Object obj26 = commandResponse19.put("command", (java.lang.Object) 10.0f);
        java.lang.String str27 = commandResponse19.getError();
        java.lang.Object obj28 = commandResponse13.put("command", (java.lang.Object) commandResponse19);
        commandResponse19.addHeader("hi!", "error");
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse36.toMap();
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream44);
        java.io.InputStream inputStream46 = commandResponse45.getInputStream();
        int int47 = commandResponse45.getStatusCode();
        commandResponse45.setStatusCode((int) (short) 100);
        java.lang.Object obj52 = commandResponse45.put("command", (java.lang.Object) 10.0f);
        java.lang.Object obj53 = commandResponse36.put("hi!", obj52);
        java.io.InputStream inputStream57 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse58 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream57);
        java.io.InputStream inputStream59 = commandResponse58.getInputStream();
        int int60 = commandResponse58.getStatusCode();
        commandResponse58.setStatusCode((int) (short) 100);
        commandResponse58.setStatusCode(0);
        commandResponse58.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse68 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj71 = commandResponse68.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse73 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj76 = commandResponse73.put("", (java.lang.Object) true);
        java.io.InputStream inputStream81 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse82 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream81);
        java.io.InputStream inputStream83 = commandResponse82.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap84 = commandResponse82.toMap();
        java.lang.Object obj85 = commandResponse73.put("", (java.lang.Object) strMap84);
        commandResponse68.putAll(strMap84);
        commandResponse58.putAll(strMap84);
        commandResponse36.putAll(strMap84);
        commandResponse19.putAll(strMap84);
        commandResponse3.putAll(strMap84);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(inputStream46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(inputStream83);
        org.junit.Assert.assertNotNull(strMap84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + true + "'", obj85, true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.io.InputStream inputStream46 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse47 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream46);
        java.io.InputStream inputStream48 = commandResponse47.getInputStream();
        java.lang.Object obj51 = commandResponse47.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse47.toMap();
        int int53 = commandResponse47.getStatusCode();
        java.lang.String str54 = commandResponse47.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap55 = commandResponse47.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse47.toMap();
        commandResponse1.putAll(strMap56);
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
        org.junit.Assert.assertNull(inputStream48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(strMap55);
        org.junit.Assert.assertNotNull(strMap56);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.lang.String str6 = commandResponse4.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#');
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream14);
        java.io.InputStream inputStream16 = commandResponse15.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        commandResponse10.putAll(strMap17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse10.toMap();
        commandResponse4.putAll(strMap19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("hi!", "");
        java.lang.String str8 = commandResponse3.getCommand();
        commandResponse3.setStatusCode((int) (byte) -1);
        commandResponse3.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        int int5 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        commandResponse3.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream6);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 200, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        commandResponse9.setStatusCode(200);
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream18);
        java.lang.Object obj20 = commandResponse9.put("", (java.lang.Object) commandResponse19);
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj46 = commandResponse43.put("", (java.lang.Object) true);
        java.io.InputStream inputStream51 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream51);
        java.io.InputStream inputStream53 = commandResponse52.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = commandResponse52.toMap();
        java.lang.Object obj55 = commandResponse43.put("", (java.lang.Object) strMap54);
        java.lang.Object obj58 = commandResponse43.put("", (java.lang.Object) '#');
        java.io.InputStream inputStream62 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse63 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream62);
        java.io.InputStream inputStream64 = commandResponse63.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse63.toMap();
        commandResponse43.putAll(strMap65);
        commandResponse23.putAll(strMap65);
        java.lang.Object obj68 = commandResponse19.put("command", (java.lang.Object) strMap65);
        java.io.InputStream inputStream69 = null;
        commandResponse19.setInputStream(inputStream69);
        java.io.InputStream inputStream74 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse75 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream74);
        java.io.InputStream inputStream76 = commandResponse75.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap77 = commandResponse75.toMap();
        commandResponse19.putAll(strMap77);
        commandResponse4.putAll(strMap77);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + true + "'", obj40, true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + true + "'", obj55, true);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "{command=hi!, error=hi!}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "{command=hi!, error=hi!}");
        org.junit.Assert.assertNull(inputStream64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(inputStream76);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.addHeader("command", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.String str6 = commandResponse4.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj11 = commandResponse8.put("", (java.lang.Object) true);
        java.lang.Object obj14 = commandResponse8.put("", (java.lang.Object) "command");
        java.io.InputStream inputStream18 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse19 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream18);
        java.io.InputStream inputStream20 = commandResponse19.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse19.toMap();
        commandResponse8.putAll(strMap21);
        java.io.InputStream inputStream23 = commandResponse8.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse8.toMap();
        commandResponse4.putAll(strMap24);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "command" + "'", str6, "command");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + true + "'", obj14, true);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 1);
        java.lang.Object obj16 = commandResponse4.put("", (java.lang.Object) 1);
        java.io.InputStream inputStream17 = null;
        commandResponse4.setInputStream(inputStream17);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", 35);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.io.InputStream inputStream25 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse26 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream25);
        java.io.InputStream inputStream27 = commandResponse26.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = commandResponse26.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse26.toMap();
        java.lang.Object obj32 = commandResponse26.put("", (java.lang.Object) false);
        commandResponse26.setStatusCode((int) (short) 10);
        int int35 = commandResponse26.getStatusCode();
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream39);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream45);
        int int47 = commandResponse46.getStatusCode();
        java.lang.Object obj48 = commandResponse40.put("error", (java.lang.Object) int47);
        int int49 = commandResponse40.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse40.toMap();
        commandResponse26.putAll(strMap50);
        commandResponse4.putAll(strMap50);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse77 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap78 = commandResponse77.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap79 = commandResponse77.toMap();
        java.io.InputStream inputStream80 = null;
        commandResponse77.setInputStream(inputStream80);
        java.lang.String str82 = commandResponse77.getError();
        commandResponse77.setStatusCode((int) (short) 10);
        java.lang.Object obj85 = commandResponse3.put("error", (java.lang.Object) commandResponse77);
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
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertNotNull(strMap79);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.lang.String str4 = commandResponse3.getError();
        java.io.InputStream inputStream5 = commandResponse3.getInputStream();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (byte) 0);
        commandResponse10.setStatusCode(0);
        java.lang.String str13 = commandResponse10.getError();
        java.lang.String str14 = commandResponse10.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse10.toMap();
        commandResponse4.putAll(strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "command" + "'", str14, "command");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 10, inputStream3);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj38 = commandResponse35.put("", (java.lang.Object) true);
        java.lang.Object obj41 = commandResponse35.put("", (java.lang.Object) "command");
        java.lang.String str42 = commandResponse35.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse35.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = commandResponse35.getHeaders();
        java.lang.Object obj45 = commandResponse6.put("error", (java.lang.Object) commandResponse35);
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
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + true + "'", obj41, true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "hi!" + "'", obj45, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse11.toMap();
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
        org.junit.Assert.assertNotNull(strMap72);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        java.io.InputStream inputStream25 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(inputStream25);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.lang.String str8 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        java.lang.String str10 = commandResponse4.getCommand();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = commandResponse4.put("command", obj12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 200, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode((int) (byte) 10);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.io.InputStream inputStream19 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + true + "'", obj13, true);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(inputStream19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.String str22 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 200, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        commandResponse4.setStatusCode(35);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        java.lang.Class<?> wildcardClass16 = strMap14.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode((int) (short) -1);
        commandResponse4.setStatusCode((int) (short) -1);
        int int14 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream15 = null;
        commandResponse4.setInputStream(inputStream15);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 0, inputStream3);
        commandResponse4.setStatusCode(200);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        commandResponse3.addHeader("error", "error");
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse4.setInputStream(inputStream7);
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        int int11 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.String str19 = commandResponse4.getCommand();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.lang.String str45 = commandResponse40.getError();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "command" + "'", str45, "command");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        org.junit.Assert.assertNull(inputStream8);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 10, inputStream3);
        commandResponse4.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (-1), inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.lang.String str7 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "command" + "'", str7, "command");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse1.toMap();
        java.lang.String str7 = commandResponse1.getCommand();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse1.getHeaders();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "command" + "'", str7, "command");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.io.InputStream inputStream36 = null;
        commandResponse26.setInputStream(inputStream36);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        int int8 = commandResponse7.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        commandResponse3.putAll(strMap9);
        java.lang.Class<?> wildcardClass11 = strMap9.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        int int16 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream20);
        commandResponse21.addHeader("hi!", "");
        java.io.InputStream inputStream25 = commandResponse21.getInputStream();
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream29);
        java.io.InputStream inputStream31 = commandResponse30.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = commandResponse30.toMap();
        commandResponse30.addHeader("", "");
        java.io.InputStream inputStream39 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse40 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream39);
        java.io.InputStream inputStream41 = commandResponse40.getInputStream();
        java.lang.Object obj44 = commandResponse40.put("", (java.lang.Object) (byte) 10);
        java.lang.String str45 = commandResponse40.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse40.toMap();
        commandResponse30.putAll(strMap46);
        java.io.InputStream inputStream48 = null;
        commandResponse30.setInputStream(inputStream48);
        commandResponse30.addHeader("error", "");
        java.util.Map<java.lang.String, java.lang.Object> strMap53 = commandResponse30.toMap();
        commandResponse21.putAll(strMap53);
        commandResponse4.putAll(strMap53);
        java.io.InputStream inputStream56 = null;
        commandResponse4.setInputStream(inputStream56);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(strMap53);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 97);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        commandResponse4.setStatusCode(0);
        java.io.InputStream inputStream15 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse16 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream15);
        int int17 = commandResponse16.getStatusCode();
        commandResponse16.setStatusCode(1);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse16.toMap();
        commandResponse4.putAll(strMap20);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        commandResponse1.setStatusCode((int) (byte) -1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "command" + "'", str23, "command");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.io.InputStream inputStream60 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) -1, inputStream60);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream65);
        java.io.InputStream inputStream71 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse72 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream71);
        java.io.InputStream inputStream73 = commandResponse72.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap74 = commandResponse72.toMap();
        commandResponse72.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap78 = commandResponse72.getHeaders();
        java.lang.String str79 = commandResponse72.getCommand();
        java.lang.Object obj80 = commandResponse66.put("", (java.lang.Object) str79);
        java.util.Map<java.lang.String, java.lang.Object> strMap81 = commandResponse66.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap82 = commandResponse66.toMap();
        commandResponse61.putAll(strMap82);
        commandResponse3.putAll(strMap82);
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
        org.junit.Assert.assertNull(inputStream73);
        org.junit.Assert.assertNotNull(strMap74);
        org.junit.Assert.assertNotNull(strMap78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNotNull(strMap82);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        java.lang.String str6 = commandResponse4.getCommand();
        commandResponse4.addHeader("error", "command");
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = commandResponse4.put("", obj11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error" + "'", str6, "error");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.Class<?> wildcardClass28 = strMap26.getClass();
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
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", 97, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
        java.io.InputStream inputStream7 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 0, inputStream3);
        commandResponse4.setStatusCode((int) '4');
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", 200, inputStream3);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 52);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (-1), inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        commandResponse4.addHeader("", "");
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str20 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.lang.Object obj16 = commandResponse9.put("hi!", (java.lang.Object) 100.0f);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream19 = commandResponse18.getInputStream();
        java.lang.String str20 = commandResponse18.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj25 = commandResponse22.put("", (java.lang.Object) true);
        java.io.InputStream inputStream30 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream30);
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = commandResponse31.toMap();
        java.lang.Object obj34 = commandResponse22.put("", (java.lang.Object) strMap33);
        commandResponse18.putAll(strMap33);
        commandResponse9.putAll(strMap33);
        commandResponse3.putAll(strMap33);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + true + "'", obj34, true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) '4');
        commandResponse36.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse36.toMap();
        commandResponse4.putAll(strMap40);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap42);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj4 = commandResponse1.put("", (java.lang.Object) true);
        java.lang.Object obj7 = commandResponse1.put("", (java.lang.Object) "command");
        java.lang.String str8 = commandResponse1.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse1.toMap();
        java.lang.String str10 = commandResponse1.getError();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + true + "'", obj7, true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        commandResponse1.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream46 = null;
        commandResponse1.setInputStream(inputStream46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = commandResponse1.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap48);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream3);
        java.lang.String str5 = commandResponse4.getCommand();
        commandResponse4.addHeader("error", "command");
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream13);
        java.lang.Class<?> wildcardClass15 = commandResponse14.getClass();
        java.lang.Object obj16 = commandResponse4.put("command", (java.lang.Object) wildcardClass15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream8);
        int int10 = commandResponse9.getStatusCode();
        java.io.InputStream inputStream11 = commandResponse9.getInputStream();
        commandResponse9.setStatusCode(200);
        java.io.InputStream inputStream14 = commandResponse9.getInputStream();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse18.toMap();
        commandResponse9.putAll(strMap19);
        commandResponse4.putAll(strMap19);
        java.lang.String str22 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "command" + "'", str22, "command");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        java.lang.String str61 = commandResponse3.getCommand();
        int int62 = commandResponse3.getStatusCode();
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.lang.String str4 = commandResponse3.getCommand();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream10 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100, inputStream10);
        java.lang.Object obj12 = commandResponse3.put("", (java.lang.Object) "error");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error" + "'", str4, "error");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream4);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1, inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.lang.String str6 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = commandResponse4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) 'a', inputStream3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (short) -1);
        java.lang.Object obj34 = commandResponse15.put("hi!", (java.lang.Object) "hi!");
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
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        int int10 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream14);
        commandResponse15.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse22 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse22.getHeaders();
        java.io.InputStream inputStream24 = null;
        commandResponse22.setInputStream(inputStream24);
        java.io.InputStream inputStream26 = commandResponse22.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse22.toMap();
        commandResponse15.putAll(strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = commandResponse15.getHeaders();
        java.io.InputStream inputStream30 = null;
        commandResponse15.setInputStream(inputStream30);
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream36);
        int int38 = commandResponse37.getStatusCode();
        commandResponse37.setStatusCode(1);
        java.lang.String str41 = commandResponse37.getError();
        java.lang.Object obj42 = commandResponse15.put("", (java.lang.Object) str41);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = commandResponse15.getHeaders();
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 0, inputStream47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse48.toMap();
        commandResponse15.putAll(strMap49);
        commandResponse4.putAll(strMap49);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(inputStream26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        commandResponse4.addHeader("error", "command");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = commandResponse4.getHeaders();
        commandResponse4.addHeader("error", "command");
        java.io.InputStream inputStream59 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse60 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream59);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream65);
        int int67 = commandResponse66.getStatusCode();
        java.lang.Object obj68 = commandResponse60.put("error", (java.lang.Object) int67);
        int int69 = commandResponse60.getStatusCode();
        int int70 = commandResponse60.getStatusCode();
        java.lang.Object obj71 = commandResponse4.put("", (java.lang.Object) commandResponse60);
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
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        commandResponse3.addHeader("hi!", "error");
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        java.lang.String str18 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = commandResponse4.getHeaders();
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream24);
        commandResponse25.addHeader("hi!", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse32.getHeaders();
        java.io.InputStream inputStream34 = null;
        commandResponse32.setInputStream(inputStream34);
        java.io.InputStream inputStream36 = commandResponse32.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = commandResponse32.toMap();
        commandResponse25.putAll(strMap37);
        java.util.Map<java.lang.String, java.lang.String> strMap39 = commandResponse25.getHeaders();
        java.io.InputStream inputStream40 = null;
        commandResponse25.setInputStream(inputStream40);
        commandResponse25.addHeader("command", "hi!");
        java.io.InputStream inputStream48 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse49 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream48);
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse49.toMap();
        commandResponse25.putAll(strMap50);
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse25.toMap();
        commandResponse4.putAll(strMap52);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap52);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.lang.String str5 = commandResponse3.getCommand();
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) 10, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream8);
        java.lang.String str10 = commandResponse9.getCommand();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = commandResponse15.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse15.toMap();
        commandResponse9.putAll(strMap17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = commandResponse9.toMap();
        commandResponse4.putAll(strMap19);
        java.io.InputStream inputStream24 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream24);
        int int26 = commandResponse25.getStatusCode();
        java.io.InputStream inputStream27 = commandResponse25.getInputStream();
        commandResponse25.setStatusCode(200);
        java.io.InputStream inputStream30 = commandResponse25.getInputStream();
        java.io.InputStream inputStream31 = null;
        commandResponse25.setInputStream(inputStream31);
        java.lang.String str33 = commandResponse25.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = commandResponse25.toMap();
        commandResponse4.putAll(strMap34);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "error" + "'", str10, "error");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        int int9 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = null;
        commandResponse4.setInputStream(inputStream12);
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", 32);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        commandResponse1.addHeader("command", "command");
        java.lang.Class<?> wildcardClass93 = commandResponse1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        java.lang.String str7 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "command" + "'", str7, "command");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (-1), inputStream28);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse31 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream32 = commandResponse31.getInputStream();
        java.lang.String str33 = commandResponse31.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj38 = commandResponse35.put("", (java.lang.Object) true);
        java.io.InputStream inputStream43 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse44 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream43);
        java.io.InputStream inputStream45 = commandResponse44.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap46 = commandResponse44.toMap();
        java.lang.Object obj47 = commandResponse35.put("", (java.lang.Object) strMap46);
        commandResponse31.putAll(strMap46);
        commandResponse29.putAll(strMap46);
        commandResponse23.putAll(strMap46);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream55);
        java.io.InputStream inputStream61 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream61);
        int int63 = commandResponse62.getStatusCode();
        java.lang.Object obj64 = commandResponse56.put("error", (java.lang.Object) int63);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse56.toMap();
        java.lang.Object obj66 = commandResponse23.put("command", (java.lang.Object) commandResponse56);
        java.lang.Object obj67 = commandResponse3.put("command", (java.lang.Object) commandResponse23);
        java.lang.String str68 = commandResponse23.getCommand();
        java.lang.String str69 = commandResponse23.getCommand();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + true + "'", obj47, true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "hi!" + "'", obj66, "hi!");
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse10.toMap();
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.lang.String str12 = commandResponse4.getError();
        commandResponse4.setStatusCode((int) (byte) 10);
        int int15 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 35, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        java.io.InputStream inputStream47 = commandResponse4.getInputStream();
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
        org.junit.Assert.assertNull(inputStream47);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        java.lang.Class<?> wildcardClass29 = commandResponse15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        java.io.InputStream inputStream10 = null;
        commandResponse4.setInputStream(inputStream10);
        commandResponse4.setStatusCode(35);
        int int14 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.Class<?> wildcardClass55 = strMap50.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ', inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 100, inputStream9);
        java.io.InputStream inputStream11 = commandResponse10.getInputStream();
        java.io.InputStream inputStream12 = null;
        commandResponse10.setInputStream(inputStream12);
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = commandResponse10.put("error", obj15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse10.toMap();
        commandResponse4.putAll(strMap17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(inputStream11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.io.InputStream inputStream25 = null;
        commandResponse4.setInputStream(inputStream25);
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = commandResponse4.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", (int) (byte) 1, inputStream3);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse4.toMap();
        int int10 = commandResponse4.getStatusCode();
        int int11 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream12 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(inputStream12);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.io.InputStream inputStream60 = null;
        commandResponse4.setInputStream(inputStream60);
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) '4', inputStream3);
        commandResponse4.setStatusCode(200);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = commandResponse4.toMap();
        java.lang.String str36 = commandResponse4.getCommand();
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
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        java.io.InputStream inputStream72 = null;
        commandResponse4.setInputStream(inputStream72);
        java.lang.String str74 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "error");
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
    }
}

