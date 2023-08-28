package capitulo3.exercicios.exercicio7;

public class Ex07 {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Entre com o valor de A: ");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Entre com o valor de B: ");
        b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        if (a > b) {
            System.out.println("Maior: " + a);
        } else {
            System.out.println("Maior: " + b);
        }
    }
}
