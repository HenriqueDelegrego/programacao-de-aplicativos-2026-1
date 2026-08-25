public class Ex4 {

	public static void main(String[] args) {

		int vetor[] = { 1, 2, 3, 4, 5 };

		// Chamamos o método obterMaiorValor().
		// O vetor é passado como parâmetro para o método.
		obterMaiorValor(vetor);

		// Chamamos o método obterMenorValor().
		// Novamente, enviamos o vetor como parâmetro.
		obterMenorValor(vetor);

		// Chamamos o método obterMediaDosValores().
		// O mesmo vetor também pode ser enviado para outro método.
		obterMediaDosValores(vetor);
	}

	/*
	 * Este método recebe um vetor como parâmetro.
	 *
	 * "int vetor[]" significa que o método espera receber um vetor de números
	 * inteiros.
	 *
	 * Quando fazemos:
	 *
	 * obterMaiorValor(vetor);
	 *
	 * o vetor criado no método main() é passado para este método.
	 *
	 * O parâmetro "vetor" abaixo recebe esse valor.
	 */
	public static void obterMaiorValor(int vetor[]) {

		int maiorValor = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorValor) {

				maiorValor = vetor[i];
			}
		}

		System.out.println("O maior valor é: " + maiorValor);
	}

	/*
	 * Este método também recebe um vetor como parâmetro.
	 *
	 * O método pode receber parâmetros diferentes dependendo do que precisamos
	 * fazer.
	 *
	 * Aqui, o parâmetro é novamente:
	 *
	 * int vetor[]
	 *
	 * Isso significa que podemos enviar um vetor de inteiros para este método.
	 */
	public static void obterMenorValor(int vetor[]) {

		int menorValor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < menorValor) {

				menorValor = vetor[i];
			}
		}

		System.out.println("O menor valor é: " + menorValor);
	}

	/*
	 * Este método também recebe o vetor como parâmetro.
	 *
	 * A diferença é que, neste método, vamos utilizar os valores do vetor para
	 * calcular a média.
	 */
	public static void obterMediaDosValores(int vetor[]) {

		double soma = 0;

		for (int i = 0; i < vetor.length; i++) {

			soma += vetor[i];
		}

		double media = soma / vetor.length;

		System.out.println("A média dos valores é: " + media);
	}
}