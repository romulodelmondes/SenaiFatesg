/*
 *
 * Repita o exercício anterior, mas crie uma variável com o nome
 * maior. Utilizando o operador ternário, atribua o maior valor
 * à variável maior e apresente na tela em seguida da mesma forma
 * que foi exemplificado anteriormente.
 * 
 */

package capitulo3.exercicios.exercicio8;

public class Ex08 {

    public static void main(String[] args) {
        int a, b, maior;
        System.out.println("Entre com o valor de A: ");
        a = new java.util.Scanner(System.in).nextInt();
        System.out.println("Entre com o valor de B: ");
        b = new java.util.Scanner(System.in).nextInt();
        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);
        maior = a > b ? a : b;
        System.out.println("Maior: " + maior);
    }
}
