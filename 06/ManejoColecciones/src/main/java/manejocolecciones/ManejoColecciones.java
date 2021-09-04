package manejocolecciones;
import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        //En general conbinacion de elementos de tipo integer y string
        miLista.add("0");
        //Elemento de tipo integer
        miLista.add(1);
        miLista.add(1);
        //Elementos de tipo string
        miLista.add("Casa");
        //Elemento repetido
        miLista.add(2);
        
            //imprimir(miLista);
            
            Set miSet = new  HashSet();
            miSet.add("100");
            miSet.add("200");
            miSet.add("300");
            //Elemento duplicado
            miSet.add("300");
            
            //imprimir(miSet);
            
            Map miMapa = new HashMap();
            //llave, valor
            miMapa.put("Valor 1", "Pedro");
            miMapa.put("Valor 2", "Raul");
            miMapa.put("Valor 3", "Martinez");
            //Elemento duplicado, el valor duplicado sustitulle el primer valor por el segundo
            miMapa.put("Valor 3", "Rosa");
            //Imprimimos todas las llaves
            //imprimir(miMapa.keySet());
            //Imprimimos todos los valores
            //imprimir(miMapa.values());
            System.out.println(miMapa.get("Valor 1"));
    }
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento:   "+ elemento);
        }
        System.out.println("");
    }
    
}
