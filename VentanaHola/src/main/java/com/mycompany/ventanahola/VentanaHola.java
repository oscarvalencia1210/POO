/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanahola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

        super("Mi primer ventana");//mandamos llamar constructor de JFrame paraa titulo de ventana
        setLocation(50,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,200);
        setVisible(true);
        this.getContentPane().setBackground(Color.RED);
        //creacion de panel
        Panel X=new Panel();
        
        //ETIQUETAS
        JLabel etiquetal = new JLabel("Introduce tu nombre");
        etiquetal.setForeground(Color.BLACK);
        etiquetal.setFont(new Font("Arial", Font.BOLD, 28));
        add(etiquetal);

        //ENTRADA DE TEXTO
        JTextField  entradaT = new JTextField(20);
        entradaT.setBounds(50,200,200,50);
        
        //BOTON
        JButton boton = new JButton("Confirmar");
        //accion al boton
        boton.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                //accion que queremos que haga el boton
            }
        });

        X.add(etiquetal);
        X.add (entradaT);
        add (X);
        
    }//constructor VentanaHola

    public static void main(String[] args) {

        new VentanaHola();
    }//main

}//clase VentanaHola 
