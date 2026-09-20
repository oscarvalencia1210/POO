/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelapp;

/**
 *
 * @author oscar
 */
import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //Creacion de 5 habitaciones diferentes
        Habitacion[] habitaciones = new Habitaciones[5];
        habitaciones[0] = new HabitacionSencilla(101, 800.00, 1);
        habitaciones[1] = new HabitacionSencilla(102, 900.00, 2);
        habitaciones[2] = new HabitacionDoble(201, 1500.00, 2);
        habitaciones[3] = new Suite(301, 3500.00, true, true);
        habitaciones[4] = new Suite(302, 3000.00, true, false);
        
        int opcion;
        
        do {
            System.out.println("\n-- MENU HOTEL --");
            System.out.println("1. Ver todas las habitaciones");
            System.out.println("2. Reservar una habitacion");
            System.out.println("3. Calcular costo de estancia");
            System.out.println("4. Liberar habitacion");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("\n-- LISTA DE HABITACIONES --");
                    //RECORRER LISTA DE OBJETOS E IMPRIMIR LA INFO
                    for (Habitacion hab : habitaciones) {
                        hab.mostrarInfo();
                        System.out.println("-");
                    }//for case 1
                    break;
                
                case 2:
                    System.out.println("Ingresa el numero de habitacion a reservar: ");
                    int numReserva = scanner.nextInt();
                    Habitacion habReserva = buscarHabitacion(habitaciones, numReserva);
                    if (habReserva != null) { 
                        habReserva.reservar();
                    } else {
                        System.out.println("Habitacion no encontrada.");
                    }//if-else
                    break;
                    
                case 3:
                    System.out.println("Ingresa el numero de la habitacion: ");
                    int numCosto = scanner.nextInt();
                    Habitacion habCosto = buscarHabitacion(habitaciones, numCosto);
                    if (habCosto != null) {
                        System.out.println("Ingresa el numero de noches: ");
                        int noches = scanner.nextInt();
                        double total = habCosto.calcularCosto(noches);
                        System.out.println("El costo total por " +noches+ "noches es: $ "+total);
                    } else {
                        System.out.println("Habitacion no encontrada :C");
                    }//if-else
                    break;
                
                case 4:
                    System.out.println("Ingresa el numero de habitacion a liberar");
                    int numLibera = scanner.nextInt();
                    Habitacion habLibera = buscarHabitacion(habitaciones, numLibera);
                    if (habLibera != null) {
                        habLibera.liberar();
                    } else {
                        System.out.println("Habitacion no encontrada :C");
                    }//if-else
                    break;
                    
                case 5:
                    System.out.println("Saliendo el sistema...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida :/");        
            }//switch
            
            
        } while (opcion != 5);
        
        scanner.close();
        
    }//main
    
    //método auxiliar  para buscar la habitacion en el arreglo por numero
    private static Habitacion buscarHabitacion(Habitacion[] habitaciones, int numero) {
        for (Habitacion hab : habitaciones) {
            if (hab.getNumero() == numero) {
                return hab;
            }//if
        }//for
        return null;
    }//metodo busqueda buscar habitacion
    
    
}//clase hotel app
