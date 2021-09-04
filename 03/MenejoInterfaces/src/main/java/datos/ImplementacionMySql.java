package datos;
public class ImplementacionMySql implements AccesoDatos{

    @Override
    public void insertar() {
        System.err.println("Insertar datos desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar datos desde MySql");
    }
    
}
