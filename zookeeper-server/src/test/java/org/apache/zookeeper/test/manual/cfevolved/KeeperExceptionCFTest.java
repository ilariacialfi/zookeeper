package org.apache.zookeeper.test.manual.cfevolved;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.KeeperException.Code;

public class KeeperExceptionCFTest {

    @Test
    public void testGetMessage_pathNull() {
        KeeperException ex = KeeperException.create(Code.NONODE, null);
        assertEquals("KeeperErrorCode = NoNode", ex.getMessage());
    }

    @Test
    public void testGetMessage_pathEmpty() {
        KeeperException ex = KeeperException.create(Code.NONODE, "");
        assertEquals("KeeperErrorCode = NoNode", ex.getMessage());
    }

    @Test
    public void testGetMessage_pathValid() {
        KeeperException ex = KeeperException.create(Code.NONODE, "/config/data");
        assertEquals("KeeperErrorCode = NoNode for /config/data", ex.getMessage());
    }

    @Test
    public void testGetResults_nullByDefault() {
        KeeperException ex = KeeperException.create(Code.NONODE, "/config/data");
        assertEquals(null, ex.getResults());
    }

    @Test
    public void testCreate_mappedCode() {
        KeeperException ex = KeeperException.create(Code.NONODE);
        assertTrue(ex instanceof KeeperException.NoNodeException);
    }
    
    @Test
    public void testCreate_anotherMappedCode() {
        KeeperException ex = KeeperException.create(Code.BADVERSION);
        assertTrue(ex instanceof KeeperException.BadVersionException);
    }
    
    @Test
    public void testCreate_okThrowsIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> KeeperException.create(Code.OK));
    }

    @Test
    public void testCreateWithPath_assignsPath() {
        KeeperException ex = KeeperException.create(Code.NONODE, "/config/data");
        assertEquals("/config/data", ex.getPath());
    }

    @Test
    public void testCodeGet_validCode() {
        assertEquals(Code.OK, Code.get(0));
    }

    @Test
    public void testCodeGet_invalidCode() {
        assertThrows(IllegalArgumentException.class, () -> Code.get(9999));
    }

    // Test aggiunti dopo analisi con JaCoCo
    @Test
    @SuppressWarnings("deprecation")
    public void testGetCode_deprecated() {
        KeeperException ex = KeeperException.create(Code.NONODE);
        assertEquals(Code.NONODE.intValue(), ex.getCode());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testSetCode_deprecated() {
        KeeperException ex = KeeperException.create(Code.NONODE);
        ex.setCode(Code.BADVERSION.intValue());
        assertEquals(Code.BADVERSION, ex.code());
    }

}
