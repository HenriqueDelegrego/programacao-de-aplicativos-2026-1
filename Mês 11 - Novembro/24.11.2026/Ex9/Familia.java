import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// (Classe): Representa o conceito de uma Família no sistema.
public class Familia {

	// ASSOCIAÇÃO (1 para Muitos / Agregação):
	// A classe Familia possui uma lista de objetos do tipo Pessoa.
	// Isso estabelece um relacionamento onde uma Família "tem várias" Pessoas.
	private List<Pessoa> listaPessoas;

	// Construtor inicializa a lista na memória para evitar erros de ponteiro nulo
	// (NullPointerException).
	public Familia() {
		listaPessoas = new ArrayList<Pessoa>();
	}

	// ASSOCIAÇÃO: Método que recebe um objeto 'Pessoa' já existente e o vincula a
	// esta 'Familia'.
	public void adicionarPessoa(Pessoa p) {
		listaPessoas.add(p);
	}

	// (Comportamento/Método): Lógica de negócio da classe Familia.
	public Pessoa encontrarPessoaMaisVelha() {
		// LOCALDATE: Inicia a variável de comparação com a data de hoje
		// (LocalDate.now()).
		LocalDate dataMaisVelha = LocalDate.now();
		Pessoa pessoaMaisVelha = null;

		// Percorre todos os objetos 'Pessoa' associados a esta família (for-each).
		for (Pessoa p : listaPessoas) {
			// LOCALDATE: O método .isBefore() compara duas datas.
			// Quanto mais antiga (anterior) for a data de nascimento, mais velha é a
			// pessoa.
			if (p.getDataNascimento().isBefore(dataMaisVelha)) {
				dataMaisVelha = p.getDataNascimento();
				pessoaMaisVelha = p;
			}
		}
		return pessoaMaisVelha; // Retorna o objeto Pessoa completo que atende ao critério.
	}
}
