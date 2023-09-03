/*package Pruebas;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;

public class PanelManagerTest {
    private JPanel contentPanel;
    private PanelManager panelManager;

    @Before
    public void setUp() {
        // Configurar el contentPanel y crear una instancia de PanelManager antes de cada prueba
        contentPanel = new JPanel();
        panelManager = new PanelManager(contentPanel);
    }

    @Test
    public void testAddPanel() {
        JPanel panel = new JPanel();
        panelManager.addPanel("testPanel", panel);

        assertTrue(panelManager.getPanels().containsKey("testPanel"));
        assertEquals(panel, panelManager.getPanels().get("testPanel"));
    }

    @Test
    public void testShowPanel() {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panelManager.addPanel("panel1", panel1);
        panelManager.addPanel("panel2", panel2);

        panelManager.showPanel("panel1");
        assertEquals(panel1, contentPanel.getComponent(0));

        panelManager.showPanel("panel2");
        assertEquals(panel2, contentPanel.getComponent(0));
    }
}
*/