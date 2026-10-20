/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */
import java.util.Scanner;

public class ContarConFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el número hasta el que deseas contar: ");
        int limite = scanner.nextInt();

        // Bucle for para contar desde 1 hasta el límite
        for (int i = 1; i <= limite; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

