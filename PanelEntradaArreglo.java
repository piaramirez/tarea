package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//NO SE OCUPA
public class PanelEntradaArreglo extends JPanel {
    private JTextField tamanoTextField;
    private JButton crearArregloButton;

    public PanelEntradaArreglo(ActionListener crearArregloListener) {
        setLayout(new FlowLayout());

        JLabel tamanoLabel = new JLabel("Tamaño del arreglo:");
        tamanoTextField = new JTextField(10);

        crearArregloButton = new JButton("Crear Arreglo");
        crearArregloButton.addActionListener(crearArregloListener);

        add(tamanoLabel);
        add(tamanoTextField);
        add(crearArregloButton);
    }

    public int getTamanoArreglo() {
        try {
            return Integer.parseInt(tamanoTextField.getText());
        } catch (NumberFormatException e) {
            return -1; // Valor inválido
        }
    }
}
