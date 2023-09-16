/*
 *
 * Utilizando a estrutura de repetição de sua preferência, faça
 * um algoritmo que calcule o fatorial de um número informado 
 * pelo usuário.
 * 
 */

package capitulo3.exercicios.exercicio12;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Entre com o número para obter seu fatorial: ");
        int numero  =  new java.util.Scanner(System.in).nextInt();
        
        int fatorial = 1;
        int n = numero;
        while (n > 1){
            fatorial = fatorial * n;
            n--;
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
