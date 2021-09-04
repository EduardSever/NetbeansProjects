package ejemploclasesabstractas;

import abstracto.domain.*;

public class EjemploClasesAbstractas {

    public static void main(String[] args) {
        //Creacion de objetos
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        FiguraGeometrica retangulo = new Retangulo("Retangulo");
        System.out.println(retangulo);
        retangulo.dibujar();

        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();

        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();

    }
}
