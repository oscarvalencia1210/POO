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
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int id;
    protected int edad;
    
    /* Constructor */
    public Persona (String nombre, String apellido, int id, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
    }
    
    /* Métodos Getter y Setter */
    public void consentrarse(){
            System.out.println("Nos encontramos en concentración de 1 dia");
    }
    public void viajar(){
        String origen, destino;
        Scanner sn=new Scanner (System.in);
        
        System.out.println("Dime origen");
        origen=sn.nextLine();
        System.out.println("Dime destino");
        destino=sn.nextLine();
        System.out.println("Viajando: ");
        System.out.println("De origen" +origen+ "\n a" +destino);
        
    }
    // Métodos para 'nombre'
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para 'apellido'
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Métodos para 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos para 'edad'
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        // Aquí es donde en un futuro podrías poner condiciones
        // Ejemplo: if(edad >= 0) { this.edad = edad; }
        this.edad = edad;
    }
}
