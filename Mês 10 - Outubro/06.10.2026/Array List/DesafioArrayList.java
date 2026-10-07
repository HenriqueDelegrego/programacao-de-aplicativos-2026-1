
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioArrayList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Cria uma lista de números inteiros chamada "numeros"
		List<Integer> numeros = new ArrayList<>();

		// Adiciona os valores na lista (lembrando que as posições começam em 0)
		numeros.add(22); // Posição 0
		numeros.add(13); // Posição 1
		numeros.add(25); // Posição 2
		numeros.add(20); // Posição 3
		numeros.add(18); // Posição 4
		numeros.add(29); // Posição 5

		System.out.println("Insira o valor");
		int valor = input.nextInt();

		// O método .indexOf() procura o número digitado na lista.
		// Se achar, ele devolve a posição (0, 1, 2...). Se NÃO achar, ele devolve
		// sempre -1.
		int indice = numeros.indexOf(valor);

		// se o índice for diferente de -1, significa que o número foi encontrado
		if (indice != -1) {
			System.out.println(indice);
		} else {
			// Se o índice for igual a -1, avisa que o número não existe na lista
			System.out.println("Não está na lista");
		}

	}

}
