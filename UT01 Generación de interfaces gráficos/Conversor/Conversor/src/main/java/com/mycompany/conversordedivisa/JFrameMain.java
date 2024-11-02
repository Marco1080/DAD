
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
import javax.swing.border.LineBorder;

public class JFrameMain extends javax.swing.JFrame {

    public JFrameMain() {
        initComponents();
        addEventListeners();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jButtonTemperatura = new javax.swing.JButton();
        jButtonDivisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Conversores");
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);

        jPanelMain.setBackground(new Color(240, 248, 255));
        jPanelMain.setLayout(new GridLayout(2, 1, 10, 10));
        jPanelMain.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        jButtonTemperatura.setText("Conversor de temperatura");
        jButtonTemperatura.setFont(new Font("Segoe UI", Font.BOLD, 18));
        jButtonTemperatura.setForeground(Color.WHITE);
        jButtonTemperatura.setBackground(new Color(70, 130, 180));
        jButtonTemperatura.setFocusPainted(false);
        jButtonTemperatura.setBorder(new LineBorder(new Color(60, 179, 113), 1, true));

        jButtonDivisa.setText("Conversor de divisa");
        jButtonDivisa.setFont(new Font("Segoe UI", Font.BOLD, 18));
        jButtonDivisa.setForeground(Color.WHITE);
        jButtonDivisa.setBackground(new Color(30, 144, 255));
        jButtonDivisa.setFocusPainted(false);
        jButtonDivisa.setBorder(new LineBorder(new Color(123, 104, 238), 1, true));

        jPanelMain.add(jButtonTemperatura);
        jPanelMain.add(jButtonDivisa);

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

    private void addEventListeners() {
        jButtonTemperatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameConversorTemperatura frameTemperatura = new JFrameConversorTemperatura();
                frameTemperatura.setVisible(true);
            }
        });

        jButtonDivisa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrameConversorDivisa frameDivisa = new JFrameConversorDivisa();
                frameDivisa.setVisible(true);
            }
        });
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonTemperatura;
    private javax.swing.JButton jButtonDivisa;
    private javax.swing.JPanel jPanelMain;
}
