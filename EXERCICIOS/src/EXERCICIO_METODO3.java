import java.util.Scanner;

public class EXERCICIO_METODO3 {


    static void exibirSequencia(int numero) {
        System.out.println("Número informado: " + numero);
        System.out.println("Os 20 números seguintes são:");

        for (int i = 1; i <= 20; i++) {
            System.out.println(numero + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroDigitado = scanner.nextInt();

        exibirSequencia(numeroDigitado);

        scanner.close();
    }
}