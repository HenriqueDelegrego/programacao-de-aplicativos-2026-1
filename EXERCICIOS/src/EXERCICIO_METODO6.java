
import java.util.Scanner;

public class EXERCICIO_METODO6 {

    
    static String generateStarWarsName(String primeiroNome, String sobrenome, String sobrenomeMae, String cidadeNatal) {
        // Primeiro nome Star Wars: 3 primeiras letras do sobrenome + 2 primeiras letras do primeiro nome
        String primeiroNomeSW = sobrenome.substring(0, 3) + primeiroNome.substring(0, 2);

        // Sobrenome Star Wars: 2 primeiras letras do sobrenome de solteira da mãe + 3 primeiras letras da cidade natal
        String sobrenomeSW = sobrenomeMae.substring(0, 2) + cidadeNatal.substring(0, 3);

        return primeiroNomeSW + " " + sobrenomeSW;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o sobrenome de solteira da sua mãe: ");
        String sobrenomeMae = scanner.nextLine();

        System.out.print("Digite a cidade onde você nasceu: ");
        String cidadeNatal = scanner.nextLine();

        String nomeStarWars = generateStarWarsName(primeiroNome, sobrenome, sobrenomeMae, cidadeNatal);

        System.out.println("Seu nome Star Wars é: " + nomeStarWars);

        scanner.close();
    }
}