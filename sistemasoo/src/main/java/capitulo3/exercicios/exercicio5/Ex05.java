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
