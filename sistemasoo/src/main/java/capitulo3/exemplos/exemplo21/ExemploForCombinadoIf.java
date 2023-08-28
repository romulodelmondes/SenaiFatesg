package capitulo3.exemplos.exemplo21;

public class ExemploForCombinadoIf {

    public static void main(String[] args) {
        System.out.println("Digite um valor: ");
        int maior = new java.util.Scanner(System.in).nextInt();
        System.out.println("Maior: " + maior);
        for (int i = 1; i <= 9; i++) {
            System.out.println("Digite um valor: ");
            int x = new java.util.Scanner(System.in).nextInt();
            if (x > maior) {
                maior = x;
            }
            System.out.println("Maior: " + maior);
        }
    }
}
