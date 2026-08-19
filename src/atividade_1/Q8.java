package atividade_1;

import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quanto você ganha por hora: ");
        double h = input.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double m = input.nextDouble();
        double salarioBruto = h * m;
        double impostoRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = impostoRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Imposto Renda: R$" + impostoRenda);
        System.out.println("Inss: R$" + inss);
        System.out.println("Sindicato: R$" + sindicato);
        System.out.println("Salário Liquido: R$" + salarioLiquido);
    }
}
