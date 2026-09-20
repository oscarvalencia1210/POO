/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author oscar
 */
public class HabitacionDoble extends Habitacion {
    private int camasDobles;
    public HabitacionDoble(int numero, double precioNoche, int camasDobles){
        super(numero, precioNoche);
        this.camasDobles = camasDobles;
    }//habitacion doble
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("-> Tipo: Doble | Camas Dobles: "+camasDobles);
    }//mostrar info
}//clase Hbitacion Doble
