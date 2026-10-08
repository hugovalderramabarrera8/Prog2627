import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        // Pedimos el nombre del cliente
        try (Scanner teclado = new Scanner(System.in)) {
            // Pedimos el nombre del cliente
            System.out.print("Introduce tu nombre: ");
            String nombre = teclado.nextLine();
            
            // Pedimos la edad del cliente
            System.out.print("Introduce tu edad: ");
            int edad = teclado.nextInt();
            
            // Si es menor de 12 paga 5 €, si no paga 8 €
            double precio = edad < 12 ? 5 : 8;
            
            // Mostramos los datos
            System.out.println("Cliente: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Precio de la entrada: " + precio + " €");
        }
    }
}