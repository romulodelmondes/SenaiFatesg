package capitulo4.exemplos.exemplo2;

public class Engenheiro {

    String nome;
    String crea;
    float salarioBruto;

    float calcularSalarioLiquido(float desconto, float bonus) {
        return (salarioBruto * desconto) + bonus;
    }

}
