/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class ContarHastaNumero2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite;
        int contador = 1;

        System.out.print("Ingresa el número hasta el que deseas contar: ");
        limite = scanner.nextInt();

        if (limite < 1) {
            System.out.println("Por favor, ingresa un número mayor o igual a 1.");
        } else {
            // Estructura do-while (Hacer - Mientras)
            do {
                System.out.println(contador);
                contador++; // Incrementa el contador en 1
            } while (contador <= limite);
        }

        scanner.close();
    }
}