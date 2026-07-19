package org.apache.zookeeper.test.randoop.c3.commandresponse;
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) '4', inputStream8);
        java.lang.Object obj10 = commandResponse3.put("", (java.lang.Object) commandResponse9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) ' ');
        java.lang.Class<?> wildcardClass15 = commandResponse3.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse4.toMap();
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
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) 100, inputStream3);
        java.io.InputStream inputStream5 = null;
        commandResponse4.setInputStream(inputStream5);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse4.getHeaders();
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream41 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream41);
        java.io.InputStream inputStream43 = commandResponse42.getInputStream();
        java.lang.Object obj46 = commandResponse42.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap47 = commandResponse42.toMap();
        int int48 = commandResponse42.getStatusCode();
        java.lang.String str49 = commandResponse42.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap50 = commandResponse42.toMap();
        java.lang.String str51 = commandResponse42.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap52 = commandResponse42.toMap();
        java.io.InputStream inputStream56 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream56);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse62 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = commandResponse62.toMap();
        java.lang.Object obj64 = commandResponse57.put("error", (java.lang.Object) strMap63);
        commandResponse42.putAll(strMap63);
        commandResponse37.putAll(strMap63);
        int int67 = commandResponse37.getStatusCode();
        java.lang.Object obj68 = commandResponse12.put("error", (java.lang.Object) commandResponse37);
        int int69 = commandResponse12.getStatusCode();
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
        org.junit.Assert.assertNull(inputStream43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNotNull(strMap63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "command" + "'", obj68, "command");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("error");
        commandResponse1.addHeader("hi!", "hi!");
        java.io.InputStream inputStream5 = commandResponse1.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        java.util.Map<java.lang.String, java.lang.String> strMap49 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap49);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.lang.String str6 = commandResponse3.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse11 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.Object obj12 = commandResponse3.put("", (java.lang.Object) "error");
        java.io.InputStream inputStream13 = null;
        commandResponse3.setInputStream(inputStream13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.String str17 = commandResponse4.getCommand();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.Class<?> wildcardClass12 = commandResponse4.getClass();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        java.util.Map<java.lang.String, java.lang.String> strMap57 = commandResponse3.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap57);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = commandResponse3.toMap();
        commandResponse3.setStatusCode((int) (short) 10);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (byte) 100);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.io.InputStream inputStream23 = commandResponse1.getInputStream();
        java.io.InputStream inputStream24 = commandResponse1.getInputStream();
        java.io.InputStream inputStream29 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 52, inputStream29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse30.toMap();
        int int32 = commandResponse30.getStatusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse30.getHeaders();
        java.lang.Object obj34 = commandResponse1.put("", (java.lang.Object) commandResponse30);
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNull(inputStream23);
        org.junit.Assert.assertNull(inputStream24);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse3.putAll(strMap10);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.lang.String str11 = commandResponse4.getError();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = commandResponse4.put("error", obj13);
        java.io.InputStream inputStream15 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(inputStream15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) -1, inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream8);
        java.io.InputStream inputStream10 = commandResponse9.getInputStream();
        java.lang.Object obj13 = commandResponse9.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = commandResponse9.toMap();
        int int15 = commandResponse9.getStatusCode();
        java.lang.String str16 = commandResponse9.getError();
        java.lang.String str17 = commandResponse9.getError();
        commandResponse9.addHeader("error", "error");
        java.io.InputStream inputStream21 = null;
        commandResponse9.setInputStream(inputStream21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = commandResponse9.getHeaders();
        commandResponse9.setStatusCode((int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = commandResponse9.toMap();
        commandResponse4.putAll(strMap26);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = commandResponse4.put("", obj29);
        java.io.InputStream inputStream35 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse36 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream35);
        java.io.InputStream inputStream37 = commandResponse36.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = commandResponse36.toMap();
        commandResponse36.addHeader("", "");
        java.lang.String str42 = commandResponse36.getCommand();
        int int43 = commandResponse36.getStatusCode();
        commandResponse36.addHeader("", "hi!");
        java.io.InputStream inputStream47 = null;
        commandResponse36.setInputStream(inputStream47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse36.toMap();
        java.lang.Object obj50 = commandResponse4.put("command", (java.lang.Object) commandResponse36);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertNull(inputStream37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        int int5 = commandResponse3.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        java.lang.String str7 = commandResponse3.getError();
        java.io.InputStream inputStream8 = null;
        commandResponse3.setInputStream(inputStream8);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 10);
        java.lang.Class<?> wildcardClass4 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (-1), inputStream3);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (-1));
        java.lang.String str10 = commandResponse9.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = commandResponse9.toMap();
        java.lang.Object obj12 = commandResponse4.put("error", (java.lang.Object) commandResponse9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "error" + "'", str10, "error");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) -1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) 10, inputStream9);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream14);
        java.lang.String str16 = commandResponse15.getCommand();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse21.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse15.putAll(strMap23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse15.toMap();
        commandResponse10.putAll(strMap25);
        java.lang.Object obj27 = commandResponse4.put("", (java.lang.Object) commandResponse10);
        java.io.InputStream inputStream28 = null;
        commandResponse10.setInputStream(inputStream28);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "error" + "'", str16, "error");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream3);
        commandResponse4.setStatusCode((int) (short) 1);
        java.lang.String str7 = commandResponse4.getError();
        java.lang.String str8 = commandResponse4.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse12 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 10);
        java.io.InputStream inputStream13 = commandResponse12.getInputStream();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse12.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1);
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (-1), inputStream22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse23.toMap();
        commandResponse18.putAll(strMap24);
        commandResponse12.putAll(strMap24);
        commandResponse4.putAll(strMap24);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error" + "'", str7, "error");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) ' ', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", 0);
        java.lang.String str4 = commandResponse3.getError();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse1.toMap();
        java.io.InputStream inputStream7 = commandResponse1.getInputStream();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.io.InputStream inputStream32 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse33 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream32);
        java.io.InputStream inputStream34 = commandResponse33.getInputStream();
        java.lang.Object obj37 = commandResponse33.put("", (java.lang.Object) (byte) 10);
        java.lang.String str38 = commandResponse33.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = commandResponse33.toMap();
        int int40 = commandResponse33.getStatusCode();
        commandResponse33.setStatusCode((int) (byte) 10);
        commandResponse33.setStatusCode((int) '4');
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse33.toMap();
        commandResponse3.putAll(strMap45);
        java.lang.String str47 = commandResponse3.getCommand();
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (byte) 10);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse7 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 1);
        int int8 = commandResponse7.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = commandResponse7.toMap();
        commandResponse3.putAll(strMap9);
        java.io.InputStream inputStream11 = commandResponse3.getInputStream();
        java.io.InputStream inputStream12 = null;
        commandResponse3.setInputStream(inputStream12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        int int28 = commandResponse4.getStatusCode();
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
        commandResponse31.setStatusCode((int) '#');
        java.io.InputStream inputStream51 = null;
        commandResponse31.setInputStream(inputStream51);
        java.io.InputStream inputStream53 = commandResponse31.getInputStream();
        java.io.InputStream inputStream54 = commandResponse31.getInputStream();
        java.lang.Object obj55 = commandResponse4.put("error", (java.lang.Object) commandResponse31);
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNull(inputStream27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(inputStream32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(inputStream45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + true + "'", obj47, true);
        org.junit.Assert.assertNull(inputStream53);
        org.junit.Assert.assertNull(inputStream54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "hi!" + "'", obj55, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (byte) -1);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.io.InputStream inputStream46 = null;
        commandResponse10.setInputStream(inputStream46);
        int int48 = commandResponse10.getStatusCode();
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        commandResponse4.setStatusCode((int) (short) 1);
        int int11 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse1.getHeaders();
        java.lang.String str23 = commandResponse1.getCommand();
        org.junit.Assert.assertNull(inputStream2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + true + "'", obj17, true);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.lang.String str4 = commandResponse3.getCommand();
        java.lang.String str5 = commandResponse3.getError();
        java.io.InputStream inputStream6 = null;
        commandResponse3.setInputStream(inputStream6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "command" + "'", str4, "command");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream3);
        commandResponse4.addHeader("hi!", "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.lang.String str8 = commandResponse4.getError();
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(inputStream9);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        org.apache.zookeeper.server.admin.CommandResponse commandResponse25 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (byte) 10);
        int int26 = commandResponse25.getStatusCode();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse30 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) ' ');
        java.io.InputStream inputStream34 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse35 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream34);
        java.io.InputStream inputStream36 = commandResponse35.getInputStream();
        java.lang.Object obj39 = commandResponse35.put("", (java.lang.Object) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = commandResponse35.toMap();
        int int41 = commandResponse35.getStatusCode();
        java.lang.String str42 = commandResponse35.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse35.toMap();
        java.lang.String str44 = commandResponse35.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse35.toMap();
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 0, inputStream49);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = commandResponse55.toMap();
        java.lang.Object obj57 = commandResponse50.put("error", (java.lang.Object) strMap56);
        commandResponse35.putAll(strMap56);
        commandResponse30.putAll(strMap56);
        commandResponse25.putAll(strMap56);
        commandResponse4.putAll(strMap56);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(inputStream36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream3);
        int int5 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream6 = commandResponse4.getInputStream();
        java.lang.String str7 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        java.io.InputStream inputStream9 = null;
        commandResponse4.setInputStream(inputStream9);
        java.io.InputStream inputStream11 = commandResponse4.getInputStream();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(inputStream11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 10, inputStream3);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (byte) 10, inputStream3);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        commandResponse3.setStatusCode((-1));
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        commandResponse27.addHeader("", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse34 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj37 = commandResponse34.put("", (java.lang.Object) true);
        java.io.InputStream inputStream42 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse43 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream42);
        java.io.InputStream inputStream44 = commandResponse43.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = commandResponse43.toMap();
        java.lang.Object obj46 = commandResponse34.put("", (java.lang.Object) strMap45);
        java.io.InputStream inputStream47 = commandResponse34.getInputStream();
        commandResponse34.addHeader("command", "");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse52 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj55 = commandResponse52.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse57 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj60 = commandResponse57.put("", (java.lang.Object) true);
        java.io.InputStream inputStream65 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse66 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream65);
        java.io.InputStream inputStream67 = commandResponse66.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap68 = commandResponse66.toMap();
        java.lang.Object obj69 = commandResponse57.put("", (java.lang.Object) strMap68);
        commandResponse52.putAll(strMap68);
        commandResponse34.putAll(strMap68);
        commandResponse27.putAll(strMap68);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse76 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) ' ');
        java.util.Map<java.lang.String, java.lang.String> strMap77 = commandResponse76.getHeaders();
        java.io.InputStream inputStream78 = null;
        commandResponse76.setInputStream(inputStream78);
        java.io.InputStream inputStream80 = commandResponse76.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap81 = commandResponse76.toMap();
        commandResponse27.putAll(strMap81);
        java.io.InputStream inputStream86 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse87 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream86);
        java.io.InputStream inputStream88 = commandResponse87.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap89 = commandResponse87.toMap();
        commandResponse27.putAll(strMap89);
        java.lang.Object obj91 = commandResponse3.put("", (java.lang.Object) strMap89);
        java.util.Map<java.lang.String, java.lang.String> strMap92 = commandResponse3.getHeaders();
        int int93 = commandResponse3.getStatusCode();
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(inputStream44);
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + true + "'", obj46, true);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(inputStream67);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + true + "'", obj69, true);
        org.junit.Assert.assertNotNull(strMap77);
        org.junit.Assert.assertNull(inputStream80);
        org.junit.Assert.assertNotNull(strMap81);
        org.junit.Assert.assertNull(inputStream88);
        org.junit.Assert.assertNotNull(strMap89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = commandResponse10.toMap();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "command" + "'", str15, "command");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        // The following exception was thrown during execution in test generation
        try {
            commandResponse12.putAll(strMap22);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) 'a');
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) -1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", 100);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.lang.Object obj11 = commandResponse4.put("command", (java.lang.Object) 10.0f);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = commandResponse4.toMap();
        java.lang.String str13 = commandResponse4.getCommand();
        commandResponse4.addHeader("", "hi!");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("command", "hi!", (int) '4', inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        commandResponse3.addHeader("hi!", "");
        java.lang.String str8 = commandResponse3.getCommand();
        java.lang.String str9 = commandResponse3.getCommand();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        java.lang.String str30 = commandResponse1.getError();
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
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 10, inputStream3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse4.getHeaders();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = commandResponse4.getHeaders();
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 200);
        java.lang.String str4 = commandResponse3.getCommand();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        commandResponse1.addHeader("error", "");
        java.lang.String str51 = commandResponse1.getCommand();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = commandResponse3.getHeaders();
        java.io.InputStream inputStream6 = commandResponse3.getInputStream();
        java.io.InputStream inputStream7 = commandResponse3.getInputStream();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 32);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) '#', inputStream3);
        commandResponse4.addHeader("hi!", "");
        java.io.InputStream inputStream8 = commandResponse4.getInputStream();
        int int9 = commandResponse4.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse4.toMap();
        java.lang.String str11 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.io.InputStream inputStream35 = null;
        commandResponse4.setInputStream(inputStream35);
        java.io.InputStream inputStream37 = commandResponse4.getInputStream();
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
        org.junit.Assert.assertNull(inputStream37);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream10 = commandResponse4.getInputStream();
        java.lang.String str11 = commandResponse4.getError();
        java.lang.String str12 = commandResponse4.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
        java.io.InputStream inputStream5 = null;
        commandResponse3.setInputStream(inputStream5);
        commandResponse3.setStatusCode(1);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (-1), inputStream13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse14.toMap();
        java.lang.Object obj16 = commandResponse3.put("command", (java.lang.Object) commandResponse14);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (short) 0, inputStream20);
        java.io.InputStream inputStream22 = null;
        commandResponse21.setInputStream(inputStream22);
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse21.toMap();
        commandResponse3.putAll(strMap24);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        commandResponse4.addHeader("error", "hi!");
        java.lang.String str9 = commandResponse4.getError();
        int int10 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "error" + "'", str9, "error");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        java.io.InputStream inputStream44 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse45 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) (byte) -1, inputStream44);
        java.io.InputStream inputStream49 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream49);
        java.io.InputStream inputStream55 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream55);
        java.io.InputStream inputStream57 = commandResponse56.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap58 = commandResponse56.toMap();
        commandResponse56.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = commandResponse56.getHeaders();
        java.lang.String str63 = commandResponse56.getCommand();
        java.lang.Object obj64 = commandResponse50.put("", (java.lang.Object) str63);
        java.util.Map<java.lang.String, java.lang.Object> strMap65 = commandResponse50.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap66 = commandResponse50.toMap();
        commandResponse45.putAll(strMap66);
        commandResponse3.putAll(strMap66);
        java.lang.String str69 = commandResponse3.getCommand();
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
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertNotNull(strMap66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) ' ', inputStream3);
        commandResponse4.setStatusCode((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = commandResponse4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        int int6 = commandResponse4.getStatusCode();
        commandResponse4.setStatusCode((int) (short) 100);
        java.io.InputStream inputStream9 = commandResponse4.getInputStream();
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 1, inputStream14);
        int int16 = commandResponse15.getStatusCode();
        java.io.InputStream inputStream17 = null;
        commandResponse15.setInputStream(inputStream17);
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
        java.lang.Object obj41 = commandResponse24.put("hi!", obj40);
        java.io.InputStream inputStream45 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream45);
        java.io.InputStream inputStream47 = commandResponse46.getInputStream();
        int int48 = commandResponse46.getStatusCode();
        commandResponse46.setStatusCode((int) (short) 100);
        commandResponse46.setStatusCode(0);
        commandResponse46.setStatusCode((int) (byte) 1);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse56 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj59 = commandResponse56.put("", (java.lang.Object) true);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse61 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj64 = commandResponse61.put("", (java.lang.Object) true);
        java.io.InputStream inputStream69 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse70 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream69);
        java.io.InputStream inputStream71 = commandResponse70.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = commandResponse70.toMap();
        java.lang.Object obj73 = commandResponse61.put("", (java.lang.Object) strMap72);
        commandResponse56.putAll(strMap72);
        commandResponse46.putAll(strMap72);
        commandResponse24.putAll(strMap72);
        java.lang.Object obj77 = commandResponse15.put("error", (java.lang.Object) strMap72);
        commandResponse15.setStatusCode(0);
        java.lang.Object obj80 = commandResponse4.put("command", (java.lang.Object) commandResponse15);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(inputStream25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNull(inputStream34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(strMap72);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + true + "'", obj73, true);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "hi!", (int) (short) 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        commandResponse4.addHeader("hi!", "");
        int int8 = commandResponse4.getStatusCode();
        java.lang.String str9 = commandResponse4.getError();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        java.lang.String str11 = commandResponse4.getCommand();
        java.lang.String str12 = commandResponse4.getCommand();
        int int13 = commandResponse4.getStatusCode();
        java.io.InputStream inputStream17 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse18 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream17);
        int int19 = commandResponse18.getStatusCode();
        java.io.InputStream inputStream20 = commandResponse18.getInputStream();
        commandResponse18.setStatusCode(200);
        java.io.InputStream inputStream26 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream26);
        java.io.InputStream inputStream28 = commandResponse27.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse27.toMap();
        commandResponse27.addHeader("", "");
        java.io.InputStream inputStream36 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse37 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream36);
        java.io.InputStream inputStream38 = commandResponse37.getInputStream();
        java.lang.Object obj41 = commandResponse37.put("", (java.lang.Object) (byte) 10);
        java.lang.String str42 = commandResponse37.getCommand();
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = commandResponse37.toMap();
        commandResponse27.putAll(strMap43);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse46 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        java.io.InputStream inputStream47 = commandResponse46.getInputStream();
        java.lang.String str48 = commandResponse46.getError();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse50 = new org.apache.zookeeper.server.admin.CommandResponse("");
        java.lang.Object obj53 = commandResponse50.put("", (java.lang.Object) true);
        java.io.InputStream inputStream58 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse59 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream58);
        java.io.InputStream inputStream60 = commandResponse59.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = commandResponse59.toMap();
        java.lang.Object obj62 = commandResponse50.put("", (java.lang.Object) strMap61);
        commandResponse46.putAll(strMap61);
        commandResponse27.putAll(strMap61);
        java.io.InputStream inputStream68 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse69 = new org.apache.zookeeper.server.admin.CommandResponse("command", "error", 1, inputStream68);
        java.io.InputStream inputStream74 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse75 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream74);
        int int76 = commandResponse75.getStatusCode();
        java.lang.Object obj77 = commandResponse69.put("error", (java.lang.Object) int76);
        java.util.Map<java.lang.String, java.lang.Object> strMap78 = commandResponse69.toMap();
        commandResponse27.putAll(strMap78);
        commandResponse18.putAll(strMap78);
        commandResponse4.putAll(strMap78);
        commandResponse4.setStatusCode(35);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNull(inputStream28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(inputStream38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(inputStream60);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + true + "'", obj62, true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(strMap78);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        commandResponse4.addHeader("hi!", "");
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(inputStream17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.io.InputStream inputStream27 = null;
        commandResponse4.setInputStream(inputStream27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = commandResponse4.toMap();
        org.junit.Assert.assertNull(inputStream7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(inputStream20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", (int) (byte) 10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) '4', inputStream3);
        java.lang.String str5 = commandResponse4.getError();
        java.io.InputStream inputStream6 = null;
        commandResponse4.setInputStream(inputStream6);
        java.lang.String str8 = commandResponse4.getCommand();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "error" + "'", str5, "error");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 10);
        commandResponse3.setStatusCode((int) (short) 10);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("command", "command", (int) (byte) 100);
        java.io.InputStream inputStream4 = commandResponse3.getInputStream();
        java.lang.String str5 = commandResponse3.getError();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertNull(inputStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "command" + "'", str5, "command");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.io.InputStream inputStream47 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse48 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream47);
        java.io.InputStream inputStream49 = commandResponse48.getInputStream();
        int int50 = commandResponse48.getStatusCode();
        commandResponse48.setStatusCode((int) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = commandResponse48.getHeaders();
        commandResponse48.setStatusCode((int) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = commandResponse48.getHeaders();
        int int57 = commandResponse48.getStatusCode();
        commandResponse48.setStatusCode((int) 'a');
        java.util.Map<java.lang.String, java.lang.String> strMap60 = commandResponse48.getHeaders();
        java.lang.Object obj61 = commandResponse1.put("", (java.lang.Object) commandResponse48);
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
        org.junit.Assert.assertNull(inputStream49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(strMap53);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (byte) 10 + "'", obj61, (byte) 10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 0);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) (short) 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.lang.Object obj8 = commandResponse4.put("hi!", (java.lang.Object) 10L);
        commandResponse4.setStatusCode((int) (short) 1);
        commandResponse4.setStatusCode(0);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse4.getHeaders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(inputStream6);
        org.junit.Assert.assertNull(inputStream9);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNull(inputStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        commandResponse4.addHeader("", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = commandResponse4.getHeaders();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", 1);
        java.lang.Object obj16 = commandResponse4.put("", (java.lang.Object) 1);
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream20);
        java.io.InputStream inputStream22 = commandResponse21.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = commandResponse21.toMap();
        java.io.InputStream inputStream28 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse29 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream28);
        java.io.InputStream inputStream30 = commandResponse29.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = commandResponse29.toMap();
        commandResponse21.putAll(strMap31);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = commandResponse21.getHeaders();
        java.io.InputStream inputStream38 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse39 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream38);
        java.io.InputStream inputStream40 = commandResponse39.getInputStream();
        int int41 = commandResponse39.getStatusCode();
        commandResponse39.setStatusCode((int) (short) 100);
        java.lang.Object obj46 = commandResponse39.put("command", (java.lang.Object) 10.0f);
        java.lang.String str47 = commandResponse39.getError();
        java.lang.Object obj48 = commandResponse21.put("error", (java.lang.Object) str47);
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = commandResponse21.toMap();
        commandResponse4.putAll(strMap49);
        java.io.InputStream inputStream54 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse55 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 0, inputStream54);
        java.io.InputStream inputStream56 = commandResponse55.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap57 = commandResponse55.toMap();
        commandResponse4.putAll(strMap57);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(inputStream22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(inputStream40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNull(inputStream56);
        org.junit.Assert.assertNotNull(strMap57);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = commandResponse3.getHeaders();
        java.lang.String str5 = commandResponse3.getError();
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) (byte) 100, inputStream9);
        java.lang.String str11 = commandResponse10.getError();
        java.lang.String str12 = commandResponse10.getCommand();
        commandResponse10.setStatusCode((int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = commandResponse10.toMap();
        commandResponse3.putAll(strMap15);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "command" + "'", str11, "command");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error" + "'", str12, "error");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        java.lang.String str22 = commandResponse4.getError();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (int) (byte) -1, inputStream3);
        java.io.InputStream inputStream9 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse10 = new org.apache.zookeeper.server.admin.CommandResponse("", "command", (int) (short) 10, inputStream9);
        java.io.InputStream inputStream14 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse15 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", 100, inputStream14);
        java.lang.String str16 = commandResponse15.getCommand();
        java.io.InputStream inputStream20 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse21 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", (int) '#', inputStream20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = commandResponse21.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = commandResponse21.toMap();
        commandResponse15.putAll(strMap23);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = commandResponse15.toMap();
        commandResponse10.putAll(strMap25);
        java.lang.Object obj27 = commandResponse4.put("", (java.lang.Object) commandResponse10);
        java.util.Map<java.lang.String, java.lang.String> strMap28 = commandResponse10.getHeaders();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "error" + "'", str16, "error");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.io.InputStream inputStream22 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse23 = new org.apache.zookeeper.server.admin.CommandResponse("command", "", (int) (short) 10, inputStream22);
        org.apache.zookeeper.server.admin.CommandResponse commandResponse27 = new org.apache.zookeeper.server.admin.CommandResponse("error", "", (int) '#');
        java.io.InputStream inputStream31 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse32 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream31);
        java.io.InputStream inputStream33 = commandResponse32.getInputStream();
        java.lang.Object obj36 = commandResponse32.put("", (java.lang.Object) (byte) 10);
        java.lang.String str37 = commandResponse32.getCommand();
        java.lang.String str38 = commandResponse32.getCommand();
        java.lang.String str39 = commandResponse32.getCommand();
        org.apache.zookeeper.server.admin.CommandResponse commandResponse42 = new org.apache.zookeeper.server.admin.CommandResponse("hi!");
        int int43 = commandResponse42.getStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap44 = commandResponse42.toMap();
        java.lang.Object obj45 = commandResponse32.put("error", (java.lang.Object) strMap44);
        commandResponse27.putAll(strMap44);
        commandResponse23.putAll(strMap44);
        commandResponse4.putAll(strMap44);
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(inputStream15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(inputStream33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "hi!", (int) (byte) 1, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse4.toMap();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = commandResponse4.toMap();
        java.lang.Object obj10 = commandResponse4.put("", (java.lang.Object) false);
        java.lang.String str11 = commandResponse4.getError();
        java.io.InputStream inputStream12 = null;
        commandResponse4.setInputStream(inputStream12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = commandResponse4.getHeaders();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "error", (int) (short) 100);
        commandResponse3.addHeader("error", "error");
        commandResponse3.setStatusCode((int) (byte) 1);
        int int9 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 10, inputStream3);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.io.InputStream inputStream17 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(inputStream13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(inputStream17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", 0);
        commandResponse3.setStatusCode(10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.io.InputStream inputStream7 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse8 = new org.apache.zookeeper.server.admin.CommandResponse("", "error", (int) ' ', inputStream7);
        java.io.InputStream inputStream13 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse14 = new org.apache.zookeeper.server.admin.CommandResponse("", "hi!", 1, inputStream13);
        int int15 = commandResponse14.getStatusCode();
        java.io.InputStream inputStream16 = commandResponse14.getInputStream();
        commandResponse14.setStatusCode(200);
        java.io.InputStream inputStream19 = commandResponse14.getInputStream();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = commandResponse14.toMap();
        java.lang.Object obj21 = commandResponse8.put("error", (java.lang.Object) strMap20);
        commandResponse3.putAll(strMap20);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(inputStream16);
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", (int) (short) 0, inputStream3);
        java.io.InputStream inputStream5 = commandResponse4.getInputStream();
        org.junit.Assert.assertNull(inputStream5);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.util.Map<java.lang.String, java.lang.String> strMap46 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap46);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("", "", (int) (byte) 1);
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        int int6 = commandResponse3.getStatusCode();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int24 = commandResponse4.getStatusCode();
        org.junit.Assert.assertNull(inputStream5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(inputStream18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
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
        java.util.Map<java.lang.String, java.lang.String> strMap63 = commandResponse4.getHeaders();
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
        org.junit.Assert.assertNotNull(strMap63);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.io.InputStream inputStream3 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse4 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "", (-1), inputStream3);
        java.io.InputStream inputStream8 = null;
        org.apache.zookeeper.server.admin.CommandResponse commandResponse9 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "error", 10, inputStream8);
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = commandResponse9.toMap();
        commandResponse4.putAll(strMap10);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = commandResponse4.toMap();
        java.lang.String str28 = commandResponse4.getCommand();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("hi!", "command", 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = commandResponse3.toMap();
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
        commandResponse3.putAll(strMap23);
        java.lang.Class<?> wildcardClass25 = commandResponse3.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(inputStream10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(inputStream19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse1 = new org.apache.zookeeper.server.admin.CommandResponse("command");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = commandResponse1.getHeaders();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = commandResponse1.toMap();
        java.io.InputStream inputStream4 = null;
        commandResponse1.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse1.toMap();
        java.io.InputStream inputStream7 = null;
        commandResponse1.setInputStream(inputStream7);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.zookeeper.server.admin.CommandResponse commandResponse3 = new org.apache.zookeeper.server.admin.CommandResponse("error", "command", (int) 'a');
        java.io.InputStream inputStream4 = null;
        commandResponse3.setInputStream(inputStream4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = commandResponse3.toMap();
        org.junit.Assert.assertNotNull(strMap6);
    }
}

