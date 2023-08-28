package capitulo6.exercicios.desafio;

public enum EspecialidadeEnum {
    TEC ("Tecnico"), ADM ("Administrador");
    private String especialidade;
    
    private EspecialidadeEnum (String especialidade){
        this.especialidade = especialidade;
    }
    
    @Override
    public String toString(){
        return especialidade;
    }
}
