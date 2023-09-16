package capitulo6.exercicios.desafio;

public enum TipoEnum {
    PALCO ("Palco"), TELEJORNAL ("Telejornal");
    private String tipo;
    
    private TipoEnum (String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return tipo;
    }
}
