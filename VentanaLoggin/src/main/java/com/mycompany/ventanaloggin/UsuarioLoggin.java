/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventanaloggin;

/**
 *
 * @author oscar
 */
import java.util.*;

public class UsuarioLoggin {
    
    private String usuario;
    private String contrasena;
    
    // ArrayList donde se guardan los usuarios registrados
    public static ArrayList<UsuarioLoggin> listaUsuarios = new ArrayList<>();

    public UsuarioLoggin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Verifica si el nombre de usuario ya está registrado en el ArrayList
    public static boolean existeUsuario(String nombreUsuario) {
        for (UsuarioLoggin u : listaUsuarios) {
            if (u.getUsuario().equals(nombreUsuario)) {
                return true;
            }
        }
        return false;
    }

    // Agrega un nuevo usuario al ArrayList
    public static void agregarUsuario(String nombreUsuario, String contrasena) {
        listaUsuarios.add(new UsuarioLoggin(nombreUsuario, contrasena));
    }

    // Verifica si el usuario y la contraseña coinciden
    public static boolean validarCredenciales(String nombreUsuario, String contrasena) {
        for (UsuarioLoggin u : listaUsuarios) {
            if (u.getUsuario().equals(nombreUsuario) && u.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }
}
