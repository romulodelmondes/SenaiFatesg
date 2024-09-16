/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex2.application;

import ex2.entities.NumeroSecreto;
import java.util.Scanner;

/**
 *
 * @author Rômulo Delmondes <romulodelmondes@gmail.com>
 * @date 16/09/2024
 * @brief Class Principal
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumeroSecreto ns = new NumeroSecreto();
        
        ns.sortear();
        
        long resultado;
        
        do {
            System.out.println("Forneça um palpite de número de 0 a 100:");
            int palpite = sc.nextInt();
            resultado = ns.adivinhar( palpite );
          
            if(resultado==-2){
                System.out.println("número não foi sorteado ainda");
                break;
            }
            else if ( resultado < 0 )
                System.out.println("O palpite é menor que o número sorteado");
            else if ( resultado > 0 )
                System.out.println("O palpite é maior que o número sorteado");      
            else if ( resultado == 0 )
                System.out.println("Acertou, parabéns!");            
        } while ( resultado != 0 );
    }
}
