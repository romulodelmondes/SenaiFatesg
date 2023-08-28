package capitulo6.exemplos.exemplo3;

public abstract class Cliente {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        String txt = "\nNome: " + nome;
        return txt;
    }
}
