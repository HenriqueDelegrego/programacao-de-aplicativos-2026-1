import java.util.ArrayList;
import java.util.List;

public class Loja {

	// RELACIONAMENTO ENTRE OBJETOS (Associação / Agregação):
	// A classe Loja possui uma lista (List) de objetos do tipo Produto.
	// Isso significa que uma Loja "tem muitos" Produtos (relação 1 para N).
	// Trata-se de uma agregação: os objetos Produto podem existir
	// independentemente de estarem associados a uma Loja ou não.
	private List<Produto> produtos;

	public Loja() {
		// Inicializa a coleção que vai armazenar as referências aos objetos Produto.
		this.produtos = new ArrayList<>();
	}

	// Método que estabelece a associação:
	// Recebe um objeto Produto já instanciado e o adiciona à lista da loja.
	public void adicionarProduto(Produto p) {
		produtos.add(p);
	}

	// Método que percorre a coleção de objetos Produto associados à Loja
	// para encontrar o mais caro com base na marca.
	public Produto produtoMaisCaro(String marca) {
		Produto produtoMaisCaro = null;
		double precoMaior = Double.MIN_VALUE;

		// Itera sobre cada objeto Produto dentro da lista da loja
		for (Produto p : produtos) {
			// Acessa os métodos do objeto Produto (p.getMarca(), p.getPreco())
			// para realizar a regra de negócio.
			if (marca.equals(p.getMarca()) && p.getPreco() > precoMaior) {
				produtoMaisCaro = p;
				precoMaior = p.getPreco();
			}
		}
		return produtoMaisCaro;
	}

	// Retorna uma sub-lista com os objetos Produto que atendem aos critérios de
	// busca.
	public List<Produto> buscaEstoque(double precoInicial, double precoFinal, String marca) {
		List<Produto> buscaEstoque = new ArrayList<>();
		for (Produto p : produtos) {
			if (marca.equals(p.getMarca()) && p.getPreco() >= precoInicial && p.getPreco() <= precoFinal) {
				buscaEstoque.add(p);
			}
		}
		return buscaEstoque;
	}
}
