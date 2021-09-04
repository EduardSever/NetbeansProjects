package biblioteca;

import java.util.Scanner;
import libros.mostrar.*;

public class CPJLaboratorioFinal {

    public static final Scanner teclado = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "E:\\WorkspaceNetBeans\\14\\Archivo.txt";
    private static final CatalogoLibros catalogoBook = new CatalogoLibrosImpl();

    public static void main(String[] args) {
            while (opcion != 0) {
            try {
                System.out.println("Elige una opcion:\n"    
                        + "1.- Iniciar catalogo libros\n"
                        + "2.- Agregar libro\n"
                        + "3.- Listar libros\n"
                        + "4.- Buscar libro\n"
                        + "0.- Salir");
                opcion = Integer.parseInt(teclado.nextLine());
                switch (opcion) {
                    case 1:
                        catalogoBook.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de un libro a agregar:");
                        String nombre = teclado.nextLine();
                        catalogoBook.agregarLibro(nombre, nombreArchivo);
                        break;
                    case 3:
                        
                        catalogoBook.listarLibros(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de un libro a buscar:");
                        String buscar = teclado.nextLine();
                        catalogoBook.buscarLibro(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.err.println("!Hasta pronto!");
                        break;
                    default:
                        System.err.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
