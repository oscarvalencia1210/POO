/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
public class Triangulo extends Figuras_Geometricas{
    int base, altura;
    
    // Se corrige el constructor para inicializar base y altura
    public Triangulo(String nombre, String color, int grosorBorde, int base, int altura) {
        super(nombre, color, grosorBorde);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        // Dibujo de un triángulo rectángulo usando la altura
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    @Override
    public void area() {
        double area = (base * altura) / 2.0;
        System.out.println("Area = " + area);
    }

    @Override
    public void perimetro() {
        // Asumiendo triángulo rectángulo para calcular la hipotenusa
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        double perimetro = base + altura + hipotenusa;
        System.out.println("Perimetro = " + perimetro);
    }
}
