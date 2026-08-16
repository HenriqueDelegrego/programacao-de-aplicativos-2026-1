

import java.util.Scanner;

public class EXERCICIO_METODO2 {


    static void joao() {
        System.out.println("O nome dele é João");
        System.out.println("Ele tem 20 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }

    static void maria() {
        System.out.println("O nome dela é Maria");
        System.out.println("Ela tem 22 anos");
        System.out.println("Ela é estudante de desenvolvimento de sistemas");
    }

    static void pedro() {
        System.out.println("O nome dele é Pedro");
        System.out.println("Ele tem 19 anos");
        System.out.println("Ele é estudante de desenvolvimento de sistemas");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do colega (joao, maria ou pedro): ");
        String nome = scanner.nextLine().trim().toLowerCase();

        if (nome.equalsIgnoreCase("joao")||nome.equalsIgnoreCase("joão" )) {
            joao();
        } else if (nome.equalsIgnoreCase( "maria")) {
            maria();
        } else if (nome.equalsIgnoreCase("pedro")) {
            pedro();
        } else {
            System.out.println("Colega não encontrado!");
        }

        scanner.close();
    }
}