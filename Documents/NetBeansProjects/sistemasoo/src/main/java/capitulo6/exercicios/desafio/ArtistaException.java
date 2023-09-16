package capitulo6.exercicios.desafio;

public class ArtistaException extends RuntimeException{
    public static final String CACHE_MENOR_QUE_ZERO ="Cache menor que zero";

    public ArtistaException(String descricao){
        super(descricao);
    }
    
    public static void lancarExcecaoCacheMenorQueZero() throws ArtistaException{
        ArtistaException ae = new ArtistaException(CACHE_MENOR_QUE_ZERO);
        throw ae;
    }
    
}
