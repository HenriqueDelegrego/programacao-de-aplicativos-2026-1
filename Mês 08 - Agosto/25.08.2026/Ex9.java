import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Chamamos o método passando o número como argumento.
		// O método retorna um boolean (true ou false),
		// que será impresso pelo println.
		System.out.println(determinarParOuImpar(numero));

	}

	/**
	 * Verifica se um número inteiro é par.
	 *
	 * <p>
	 * O operador % calcula o resto da divisão. Se o resto da divisão por 2 for 0, o
	 * número é par.
	 * </p>
	 *
	 * @param numero número inteiro que será verificado
	 * @return true se o número for par; false se for ímpar
	 */
	public static boolean determinarParOuImpar(int numero) {
		// A comparação "numero % 2 == 0" já produz um boolean:
		// true -> número é par
		// false -> número é ímpar
		//
		// Por isso, podemos retornar a comparação diretamente,
		// sem precisar criar uma variável.
		return numero % 2 == 0;
	}
}