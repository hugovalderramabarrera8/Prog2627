public class Ejercicio26 {
    public static void main(String[] args) {

        // Expresión 1
        boolean resultado1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("Expresión 1: " + resultado1);

        // Expresión 2
        boolean resultado2 = !(7 + 3 > 10) || 3 * 2 <= 6;
        System.out.println("Expresión 2: " + resultado2);

        // Expresión 3
        boolean resultado3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("Expresión 3: " + resultado3);

        // Expresión 4
        int x = 5;
        x += 3 * 2;
        System.out.println("Expresión 4: x = " + x);

        // Expresión 5
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("Expresión 5: b = " + b);
    }
}