/*Ejercicio 3: Sistema de Recomendación de Libros
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/

import java.util.Scanner;

public class ejercicio3condicionales {
    public static void main(String[] args) {
        int genero;
        Scanner lectura=new Scanner(System.in);
        do {
            System.out.println("LIBROS\n");
            System.out.println("GÉNEROS\n1.Fantasía\n2.Misterio\n3.Romance\n4.Ciencia Ficción\n5.Salir");
            genero= lectura.nextInt();
            if (genero==1) {
                System.out.println("\nGÉNERO SELECCIONADO: FANTASÍA");
                System.out.println("\n\"Harry Potter y la piedra filosofal\"\nAutor:J.K. Rowling\nDescripción:  El comienzo de la famosa serie que sigue a un joven mago en su aventura en Hogwarts.");
                break;
            }
            else if (genero==2) {
                System.out.println("\nGÉNERO SELECCIONADO: MISTERIO");
                System.out.println("\n\"La mujer en la ventana\"\nAutor:A.J. Finn\nUna mujer que sufre de agorafobia espía a sus vecinos y se convierte en testigo de un crimen. La historia se desarrolla con un ambiente de tensión y misterio.");
                break;
            }
            else if (genero==3) {
                System.out.println("\nGÉNERO SELECCIONADO: ROMANCE");
                System.out.println("\n\"Como un susurro\"\nAutor:Megan Maxwell\nDescripción:Un romance contemporáneo que sigue a una joven que se enfrenta a sus inseguridades mientras se enamora de un hombre carismático.");
                break;
            }
            else if (genero==4) {
                System.out.println("\nGÉNERO SELECCIONADO: CIENCIA FICCIÓN");
                System.out.println("\n\"Fahrenheit 451\"\nAutor:Ray Bradbury\nDescripción:Una novela distópica sobre un futuro donde los libros están prohibidos y los \"bomberos\" queman cualquier literatura que encuentren.");
                break;
            }
            else if (genero==5) {
                System.out.println("Saliendo...");
            }
            else {
                System.out.println("Numero inválido, vuelva a intentarlo");
            }
        }while (genero!=5);
    }
}
