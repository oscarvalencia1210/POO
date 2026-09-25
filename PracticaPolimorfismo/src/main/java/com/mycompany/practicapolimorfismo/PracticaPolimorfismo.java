/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
import java.util.Scanner;
public class PracticaPolimorfismo {

    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        int menu;
        System.out.println("-- FIGURAS GEOMETRICAS --");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        System.out.println("INGRESA TU OPCION: ");
        menu = sn.nextInt();
        switch(menu) {
            case 1:
            {
                Cuadrado miCuadrado = new Cuadrado ("Cuadrado", "Rojo", 1, 0);
                System.out.println("Dame las medidas del lado");
                miCuadrado.lado = sn.nextInt();
                miCuadrado.dibujar();
                miCuadrado.perimetro();
                miCuadrado.area();
            }break;//case 1
            case 2:
            {
                Triangulo miTriangulo = new Triangulo ("Triangulo", "Azul", 1, 0, 0);
                System.out.println("Dame la base del triangulo:");
                miTriangulo.base = sn.nextInt();
                System.out.println("Dame la altura del triangulo:");
                miTriangulo.altura = sn.nextInt();
                miTriangulo.dibujar();
                miTriangulo.perimetro();
                miTriangulo.area();
            }break; //case 2
            case 3:
            {
                Circulo miCirculo = new Circulo ("Circulo", "Verde", 1, 0.0);
                System.out.println("Dame el radio del circulo:");
                miCirculo.radio = sn.nextDouble();
                miCirculo.dibujar();
                miCirculo.perimetro();
                miCirculo.area();
            }break;//case 3
            default: 
                System.out.println("Opción no válida.");
                break;
        }//switch
    }//main
}//clase polimorfismo
