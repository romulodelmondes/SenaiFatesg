/*
 *
 * Considere dois ponto no plano cartesiano, o Ponto 1 o Ponto 2,
 * e suas respectivas coordenadas. As coordenadas do Ponto 1 são
 * definidas pelas variáveis x1 e y1, e as coordenadas do Ponto 2
 * são deinidas pelas variáveis x2 e y2. Faça um programa que calcule
 * a distância euclidiana (d) entre dois pontos considerando os
 * valores digitados pelo usuário para as variáveis x1, y1, x2 e y2.
 * Considere d = (x1 - x2)² + (y1 - y2)². Por exemplo, suponha que o
 * usuário digitou para o Ponto 1 as coordenadas 2 e 3; além disso,
 * suponha que os valores digitados pra o Ponto 2 tenham sido 4 e 5.
 * O prograa deverá ter a seguinte saída:
 *
 * Ponto 1: (2,3)
 * Ponto 2: (4,5)
 * Distância: 8
 * 
 */

package capitulo3.exercicios.exercicio6;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Entre com as coordenadas do Ponto 1");
        
        System.out.println("Entre com o valor de X do Ponto 1");
        int x1 = new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o valor de Y do Ponto 1");
        int y1 = new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com as coordenadas do Ponto 2");
        
        System.out.println("Entre com o valor de X do Ponto 2");
        int x2 = new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Entre com o valor de Y do Ponto 2");
        int y2 = new java.util.Scanner(System.in).nextInt();
        
        double d = ((x1-x2) * (x1-x2)) + ((y1-y2) * (y1-y2));
        
        System.out.println("Ponto 1: " + "("+ x1 + "," + y1 + ")");
        System.out.println("Ponto 2: " + "("+ x2 + "," + y2 + ")");
        System.out.println("Distância: " + d);
        
    }
}
