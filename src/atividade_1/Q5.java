package atividade_1;

import java.util.Scanner;

public class Q5 {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String usuario = input.nextLine();
        System.out.print("Digite sua senha: ");
        double senha = input.nextInt();
        if(usuario == "admin" && senha == 1234){
            System.out.println("Login Bem-Sucedido!");
        }else{
            System.out.println("Usuário ou Senha incorretos!");
        }
    }
}
