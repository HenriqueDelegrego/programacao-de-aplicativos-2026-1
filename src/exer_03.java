import java.util.Scanner;

public class exer_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //3)
        //O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma
        //pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo
        //quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de
        //acordo com a fórmula:

        System.out.println("Insira a sua massa");
        double massa = sc.nextDouble();

        System.out.println("Insira a sua altura");
        double altura = sc.nextDouble();

        double imc = massa / Math.pow(altura, 2);

        if (imc <= 18.5) {
            System.out.println("Magreza");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        }else if (imc >= 25 && imc <=29.9) {
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade I");
        }else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidadee II");
        }else {
            System.out.println("Obesidade III");
        }



        sc.close();

    }

}
