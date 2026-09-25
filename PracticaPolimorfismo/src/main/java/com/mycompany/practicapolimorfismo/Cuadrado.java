/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
public class Cuadrado extends Figuras_Geometricas{

    int lado;

    public Cuadrado(String nombre, String color, int grosorBorde, int lado ) {
        super(nombre, color, grosorBorde);
        this.lado = lado;
    }
    
    @Override
    public void dibujar() {
        //Dibujar un cuadrado con *
        for (int j = 0; j < lado; j++){
            
           for (int i = 0; i < lado; i++){
            System.out.print("* ");
            }//for i dibujar
            System.out.println("");
        }//for j dibujar
        
    }//dibujar

    @Override
    public void area() {
        System.out.println("Area = " +lado*lado);
    }//area

    @Override
    public void perimetro() {
        System.out.println("Perimetro = "+ lado*4);
    }//perimetro
    
}//clase cuadrado