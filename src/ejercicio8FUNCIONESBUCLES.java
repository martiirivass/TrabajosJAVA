public class ejercicio8FUNCIONESBUCLES {

    public static void main(String[] args) {

        String[] empleados = {"Juan", "María", "Pedro", "Ana", "Luis"};
        int[] horasTrabajadas = {42, 34, 45, 55, 30};


        double[] pagos = calcularPagoSemanal(horasTrabajadas);


        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("%s: Pago semanal: $%.2f%n", empleados[i], pagos[i]);
        }
    }


    public static double[] calcularPagoSemanal(int[] horasTrabajadas) {
        double[] pagos = new double[horasTrabajadas.length];
        double tarifaPorHora = 15.0;


        for (int i = 0; i < horasTrabajadas.length; i++) {
            pagos[i] = horasTrabajadas[i] * tarifaPorHora;
        }

        return pagos;
    }
}
