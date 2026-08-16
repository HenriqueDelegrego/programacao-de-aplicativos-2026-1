import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a estação do ano");
		int estacao = input.nextInt();

		// Verificamos qual número o usuário informou.
		// Dependendo do número, chamamos um método diferente.

		if (estacao == 1) {

			// Chama o método imprimirVerao().
			// Quando um método é chamado, o programa
			// executa o código que está dentro dele.
			imprimirVerao();

		} else if (estacao == 2) {

			// Chama o método imprimirOutono().
			imprimirOutono();

		} else if (estacao == 3) {

			// Chama o método imprimirInverno().
			imprimirInverno();

		} else if (estacao == 4) {

			// Chama o método imprimirPrimavera().
			imprimirPrimavera();
		}

	}

	// Este é um método chamado "imprimirVerao".
	public static void imprimirVerao() {
		// Este código será executado quando o método
		// imprimirVerao() for chamado.
		System.out.println("É verão\nE o tempo está quente");
	}

	// Método responsável por imprimir as informações do outono.
	// Perceba que podemos criar vários métodos dentro
	// da mesma classe, cada um responsável por uma tarefa
	public static void imprimirOutono() {
		System.out.println("É outono\nE as folhas estão caindo");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno\nE o tempo está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera\nE as folhas estão florindo");
	}
}
