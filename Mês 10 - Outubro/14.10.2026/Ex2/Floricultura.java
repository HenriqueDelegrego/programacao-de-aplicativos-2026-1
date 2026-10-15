import java.util.ArrayList;
import java.util.List;

/**
 * RELACIONAMENTO ENTRE OBJETOS: A classe Floricultura possui uma lista de
 * objetos do tipo 'Flor' (List<Flor>). Isso caracteriza uma relação onde a
 * Floricultura "tem várias" Flores.
 */
public class Floricultura {
	// Atributo que armazena a coleção de objetos 'Flor'
	private List<Flor> flores;

	// Construtor cria a lista interna vazia ao instanciar uma nova Floricultura
	public Floricultura() {
		flores = new ArrayList<Flor>();
	}

	/**
	 * MENSAGEM / INTERAÇÃO: Método que recebe a referência de um objeto 'Flor'
	 * externo e o adiciona à coleção interna da Floricultura.
	 */
	public void adicionarFlor(Flor f) {
		flores.add(f);
	}

	/**
	 * REGRA DE NEGÓCIO: Método que varre a coleção de objetos 'Flor' e filtra
	 * aquelas que pertencem ao cliente informado, demonstrando a interação dinâmica
	 * entre coleções e atributos de objetos.
	 */
	public List<Flor> pesquisarFlores(String nomeCliente) {
		List<Flor> floresPesquisa = new ArrayList<Flor>();
		for (Flor f : flores) {
			// Acessa o atributo encapsulado do objeto 'f' usando o método getter
			if (f.getNomeCliente().equals(nomeCliente)) {
				floresPesquisa.add(f);
			}
		}
		return floresPesquisa;
	}
}