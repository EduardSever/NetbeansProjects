package test;

import datos.*;
import excepciones.*;

public class MenejoExcepciones2 {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(false);
        ejecutar(datos, "listar");
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(false);
        ejecutar(datos2, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error de lectura");
                ex.printStackTrace(System.out);
            } catch (AccesoDatosEx ex) {
                System.out.println("Error acceso a datos");
                ex.printStackTrace(System.out);
            }catch(Exception ex){
                System.out.println("Error gerneral");
                ex.printStackTrace(System.out);
            }
            finally{
                System.out.println("Procesar finally es opcional, pero siempre se va a ejecutar");
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace(System.out);
            }
            finally{
                System.out.println("Procesar finally es opcional");
            }
        }else{
            System.out.println("No se proporciono ninguna accion conocida");
                    }
        }
    }
