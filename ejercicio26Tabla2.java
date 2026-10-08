import java.util.Scanner;

public class ejercicio26Tabla2 {
    public static void main(String[] args) {
        // Pedimos el nombre
        try (Scanner teclado = new Scanner(System.in)) {
            // Pedimos el nombre
            System.out.print("Introduce tu nombre: ");
            String nombre = teclado.nextLine();
            
            // Pedimos la edad
            System.out.print("Introduce tu edad: ");
            int edad = teclado.nextInt();
            
            // Calculamos el precio según la edad
            double precio = edad < 12 ? 5 : edad < 65 ? 8 : 6;
            
            // Mostramos los datos
            System.out.println("Cliente: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Precio de la entrada: " + precio + " €");
        }
    }
}





