import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a sua terceira nota");
        double nota3 = sc.nextDouble();

        System.out.println("A média é: " + mediaNotas(nota1, nota2, nota3));

    }

        public static double mediaNotas(double nota1, double nota2, double nota3) {
            return(nota1 + nota2 + nota3)/3;
        }


}
