import java.util.Scanner;

public class ex01  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Métodos sem parâmetros
        //1)
        //Faça um programa em que o usuário entre com um número de 1 a 4
        //Com o número 1 sendo verão, 2 sendo outono...
        //Dependendo de o que o usuário informa, imprima:
        //É verão
        //E o tempo está quente
        //Ou
        //É inverno
        //E está frio

        System.out.println("Informe a estação do ano");
        int estacao = sc.nextInt();

        if (estacao == 1) {
            imprimirVerao();
        } else if (estacao == 2) {
            imprimirOutono();
        } else if (estacao == 3) {
            imprimirInverno();
        } else if (estacao == 4) {
            imprimirPrimavera();
        }
    }

        public static void imprimirVerao() {
            System.out.println("É verão\nE o tempo esta quente");
        }
        public static void imprimirOutono() {
            System.out.println("É outono\nE as folhas estão caindo");
        }
        public static void imprimirInverno() {
            System.out.println("É inverno\nE está frio");
        }
        public static void imprimirPrimavera() {
            System.out.println("É primavera\nE a natureza está florescendo");

    }
}
