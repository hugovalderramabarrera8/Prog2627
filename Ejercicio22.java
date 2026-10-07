import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        boolean mayorDeEdad = edad >= 18;

        System.out.println(mayorDeEdad);
    }
}
