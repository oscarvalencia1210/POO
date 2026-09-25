/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
public class Circulo extends Figuras_Geometricas{
    double radio;

    // Se agrega el parámetro radio al constructor
    public Circulo(String nombre, String color, int grosorBorde, double radio) {
        super(nombre, color, grosorBorde);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("\nDibujando un círculo...");
        System.out.println("      ***      ");
        System.out.println("   *       *   ");
        System.out.println("  *         *  ");
        System.out.println("  *         *  ");
        System.out.println("   *       *   ");
        System.out.println("      ***      \n");
    }

    @Override
    public void area() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("Area = " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro = " + perimetro);
    }
}