package capitulo4.exemplos.exemplo2;

public class Principal {

    public static void main(String[] args) {
        Engenheiro e1 = new Engenheiro();
        e1.nome = "José";
        e1.salarioBruto = 10000;
        System.out.println("Salário Liquido: " + e1.calcularSalarioLiquido(0.8f, 400.70f));
    }
}
