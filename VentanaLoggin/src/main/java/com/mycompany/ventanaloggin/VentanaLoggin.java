/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanaloggin;

/**
 *
 * @author oscar
 */
import java.awt.*;
import javax.swing.*;


public class VentanaLoggin extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnGuardar;
    private JButton btnEntrar;

    public VentanaLoggin() {
        setTitle("Login");
        setSize(550, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(220, 235, 220)); // Fondo azul claro

        // Etiqueta USUARIO:
        JLabel lblUsuario = new JLabel("USUARIO:", SwingConstants.CENTER);
        lblUsuario.setBounds(70, 45, 110, 30);
        lblUsuario.setOpaque(true);
        lblUsuario.setBackground(Color.WHITE);
        lblUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblUsuario.setFont(new Font("SansSerif", Font.PLAIN, 12));
        add(lblUsuario);

        // Caja de texto USUARIO
        txtUsuario = new JTextField();
        txtUsuario.setBounds(240, 38, 230, 45);
        txtUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtUsuario.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(txtUsuario);

        // Etiqueta CONTRASEÑA:
        JLabel lblContrasena = new JLabel("CONTRASEÑA:", SwingConstants.CENTER);
        lblContrasena.setBounds(70, 130, 115, 30);
        lblContrasena.setOpaque(true);
        lblContrasena.setBackground(Color.WHITE);
        lblContrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        lblContrasena.setFont(new Font("SansSerif", Font.PLAIN, 12));
        add(lblContrasena);

        // Caja de texto CONTRASEÑA
        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(240, 123, 230, 45);
        txtContrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        txtContrasena.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(txtContrasena);

        // Botón GUARDAR
        btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBounds(70, 225, 130, 45);
        btnGuardar.setBackground(new Color(146, 208, 80)); // Verde
        btnGuardar.setForeground(Color.BLACK);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setOpaque(true);
        btnGuardar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(btnGuardar);

        // Botón ENTRAR
        btnEntrar = new JButton("ENTRAR");
        btnEntrar.setBounds(300, 225, 130, 45);
        btnEntrar.setBackground(new Color(0, 112, 192)); // Azul
        btnEntrar.setForeground(Color.BLACK);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setOpaque(true);
        btnEntrar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(btnEntrar);

        // Acción del botón GUARDAR
        btnGuardar.addActionListener(e -> {
            String usuario = txtUsuario.getText().trim();
            String contrasena = new String(txtContrasena.getPassword()).trim();

            if (usuario.isEmpty() || contrasena.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese usuario y contraseña.");
                return;
            }

            if (UsuarioLoggin.existeUsuario(usuario)) {
                JOptionPane.showMessageDialog(this, "El usuario ya existe, ingrese contraseña.");
                txtContrasena.setText("");
                txtContrasena.requestFocus();
            } else {
                UsuarioLoggin.agregarUsuario(usuario, contrasena);
                JOptionPane.showMessageDialog(this, "Usuario guardado correctamente.");
                txtUsuario.setText("");
                txtContrasena.setText("");
            }
        });

        // Acción del botón ENTRAR
        btnEntrar.addActionListener(e -> {
            String usuario = txtUsuario.getText().trim();
            String contrasena = new String(txtContrasena.getPassword()).trim();

            if (UsuarioLoggin.validarCredenciales(usuario, contrasena)) {
                JOptionPane.showMessageDialog(this, "INICIO EXITOSO, BIENVENIDO "+usuario);
            } else {
                JOptionPane.showMessageDialog(this, "USUARIO O CONTRASEÑA INCORRECTOS");
            }
        });
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaLoggin().setVisible(true);
        });
    }
}
