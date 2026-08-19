package atividade_1;


import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int n3 = input.nextInt();
        if (n1 > n2 && n1 > n3) {
        System.out.println("O número " + n1 + " é o maior!");
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("O número " + n2 + " é o maior!");
        }
        else {
            System.out.println("O número " + n3 + " é o maior!");
        }
    }
}
