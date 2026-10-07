import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double PI = 3.141592;

        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("La longitud es: " + longitud);
        System.out.println("El área es: " + area);
    }
}
