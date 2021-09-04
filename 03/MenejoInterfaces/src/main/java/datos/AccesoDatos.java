package datos;

public interface AccesoDatos {
   
    // int MAX_REGISTROS=10;
    //La declaracion de la variable son de igual forma pues !!public static final¡¡ se agregan automaticamente
    public static final int MAX_REGISTROS=10;
    
    public abstract void insertar();
    
    public abstract void listar();
    
}
