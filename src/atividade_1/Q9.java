package atividade_1;

import java.util.Scanner;

public class Q9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int quantidade = 0;
        double maiorPeso = Double.MIN_VALUE;
        double menorPeso = Double.MAX_VALUE;

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar Peso");
            System.out.println("2. Finalizar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o peso do animal (kg): ");
                    double peso = sc.nextDouble();

                    quantidade++;

                    if (peso > maiorPeso) {
                        maiorPeso = peso;
                    }
                    if (peso < menorPeso) {
                        menorPeso = peso;
                    }
                    break;

                case 2:
                    System.out.println("\n===== RESUMO DO REGISTRO =====");
                    System.out.println("Quantidade de animais registrados: " + quantidade);

                    if (quantidade > 0) {
                        System.out.printf("Maior peso registrado: %.2f kg%n", maiorPeso);
                        System.out.printf("Menor peso registrado: %.2f kg%n", menorPeso);
                    } else {
                        System.out.println("Nenhum animal foi registrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 2);

        sc.close();
    }
}