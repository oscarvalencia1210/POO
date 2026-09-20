/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author oscar
 */
public class HabitacionSencilla extends Habitacion {
    private int camasIndividuales;
    
    public HabitacionSencilla(int numero,  double precioNoche, int camasIndividuales){
        super(numero, precioNoche); //llamar al constructor del padre Habitacion
        this.camasIndividuales = camasIndividuales;
    }//Habiracion sencilla
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("-> Tipo: Sencilla | Camas individuales: "+camasIndividuales);
    }//mostrar info
}// clase Habitacion sencilla
