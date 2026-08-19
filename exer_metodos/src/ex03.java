import java.util.Scanner;
//Métodos com parâmetros
//3)Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
//números que vem após esse número
//(O parâmetro do metodo deve ser o número inserido pelo usuário)

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        imprimir20Numeros(numero);
    }

    public static void imprimir20Numeros(int num)  {
        for (int i = num; i <= num + 20; i++) {
            System.out.println(i);
        }
    }
}