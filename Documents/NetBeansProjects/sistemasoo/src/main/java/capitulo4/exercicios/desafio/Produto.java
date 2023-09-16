package capitulo4.exercicios.desafio;

public abstract class Produto {
    public static final float FRETE_POR_KM = 2;
    private String nome;
    private float preco;
    
    public Produto(String nome, float preco){
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0){
            this.preco = preco;
        }
    }
            
    public abstract float calcularPreco();
    
    public static float calcularFrete(float distancia){
        if (distancia >=0){
            return distancia * FRETE_POR_KM;
        }
        else{
            return 0;
        }
    }
    
    public float calcularTotal (float distancia){
        return calcularPreco() + calcularFrete(distancia);
    }
            
}
