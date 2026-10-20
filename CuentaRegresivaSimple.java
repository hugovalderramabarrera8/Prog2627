/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class CuentaRegresivaSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el número: ");
        int numero = scanner.nextInt();

        // Bucle do-while puro sin condicionales if/else
        do {
            System.out.println(numero);
            numero--; // Resta 1 en cada vuelta
        } while (numero >= 1); // Se repite hasta llegar a 1

        scanner.close();
    }
}
