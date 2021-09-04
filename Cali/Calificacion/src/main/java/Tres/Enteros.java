package Tres;

import java.util.Scanner;

public class Enteros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa numero: ");
        int num = sc.nextInt();
        int resul = num*(num+1)/2;
            System.out.println("resulta " + resul);
        }
    }
