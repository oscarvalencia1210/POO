/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelapp;

/**
 *
 * @author oscar
 */
public class Suite extends Habitacion {
    private boolean tieneJacuzzi;
    private boolean tieneVistaMar;
    
    public Suite (int numero, double precioNoche, boolean tieneJacuzzi, boolean tieneVistaMar) {
        super(numero, precioNoche);
        this.tieneJacuzzi = tieneJacuzzi;
        this.tieneVistaMar = tieneVistaMar;
    }//suite
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        String jacuzzi = tieneJacuzzi ? "Si" : "No";
        String vista = tieneVistaMar ? "Si" : "No";
        System.out.println("-> Tipo: Suite | Jacuzzi: " +jacuzzi+ " | Vista al mar: "+vista);
    }//mostrar info
}//clase Suite
