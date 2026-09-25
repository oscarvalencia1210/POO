/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicapolimorfismo;

/**
 *
 * @author oscar
 */
import java.util.*;

public class PracticaPolimorfismo {
    static boolean valido;
    
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        int menu = 0;
        
        System.out.println("-- FIGURAS GEOMETRICAS --");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Circulo");
        
        do{
            System.out.println("INGRESA TU OPCION: ");
            try{
                menu = sn.nextInt();
                valido = true;
            }
            catch(InputMismatchException e){
                System.out.println("OPCION INVALIDA, INGRESA UN NUMERO");
                sn.nextLine();
                valido = false;
            }
        }while (!valido);
        
        
        switch(menu) {
            case 1:
            {
                Cuadrado miCuadrado = new Cuadrado ("Cuadrado", "Rojo", 1, 0);
                do{
                    System.out.println("Dame las medidas del lado");
                    try{
                        miCuadrado.lado = sn.nextInt();
                        valido = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("OPCION INVALIDA, INGRESA UN NUMERO");
                        sn.nextLine();
                        valido = false;
                    }
                    miCuadrado.dibujar();
                    miCuadrado.perimetro();
                    miCuadrado.area();
                }while (!valido);//do
                
            }break;//case 1
            case 2:
            {
                Triangulo miTriangulo = new Triangulo ("Triangulo", "Azul", 1, 0, 0);
                do{
                    System.out.println("Dame la base del triangulo:");
                    try{
                        miTriangulo.base = sn.nextInt();
                        valido = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("OPCION INVALIDA, INGRESA UN NUMERO");
                        sn.nextLine();
                        valido = false;
                    }
                }while(!valido);
                do{
                System.out.println("Dame la altura del triangulo:");
                    try{
                        miTriangulo.altura = sn.nextInt();
                        valido = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("OPCION INVALIDA, INGRESA UN NUMERO");
                        sn.nextLine();
                        valido = false;
                    }
                }while (!valido);
                miTriangulo.dibujar();
                miTriangulo.perimetro();
                miTriangulo.area();
                
            }break; //case 2
            case 3:
            {
                Circulo miCirculo = new Circulo ("Circulo", "Verde", 1, 0.0);
                do{
                    System.out.println("Dame el radio del circulo:");
                    try{
                        miCirculo.radio = sn.nextDouble();
                        valido = true;
                    }
                    catch(InputMismatchException e){
                        System.out.println("OPCION INVALIDA, INGRESA UN NUMERO");
                        sn.nextLine();
                        valido = false;
                    }
                }while (!valido);
                miCirculo.dibujar();
                miCirculo.perimetro();
                miCirculo.area();
            }break;//case 3
            default: 
                System.out.println("Opcion no válida.");
                break;
        }//switch
    }//main
}//clase polimorfismo
