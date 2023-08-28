package capitulo6.exercicios.exercicio7;

public enum PerfilEnum {
    OPERADOR ("Operador"), ADMIN ("Administrador");
    private String perfil;
    
    private PerfilEnum (String perfil){
        this.perfil = perfil;
    }
    
    @Override
    public String toString(){
        return perfil;
    }
}
