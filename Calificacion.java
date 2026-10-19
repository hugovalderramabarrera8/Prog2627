/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner; 

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota numérica (0 al 10): ");
        double nota = scanner.nextDouble();

        // Validamos primero que la nota esté dentro del rango correcto
        if (nota < 0 || nota > 10) {
            System.out.println("Error: La nota debe estar entre 0 y 10.");
        } else if (nota >= 9) { // Cubre del 9 al 10
            System.out.println("Sobresaliente");
        } else if (nota >= 7) { // Cubre del 7 al 8.9 (en decimales) o 7 y 8 enteros
            System.out.println("Notable");
        } else if (nota >= 6) { // Cubre el 6 (Bien)
            System.out.println("Bien");
        } else if (nota >= 5) { // Cubre el 5 (Suficiente)
            System.out.println("Suficiente");
        } else { // Del 0 al 4.99
            System.out.println("Insuficiente");
        }

        scanner.close();
    }
}