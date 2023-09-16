package capitulo4.exercicios.desafio;

public final class Vestuario extends Produto {

    public static final float DESCONTO_QTD = 0.05f;

    private int quantidade;

    public Vestuario(String nome, float preco, int quantidade){
        super(nome, preco);
        setQuantidade(quantidade);
    }
    
    @Override
    public float calcularPreco() {
        if (quantidade > 5){
            return (getPreco()*quantidade) - ((getPreco() * quantidade) * DESCONTO_QTD);
        }
        return getPreco() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

}
