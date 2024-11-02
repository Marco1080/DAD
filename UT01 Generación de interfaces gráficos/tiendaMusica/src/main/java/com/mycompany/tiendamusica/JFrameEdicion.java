package com.mycompany.tiendamusica;

import javax.swing.*;
import java.awt.*;

public class JFrameEdicion extends JFrame {

    public JFrameEdicion(String nombre, String artista, String genero, String precio, String cantidad) {
        setTitle("Edición de producto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 50, 70));
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        JTextField txtNombre = new JTextField(nombre, 15);
        JTextField txtArtista = new JTextField(artista, 15);
        JTextField txtGenero = new JTextField(genero, 15);
        JTextField txtPrecio = new JTextField(precio, 10);
        JTextField txtCantidad = new JTextField(cantidad, 10);

        JButton btnGuardar = new JButton("Guardar Cambios");
        estilizarBoton(btnGuardar);
        btnGuardar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Producto " + txtNombre.getText() + " editado con éxito.");
            new tiendaMusica().setVisible(true);
            dispose();
        });

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Artista:"));
        panel.add(txtArtista);
        panel.add(new JLabel("Género:"));
        panel.add(txtGenero);
        panel.add(new JLabel("Precio:"));
        panel.add(txtPrecio);
        panel.add(new JLabel("Cantidad:"));
        panel.add(txtCantidad);
        panel.add(new JLabel());
        panel.add(btnGuardar);
        add(panel);
    }

    private void estilizarBoton(JButton boton) {
        boton.setBackground(new Color(200, 200, 255));
        boton.setForeground(Color.DARK_GRAY);
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
    }
}

