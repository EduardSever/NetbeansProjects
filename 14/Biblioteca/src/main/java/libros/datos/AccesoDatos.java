package libros.datos;

import java.util.List;
import libros.dominio.*;
import libros.excepciones.*;

public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Libro> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Libro libro, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
