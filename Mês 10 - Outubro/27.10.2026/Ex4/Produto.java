public class Produto {

	// Atributos primitivos e de referência da classe Produto.
	// Representam o estado (características) de um objeto do tipo Produto.
	private String modelo;
	private String marca;
	private double preco;
	private int qtdEstoque;

	// Construtor: usado para instanciar (criar) um novo objeto Produto,
	// garantindo que ele nasça com valores válidos através dos setters.
	public Produto(String modelo, String marca, double preco, int qtdEstoque) {
		setModelo(modelo);
		setMarca(marca);
		setPreco(preco);
		setQtdEstoque(qtdEstoque);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("nome invalido");
		}
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("nome invalido");
		}
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("preco ta errado");
		}
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new IllegalArgumentException("invalido");
		}
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Produtos{" + "modelo='" + modelo + '\'' + ", marca='" + marca + '\'' + ", preco=" + preco
				+ ", qtdEstoque=" + qtdEstoque + '}';
	}

	/*
	 * POR QUE ESTE MÉTODO FICA AQUI E NÃO NA CLASSE LOJA?
	 * 
	 * 1. Princípio do Especialista na Informação (Information Expert): A regra diz
	 * que a responsabilidade por um comportamento deve ser dada à classe que possui
	 * a informação necessária para executá-lo. Quem sabe a quantidade atual do
	 * estoque e como validá-la é o próprio Produto.
	 * 
	 * 2. Encapsulamento e Coesão: Se o método ficasse na Loja, a Loja teria que
	 * pegar o estoque atual do produto, fazer a conta e depois usar um
	 * 'setQtdEstoque' para alterar o valor de fora. Isso quebraria o
	 * encapsulamento, tornando a classe Produto apenas um "saco de dados" passivo
	 * (modelo anêmico) em vez de um objeto inteligente que protege suas próprias
	 * regras.
	 */
	public void aumentarQuantidadeDoEstoque(int aumento) {
		if (aumento <= 0) {
			throw new IllegalArgumentException("Erro, quantidade de aumento inválida");
		}
		qtdEstoque = qtdEstoque + aumento;
	}

	/*
	 * POR QUE ESTE MÉTODO FICA AQUI E NÃO NA CLASSE LOJA?
	 * 
	 * 3. Autonomia e Reutilização do Objeto: Um Produto existe de forma
	 * independente. Se no futuro criarmos uma classe 'Fornecedor', uma classe
	 * 'CarrinhoDeCompras' ou um 'Galpao', todas essas classes poderão vender ou dar
	 * baixa no estoque chamando 'p.venderQuantidadeDeEstoque(x)'. Se essa lógica
	 * estivesse presa dentro da classe Loja, o comportamento não seria
	 * reaproveitável.
	 * 
	 * 4. Validação Centralizada: A validação de que a venda não pode ser maior que
	 * o estoque disponível diz respeito à consistência interna do Produto. O objeto
	 * garante sozinho que nunca ficará com estoque negativo.
	 */

	public void venderQuantidadeDeEstoque(int venda) {
		if (venda > qtdEstoque || venda <= 0) {
			throw new IllegalArgumentException("Erro, quantidade de venda inválida");
		}
		qtdEstoque = qtdEstoque - venda;
	}
}