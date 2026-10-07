import java.util.Scanner;

public class Ejercicio21B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.println("La longitud es: " + longitud);
        System.out.println("El área es: " + area);
    }
}
