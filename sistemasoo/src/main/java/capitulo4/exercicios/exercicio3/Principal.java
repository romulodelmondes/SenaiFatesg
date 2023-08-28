package capitulo4.exercicios.exercicio3;

public class Principal {
    public static void main(String[] args) {
        Impressora impressora = new Impressora("Melhor Qualidade", 50);
        System.out.println("Autonomia da impressora: " + impressora.calcularAutonomia() + " páginas ");
    }
}
