/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String usuarioCorrecto = "admin";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de usuario: ");
        // .trim() elimina espacios en blanco accidentales al principio o final
        String usuario = scanner.nextLine().trim();

        // Usamos equalsIgnoreCase si quieres que no importe si ponen Admin o admin
        // Si quieres que sea estrictamente literal, cambia equalsIgnoreCase por equals
        if (usuario.equals(usuarioCorrecto)) {
            System.out.println("¡Bienvenido!");
        } else {
            System.out.println("Incorrecto");
        }

        scanner.close();
    }
}

