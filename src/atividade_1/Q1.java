package atividade_1;

import java.util.Scanner;

public class Q1 {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Olá " + nome + "Você tem " + idade + " anos.");
    }
}
