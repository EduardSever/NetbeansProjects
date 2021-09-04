package libros.mostrar;

public interface CatalogoLibros {

    public void agregarLibro(String nombreLibro, String nombreArchivo);

    public void listarLibros(String nombreLibro);

    public void buscarLibro(String nombreLibro, String buscar);

    public void iniciarArchivo(String nombreArchivo);
}
