package capitulo4.exemplos.exemplo4;

public class Medico extends Profissional {

    private String crm;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String obterRegistroProfissional() {
        return crm;
    }
}
