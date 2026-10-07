
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
	public static void main(String[] args) {

		// Cria uma nova lista chamada "idades" que vai guardar apenas números inteiros
		// (Integer)
		List<Integer> idades = new ArrayList<>();

		// O método .add() coloca um novo elemento sempre no final da lista
		idades.add(22); // Posição 0
		idades.add(13); // Posição 1
		idades.add(25); // Posição 2
		idades.add(20); // Posição 3
		idades.add(18); // Posição 4
		idades.add(29); // Posição 5

		// Imprime a lista inteira na tela: [22, 13, 25, 20, 18, 29]
		System.out.println(idades);

		// O método .contains() pergunta: "O número 25 está na lista?". Retorna true
		// (verdadeiro) ou false
		System.out.println(idades.contains(25));

		// O método .indexOf() diz em qual posição (índice) o número 25 está.
		// Como a contagem começa em 0 (0, 1, 2...), ele vai retornar 2
		System.out.println(idades.indexOf(25));

		// O método .size() conta o total de elementos guardados na lista. Retorna 6
		System.out.println(idades.size());

		// O método .getLast() pega diretamente o último elemento da lista, sem precisar
		// saber a posição dele. Retorna 29
		System.out.println(idades.getLast());

		// O Collections.sort() reorganiza os elementos da lista diretamente em ordem
		// crescente
		Collections.sort(idades);

		// Imprime a lista novamente, agora alterada e ordenada: [13, 18, 20, 22, 25,
		// 29]
		System.out.println(idades);
	}
}
