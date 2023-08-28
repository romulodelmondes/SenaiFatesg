package capitulo6.exercicios.exercicio4;

public class Material {

    private String nome;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.isBlank()){
            Exception e = new Exception ("Nome em branco!");
            throw e;
        }
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        if (peso < 0){
            Exception e = new Exception ("Peso menor do que zero");
            throw e;
        }
        this.peso = peso;
    }
}
