package capitulo6.exercicios.exercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite um número de ponto flutuante (float): ");
        float numero = teclado.nextFloat();
        String palavra = String.valueOf(numero);
    }
}
