/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class MayorMenorIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Estructura para evaluar mayor, menor o igual
        if (num1 > num2) {
            System.out.println("El primer número (" + num1 + ") es mayor.");
        } else if (num1 < num2) {
            System.out.println("El segundo número (" + num2 + ") es mayor.");
        } else {
            System.out.println("¡Los dos números son iguales!");
        }

        scanner.close();
    }
}