package test;

import static utileria.Archivo.*;

public class ManejoArchivos {

    public static void main(String[] args) {
        String nombreArchivo = "E:\\WorkspaceNetBeans\\11\\archivoPruebaJava.txt";
        //Creamos un archivo
        //crearArchivo(nombreArchivo);
       
        //Escribir archivo
        //escribirArchivo(nombreArchivo);
        
        //Leer informacion de un archivo
        leerArchivo(nombreArchivo);
        
        //Anexar información
        anexarArchivo(nombreArchivo); 
    }
}
