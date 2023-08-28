package capitulo6.exemplos.exemplo3;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String txt = super.toString();
        txt = txt + "\nCNPJ: " + cnpj;
        return txt;
    }
}
