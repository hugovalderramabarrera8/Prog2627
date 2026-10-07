public class GestionInventario {
    public static void main(String[] args) {
        int cantidadPociones = 1;
        double precioUnitario = 10.50;
        boolean mochilaLlena;
        double oro = 100.0;

        int pocionesCompradas = 3;
        double importe = pocionesCompradas * precioUnitario;

        oro = oro - importe;
        cantidadPociones = cantidadPociones + pocionesCompradas;

        mochilaLlena = cantidadPociones == 5;

        System.out.println("Cantidad de pociones: " + cantidadPociones);
        System.out.println("Precio por poción: " + precioUnitario + " euros");
        System.out.println("Importe de la compra: " + importe + " euros");
        System.out.println("Oro restante: " + oro + " euros");
        System.out.println("Estado de la mochila: " + (mochilaLlena ? "llena" : "vacía"));
    }
}
