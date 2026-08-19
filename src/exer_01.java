import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class exer_01 {
    //1)
    //Escreva um programa que leia o número de matrícula um funcionário, seu nome, sua
    //quantidade de horas trabalhadas na semana, o valor que recebe por hora e calcule o salário
    //mensal desse funcionário (assuma que um mês tem 4 semanas).
    //A seguir, mostre a sua matrícula, nome e o salário do funcionário, com duas casas decimais

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a sua matricula: ");
        String matricula = sc.next();

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Informe a sua quantidade de horas trabalhadas na semana: ");
        double horas_trabalhadas = sc.nextDouble();

        System.out.println("Digite o valor que você ganha por hora: ");
        double valor_hora = sc.nextDouble();

        //processo da conta
        double sal_final = horas_trabalhadas * valor_hora * 4;

        System.out.println("Matricula: "+matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Salário mensal: R$" + df.format(sal_final));

        //ok


        sc.close();
    }
}
