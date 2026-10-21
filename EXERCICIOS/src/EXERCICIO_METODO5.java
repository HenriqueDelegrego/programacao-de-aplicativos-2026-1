import java.util.Scanner;

public class EXERCICIO_METODO5 {


    static void maisProximo(int base, int numero1, int numero2) {
        int diferenca1 = Math.abs(base - numero1);
        int diferenca2 = Math.abs(base - numero2);

        if (diferenca1 < diferenca2) {
            System.out.println("O número " + numero1 + " está mais perto de " + base);
        } else if (diferenca2 < diferenca1) {
            System.out.println("O número " + numero2 + " está mais perto de " + base);
        } else {
            System.out.println("Os dois números estão à mesma distância de " + base);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número base e os dois números a comparar, separados por espaço.");
        System.out.println("Exemplo: 10 7 15");
        System.out.print("Entrada: ");

        int base = scanner.nextInt();
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        maisProximo(base, numero1, numero2);

        scanner.close();
    }
}