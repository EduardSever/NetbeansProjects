package datos;

import excepciones.AccesoDatosEx;
import excepciones.*;

public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;
    public void insertar() throws AccesoDatosEx{
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }else{
            System.out.println("Insertar desde Oracle");
        }
        System.err.println("Insertar datos desde Oracle");
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(this.simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else
        System.out.println("Listar datos desde Oracle");
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError=simularError;
    }
    public boolean isSimularError(){
        return this.simularError;
    }
}
    