package capitulo4.exercicios.desafio;

public class Informatica extends Produto{
    public static final float DESCONTO_A_VISTA = 0.1f;
    
    private String tipoPagamento;

    public Informatica(String nome, float preco, String tipoPagamento){
        super(nome, preco);
        setTipoPagamento(tipoPagamento);
    }
    
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public float calcularPreco() {
        if (tipoPagamento.equals("A VISTA")){
            return getPreco() - (DESCONTO_A_VISTA * getPreco());
        }
        return getPreco();
    }
    
    
}
