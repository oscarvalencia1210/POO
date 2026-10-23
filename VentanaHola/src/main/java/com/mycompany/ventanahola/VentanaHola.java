/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanahola;
import javax.swing.*;
import java.awt.*;


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
        
        X.add(etiquetal);
        X.add (entradaT);
        add (X);
        
        
    }//constructor VentanaHola
    
    
    public static void main(String[] args) {
        new VentanaHola();
        
    }//main
}//clase VentanaHola
