package com.mycompany.tiendamusica;

import javax.swing.*;
import java.awt.*;

public class JFrameBienvenida extends JFrame {

    public JFrameBienvenida() {
        setTitle("Bienvenid@");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 50, 70));
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        JButton btnInventario = new JButton("Inventario");
        estilizarBoton(btnInventario);
        btnInventario.addActionListener(e -> {
            new tiendaMusica().setVisible(true);
            dispose();
        });

        JButton btnAltaProducto = new JButton("Agregar producto");
        estilizarBoton(btnAltaProducto);
        btnAltaProducto.addActionListener(e -> {
            new JFrameAlta().setVisible(true);
            dispose();
        });

        panel.add(btnInventario);
        panel.add(btnAltaProducto);
        add(panel);
    }

    private void estilizarBoton(JButton boton) {
        boton.setBackground(new Color(200, 200, 255));
        boton.setForeground(Color.DARK_GRAY);
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
    }

    public static void main(String[] args) {
        new JFrameBienvenida().setVisible(true);
    }
}
