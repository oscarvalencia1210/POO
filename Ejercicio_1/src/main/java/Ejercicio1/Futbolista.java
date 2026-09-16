/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author oscar
 */
public class Futbolista extends Persona{
    private int dorsal;
    private String demarcacion;

    public Futbolista(String nombre, String apellido, int id, int edad, int dorsal, String demarcacion) {
        super(nombre, apellido, id, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    public void jugarpartido()
    {
        String equipoC;
        Scanner sn=new Scanner (System.in);
        System.out.println("Jugar partido");
        System.out.println("Dime contra que equipo es el partido");
        equipoC=sn.nextLine();
        System.out.println("El equipo esta jugando contra" +equipoC+ "\n");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void entrenar(){
        System.out.println("Equipo en entrenamiento");
    }
    
}
