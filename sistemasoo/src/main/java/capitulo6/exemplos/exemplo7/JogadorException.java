package capitulo6.exemplos.exemplo7;

public class JogadorException extends RuntimeException {

    private static final String EXCECAO_IDADE = "Idade menor que 18 anos";

    public JogadorException(String message) {
        super(message);
    }

    public static JogadorException lancarExcecaoIdade() {
        return new JogadorException(EXCECAO_IDADE);
    }
}
