package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {
        public static final Scanner sc = new Scanner(System.in);
        private static int opcion = -1;
        private static final String nombreArchivo = "E:\\WorkspaceNetBeans\\13\\archivoPruebaJava.txt";
        private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
     
        public static void main(String[] args) {
            
            while(opcion !=0){
                try {
                    System.out.println("Elige opcion:\n1.-Iniciar catalogo peliculas"
                            + "\n2.- Agregar pelicula"
                            + "\n3.- Listar pelicula"
                            + "\n4.- Buscar pelicula"
                            + "\n0.- Salir"
                            + "\n.- Ingresar opcion: ");
                    opcion = Integer.parseInt(sc.nextLine());
                    //Ejemplo de switch case en Java
                    switch(opcion){
                        case 1:
                            //1.Creamos el objeto que administra el catalogo de personas
                            //La creacion del archivo es opcional, de todas maneras se creara
                            //al escribir por primera vez en el archivo
                            catalogoPeli.iniciarArchivo(nombreArchivo);
                            break;
                        case 2:
                            //2.Agregar información archivo
                            System.out.println("Introduce el nombre de una pelicula a agregar");
                            String nombre = sc.nextLine();
                            catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                            break;
                        case 3:
                            //3. listar catalogo completo
                           catalogoPeli.listarPeliculas(nombreArchivo);
                            break;
                        case 4:
                            //4.Buscar pelicula
                            System.out.println("Introduce el nombre de la pelicula a buscar: ");
                            String buscar = sc.nextLine();
                            catalogoPeli.buscarPelicula(nombreArchivo , buscar);
                            break;
                        case 0:
                            System.out.println("!Hasta pronto¡");
                            break;
                        default:
                            System.out.println("Opcion no reconicida");
                            break;
                    }
                    System.out.println("\n");
                    
                } catch (Exception e) {
                    System.out.println("Error!");
                }
            }
     }
}
