import java.util.Scanner;

public class exer_05 {

    //5)
    //Crie uma array de 5 elementos e descubra:
    //a) Qual o maior elemento
    //b) Qual o menor elemento
    //c) A média dos elementos

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o elemento " + (i + 1));
            numeros[i] = sc.nextDouble();
        }

        sc.close();

        double maior = numeros[0];
        double menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = soma / numeros.length;

        System.out.println("\n----- RESULTADOS -----");
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média dos elementos: " + media);
    }
}