import java.util.Scanner;

public class MostrarNumero {
    public static void main(String[] args) {
        try ( // Crear el objeto Scanner para leer desde la consola
                Scanner scanner = new Scanner(System.in)) {
            // Pedir el número al usuario
            System.out.println("Introduzca un número:");
            
            int numero = scanner.nextInt();
            // Hace el scaneo y lo muestra
            System.out.println("El número es: " + numero);
            // Cerrar el scanner
        }
    }
}