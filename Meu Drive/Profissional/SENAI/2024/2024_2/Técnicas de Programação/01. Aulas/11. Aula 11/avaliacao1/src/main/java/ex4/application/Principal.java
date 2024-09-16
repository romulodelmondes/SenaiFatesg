/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4.application;

import ex4.entities.Produto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PROFESSOR
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Café Expresso", 0.75));
        produtos.add(new Produto("Café Capuccino", 1.00));
        produtos.add(new Produto("Leite com Café", 1.25));
        produtos.add(new Produto("Achocolatado", 1.50));
        produtos.add(new Produto("Bolo de cenoura", 2.00));
        produtos.add(new Produto("Pão de queijo", 1.75));

        int opcao;
        do {
            System.out.println("Forneça uma opção: \n" +
                    "1 - Café Expresso \n" +
                    "2 - Café Capuccino \n" +
                    "3 - Leite com Café \n" +
                    "4 - Achocolatado \n" +
                    "5 - Bolo de cenoura \n" +
                    "6 - Pão de queijo \n" +
                    "7 - Totalizar vendas \n" +
                    "8 - Pagar conta parcial \n" +
                    "9 - Pagar conta total \n" +
                    "10 - Sair");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                produtos.get(opcao - 1).adicionar();
            } else if (opcao == 7) {
                System.out.println("Total de vendas:");
                for (Produto produto : produtos) {
                    System.out.println(produto.getNome() + ": " + produto.getQuantidade() + " - Valor: " + produto.getTotal());
                }
            } else if (opcao == 8) {
                double total = 0;
                System.out.println("Total a pagar:");
                for (Produto produto : produtos) {
                    total += produto.getTotal();
                }
                System.out.println("Total: " + total);

            } else if (opcao == 9) {
                double total = 0;
                System.out.println("Total a pagar:");
                for (Produto produto : produtos) {
                    total += produto.getTotal();
                }
                System.out.println("Total: " + total);
                System.out.println("Conta paga com sucesso!");
                produtos.clear();
            } else if (opcao == 10) {
                double total = 0;
                for (Produto produto : produtos) {
                    total += produto.getTotal();
                }
                if (total > 0) {
                    System.out.println("A conta está em aberto. Por favor, pague antes de sair.");
                    opcao = 0;
                }
            } else {
                System.out.println("Opção inválida");
            }

        } while (opcao != 10);
    }
    
}
