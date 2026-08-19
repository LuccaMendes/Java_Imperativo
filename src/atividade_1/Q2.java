package atividade_1;

import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }
    }
}
