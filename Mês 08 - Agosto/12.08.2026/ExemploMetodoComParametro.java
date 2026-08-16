public class ExemploMetodoComParametro {

	public static void main(String[] args) {

		// Aqui estamos CHAMANDO o método desempenharCalculo().
		// O método foi criado para receber 3 valores.
		// Neste caso, estamos passando os valores:
		// 5, 4 e 2
		desempenharCalculo(5, 4, 2);

	}

	// Aqui estamos CRIANDO/DECLARANDO o método.

	// Dentro dos parênteses estão os PARÂMETROS do método.
	//
	// O método possui 3 parâmetros:
	// num1 -> recebe um número do tipo double
	// num2 -> recebe um número do tipo double
	// num3 -> recebe um número do tipo double
	public static void desempenharCalculo(double num1, double num2, double num3) {

		double resultado = (num1 + num2) * num3;

		System.out.println(resultado);
	}

}