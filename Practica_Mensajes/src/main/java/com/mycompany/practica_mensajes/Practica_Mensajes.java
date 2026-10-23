/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica_mensajes;

/**
 *
 * @author oscar
 */
import javax.swing.*;
import java.util.*;

public class Practica_Mensajes {

    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        String nombre;
        int opc;
        /*
        System.out.println("Ingresa tu nombre");
        nombre=sn.nextLine();
        JOptionPane.showMessageDialog(null, "tu nombre es: "+ nombre, "Mi primer ventana", 2);
        */
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Capturar \n 2. Mostrar \n 3. Salir", "Mi primer ventana",  1));
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + opc, "VENTANA", 2);
        opc = JOptionPane.showConfirmDialog(null, "¿Estas seguro?");
    }
}
