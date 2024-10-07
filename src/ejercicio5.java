import java.util.Scanner;

/*Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.*/
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Km de su viaje: ");
        float kilometros=lectura.nextFloat();  //Variable para la cantidad de kilometros
        System.out.println("Ingrese la cantidad de kilometros que hace su auto por litro de combustible");
        float consumoporkm=lectura.nextFloat(); //Variable para consumo por kilometro
        System.out.println("Ingrese el precio del combustible por litro");
        float preciocombustible= lectura.nextFloat();  //Variable que guarda el precio del combustible
        System.out.println("Su viaje tendra "+kilometros+"km.");
        System.out.println("Viendo el consumo de su auto, usted tendra un consumo aproximado de "+(kilometros/consumoporkm)+" litros cada 100km");  //Consumo total del viaje
        System.out.println("El costo del viaje será de $"+ (kilometros/consumoporkm)*preciocombustible); //Gasto de dinero en nafta para el viaje
    }
}
