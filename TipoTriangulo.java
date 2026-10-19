/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los tres lados del triángulo
        System.out.print("Ingrese el lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c: ");
        double c = scanner.nextDouble();

        // 1. Validar si pueden formar un triángulo
        // La suma de dos lados cualesquiera debe ser mayor que el tercero
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("¡Sí forman un triángulo!");

            // 2. Clasificar el triángulo según sus lados
            if (a == b && b == c) {
                System.out.println("Es un triángulo **Equilátero** (todos los lados iguales).");
            } else if (a == b || a == c || b == c) {
                System.out.println("Es un triángulo **Isósceles** (dos lados iguales).");
            } else {
                System.out.println("Es un triángulo **Escaleno** (ningún lado igual).");
            }

        } else {
            System.out.println("Los valores ingresados NO pueden formar un triángulo.");
        }

        scanner.close();
    }
}
