import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el año actual: ");
        int añoActual = teclado.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int añoNacimiento = teclado.nextInt();

        int edad = añoActual - añoNacimiento;

        System.out.println("Tu edad es: " + edad + " años.");
    }
}