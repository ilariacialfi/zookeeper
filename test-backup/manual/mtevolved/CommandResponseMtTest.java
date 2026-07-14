package org.apache.zookeeper.test.manual.mtevolved;

import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.apache.zookeeper.server.admin.CommandResponse;


public class CommandResponseMtTest {
    @Test
    // Verifico che quando non c'è errore, toMap() produca una mappa con command corretto (error=null) e tutti i dati extra aggiunti a mano.
    public void testToMap_withErrorNull() {
        CommandResponse response = new CommandResponse("testCommand");
        response.put("key1", "value1");
        Map<String, Object> result = response.toMap();
        assertEquals("testCommand", result.get(CommandResponse.KEY_COMMAND));
        assertEquals(null, result.get(CommandResponse.KEY_ERROR));
        assertEquals("value1", result.get("key1"));
    }

    @Test
    // Verifico che quando c'è un errore, toMap() produca una mappa con command corretto e error "some error".
    public void testToMap_withErrorPresent() {
        CommandResponse response = new CommandResponse("testCommand", "some error", 500);
        Map<String, Object> result = response.toMap();
        assertEquals("testCommand", result.get(CommandResponse.KEY_COMMAND));
        assertEquals("some error", result.get(CommandResponse.KEY_ERROR));
    }

    // Test aggiunti dopo l'analisi con JaCoCo
    @Test
    public void testGetCommand() {
        CommandResponse response = new CommandResponse("testCommand");
        assertEquals("testCommand", response.getCommand());
    }

    @Test
    public void testSetStatusCode() {
        CommandResponse response = new CommandResponse("testCommand");
        response.setStatusCode(404);
        assertEquals(404, response.getStatusCode());
    }

    // Test aggiunto dopo analisi PIT
    @Test
    public void testPut_returnsPreviousValue() {
        CommandResponse response = new CommandResponse("testCommand");
        Object firstResult = response.put("key1", "value1");
        assertEquals(null, firstResult); // prima chiamata, nessun valore precedente

        Object secondResult = response.put("key1", "value2");
        assertEquals("value1", secondResult); // seconda chiamata, restituisce il vecchio valore
    }
}
