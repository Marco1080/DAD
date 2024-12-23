/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examen1dad;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2damb
 */
public class JFrameClientes extends javax.swing.JFrame {

    /**
     * Creates new form JFrameClientes
     */
    public JFrameClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCiudad = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonAccept = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerEdad = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Nombre");
        jPanel5.add(jLabel1);

        jTextFieldName.setBackground(new java.awt.Color(153, 153, 255));
        jTextFieldName.setColumns(10);
        jTextFieldName.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jTextFieldName);

        jPanelMain.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 275, -1));

        jLabel2.setText("Ciudad");

        jComboBoxCiudad.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxCiudad.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- --", "Santa Cruz", "La Laguna", "La Breña" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanelMain.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 44, 275, -1));

        jLabel3.setText("¿Aceptas las condiciones de uso?");
        jPanel1.add(jLabel3);

        buttonGroup1.add(jRadioButtonAccept);
        jRadioButtonAccept.setText("Si");
        jPanel1.add(jRadioButtonAccept);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);

        jPanelMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 275, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Edad actual");
        jLabel4.setToolTipText("");
        jPanel2.add(jLabel4);
        jPanel2.add(jSpinnerEdad);

        jPanelMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 275, -1));

        jButton1.setText("Cancelar");
        jPanel3.add(jButton1);

        jButton2.setText("Registrar cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanelMain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 189, 281, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String mensaje;
        if (jTextFieldName.getText().trim().isEmpty()) {
            mensaje = "Debe haber un nombre";
            JDialogAviso jdialogAviso = new JDialogAviso(this, true, mensaje);
            jdialogAviso.setVisible(true);
        }
        else if(jComboBoxCiudad.getSelectedItem() == "-- --") {
            mensaje = "Debe seleccionar una ciudad";
            JDialogAviso jdialogAviso = new JDialogAviso(this, true, mensaje);
            jdialogAviso.setVisible(true);
        }
        else if (!jRadioButtonAccept.isSelected()) {
            mensaje = "Debe aceptar los términos";
            JDialogAviso jdialogAviso = new JDialogAviso(this, true, mensaje);
            jdialogAviso.setVisible(true);
        }
        else {
            
            mensaje = "Registro con éxito";
            JDialogAviso jdialogAviso = new JDialogAviso(this, true, mensaje);
            jdialogAviso.setVisible(true);
            
            
            String[] listaDatosCliente = {jTextFieldName.getText().trim(), jComboBoxCiudad.getSelectedItem().toString(),jSpinnerEdad.getValue().toString()};
            JDialogDatosCliente jdialogDatosCliente = new JDialogDatosCliente(this, rootPaneCheckingEnabled, listaDatosCliente);
            jdialogDatosCliente.setVisible(true);
            
            try {
                Thread.sleep(500);
                jdialogAviso.setVisible(false);
                this.setVisible(false);
                JFrameZonaClientes jframeZonaClientes = new JFrameZonaClientes();
                this.setVisible(false);
                jframeZonaClientes.setVisible(true);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(JFrameClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButtonAccept;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
