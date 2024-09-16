/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex1.application;

import ex1.entities.Aluno;
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
        
        System.out.println("Quantos alunos serao cadastrados?");
        int qtde = sc.nextInt();
        sc.nextLine();
        
        Aluno[] aluno = new Aluno[qtde];
        
        for(int i=0; i<qtde; i++){
            sc.nextLine();
            System.out.println("Informe a nota " + (i+1) + " do " + (i+1) + "° aluno");
            Double n1 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+2) + " do " + (i+1) + "° aluno");
            Double n2 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+3) + " do " + (i+1) + "° aluno");
            Double n3 = (sc.nextDouble());
            System.out.println("Informe a nota " + (i+4) + " do " + (i+1) + "° aluno");
            Double n4 = (sc.nextDouble());
            
            aluno[i] = new Aluno(n1, n2, n3, n4);
            aluno[i].media();
        }
        
        System.out.println(String.format("A media geral dos alunos é: %.2f",Aluno.media_total()));

    }
}
