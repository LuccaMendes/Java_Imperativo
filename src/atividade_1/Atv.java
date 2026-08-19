package atividade_1;

import java.util.Scanner;

public class Atv {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o tipo de operação: ( + - * / )");
        String operacao = sc.next();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        switch (operacao) {
            case "+":
                System.out.println("A soma de " + n1 + " + " + n2 + " é = " + (n1 + n2));
                break;
            case "-":
                System.out.println("A subtração de " + n1 + " - " + n2 + " é = " + (n1 - n2) );
                break;
            case "*":
                System.out.println("A multiplicação de " + n1 + " * " + n2 + " é = " + (n1 * n2));
                break;
            case "/":
                System.out.println("A divisão de " + n1 + " / " + n2 + " é = " + (n1 / n2));
                break;
            default:
                System.out.println("Calculo Invalido!");
        }
    }
}
