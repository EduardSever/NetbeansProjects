package libros.mostrar;

import java.util.List;
import libros.datos.*;
import libros.dominio.Libro;
import libros.excepciones.*;

public class CatalogoLibrosImpl implements CatalogoLibros {

    private final AccesoDatos datos;

    public CatalogoLibrosImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarLibro(String nombreLibro, String nombreArchivo) {
        Libro libro = new Libro(nombreLibro);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(libro, nombreArchivo, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarLibros(String nombreLibro) {
        try {
            List<Libro> libros = datos.listar(nombreLibro);
            for (Libro libro : libros) {
                System.out.println("Libro: " + libro);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarLibro(String nombreLibro, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(nombreLibro, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buuscar el libro");
            ex.printStackTrace();
        }
        System.out.println("Resultado de busqueda:" + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            }else{
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso de datos");
            ex.printStackTrace();
        }
    }
}
