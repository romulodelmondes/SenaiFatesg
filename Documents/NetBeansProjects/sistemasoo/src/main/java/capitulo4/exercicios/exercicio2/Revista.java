package capitulo4.exercicios.exercicio2;

public class Revista {
    private String nome;
    private int paginaAtual;
    private int totalPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    
    public void avancarPagina(){
        if (paginaAtual < totalPaginas){
            paginaAtual++;
        }
    }
    
    public void retrocederPagina(){
        if (paginaAtual > 1){
            paginaAtual--;
        }
    }
    
}
