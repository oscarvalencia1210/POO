/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio1;
import java.util.Scanner;
public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int menu;
        int numeroJugadores, contadorJugadores=0, jugador;
        String nombreEquipo;
        
        System.out.println("Estamos creando un equipo de futbol");
        System.out.println("¿Cuantos jugadores vas a comprar? ");
        numeroJugadores=sn.nextInt();
        sn.nextLine(); 
        System.out.println("Dame el nombre de tu equipo ");
        nombreEquipo=sn.nextLine();
        
        
        Futbolista equipoFutbol[]= new Futbolista[numeroJugadores];
        /**********************************************************/
        System.out.println("Construyendo el equipo " +nombreEquipo);
        System.out.println("Generando un equipo de futbol\n");
        System.out.println("1. Captura datos del futbolista");
        System.out.println("2. Concentrarse");
        System.out.println("3. Viajar");
        System.out.println("4. Jugar");
        System.out.println("5. Entrenar");
        System.out.println("Dame tu opcion");
        menu=sn.nextInt();
        sn.nextLine();
        switch(menu){
            case 1: {
                
                while(contadorJugadores<numeroJugadores){
                    //instanciamos el objeto de cada una de las posiciones de array
                    equipoFutbol[contadorJugadores]= new Futbolista("","", 0, 0, 0, "");
                    //mandar llamar los metodos de clase Futbolista
                    
                    System.out.println("Dame el nombre del futbolista");
                    equipoFutbol[contadorJugadores].setNombre(sn.nextLine());
                    System.out.println("Apellido");
                    equipoFutbol[contadorJugadores].setApellido(sn.nextLine());
                    System.out.println("ID");
                    equipoFutbol[contadorJugadores].setId(sn.nextInt());
                    System.out.println("Edad");
                    equipoFutbol[contadorJugadores].setEdad(sn.nextInt());
                    System.out.println("Dorsal");
                    equipoFutbol[contadorJugadores].setDorsal(sn.nextInt());
                    sn.nextLine();
                    System.out.println("Demarcacion");
                    equipoFutbol[contadorJugadores].setDemarcacion(sn.nextLine());
                    contadorJugadores++;
                    break;
                }//while
            }//case 1
            case 2:{
                System.out.println("Dime el numero de jugador que va a concentrarse");
                jugador=sn.nextInt();
                
                equipoFutbol[jugador].consentrarse();
                break;
            }//case 2
            case 3:{
                System.out.println("Dime el numero de jugador que va a viajar");
                jugador=sn.nextInt();
                
                equipoFutbol[jugador].viajar();
                break;
            }//case 3
            case 4:{
                System.out.println("Dime el numero de jugador que va a jugar el partido");
                jugador=sn.nextInt();
                
                equipoFutbol[jugador].jugarpartido();
                break;
            }//case 4
            case 5:{
                System.out.println("Dime el numero de jugador que va a entrenar");
                jugador=sn.nextInt();
                
                equipoFutbol[jugador].entrenar();
                break;
            }//case 5
        }//switch
    }//main
}//clase_ejercicio_1