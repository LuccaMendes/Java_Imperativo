package atividade_1;

import java.util.Scanner;

public class Q10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.print("Digite uma senha forte: ");
            String senha = sc.nextLine();

            boolean temTamanhoMinimo = senha.length() >= 8;
            boolean temNumero = false;
            boolean temMaiuscula = false;

            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isDigit(c)) {
                    temNumero = true;
                }
                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                }
            }

            if (!temTamanhoMinimo) {
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
            }
            if (!temNumero) {
                System.out.println("A senha deve conter pelo menos 1 número.");
            }
            if (!temMaiuscula) {
                System.out.println("A senha deve conter pelo menos 1 letra maiúscula.");
            }

            if (temTamanhoMinimo && temNumero && temMaiuscula) {
                senhaValida = true;
                System.out.println("Senha válida! Cadastro concluído com sucesso.");
            } else {
                System.out.println();
            }
        }

        sc.close();
    }
}
