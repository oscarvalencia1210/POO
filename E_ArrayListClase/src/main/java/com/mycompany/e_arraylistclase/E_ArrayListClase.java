/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e_arraylistclase;

/**
 *
 * @author oscar
 */
import java.util.*;
public class E_ArrayListClase {

    public static void main(String[] args) {
        ArrayList <Usuario> listaUsuarios = new ArrayList <>();
        Scanner sn = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("---Menu---");
            System.out.println("1. Agregar usuraios");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Buscar elemento");
            System.out.println("4. Salir");
            opc=sn.nextInt();
            switch (opc){
                case 1:{
                    String usuario, contraseña;
                    System.out.println("Ingresa tu correo");
                    usuario=sn.nextLine();
                    System.out.println("Ingresa tu contraseña");
                    contraseña=sn.nextLine();
                    listaUsuarios.add(
                    new Usuario(usuario, contraseña));
                    
                }break;
                case 2:{
                    System.out.println("Arreglo de la lista de usuarios");
                    System.out.println(listaUsuarios);
                }break;
                case 3:{
                    boolean encontrado = false;
                    String usuario;
                    System.out.println("Ingresa el usuario a buscar");
                    usuario=sn.nextLine();
                    for (Usuario x: listaUsuarios){
                    if(x.getCorreo().equalsIgnoreCase(usuario)){
                        System.out.println("Usuario "+x.getCorreo());
                        System.out.println("Contraseña "+x.getContraseña());
                        encontrado = true;
                    }
                    }
                    if(encontrado == false)
                        System.out.println("El usuario no existe");
                }break;
                case 4:{
                    System.out.println("Saliendo...");
                }break;
                      
            }
        }while(opc!= 4);
    }
}
