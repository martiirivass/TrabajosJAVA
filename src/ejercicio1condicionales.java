import java.util.Scanner;
/*Ejercicio 1: Sistema de Recomendación de Películas
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.*/
public class ejercicio1condicionales {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un género de película:\n1.ACCIÓN\n2.COMEDIA\n3.DRAMA\n4.CIENCIA FICCIÓN");
        int genero= lectura.nextInt();
        if (genero==1) {
            System.out.println("\nPELICULAS DE ACCIÓN RECOMENDADAS");
            System.out.println("\nThe Matrix (1999)\nUna innovadora película de ciencia ficción que combina acción y filosofía, en un mundo donde la realidad es una simulación.");
            System.out.println("\nGladiator (2000)\nUn general romano es traicionado y se convierte en gladiador, buscando venganza en el Coliseo.");
            System.out.println("\nTerminator 2: Judgment Day (1991)\nLa secuela de \"The Terminator\", con impresionantes efectos especiales y una emocionante trama de ciencia ficción.");
            System.out.println("\nJohn Wick (2014)\nUn exasesino a sueldo busca vengarse después de que le roban lo que más ama. Con un estilo de combate único y una narrativa intrigante.");
        }
        else if (genero==2) {
            System.out.println("\nPELICULAS DE COMEDIA RECOMENDADAS");
            System.out.println("\nDumb and Dumber (1994)\nLa historia de dos amigos torpes que emprenden un viaje cross-country para devolver una maleta perdida.");
            System.out.println("\nThe 40-Year-Old Virgin (2005)\nUn hombre que nunca ha tenido relaciones sexuales se embarca en una misión para cambiar eso, con resultados cómicos.");
            System.out.println("\nZombieland (2009)\nUna comedia de terror sobre un grupo de sobrevivientes en un mundo lleno de zombis, con momentos cómicos y acción.");
            System.out.println("\nJump Street (2012)\nDos policías jóvenes se infiltran en una escuela secundaria para desmantelar un anillo de drogas, con un humor irreverente y dinámicas divertidas.");
        }
        else if (genero==3) {
            System.out.println("\nPELICULAS DE DRAMA RECOMENDADAS");
            System.out.println("\nForrest Gump (1994)La vida de un hombre con discapacidad intelectual que, a lo largo de varias décadas, se convierte en testigo y protagonista de momentos clave de la historia estadounidense.");
            System.out.println("\nMoonlight (2016)\nUn poderoso relato sobre la vida de un joven afroamericano que enfrenta su identidad y sexualidad mientras crece en un vecindario difícil de Miami.");
            System.out.println("\nThe Godfather (1972)\nUn drama épico sobre la familia mafiosa Corleone y las luchas de poder dentro del crimen organizado en Estados Unidos.");
            System.out.println("\nFight Club (1999)\nna crítica a la cultura consumista y la identidad masculina, sigue la vida de un hombre insatisfecho que forma un club de lucha clandestino.");
        }
        else if (genero==4) {
            System.out.println("\nPELICULAS DE CIENCIA FICCIÓN RECOMENDADAS");
            System.out.println("\nInterstellar (2014)\nUn grupo de astronautas viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad, explorando temas de amor, tiempo y sacrificio.");
            System.out.println("\nInception (2010)\nUn ladrón que roba secretos de los sueños debe realizar la tarea inversa: implantar una idea en la mente de alguien, llevando al espectador a través de múltiples niveles de sueño.");
            System.out.println("\nGravity (2013)\nUn thriller espacial sobre dos astronautas que luchan por sobrevivir después de que su transbordador es destruido, con impresionantes efectos visuales y una intensa narrativa.");
            System.out.println("\nThe Fifth Element (1997)\nEn un futuro lejano, un taxista se convierte en el héroe que debe salvar a la humanidad de una fuerza oscura, lleno de acción, humor y visuales únicos.");
        }
        else {
            System.out.println("El número ingresado no corresponde a ningún género");
        }
    }
}
