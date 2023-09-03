package Pruebas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArreglosCola extends JPanel {
    private PanelPrincipal panelPrincipal;
    private JPanel formularioPanel;
    private JTextField elementoTextField;
    private JButton guardarButton;

    public ArreglosCola(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        setLayout(new BorderLayout());

        mostrarFormulario(false); // Inicia ocultando el formulario
    }

    private void mostrarFormulario(boolean mostrar) {
        removeAll();

        if (mostrar) {
            formularioPanel = new JPanel(new GridLayout(0, 2));

            formularioPanel.add(new JLabel("Ingrese el elemento a agregar:"));
            elementoTextField = new JTextField(10);
            formularioPanel.add(elementoTextField);

            guardarButton = new JButton("Guardar");
            formularioPanel.add(guardarButton);

            guardarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String elemento = elementoTextField.getText();
                    if (!elemento.isEmpty()) {
                        System.out.println("Elemento capturado: " + elemento);
                    }
                }
            });

            add(formularioPanel, BorderLayout.CENTER);
        } else {
            JPanel buttonsPanel = new JPanel(new FlowLayout());
            JButton botonArreglos = new JButton("Arreglos");
            botonArreglos.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelPrincipal.mostrarPanel("arreglos");
                }
            });
            JButton botonCola = new JButton("Cola");
            botonCola.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelPrincipal.mostrarPanel("cola");
                }
            });
            buttonsPanel.add(botonArreglos);
            buttonsPanel.add(botonCola);

            add(buttonsPanel, BorderLayout.NORTH);
        }

        revalidate();
        repaint();
    }
}
