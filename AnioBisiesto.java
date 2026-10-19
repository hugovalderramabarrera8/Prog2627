/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20_1DAW
 */


import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        // Un año es bisiesto si es divisible entre 4, 
        // y (no es divisible entre 100 o es divisible entre 400)
        if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " no es bisiesto.");
        }
        
        scanner.close();
    }
}



