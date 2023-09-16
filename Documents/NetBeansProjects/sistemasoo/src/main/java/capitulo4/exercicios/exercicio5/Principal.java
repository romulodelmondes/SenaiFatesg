package capitulo4.exercicios.exercicio5;

public class Principal {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.setLado(3);
        Circulo c1 = new Circulo ();
        c1.setRaio(1);
        
        System.out.println("Area do Quadrado: " + q1.calcularArea());
        System.out.println("Perimetro do Quadrado: " + q1.calcularPerimetro());
        
        System.out.println("Area do Circulo: " + c1.calcularArea());
        System.out.println("Circunferência: " + c1.calcularCircunferencia());
    }
}
