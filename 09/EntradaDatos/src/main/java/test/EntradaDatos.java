
package test;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
     String captura = null;
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Introcude un valor: ");
        captura = scanner.nextLine();
        while(!"salir".equals(captura)){
             System.out.println("Dato introcducido: "+ captura);
             captura = scanner.nextLine();
        }
    }
}
