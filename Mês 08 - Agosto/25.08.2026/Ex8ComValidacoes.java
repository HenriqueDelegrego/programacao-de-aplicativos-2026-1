import java.util.Scanner;

public class Ex8ComValidacoes {

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
	 * <p>
	 * As notas devem estar no intervalo de 0 a 10. Caso alguma nota seja inválida,
	 * o método retorna 0.
	 * </p>
	 *
	 * @param nota1 primeira nota, entre 0 e 10
	 * @param nota2 segunda nota, entre 0 e 10
	 * @param nota3 terceira nota, entre 0 e 10
	 * @return a média das três notas ou 0 caso alguma nota seja inválida
	 */
	public static double calcularMedia(double nota1, double nota2, double nota3) {

		if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
			return 0;
		}

		return (nota1 + nota2 + nota3) / 3;

	}

}
