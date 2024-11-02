package com.mycompany.tiendamusica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class tiendaMusica extends JFrame {

    public tiendaMusica() {
        setTitle("Tienda");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        String[] columnNames = {"Nombre", "Artista", "Género", "Precio", "Cantidad"};
        DefaultTableModel model = new DefaultTableModel(null, columnNames);
        JTable table = new JTable(model);

        JButton btnAgregar = new JButton("Agregar producto");
        estilizarBoton(btnAgregar);
        btnAgregar.addActionListener(e -> {
            new JFrameAlta().setVisible(true);
            dispose();
        });

        JButton btnEditar = new JButton("Editar producto");
        estilizarBoton(btnEditar);
        btnEditar.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String nombre = (String) model.getValueAt(selectedRow, 0);
                String artista = (String) model.getValueAt(selectedRow, 1);
                String genero = (String) model.getValueAt(selectedRow, 2);
                String precio = (String) model.getValueAt(selectedRow, 3);
                String cantidad = (String) model.getValueAt(selectedRow, 4);
                
                new JFrameEdicion(nombre, artista, genero, precio, cantidad).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Selecciona un producto para editar.");
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(50, 50, 70));
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void estilizarBoton(JButton boton) {
        boton.setBackground(new Color(200, 200, 255));
        boton.setForeground(Color.DARK_GRAY);
        boton.setFont(new Font("Arial", Font.BOLD, 16));
        boton.setFocusPainted(false);
    }
}
