package test;
import static calculadora.Operaciones.*;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.print("Valor Uno: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Valor Dos: ");
        int b = sc.nextInt();
        int resultado = sumar(a , b);
        int resultado1 = restar(a , b);
        int resultado2 = multiplicar(a , b);
        int resultado3 = dividir(a , b);
        int resultado4 = porcentaje(a , b);
        System.out.println("El resultado de la suma es: "+ resultado);
        System.out.println("El resultado de la suma es: "+ resultado1);
        System.out.println("El resultado de la suma es: "+ resultado2);
        System.out.println("El resultado de la suma es: "+ resultado3);
        System.out.println("El resultado de la suma es: "+ resultado4);
    }
}
