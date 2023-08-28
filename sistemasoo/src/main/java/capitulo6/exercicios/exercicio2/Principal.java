package capitulo6.exercicios.exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        String invertida="";
        for (int i=palavra.length()-1; i >=0; i--){
            invertida +=palavra.charAt(i);
        }
        System.out.println("Palavra invertida: " + invertida);
        if (invertida.equals(palavra)){
            System.out.println("Palindromo!");
        }
        else{
            System.out.println("Não é Palindromo!");
        }
   }
}