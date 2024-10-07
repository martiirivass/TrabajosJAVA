import java.util.Scanner;

/*Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.*/
public class ejercicio7condicionales {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese su estado de ánimo\n1.Feliz\n2.Triste\n3.Enérgico\n4.Relajado");
        int estado= lectura.nextInt();
        if (estado==1) {
            System.out.println("\nSu estado de ánimo es FELIZ");
            System.out.println("\nActividades que podrías realizar:\nPractica deporte\nOrganiza salidas\nTiempo recreativo");
        }
        else if (estado==2) {
            System.out.println("\nSu estado de ánimo es TRISTE");
            System.out.println("\nActividades que podrías realizar:\nEscribe tus sentimientos en algún lado\nMira una pelicula conmovedora\nHaz ejercicios suaves como yoga");
        }
        else if (estado==3) {
            System.out.println("\nSu estado de ánimo es ENÉRGICO");
            System.out.println("\nActividades que podrías realizar:\nHaz ejercicio intenso\nEscucha música activa\nInicia o sigue con tus proyectos");
        }
        else if (estado==4) {
            System.out.println("\nSu estado de ánimo es RELAJADO");
            System.out.println("\nActividades que podrías realizar:\nMeditar\nLeer un libro\nDucha caliente");
        }
        else {
            System.out.println("Número inválido");
        }
    }
}
