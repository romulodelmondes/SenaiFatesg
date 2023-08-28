package capitulo6.exercicios.exercicio7;

public class UsuarioException extends RuntimeException{
    public static final String LOGIN_BRANCO ="Login em branco";
    public static final String LOGIN_INVALIDO ="Login inválido";
    public static final String SENHA_BRANCO ="Senha em branco";
    public static final String SENHA_INVALIDA ="Senha inválida";
    
    public UsuarioException(String descricao){
        super(descricao);
    }
    
    public static void lancarExcecaoLoginEmBranco() throws UsuarioException{
        UsuarioException ue = new UsuarioException(LOGIN_BRANCO);
        throw ue;
    }
    
    public static void lancarExcecaoLoginInvalido() throws UsuarioException{
        UsuarioException ue = new UsuarioException(LOGIN_INVALIDO);
        throw ue;
    }
    
    public static void lancarExcecaoSenhaEmBranco() throws UsuarioException{
        UsuarioException ue = new UsuarioException(SENHA_BRANCO);
        throw ue;
    }
    
    public static void lancarExcecaoSenhaInvalida() throws UsuarioException{
        UsuarioException ue = new UsuarioException(SENHA_INVALIDA);
        throw ue;
    }
    
    
    
}
