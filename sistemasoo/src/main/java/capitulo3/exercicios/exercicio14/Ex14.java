package capitulo3.exercicios.exercicio14;

public class Ex14 {

    public static void main(String[] args) {
        int numeroPrimos = 0;
        for (int i = 2; i <= 1000; i++) {
            int qtdMultiplos = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    qtdMultiplos++;
                }
            }
            if (qtdMultiplos == 2) {
                numeroPrimos++;
            }
        }
        System.out.println("Número de primos: " + numeroPrimos);
    }
}
