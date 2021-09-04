package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaDatos1 {
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader brInput = new BufferedReader(input);
        
        System.out.println("Introduce un dato: ");
        try {   
            captura= brInput.readLine();
            System.out.println("Dato introducido: "+ captura);
        } catch (IOException ex) {
            
            ex.printStackTrace(System.out);
            
        }
        
    }
}
