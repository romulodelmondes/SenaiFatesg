package capitulo6.exercicios.desafio;

public class FuncionarioException extends RuntimeException{
    public static final String NOME_BRANCO ="Nome em branco";
    public static final String CPF_BRANCO ="CPF em branco";
    
    public FuncionarioException(String descricao){
        super(descricao);
    }
    
    public static void lancarExcecaoNomeEmBranco() throws FuncionarioException{
        FuncionarioException fe = new FuncionarioException(NOME_BRANCO);
        throw fe;
    }
        
    public static void lancarExcecaoCPFEmBranco() throws FuncionarioException{
        FuncionarioException fe = new FuncionarioException(CPF_BRANCO);
        throw fe;
    }
    
}
