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
        super("Mi primer ventana"); // mandamos llamar constructor de JFrame para titulo de ventana
        setLocation(50, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200); // Un poco más ancha para que quepa bien la etiqueta
        this.getContentPane().setBackground(Color.RED);
        
        // Creación de panel
        Panel X = new Panel();
        
        // ETIQUETAS
        JLabel etiquetal = new JLabel("Introduce tu nombre");
        etiquetal.setForeground(Color.BLACK);
        etiquetal.setFont(new Font("Arial", Font.BOLD, 28));
        
        // ENTRADA DE TEXTO
        JTextField entradaT = new JTextField(20);
        entradaT.setBounds(50, 200, 200, 50);
        
        // BOTÓN Y ACCIÓN DEL EVENTO //tarea 27-10-2026
        JButton miBoton = new JButton("Mostrar texto");
        miBoton.addActionListener(e -> {
            // Imprime en la consola lo que se escribió en el JTextField
            System.out.println("Texto ingresado: " + entradaT.getText());
        });
        
        // Agregar todo al panel X y luego el panel a la ventana
        X.add(etiquetal);
        X.add(entradaT);
        X.add(miBoton);
        add(X);
        
        // Hacer visible la ventana al final, cuando ya tiene todos los elementos
        setVisible(true);
        
    } // constructor VentanaHola
    
    public static void main(String[] args) {
        new VentanaHola();
    } // main
} // clase VentanaHola
