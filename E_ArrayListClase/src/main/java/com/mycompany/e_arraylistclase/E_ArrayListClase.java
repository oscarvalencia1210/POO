/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e_arraylistclase;

/**
 *
 * @author oscar
 */


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E_ArrayListClase {

    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("\n---Menu---");
            System.out.println("1. Agregar usuarios");
            System.out.println("2. Consultar usuarios");
            System.out.println("3. Buscar usuarios");
            System.out.println("4. Salir");
            
            // Manejo de excepciones con try-catch para evitar que el programa falle si se ingresa texto en lugar de un número
            try {
                System.out.print("Elige una opcion: ");
                opc = sn.nextInt();
                sn.nextLine(); // Limpiar el buffer
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero valido.");
                sn.nextLine(); // Limpiar la entrada incorrecta
                continue; // Volver al inicio del ciclo
            }

            switch (opc) {
                case 1: {
                    String usuario = "";
                    String contraseña = "";
                    boolean correoValido = false;
                    boolean contraValida = false;

                    // Validación del correo electrónico
                    while (!correoValido) {
                        System.out.println("Ingresa tu correo electronico:");
                        usuario = sn.nextLine();

                        // Verificar que tenga un formato válido (contiene texto, @, texto, punto, texto)
                        if (!usuario.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                            System.out.println("Error: El formato del correo es invalido.");
                            continue;
                        }

                        // Verificar si ya se encuentra registrado
                        boolean existe = false;
                        for (Usuario u : listaUsuarios) {
                            if (u.getCorreo().equalsIgnoreCase(usuario)) {
                                existe = true;
                                break;
                            }
                        }

                        if (existe) {
                            System.out.println("Error: El correo ya se encuentra registrado.");
                        } else {
                            correoValido = true;
                        }
                    }//while

                    // Validación de la contraseña
                    while (!contraValida) {
                        System.out.println("Ingresa tu contraseña:");
                        contraseña = sn.nextLine();

                        if (contraseña.length() < 8) {
                            System.out.println("Error: La contraseña debe tener una longitud minima de 8 caracteres.");
                        } else if (!contraseña.matches(".*\\d.*")) {
                            System.out.println("Error: La contraseña debe contener al menos un numero.");
                        } else if (!contraseña.matches(".*[@#$%&].*")) {
                            System.out.println("Error: La contraseña debe contener al menos un caracter especial (@, #, $, % o &).");
                        } else {
                            contraValida = true;
                        }
                    }

                    // Almacenar la información si pasa todas las validaciones
                    listaUsuarios.add(new Usuario(usuario, contraseña));
                    System.out.println("Usuario registrado exitosamente.");
                    
                } break;
                
                case 2: {
                    System.out.println("\n--- Lista de Usuarios Registrados ---");
                    if (listaUsuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados aun.");
                    } else {
                        for (Usuario u : listaUsuarios) {
                            System.out.println(u.toString());
                        }
                    }
                } break;
                
                case 3: {
                    boolean encontrado = false;
                    System.out.println("Ingresa el correo del usuario a buscar:");
                    String usuarioBuscar = sn.nextLine();
                    
                    for (Usuario x : listaUsuarios) {
                        if (x.getCorreo().equalsIgnoreCase(usuarioBuscar)) {
                            System.out.println("\nUsuario encontrado:");
                            System.out.println("Correo: " + x.getCorreo());
                            System.out.println("Contraseña: " + x.getContraseña());
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("El usuario no se encuentra registrado.");
                    }
                } break;
                
                case 4: {
                    System.out.println("Finalizando la ejecucion del programa...");
                } break;
                
                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        } while (opc != 4);
        
        sn.close();
    }
}
