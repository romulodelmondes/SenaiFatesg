package capitulo3.exemplos.exemplo9;

public class ParOuImpar {

    public static void main(String[] args) {
        System.out.println("Entre com um valor para x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        if (x % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }
}
