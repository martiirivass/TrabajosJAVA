/*Ejercicio 4: Generador de Listas de Reproducción
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.*/

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner animo=new Scanner(System.in);
        System.out.println("Ingrese su estado de ánimo\n1.Feliz\n2.Triste\nEnérgico\n4.Relajado");
        int estado=animo.nextInt();
        if (estado==1) {
            System.out.println("Su estado de ánimo es feliz, acá tiene canciones sugeridas.\n----------");
            System.out.println("1.\"Happy\" – Pharrell Williams");
            System.out.println("2.\"Shake It Off\" – Taylor Swift");
            System.out.println("3.\"Blinding Lights\" – The Weeknd");
            System.out.println("4.\"La Vida Es Un Carnaval\" – Celia Cruz");
            System.out.println("5.\"Despacito\" – Luis Fonsi, Daddy Yankee");
        }
        else if (estado==2) {
            System.out.println("Su estado de ánimo es triste, te dejo canciones para acompañar la tristeza.\n----------");
            System.out.println("1.\"Someone Like You\" – Adele");
            System.out.println("2.\"Lose You to Love Me\" – Selena Gomez");
            System.out.println("3.\"Creep\" – Radiohead");
            System.out.println("4.\"Lo Siento\" – Beret");
            System.out.println("5.\"Rayando el Sol\" – Maná");
        }
        else if (estado==3) {
            System.out.println("Su estado de ánimo es enérgico, te dejo canciones recomendadas.\n---------");
            System.out.println("1.\"Summer\" – Calvin Harris");
            System.out.println("2.\"Wake Me Up\" – Avicii");
            System.out.println("3.\"Animals\" – Martin Garrix");
            System.out.println("4.\"La Gozadera\" – Gente de Zona ft. Marc Anthony");
            System.out.println("5.\"Sicko Mode\" – Travis Scott");
        }
        else if (estado==4) {
            System.out.println("Su estado de ánimo esta en paz y relajado, te recomiendo estas canciones\n-------");
            System.out.println("1.\"Perfect\" – Ed Sheeran");
            System.out.println("2.\"All of Me\" – John Legend");
            System.out.println("3.\"Me Voy\" – Julieta Venegas");
            System.out.println("4.\"Riptide\" – Vance Joy");
            System.out.println("5.\"Sunset Lover\" – Petit Biscuit");
        }
        else {
            System.out.println("El número ingresado no tiene un estado de ánimo.");
        }
    }
}
