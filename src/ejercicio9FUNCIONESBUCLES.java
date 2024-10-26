public class ejercicio9FUNCIONESBUCLES {

    public static void main(String[] args) {

        double[] preciosOriginales = {150.0, 230.5, 45.75, 3400.0, 250.25};


        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);


        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.printf("Precio original: %.2f - Precio final: %.2f%n", preciosOriginales[i], preciosFinales[i]);
        }
    }


    public static double[] calcularPrecioFinal(double[] preciosOriginales) {
        double[] preciosFinales = new double[preciosOriginales.length];
        double descuento = 0.10;


        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosFinales[i] = preciosOriginales[i] * (1 - descuento); // Aplica el descuento
        }

        return preciosFinales;
    }
}
