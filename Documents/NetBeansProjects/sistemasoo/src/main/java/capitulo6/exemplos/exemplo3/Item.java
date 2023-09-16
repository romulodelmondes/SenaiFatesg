package capitulo6.exemplos.exemplo3;

public class Item {
    private Produto produto;
    private int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString(){
        String txt = "\n" + produto;
        txt = txt + "\nQuantidade: " + quantidade;
        return txt;
    }
    
}
