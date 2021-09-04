
package manejointerfaces;

import datos.*;

public class ManejoInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        
        datos = new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        
        System.err.println(AccesoDatos.MAX_REGISTROS);
        //Todas las variables definidas en una interface son ¡¡public static final!! esto quiere desit que no se pueden modificar 
        //AccesoDatos.MAX_REGISTROS=12;
    }
}
