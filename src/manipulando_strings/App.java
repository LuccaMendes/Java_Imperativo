package manipulando_strings;

public class App {

    static void main() {
        String a = "José";
        String b = "JOsé";

//        System.out.println(a == b);
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));
//        System.out.println(a.length());
//        System.out.println(a.charAt(0));
//        System.out.println(a.contains("sé"));
        String firstName = "Maria";
        String lastName = "da Silva";
//        String menssagem = "Olá " + firstName + " " + lastName + "!";
//        String menssagem = "Olá ".concat(firstName).concat(" ").concat(lastName).concat("!");
        String menssagem = "";
        for (int i = 0; i < 1000; i++) {
            menssagem += i;
        }
        System.out.println(menssagem);
    }

        StringBuilder sb = new StringBuilder();
}