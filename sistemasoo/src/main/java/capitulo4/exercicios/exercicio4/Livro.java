package capitulo4.exercicios.exercicio4;

public class Livro {
    private String nome;
    private String editora;
    private int anoPublicacao;

    public Livro (){
        nome = "Desconhecido";
        editora = "Desconhecida";
        anoPublicacao=0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome );
        System.out.println("Editora: " + editora );
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
    
}
