import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o número");
		int numero = input.nextInt();

		// Chamamos o método imprimir20Numeros().
		// O valor armazenado na variável "numero" é passado
		// como argumento para o método.
		imprimir20Numeros(numero);

	}

	// Este método recebe um parâmetro chamado "num".
	// O parâmetro é uma variável que recebe o valor
	// enviado quando o método é chamado.
	//
	// Neste caso:
	// - "int" indica o tipo do parâmetro.
	// - "num" é o nome do parâmetro.
	//
	// Quando fizemos imprimir20Numeros(numero),
	// o valor de "numero" foi passado para "num".
	public static void imprimir20Numeros(int num) {

		// Usamos o parâmetro "num" para definir o início
		// da contagem.
		for (int i = num; i <= num + 20; i++) {

			System.out.println(i);
		}

	}

}