package abstracto.domain;

public class Retangulo extends FiguraGeometrica{
    
     public Retangulo(String tipoFigura){
     super(tipoFigura);   
    }
    @Override
    public void dibujar(){
        //Agregamos el comportamiento del metodo abstracto
        System.out.println("Aquí deberia dibujar:"+this.getClass().getSimpleName() );
    }
    
    
}
