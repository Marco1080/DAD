/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversordedivisa;
/**
 *
 * @author tonyi
 */

import java.awt.Color;
import java.awt.Font;

public class JFrameConversorTemperatura extends javax.swing.JFrame {

    public JFrameConversorTemperatura() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabelCelsius = new javax.swing.JLabel();
        jLabelFahrenheit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");
        setSize(400, 300);

        jPanelMain.setBackground(new Color(240, 240, 240));

        jSlider1.setMinimum(-100);
        jSlider1.setMaximum(100);
        jSlider1.setValue(0);
        jSlider1.setMajorTickSpacing(50);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);

        jSlider1.addChangeListener(evt -> {
            int celsius = jSlider1.getValue();
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            jLabelCelsius.setText("Celsius: " + celsius + "°C");
            jLabelFahrenheit.setText("Fahrenheit: " + String.format("%.2f", fahrenheit) + "°F");
        });

        jLabelCelsius.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelCelsius.setForeground(new Color(0, 102, 204));
        jLabelCelsius.setText("Celsius: 0°C");

        jLabelFahrenheit.setFont(new Font("Arial", Font.BOLD, 14));
        jLabelFahrenheit.setForeground(new Color(204, 51, 0));
        jLabelFahrenheit.setText("Fahrenheit: 32.00°F");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCelsius)
                    .addComponent(jLabelFahrenheit))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelCelsius)
                .addGap(10, 10, 10)
                .addComponent(jLabelFahrenheit)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameConversorTemperatura().setVisible(true);
        });
    }

    private javax.swing.JLabel jLabelCelsius;
    private javax.swing.JLabel jLabelFahrenheit;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JSlider jSlider1;
}
