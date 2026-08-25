import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número base");
		int numBase = input.nextInt();

		System.out.println("Insira o número 1");
		int num1 = input.nextInt();

		System.out.println("Insira o número 2");
		int num2 = input.nextInt();

		obterNumeroPertoBase(numBase, num1, num2);

	}

	/*
	 * Este é um método que recebe 3 PARÂMETROS:
	 *
	 * int base int num1 int num2
	 *
	 * Os parâmetros são variáveis que recebem os valores enviados quando o método é
	 * chamado.
	 *
	 * Por exemplo, se fizermos:
	 *
	 * obterNumeroPertoBase(10, 8, 15);
	 *
	 * então: base = 10 num1 = 8 num2 = 15
	 *
	 * O método é void porque ele realiza uma ação (mostra uma mensagem) mas não
	 * retorna um valor. //
	 */
	public static void obterNumeroPertoBase(int base, int num1, int num2) {

		/*
		 * Calcula a distância entre num1 e a base.
		 *
		 * Math.abs() retorna o valor absoluto de um número. Isso evita que a distância
		 * seja negativa.
		 *
		 * Exemplo: se num1 = 8 e base = 10:
		 *
		 * 8 - 10 = -2 Math.abs(-2) = 2
		 */
		int distanciaBase1 = Math.abs(num1 - base);
		int distanciaBase2 = Math.abs(num2 - base);

		if (distanciaBase1 < distanciaBase2) {
			System.out.println("O número mais perto é: " + num1);
		} else if (distanciaBase2 < distanciaBase1) {
			System.out.println("O número mais perto é: " + num2);
		} else {
			System.out.println("As distâncias são iguais");
		}

	}

}
