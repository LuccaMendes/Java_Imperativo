package atividade_1;

import java.util.Scanner;

public class Q6 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o tipo de combustível (G para gasolina, A para álcool): ");
        String combustivel = input.nextLine();
        System.out.println("Digite a quantidade de Litros:");
        int quantidade = input.nextInt();
        double valorGasolina = 5.50;
        double valorAlcool = 4.00;
        if (combustivel.equals("G")) {
            System.out.println("Valor Total:" + valorGasolina * quantidade);
        }else if (combustivel.equals("A")){
            System.out.println("Valor Total:" + valorAlcool * quantidade);
        }else {
            System.out.println("Valor invalido!");
        }
    }
}
