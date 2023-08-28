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
