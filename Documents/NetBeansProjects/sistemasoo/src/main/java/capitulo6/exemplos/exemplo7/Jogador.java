package capitulo6.exemplos.exemplo7;

public class Jogador {

    private String nome;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws JogadorException {
        if (idade < 18) {
            throw JogadorException.lancarExcecaoIdade();
        }
        this.idade = idade;
    }
}
