import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a estação do ano");
		int estacao = input.nextInt(); // Lê o número digitado e guarda na variável 'estacao'

		/*
		 * Aqui usamos métodos com retorno. Em vez de escrever o texto direto no
		 * System.out.println, chamamos um método que DEVOLVE (retorna) um texto
		 * (String). O valor retornado pelo método é usado diretamente no println.
		 */
		if (estacao == 1) {
			// Chama o método imprimirVerao() e imprime o que ele retornou
			System.out.println(imprimirVerao());
		} else if (estacao == 2) {
			System.out.println(imprimirOutono());
		} else if (estacao == 3) {
			System.out.println(imprimirInverno());
		} else if (estacao == 4) {
			System.out.println(imprimirPrimavera());
		}

	}

	/*
	 * Métodos com retorno: - A palavra "String" antes do nome do método indica que
	 * ele DEVOLVE um valor do tipo String (texto). - A palavra "return" envia o
	 * valor de volta para quem chamou o método. - Depois do return, o método
	 * termina e não executa mais nada.
	 */

	/**
	 * Retorna a mensagem correspondente ao verão.
	 * 
	 * @return Uma String com a mensagem: "É verão" e a descrição do clima quente.
	 */
	public static String imprimirVerao() {
		return "É verão\nE o tempo está quente";
	}

	/**
	 * Retorna a mensagem correspondente ao outono.
	 * 
	 * @return Uma String com a mensagem: "É outono" e a descrição das folhas
	 *         caindo.
	 */
	public static String imprimirOutono() {
		return "É outono\nE as folhas estão caindo";
	}

	/**
	 * Retorna a mensagem correspondente ao inverno.
	 * 
	 * @return Uma String com a mensagem: "É inverno" e a descrição do clima frio.
	 */
	public static String imprimirInverno() {
		return "É inverno\nE o tempo está frio";
	}

	/**
	 * Retorna a mensagem correspondente à primavera.
	 * 
	 * @return Uma String com a mensagem: "É primavera" e a descrição das flores
	 *         florindo.
	 */
	public static String imprimirPrimavera() {
		return "É primavera\nE as flores estão florindo";
	}
}