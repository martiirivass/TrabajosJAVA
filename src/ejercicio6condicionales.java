import java.util.Scanner;

/*Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.
*/
public class ejercicio6condicionales {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese cuantas horas duerme al dia");
        int horas= lectura.nextInt();
        if (horas<7) {
            System.out.println("Tendrías que dormir más");
        }
        else if (horas==8) {
            System.out.println("Tu horario de sueño es perfecto");
        }
        else if (horas>8) {
            System.out.println("Estas durmiendo de más");
        }
        System.out.println("Ingrese cuantas comidas saludables consume al dia");
        int comidas= lectura.nextInt();
        if (comidas<=2) {
            System.out.println("Faltan comidas saludables en tu rutina");
        }
        else if (comidas>=3) {
            System.out.println("Todas tus comidas son saludables");
        }
    }
}
