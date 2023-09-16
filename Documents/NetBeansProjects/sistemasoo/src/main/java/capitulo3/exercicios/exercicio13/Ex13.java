/*
 *
 * Utilizando a estrutura de repetição de sua preferência faça
 * um programa que defina duas variáveis inteiras (x e y) e 
 * solicite ao operador os valores. O programa deve caclcular
 * o valor da expressão x^y sem utilizar nenhuma função já
 * existente, ou seja, usando apenas operações aritméticas
 * simples, além de estruturas de repetição.
 * 
 */

package capitulo3.exercicios.exercicio13;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println ("Entre com o valor de x: ");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.println ("Entre com o valor de y: ");
        int y = new java.util.Scanner(System.in).nextInt();
        
        int resultado = 1;
        
        for (int i=0; i<y; i++){
            resultado = resultado * x;
        }
        
        System.out.println(x + " elevado a " + y + " é " + resultado);
    }
}
