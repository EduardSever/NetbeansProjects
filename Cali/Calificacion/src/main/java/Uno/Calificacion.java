package Uno;

import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa calificación:");
        double cal = sc.nextDouble();
        if (cal > 10 || cal < 0) {
            System.out.println("Calificacion Invalida");
        }
        if (cal >= 0 && cal < 6) {
            System.out.println("Reprobo");
        }else if(cal>=6 && cal<=10){
            System.out.println("Aprobo");
        }
    }
}
