/*
 *
 * Faça um programa que calcule a distância em quilômetros (km)
 * percorrida or um carro. Solicite ao usuário a velocidade em
 * quilômetros por hora (km/h) e o tempo da viagem em horas.
 * O programa deve apresentar a velocidade e o tempo informados
 * pelo usuário, bem como a distância calculada. Exemplo:
 *
 * Velocidade: 100 km/h
 * Tempo da viagem: 3 horas
 * Distância percorrida: 300 km
 * 
 */

package capitulo3.exercicios.exercicio5;

public class Ex05 {
    public static void main(String[] args) {
        float distancia, velocidade, tempo;
        
        System.out.println("Entre com a velocidade (km/h) do carro: ");
        velocidade = new java.util.Scanner(System.in).nextFloat();
        System.out.println("Entre com o tempo (horas) de viagem do carro: ");
        tempo = new java.util.Scanner(System.in).nextFloat();
        
        distancia = velocidade * tempo;
        
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
    }
}
