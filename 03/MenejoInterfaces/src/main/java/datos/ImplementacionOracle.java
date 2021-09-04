
package datos;

public class ImplementacionOracle implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar datos desde oracle");
    }

    @Override
    public void listar() {
        System.err.println("Listar datos desde oracle");
    }
    
}
