/*
 *
 * Faça um programa que defina duas variáveis inteiras (a e b)
 * e que solicite ao usuário os valores delas. Utilizando a
 * estrutura condicional if-else, imprima os dois valores
 * atribuídos e o maior valor digitado. Exemplo:
 *
 * Valor de A: 10
 * Valor de B: 20
 * Maior: 20
 * 
 */

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
