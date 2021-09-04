package manejojavabeans;

import beans.PersonaBean;

public class ManejoJavaBeans {

    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setNombre("juan");
        bean.setEdad(20);
        
        System.out.println("Nombre: "+bean.getNombre());
        System.out.println("Edad: "+bean.getEdad());
        
        
        PersonaBean bean2 = new PersonaBean("Perla",34);
        System.out.println(bean2);
        
    }
}
