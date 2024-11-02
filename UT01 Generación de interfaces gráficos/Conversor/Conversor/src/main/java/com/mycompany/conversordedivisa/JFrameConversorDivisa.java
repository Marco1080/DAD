
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversordedivisa;
/**
 *
 * @author tonyi
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JFrameConversorDivisa extends javax.swing.JFrame {

    public JFrameConversorDivisa() {
        initComponents();
    }

    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jComboBoxConversion = new javax.swing.JComboBox<>();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jButtonConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Divisas");
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);

        jPanelMain.setBackground(new Color(240, 248, 255));
        jPanelMain.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        jComboBoxConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Euros a dolar", "Dolar a euros" }));
        jComboBoxConversion.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jComboBoxConversion.setForeground(new Color(60, 63, 65));
        jComboBoxConversion.setBackground(new Color(224, 224, 224));
        jComboBoxConversion.setBorder(new LineBorder(new Color(173, 216, 230), 1, true));
        jComboBoxConversion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actualizarCampo();
            }
        });

        jTextFieldValor.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jTextFieldValor.setHorizontalAlignment(JTextField.RIGHT);
        jTextFieldValor.setForeground(new Color(60, 63, 65));
        jTextFieldValor.setBackground(new Color(224, 224, 224));
        jTextFieldValor.setBorder(new LineBorder(new Color(173, 216, 230), 1, true));

        jLabelResultado.setFont(new Font("Segoe UI", Font.BOLD, 16));
        jLabelResultado.setForeground(new Color(0, 128, 128));
        jLabelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelResultado.setText("Resultado:");
        jLabelResultado.setOpaque(true);
        jLabelResultado.setBackground(new Color(240, 248, 255));
        jLabelResultado.setBorder(new EmptyBorder(10, 0, 10, 0));

        jButtonConvertir.setText("Convertir");
        jButtonConvertir.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        jButtonConvertir.setForeground(Color.WHITE);
        jButtonConvertir.setBackground(new Color(70, 130, 180));
        jButtonConvertir.setFocusPainted(false);
        jButtonConvertir.setBorder(new LineBorder(new Color(60, 179, 113), 1, true));
        jButtonConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                convertirDivisa();
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBoxConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBoxConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelResultado)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void actualizarCampo() {
        jTextFieldValor.setText("");
    }

    private void convertirDivisa() {
        try {
            double valor = Double.parseDouble(jTextFieldValor.getText());
            String seleccion = (String) jComboBoxConversion.getSelectedItem();
            double resultado;

            if ("Euros a dolar".equals(seleccion)) {
                resultado = valor * 1.1;
                jLabelResultado.setText(String.format("Resultado: %.2f USD", resultado));
            } else {
                resultado = valor * 0.91;
                jLabelResultado.setText(String.format("Resultado: %.2f EUR", resultado));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameConversorDivisa().setVisible(true);
        });
    }

    private javax.swing.JButton jButtonConvertir;
    private javax.swing.JComboBox<String> jComboBoxConversion;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldValor;
}
