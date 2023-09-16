package capitulo4.exercicios.exercicio1;


public class Professor extends Profissional {

    private int horasTrabalhadas;

    public Professor() {
        super();
    }

    public Professor(String cpf, String nome, float salarioBruto) {
        super(cpf, nome, salarioBruto);
    }

    public Professor(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    float calcularSalarioLiquido(float desconto, float bonus) {
        return ((getSalarioBruto() * horasTrabalhadas) * desconto) + bonus;
    }

    float calcularSalarioLiquido(float desconto) {
        return ((salarioBruto * horasTrabalhadas) * desconto);
    }

    @Override
    public String obterRegistroProfissional() {
        return getCpf();
    }
}
