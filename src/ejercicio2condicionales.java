import java.util.Scanner;

/*Ejercicio 2: Calculadora de Descuentos
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.*/
public class ejercicio2condicionales {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("CALCULADORA DE DESCUENTOS");
        System.out.println("\nIngrese el precio del producto");
        float precioproducto= lectura.nextFloat();
        System.out.println("¿Que categoría de cliente tiene?\n1.Estudiante\n2.Adulto\n3.Jubilado");
        int catcliente= lectura.nextInt();
        if (catcliente==1) {
            System.out.println("\nCategoría Estudiante (descuento de 10%)");
            System.out.println("El descuento del producto es "+ (precioproducto * (10.00/100.00)));
            System.out.println("El precio final es $"+ (precioproducto - (precioproducto*(10.00/100.00))));
        }
        else if (catcliente==2) {
            System.out.println("\nCategoría Adulto (descuento de 5%)");
            System.out.println("El descuento del producto es "+ (precioproducto * (5.00/100.00)));
            System.out.println("El precio final es $"+ (precioproducto - (precioproducto*(5.00/100.00))));
        }
        else if (catcliente==3) {
            System.out.println("\nCategoría Jubilado (descuento de 15%)");
            System.out.println("El descuento del producto es "+ (precioproducto * (15.00/100.00)));
            System.out.println("El precio final es $"+ (precioproducto - (precioproducto*(15.00/100.00))));
        }
    }
}
