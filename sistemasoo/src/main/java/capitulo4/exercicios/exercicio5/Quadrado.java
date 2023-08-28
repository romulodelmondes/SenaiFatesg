package capitulo4.exercicios.exercicio5;

public class Quadrado {
    private float lado;

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
    
    public float calcularArea(){
        return lado * lado;
    }
    
}
