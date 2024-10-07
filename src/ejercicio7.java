import java.util.Scanner;

/*Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.*/
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("CALCULADORA DE ÍNDICE DE FELICIDAD");
        System.out.println("\nIngrese el nivel de satisfacción de vida (1 al 10)");
        int nivelsat=lectura.nextInt();
        System.out.println("Ingrese el nivel de estrés (1 al 10)");
        int nivelestres= lectura.nextInt();
        System.out.println("Ingrese el nivel de salud mental (1 al 10)");
        int nivelsaludmental= lectura.nextInt();
        System.out.println("Ingrese el nivel de salud física (1 al 10)");
        int nivelsaludfisica= lectura.nextInt();
        int niveltotal=(nivelsat+nivelestres+nivelsaludmental+nivelsaludfisica/4);
        System.out.println("CALCULANDO ÍNDICE DE FELICIDAD...");
        System.out.println("\nBasandonós en los índices que dió, su felicidad es de: "+(niveltotal));
    }
}
