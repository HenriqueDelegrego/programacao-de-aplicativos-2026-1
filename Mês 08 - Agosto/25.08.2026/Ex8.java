import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a primeira nota");
		double nota1 = input.nextDouble();

		System.out.println("Informe a segunda nota");
		double nota2 = input.nextDouble();

		System.out.println("Informe a terceira nota");
		double nota3 = input.nextDouble();

		System.out.println("A média é: " + calcularMedia(nota1, nota2, nota3));

	}

	/**
	 * Calcula a média aritmética de três notas.
	 *
	 * @param nota1 primeira nota
	 * @param nota2 segunda nota
	 * @param nota3 terceira nota
	 * @return a média aritmética das três notas
	 */
	public static double calcularMedia(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}

}
