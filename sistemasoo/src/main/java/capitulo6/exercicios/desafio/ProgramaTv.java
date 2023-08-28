package capitulo6.exercicios.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProgramaTv implements Runnable{
    private String nome;
    private int duracao;
    private List<Funcionario> listaFuncionarios;
  
    public ProgramaTv(){
        listaFuncionarios = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        if (duracao < 0){
            ProgramaTvException.lancarExcecaoDuracaoMenorQueZero();
        }
        this.duracao = duracao;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }   
    
    public void removerFuncionario(Funcionario funcionario){
        listaFuncionarios.remove(funcionario);
    }   

    @Override
    public void run() {
        int tempo = 0;
        System.out.println("Programa iniciado");
        while ( (tempo / 60000) < duracao){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgramaTv.class.getName()).log(Level.SEVERE, null, ex);
            }
            tempo = tempo + 1000;
        }
        System.out.println("Fim do Programa. Tempo decorrido: " + tempo/60000 + " minuto(s) ");
    }
    
}
