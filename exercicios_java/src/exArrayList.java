import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class exArrayList {

    //Crie um programa que solicite ao usuário que insira um número.
    // Se esse número estiver presente na lista, exiba o índice. Caso contrário, informe que não está presente

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        num.add(15);
        num.add(22);
        num.add(2);
        num.add(55);
        num.add(37);
        num.add(10);

        System.out.println("Digite um número : ");
        int numero = sc.nextInt();

        int indice = num.indexOf(numero);

        if (indice != -1) {
            System.out.println(indice);
        } else {
            System.out.println("Não consta na lista");
        }
    }
}
