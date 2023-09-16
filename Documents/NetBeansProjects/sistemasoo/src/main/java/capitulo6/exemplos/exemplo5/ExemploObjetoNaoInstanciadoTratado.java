package capitulo6.exemplos.exemplo5;

public class ExemploObjetoNaoInstanciadoTratado {

    public static void main(String[] args) {
        Pessoa pessoa = null;
        try {
            pessoa.setNome("Joshua");
        } catch (NullPointerException e) {
            pessoa = new Pessoa();
        } finally {
            pessoa.setNome("Joshua");
        }
    }
}
