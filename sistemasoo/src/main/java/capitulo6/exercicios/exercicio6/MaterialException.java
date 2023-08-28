package capitulo6.exercicios.exercicio6;

public class MaterialException extends RuntimeException{
    public static final String NOME_BRANCO ="Nome em branco";
    public static final String PESO_MENOR_QUE_ZERO ="Peso menor que zero";
    
    public MaterialException(String descricao){
        super(descricao);
    }
    
    public static void lancarExcecaoNomeEmBranco() throws MaterialException{
        MaterialException me = new MaterialException(NOME_BRANCO);
        throw me;
    }
    
    public static void lancarExcecaoPesoMenorQueZero() throws MaterialException{
        MaterialException me = new MaterialException(PESO_MENOR_QUE_ZERO);
        throw me;
    }
    
}
