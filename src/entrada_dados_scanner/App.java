package entrada_dados_scanner;

public class App {

    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o primeiro numero:");
//        int num1 = sc.nextInt();
//        System.out.println("Digite o segundo numero:");
//        int num2 = sc.nextInt();
//        System.out.println("Digite seu nome:");
//        String nome = sc.next();
//
//        int resultado = somar(num1, num2);
//        System.out.println(resultado);
//        System.out.println("Seja Bem Vindo!" + nome);
//        subtrair(10, 5);
        validateNumber(10);
}

    public static int somar(int a, int b){
        return a+b;
    }

    public static void subtrair(int c, int d){
        System.out.println(c - d);
    }

    public static void validateNumber(int number){
        if (number > 5){
            System.out.println(number);
            return;
        }
        System.out.println("Sem o return essa linha sempre será impressa");
    }
}
