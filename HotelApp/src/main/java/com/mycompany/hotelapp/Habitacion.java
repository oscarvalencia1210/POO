/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author oscar
 */
public class Habitacion {
    protected int numero;
    protected double precioNoche;
    protected boolean ocupada; 
    
    public Habitacion(int numero, double precioNoche){
        this.numero = numero;
        this.precioNoche = precioNoche;
        this.ocupada = false; //por defecto habitacion libre
    }//Habitacion
    
    public void mostrarInfo(){
        String estado = ocupada ? "Ocupada" : "Libre";
        System.out.println("Habitación #" +numero+ " | Precio:  $" +precioNoche+ " | Estado: " +estado);
        /*
        String estado = ocupada ? "Ocupada" : "Libre"; el signo de pregunta es una forma
        hacer resumudo un if-else
        es como hacer 
        String estado;
        if (ocupada) {
            estado = "Ocupada";
        } else {
            estado = "Libre";
        }
        */
    }//mostrar info
    
    public void reservar(){
        if (!ocupada) {
            ocupada = true;
            System.out.println("La habitacion #" +numero+ "ha sido reservada exitosamente :D");
        } else {
            System.out.println("Lo sentimos, la hbaitacion #"+numero+ "ya fue reservada :C");
        }
    }//reservar
    
    public void liberar(){
        if (ocupada){
            ocupada = false;
            System.out.println("La habitacion #"+numero+ "ha sido liberada"); 
        } else {
            System.out.println("La habitacion #"+numero+ "ya estaba libre");
        }
    }//liberar
    
    public double calcularCosto(int noches){
        return precioNoche * noches;
    }//calcular costo noches
    
    public int getNumero(){
        return numero;
    }//get numero
}//class habitacion
