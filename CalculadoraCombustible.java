/** Programa para calcular el combustible del cohete Artemis-X.
 * Calcula los litros necesarios y su precio.
 */

public class CalculadoraCombustible {
    public static void main(String[] args) {

        // Constantes
        final double CONSUMO_POR_KM = 14.75;
        final int RESERVA_SEGURIDAD = 500;

        // Variables
        int distanciaKm = 5200;
        double precioLitro = 4.87;

        // Calculamos los litros que hacen falta
        double litrosTotales = (distanciaKm * CONSUMO_POR_KM) + RESERVA_SEGURIDAD;

        // Calculamos el precio total
        double costeTotal = litrosTotales * precioLitro;

        // Pasamos los resultados a números enteros
        int litrosOficialesComprar = (int) litrosTotales;
        int costePresupuestado = (int) costeTotal;

        // Mostramos los resultados
        System.out.println("CALCULADORA DE COMBUSTIBLE");
        System.out.println("-------------------------");
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Precio por litro: " + precioLitro + " euros");
        System.out.println("Litros totales: " + litrosTotales + " litros");
        System.out.println("Coste total: " + costeTotal + " euros");
        System.out.println("Litros para comprar: " + litrosOficialesComprar + " litros");
        System.out.println("Presupuesto: " + costePresupuestado + " euros");
    }
}
