package capitulo4.exercicios.desafio;

public class Principal {
    public static void main(String[] args) {
        Informatica inf = new Informatica("Switch", 2000,"A VISTA");
        Vestuario vest = new Vestuario ("Blusa",100, 6);
        System.out.println("Valor: " + inf.calcularTotal(15));
        System.out.println("Valor: " + vest.calcularTotal(15));
    }
}
