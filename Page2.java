package Pruebas;

import javax.swing.*;
import java.awt.*;

public class Page2 extends JPanel {

    private javax.swing.JTextField Campostxt;
    private javax.swing.JTextField Campostxt1;
    private javax.swing.JLabel campoLBL;
    private javax.swing.JLabel CamposLBL1;

    public Page2() {
        initComponents();
    }

    private void initComponents() {
        campoLBL = new javax.swing.JLabel();
        Campostxt = new javax.swing.JTextField();
        CamposLBL1 = new javax.swing.JLabel();
        Campostxt1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(216, 255, 237));
        setMinimumSize(new java.awt.Dimension(490, 258));

        campoLBL.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        campoLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        campoLBL.setText("Ingrese un dato:   ");

        Campostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampostxtActionPerformed(evt);
            }
        });

        CamposLBL1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        CamposLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CamposLBL1.setText("Ingrese la cantidad de datos a tratar:");

        Campostxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campostxt1ActionPerformed(evt);
            }
        });

        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        add(CamposLBL1);
        add(Campostxt1);
        add(campoLBL);
        add(Campostxt);
    }

    private void CampostxtActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Campostxt1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
