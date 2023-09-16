package capitulo3.exemplos.exemplo14;

public class OperadorTernario {

    public static void main(String[] args) {
        System.out.println("Entre com um valor para x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println(x % 2 == 0 ? "É Par" : "É ímpar");
    }
}
