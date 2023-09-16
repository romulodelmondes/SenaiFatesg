package capitulo4.exercicios.exercicio1;

public class Principal {

    public static void main(String[] args) {

        Engenheiro e1 = new Engenheiro();
        e1.setNome("José");
        e1.setSalarioBruto(10000);
        System.out.println("Salário Líquido: "
                + e1.calcularSalarioLiquido(0.8f, 400.70f));

        Medico m1 = new Medico();
        m1.setNome("Vinicius");
        m1.setSalarioBruto(-10000);
        System.out.println("Salário Líquido: "
                + m1.calcularSalarioLiquido(0.7f, 1500.70f));

        Professor p1 = new Professor();
        p1.setNome("Pablo");
        p1.setHorasTrabalhadas(160);
        p1.setSalarioBruto(50);
        System.out.println("Salário Líquido: "
                + p1.calcularSalarioLiquido(0.6f, 500.30f));
        System.out.println("Salário Líquido: "
                + p1.calcularSalarioLiquido(0.6f));

        Professor p2 = new Professor(55);
        p2.setNome("Rodrigo");
        p2.setHorasTrabalhadas(160);
        
        Engenheiro eng = new Engenheiro();
        System.out.println("Piso Salarial: " + eng.PISO_SALARIAL);
        
        System.out.println("Piso salarial: " + Engenheiro.PISO_SALARIAL);
        System.out.println("Piso salarial corrigido: " + 
                Engenheiro.calcularPisoCorrigido(1.3f));

    }
}