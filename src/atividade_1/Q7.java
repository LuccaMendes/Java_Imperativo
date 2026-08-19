package atividade_1;

import java.util.Scanner;

public class Q7 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número do qual quer ver a tabuada: ");
        int num = input.nextInt();
        System.out.println("A tabuada de " + num + ":");
        System.out.println(num + " X " + "1 = " + num * 1 );
        System.out.println(num + " X " + "2 = " + num * 2 );
        System.out.println(num + " X " + "3 = " + num * 3 );
        System.out.println(num + " X " + "4 = " + num * 4 );
        System.out.println(num + " X " + "5 = " + num * 5 );
        System.out.println(num + " X " + "6 = " + num * 6 );
        System.out.println(num + " X " + "7 = " + num * 7 );
        System.out.println(num + " X " + "8 = " + num * 8 );
        System.out.println(num + " X " + "9 = " + num * 9 );
        System.out.println(num + " X " + "10 = " + num * 10 );
    }
}
