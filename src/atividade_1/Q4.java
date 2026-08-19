package atividade_1;

import java.util.Scanner;

public class Q4 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        double imc = peso/(altura*altura);
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso Normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }else if (imc >= 30){
            System.out.println("Obeso");
        }
    }
}
