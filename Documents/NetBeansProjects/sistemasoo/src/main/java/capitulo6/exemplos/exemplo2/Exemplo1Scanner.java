package capitulo6.exemplos.exemplo2;

import java.util.Scanner;

public class Exemplo1Scanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        Integer valorI = entrada.nextInt();
        Float valorF = entrada.nextFloat();
        Double valorD = entrada.nextDouble();
        Boolean valorB = entrada.nextBoolean();
    }
}
