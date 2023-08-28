package capitulo6.exercicios.exercicio6;

public class Material {

    private String nome;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isBlank()) {
            MaterialException.lancarExcecaoNomeEmBranco();
        }
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        if (peso < 0) {
            MaterialException.lancarExcecaoPesoMenorQueZero();
        }
        this.peso = peso;
    }
}
