package com.mycompany.tiendamusica;

import javax.swing.*;
import java.awt.*;

public class JFrameAlta extends JFrame {

    public JFrameAlta() {
        setTitle("Alta de producto");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 50, 70));
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setForeground(Color.WHITE);
        panel.add(lblNombre, gbc);
        
        gbc.gridx = 1; 
        panel.add(new JTextField(20), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        JLabel lblArtista = new JLabel("Artista:");
        lblArtista.setForeground(Color.WHITE);
        panel.add(lblArtista, gbc);
        
        gbc.gridx = 1; 
        panel.add(new JTextField(20), gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setForeground(Color.WHITE);
        panel.add(lblGenero, gbc);
        
        gbc.gridx = 1; 
        panel.add(new JTextField(20), gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setForeground(Color.WHITE);
        panel.add(lblPrecio, gbc);
        
        gbc.gridx = 1; 
        panel.add(new JTextField(10), gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setForeground(Color.WHITE);
        panel.add(lblCantidad, gbc);
        
        gbc.gridx = 1; 
        panel.add(new JTextField(10), gbc);

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        JButton btnGuardar = new JButton("Guardar");
        estilizarBoton(btnGuardar);
        btnGuardar.addActionListener(e -> {
            String nombre = ((JTextField) panel.getComponent(1)).getText();
            JOptionPane.showMessageDialog(this, "Producto " + nombre + " creado con éxito.");
            new tiendaMusica().setVisible(true);
            dispose();
        });
        panel.add(btnGuardar, gbc);

        add(panel);
    }

    private void estilizarBoton(JButton boton) {
        boton.setBackground(new Color(200, 200, 255));
        boton.setForeground(Color.DARK_GRAY);
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
    }
}
