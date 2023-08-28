package capitulo6.exercicios.exercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        System.out.println("Primeira Letra: " + palavra.charAt(0));
        System.out.println("Última Letra: " + palavra.charAt(palavra.length()-1));
    }
}
