
public class ExemploMetodosComRetorno {

	/**
	 * Soma dois números inteiros e retorna o resultado.
	 *
	 * @param num1 primeiro número que será somado
	 * @param num2 segundo número que será somado
	 * @return a soma de num1 e num2
	 */
	public static double somarNumeros(int num1, int num2) {

		/*
		 * num1 e num2 são os PARÂMETROS do método.
		 *
		 * Quando criamos o método, declaramos quais informações ele precisa receber
		 * para funcionar.
		 *
		 * Neste caso: - num1 recebe o primeiro número; - num2 recebe o segundo número.
		 *
		 * O comando return devolve um valor para quem chamou o método.
		 */
		return num1 + num2;

		/*
		 * Ou
		 * double soma = num1 + num2;
		 * return soma;
		 */

	}

	public static void main(String[] args) {

		/*
		 * Aqui estamos CHAMANDO o método somarNumeros().
		 *
		 * Os valores 10 e 2 são os ARGUMENTOS.
		 *
		 * Eles serão enviados para os parâmetros:
		 *
		 * num1 <- 10 num2 <- 2
		 *
		 * O método calcula 10 + 2 e retorna 12.
		 *
		 * O valor retornado é armazenado na variável "soma".
		 */
		double soma = somarNumeros(10, 2);

		// Exibe o valor armazenado na variável soma.
		System.out.println(soma);

		/*
		 * Também podemos chamar o método diretamente dentro do println.
		 *
		 * Neste caso:
		 *
		 * somarNumeros(5, 4)
		 *
		 * retorna 9.
		 *
		 * Então é como se tivéssemos:
		 *
		 * System.out.println(9);
		 */
		System.out.println(somarNumeros(5, 4));
	}
}
