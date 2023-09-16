package capitulo3.exemplos.exemplo22;

public class EstruturasCombinadas {

    public static void main(String[] args) {
        int quantidadeNumerosPrimos = 0;
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " é Primo?");
            int numeroDivisores = 0;
            int j = 1;
            while (j <= i) {
                if (i % j == 0) {
                    numeroDivisores++;
                }
                j++;
            }
            if (numeroDivisores == 2) {
                quantidadeNumerosPrimos++;
                System.out.println("... Sim!");
            } else {
                System.out.println("... Não!");
            }
        }
        System.out.println("Quantidade de números primos: " + quantidadeNumerosPrimos);
    }
}
