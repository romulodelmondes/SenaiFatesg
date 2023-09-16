package capitulo6.exemplos.exemplo6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Robo robo1 = new Robo();
        try {
            System.out.println("Qual a distância percorrida? ");
            int dist = entrada.nextInt();
            System.out.println("Qual o tempo gasto para a distância? ");
            int tempo = entrada.nextInt();
            robo1.calcularVelocidade(tempo, dist);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível alterar a velocidade quando o tempo é zero!");
        } finally {
            System.out.println("A velocidade atual do robô é " + robo1.getVelocidade());
        }
    }
}
