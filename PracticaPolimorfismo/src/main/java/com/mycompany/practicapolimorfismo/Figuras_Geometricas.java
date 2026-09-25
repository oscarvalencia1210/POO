/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
public abstract class Figuras_Geometricas {
    protected String nombre, color;
    int grosorBorde;
    
    public Figuras_Geometricas(String nombre, String color, int grosorBorde) {
        this.nombre = nombre;
        this.color = color;
        this.grosorBorde = grosorBorde;
    }
    
    public abstract void dibujar();
    public abstract void area();
    public abstract void perimetro();
}
