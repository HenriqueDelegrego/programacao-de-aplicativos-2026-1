import java.util.Scanner;

public class ex09 {

    //Faça um metodo booleano que retorne true se o número passado como parâmetro
    //seja par.
    //Retorne false caso seja ímpar.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número");
        int numero = sc.nextInt();

        System.out.println(fatorParouImpar(numero));
    }

    public static boolean fatorParouImpar(int numero) {
        return numero % 2 == 0;

    }
}
