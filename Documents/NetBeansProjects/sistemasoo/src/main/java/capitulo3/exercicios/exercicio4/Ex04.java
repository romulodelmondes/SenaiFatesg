/*
 *
 * Repita o exercício anterior, mas solicite ao usuário os
 * valores para as variáveis x, y e z.
 * 
 */

package capitulo3.exercicios.exercicio4;

public class Ex04 {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Entre com o valor de X: ");
        x = new java.util.Scanner(System.in).nextInt();
        System.out.println("Entre com o valor de Y: ");
        y = new java.util.Scanner(System.in).nextInt();
        System.out.println("Entre com o valor de Z: ");
        z = new java.util.Scanner(System.in).nextInt();
        
        System.out.println(x*y/z);
    }
}
