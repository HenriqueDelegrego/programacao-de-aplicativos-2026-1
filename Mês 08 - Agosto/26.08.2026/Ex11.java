
public class Ex11 {

	public static void main(String[] args) {
		double vetor[] = { 5, 6, 4, 12, -5, 0, 84 };

		System.out.println(obterMaiorValor(vetor));
		System.out.println(obterMenorValor(vetor));
		System.out.println(calcularMedia(vetor));

	}

	/**
	 * Obtém o maior valor presente em um vetor.
	 *
	 * @param vetor vetor de valores reais a ser analisado
	 * @return o maior valor encontrado no vetor
	 */
	public static double obterMaiorValor(double vetor[]) {

		double maiorValor = Double.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorValor) {

				maiorValor = vetor[i];

			}

		}

		return maiorValor;

	}

	/**
	 * Obtém o menor valor presente em um vetor.
	 *
	 * @param vetor vetor de valores reais a ser analisado
	 * @return o menor valor encontrado no vetor
	 */
	public static double obterMenorValor(double vetor[]) {

		double menorValor = Double.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < menorValor) {

				menorValor = vetor[i];

			}

		}

		return menorValor;

	}

	/**
	 * Calcula a média aritmética dos valores presentes em um vetor.
	 *
	 * @param vetor vetor de valores reais a ser analisado
	 * @return a média aritmética dos valores do vetor
	 */
	public static double calcularMedia(double vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {

			soma += vetor[i];
			// soma = soma + vetor[i];

		}

		double media = soma / vetor.length;

		return media;

	}

}
