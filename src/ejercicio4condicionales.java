import java.util.Scanner;
/*Ejercicio 4: Calculadora de IMC con Recomendaciones
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad).*/
public class ejercicio4condicionales {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
            System.out.println("Escriba su peso en kilogramos");
            float kilogramos= lectura.nextFloat();
            System.out.println("Escriba su altura en metros");
            float altura= lectura.nextFloat();
            float imc = kilogramos/(altura*altura);  //Calcular el IMC
        System.out.printf("Tu índice de Masa Corporal (IMC) es: %.2f%n", imc);
        if (imc<18.5) {
            System.out.println("Clasificación: Bajo peso");
            System.out.println("\nRecomendaciones:\nConsulta médica\nAumentar ingesta calórica\nComidas frecuentes\nEjercicio de fuerza");
        }
        else if (imc<24.9) {
            System.out.println("Clasificación: Peso normal");
            System.out.println("\nRecomendaciones:\nMantener un estilo de vida saludable\nEjercicio regular\nControlar el estrés\nChequeos regulares");
        }
        else if (imc<29.9) {
            System.out.println("Clasificación: Sobrepeso");
            System.out.println("\nRecomendaciones:\nConsulta médica\nPlan de pérdida de peso\nAlimentación consciente\nActividad física");
        }
        else {
            System.out.println("Clasificación: Obesidad");
            System.out.println("\nRecomendaciones:\nConsulta médica\nCambio de hábitos\nDietas balanceadas\nEjercicio regular\nConsideraciones adicionales");
        }
    }
}
