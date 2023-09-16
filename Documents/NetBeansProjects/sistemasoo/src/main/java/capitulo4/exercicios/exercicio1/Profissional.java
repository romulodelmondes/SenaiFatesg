package capitulo4.exercicios.exercicio1;

public abstract class Profissional implements Pagamento {

    private String cpf;
    private String nome;
    protected float salarioBruto;

    public Profissional() {
        salarioBruto = 0;
    }

    public Profissional(String cpf, String nome, float salarioBruto) {
        this.cpf = cpf;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        char digito10, digito11;
        int somatorio, i, r, numero, peso;

        somatorio = 0;
        peso = 10;
        for (i = 0; i < 9; i++) {
            numero = (int) (cpf.charAt(i) - 48);
            somatorio = somatorio + (numero * peso);
            peso = peso - 1;
        }

        r = 11 - (somatorio % 11);
        if ((r == 10) || (r == 11)) {
            digito10 = '0';
        } else {
            digito10 = (char) (r + 48);
        }
        somatorio = 0;
        peso = 11;
        for (i = 0; i < 10; i++) {
            numero = (int) (cpf.charAt(i) - 48);
            somatorio = somatorio + (numero * peso);
            peso = peso - 1;
        }

        r = 11 - (somatorio % 11);
        if ((r == 10) || (r == 11)) {
            digito11 = '0';
        } else {
            digito11 = (char) (r + 48);
        }

        if ((digito10 != cpf.charAt(9)) || (digito11 == cpf.charAt(10))) {
            return;
        }
        
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto >= 0) {
            this.salarioBruto = salarioBruto;
        }
    }

    float calcularSalarioLiquido(float desconto, float bonus) {
        return (salarioBruto * desconto) + bonus;
    }

    public abstract String obterRegistroProfissional();

    @Override
    public float calcularDespesa() {
        return salarioBruto;
    }

}
