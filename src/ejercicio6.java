
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.*/
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese cuantas horas al día puede estudiar: ");
        double cantidadhoras=lectura.nextInt();

        String input; //Variable para cuando el usuario deje de ingresar materias.
        List<String> listaMaterias=new ArrayList<>(); //Lista para la cantidad de materias
        System.out.println("Ingrese que materias tiene que estudiar. Escriba 'salir' cuando termine.");
        while (true) {
            System.out.println("MATERIA:");
            input=lectura.nextLine();

            if (input.equalsIgnoreCase("salir")) {  //con la palabra salir rompe el if
                break;
            }
            listaMaterias.add(input); //Agrego cadena, esto va luego del salir para que "salir" no se agregue como materia
        }
        System.out.println("Ingreso las siguientes materias:");  //Muestra las materias que ingresó el usuario
        for (String str : listaMaterias) {
            System.out.println(str);
        }
        double horasTotalesSemanales = cantidadhoras * 7;
        double horasPorMateria = cantidadhoras/listaMaterias.size();
        System.out.println("\nPlan de Estudio");
        System.out.println("La cantidad de horas a la semana que usted tiene son: "+horasTotalesSemanales);
        System.out.println("Usted tendra "+horasPorMateria+" horas por materia (por dia)");
    }
}
