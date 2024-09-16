/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4.entities;

/**
 *
 * @author PROFESSOR
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionar() {
        quantidade++;
    }

    public void remover() {
        if (quantidade > 0) {
            quantidade--;
        } else {
            System.out.println("Não há mais " + nome + " na lista.");
        }
    }

    public double getTotal() {
        return quantidade * preco;
    }
}
