/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanahola;
import javax.swing.*;
import java.awt.*;
/*¿Cómo se hace un botón?
// 1. Crear el botón
JButton miBoton = new JButton("Texto del Botón");

// 2. Definir la acción al hacer clic (usando una expresión lambda)
miBoton.addActionListener(e -> {
    // Código que se ejecuta al presionar el botón
});
*/

/**
 *
 * @author oscar
 */
public class VentanaHola extends JFrame {

    public VentanaHola() {
        super("Mi primera ventana"); // Título de la ventana
        setLocation(50, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250); // Ampliamos un poco el tamaño para acomodar los nuevos elementos
        this.getContentPane().setBackground(new Color(45, 52, 54));

        // Creando un panel de Swing (JPanel) en lugar de java.awt.Panel
        JPanel panel = new JPanel();
        panel.setLayout(null); // Usamos diseño nulo para posicionar con setBounds
        panel.setBackground(new Color(45, 52, 54));

        // Creación de la etiqueta de instrucción
        JLabel etiqueta1 = new JLabel("Introduce tu nombre:");
        etiqueta1.setForeground(Color.WHITE);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 14));
        etiqueta1.setBounds(20, 20, 250, 25);
        panel.add(etiqueta1);

        // Crear una entrada de texto
        JTextField entradaT = new JTextField(15);
        entradaT.setBounds(20, 55, 230, 30);
        panel.add(entradaT);

        // 1. Crear el botón
        JButton boton = new JButton("CONFIRMAR");
        boton.setBounds(20, 100, 230, 30);
        panel.add(boton);

        // Etiqueta donde se imprimirá el resultado
        JLabel etiquetaResultado = new JLabel("");
        etiquetaResultado.setForeground(Color.WHITE);
        etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 14));
        etiquetaResultado.setBounds(20, 145, 230, 30);
        panel.add(etiquetaResultado);

        // 2. Agregar la acción al botón (Listener)
        boton.addActionListener(e -> {
            String nombre = entradaT.getText(); // Captura lo escrito en el JTextField
            etiquetaResultado.setText("¡Hola, " + nombre + "!"); // Lo imprime en el JLabel
        });

        // Agregar el panel a la ventana
        add(panel);
        
        // setVisible(true) siempre debe ir al final para que pinte todos los componentes correctamente
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaHola();
    }
}
