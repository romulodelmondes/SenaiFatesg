package capitulo4.exercicios.exercicio5;

public class Circulo {
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio > 0)
            this.raio = raio;
    }
    
    public float calcularCircunferencia(){
        return (float) (2*Math.PI * raio);
    }
    
    public float calcularArea(){
        return (float) (Math.PI*raio*raio);
    }
    
}
