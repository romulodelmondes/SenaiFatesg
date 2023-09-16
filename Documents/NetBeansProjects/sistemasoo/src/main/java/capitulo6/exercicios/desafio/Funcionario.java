package capitulo6.exercicios.desafio;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private String cpf;
    private String nome;
    private List<ProgramaTv> listaProgramas;

    public Funcionario(){
        listaProgramas = new ArrayList();
    }
        
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isBlank()){
            FuncionarioException.lancarExcecaoCPFEmBranco();
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()){
            FuncionarioException.lancarExcecaoNomeEmBranco();
        }
        this.nome = nome;
    }

    public List<ProgramaTv> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(List<ProgramaTv> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }
    
    public void adicionarPrograma(ProgramaTv programa){
        listaProgramas.add(programa);
    }   
    
    public void removerPrograma(ProgramaTv programa){
        listaProgramas.remove(programa);
    }
    
}
