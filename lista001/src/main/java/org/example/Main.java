package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ola mundo!");
    }

    static void exercicio01(){
        System.out.println("bem vindo ao sistema de jogador");

    }
    static void exercicio02(){
        String nome = "mariana silva";
        String cargo = "analista";
        Double salario = 4500.00;

        System.out.println("nome: " + nome);
        System.out.println("cargo: " + cargo);
        System.out.println("salario: " + salario);
    }
    static void exercicio03(){
        String nome = "teclado";
        int codigo = 123445;
        double preco = 99.90;
        boolean promocao = true;
        System.out.println("Produto: " + nome);
        System.out.println("codigo: " + codigo);
        System.out.println("preco: " + preco);
        System.out.println("promo: " + promocao);
    }
    static void exercicio04(){
        Scanner leitor = new Scanner(System.in);
        Double valorTotal = leitor.nextDouble();
        if (valorTotal > 100){
            System.out.println("valor final: " + valorTotal * 0.9);
        }else{
            System.out.println("valor total; " + valorTotal);
        }
                


    }
}