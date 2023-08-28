package capitulo6.exercicios.desafio;

public class ProgramaTvException extends RuntimeException{
    public static final String DURACAO_MENOR_QUE_ZERO ="Duração menor que zero";

    public ProgramaTvException(String descricao){
        super(descricao);
    }
    
    public static void lancarExcecaoDuracaoMenorQueZero() throws ProgramaTvException{
        ProgramaTvException pe = new ProgramaTvException(DURACAO_MENOR_QUE_ZERO);
        throw pe;
    }
    
}
