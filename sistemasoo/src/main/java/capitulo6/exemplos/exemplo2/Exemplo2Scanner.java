package capitulo6.exemplos.exemplo2;

import java.util.Scanner;

public class Exemplo2Scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
 
        String nome = entrada.nextLine(); 
        
        if (entrada.hasNextInt()) {
            Integer valorI = entrada.nextInt(); 
        }
        if (entrada.hasNextFloat()) {
            Float valorF = entrada.nextFloat();  
        }
        if (entrada.hasNextDouble()) {
            Double valorD = entrada.nextDouble();
        }
        if (entrada.hasNextBoolean()) {
            Boolean valorB = entrada.nextBoolean();
        } 
    }
}

