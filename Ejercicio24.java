import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = teclado.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareasTerminadas = teclado.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean biblioteca = teclado.nextBoolean();

        boolean permiso = (!llueve && tareasTerminadas) || biblioteca;

        System.out.println("¿Puedes salir a la calle? " + permiso);
    }
}

