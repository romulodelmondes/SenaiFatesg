package capitulo4.exercicios.exercicio6;

public class Quadrado extends FiguraGeometrica{
    private float lado;

    public Quadrado(float lado){
        this.setLado(lado);
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        if (lado > 0)
            this.lado = lado;
    }
    
    public float calcularPerimetro(){
        return lado * 4;
    }
    
    @Override
    public float calcularArea(){
        return lado * lado;
    }
    
}
