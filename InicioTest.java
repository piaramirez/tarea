/*package Pruebas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class InicioTest {
    private Inicio inicio;

    @BeforeEach
    public void setUp() {
        inicio = new Inicio();
    }

    @Test
    public void testInicializarPagina() {
        inicio.inicializarPagina();

        assertEquals("page1", inicio.getPanelManager().getCurrentPanelName());
    }

    @Test
    public void testModificarJPanel() {
        JPanel panel = new JPanel(); // Crear un panel de prueba
        inicio.modificarJPanel(panel);

        // Asegurarse de que el panel actual en content sea el mismo que el panel de prueba
        assertEquals(panel, inicio.getContentPanel().getComponent(0));
    }

    @Test
    public void testBotones4Vis() {
        inicio.botones4Vis(true);

        // Asegurarse de que los botones regresarBTN, agregarDatoBTN, insertarBTN y verBTN estén visibles
        assertTrue(inicio.getRegresarBTN().isVisible());
        assertTrue(inicio.getAgregarDatoBTN().isVisible());
        assertTrue(inicio.getInsertarBTN().isVisible());
        assertTrue(inicio.getVerBTN().isVisible());
    }

    @Test
    public void testBotones2Vis() {
        inicio.botones2Vis(true);

        // Asegurarse de que los botones adiosBTN e ingresoDato estén visibles
        assertTrue(inicio.getAdiosBTN().isVisible());
        assertTrue(inicio.getIngresoDato().isVisible());
    }
}*/
