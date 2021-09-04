package libros.datos;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import libros.dominio.*;
import libros.excepciones.*;

public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Libro> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Libro> libros = new ArrayList();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Libro libro = new Libro(linea);
                libros.add(libro);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return libros;
    }
    @Override
    public void escribir(Libro libro, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,anexar));
            salida.println(libro.toString());
            salida.close();
            System.out.println("Se ha escrito correctamente el libro en el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File (nombreArchivo);
        String resultado=null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea=null;
            int i=0;
            linea = entrada.readLine();
            while(linea != null){
                if (buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = " Libro: " + linea +  " encontrado en indice " +i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
            File archivo = new File (nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.err.println("Se ha creado el archivo correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se ha eliminado el archivo correctamente !!");
    }
}
