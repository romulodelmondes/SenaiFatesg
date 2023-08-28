package capitulo6.exemplos.exemplo3;

public class PessoaFisica extends Cliente{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
     @Override
    public String toString(){
        String txt = super.toString();
        txt = txt +  "\nCPF: " + cpf;
        return txt;
    }
}
