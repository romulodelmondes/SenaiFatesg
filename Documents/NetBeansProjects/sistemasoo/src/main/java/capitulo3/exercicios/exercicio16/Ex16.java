/*
 *
 * Faça um programa em Java que leia dos dados de uma matriz
 * quadrada e imprima a diagonal secundária da matriz. Utilize
 * a declaração convencional.
 * 
 */

package capitulo3.exercicios.exercicio16;

public class Ex16 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Entre com o valor para a posição [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }
        
        System.out.println("Diagonal Secundária");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j == (3-1)){
                    for (int k=j; k > 0; k--)
                        System.out.print("\t");
                    System.out.println( matriz[i][j] );
                }
            }
        }
        
    }
}
