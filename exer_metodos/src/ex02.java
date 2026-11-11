import java.util.Scanner;
//2)
//Faça um metodo para seus colegas mais próximos
//O metodo deve imprimir:
//O nome dele(a) é [nome]
//Ele(a) tem [idade] anos
//Ele(a) é estudante de desenvolvimento de sistemas
//(Em prints separados)
//Faça com que o metodo seja uma expressão verbal com o nome do seu colega.
//O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
//executado.

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome da pessoa que deseja obter os dados");
        String nome = sc.next();

        if (nome.equalsIgnoreCase("Pohl")) {
            imprimirPohl();
        } else if (nome.equalsIgnoreCase("Maria")) {
            imprimirMaria();
        } else if (nome.equalsIgnoreCase("Eloiza")) {
            imprimirEloiza();
        } else if (nome.equalsIgnoreCase("Anna")) {
            imprimirAnna();
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public static void imprimirPohl() {
        System.out.println("O nome dele é Pohl");
        System.out.println("Ele tem 18 anos");
        System.out.println("Ele é aluno de desenvolvimento de sistemas");
    }

    public static void imprimirMaria() {
        System.out.println("O nome dela é Maria");
        System.out.println("Ela tem 23 anos");
        System.out.println("Ela é aluna de desenvolvimento de sistemas");
    }

    public static void imprimirEloiza() {
        System.out.println("O nome dela é Eloiza");
        System.out.println("Ela tem 10 anos");
        System.out.println("Ela é aluna de desenvolvimento de sistemas");
    }

    public static void imprimirAnna() {
        System.out.println("O nome dela é Anna");
        System.out.println("Ela tem 18 anos");
        System.out.println("Ela é aluna de desenvolvimento de sistemas");
    }
}