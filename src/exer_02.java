import java.text.DecimalFormat;
import java.util.Scanner;

public class exer_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
        //efetuadas por ele no mês (em R$).
        //Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informe o
        //total a receber no final do mês, com duas casas decimais.

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o seu salário fixo: R$");
        double salarioFixo = sc.nextDouble();

        System.out.println("Insira a receita gerada: ");
        double receita = sc.nextDouble();

        double comissao = receita * 0.15;
        double salFinal = salarioFixo + comissao;

        System.out.println("O vendedor "+nome+" terá um salário final de R$"+ salFinal);

        sc.close();


    }
}
