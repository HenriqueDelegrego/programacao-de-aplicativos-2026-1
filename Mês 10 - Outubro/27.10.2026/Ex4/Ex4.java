public class Ex4 {
	public static void main(String[] args) {
		// Criação de múltiplos objetos independentes da classe Produto.
		Produto p1 = new Produto("Cimento", "Riachuelo", 9.99, 10);
		Produto p2 = new Produto("Vergalhão", "Rihappy", 10.99, 10);
		Produto p3 = new Produto("Madeira", "Rihappy", 12.99, 15);
		Produto p4 = new Produto("Cano Grosso ( ͡° ͜ʖ ͡°)", "Tigre", 900, 69);
		Produto p5 = new Produto("Telha", "Honda", 16.99, 32);

		// Interação com o objeto p1 (chamada de método de negócio)
		p1.venderQuantidadeDeEstoque(5);
		System.out.println(p1);

		// Criação de um objeto da classe Loja
		Loja l1 = new Loja();

		// Relacionando os objetos Produto (p1 a p5) ao objeto Loja (l1)
		// através do método adicionarProduto
		l1.adicionarProduto(p1);
		l1.adicionarProduto(p2);
		l1.adicionarProduto(p3);
		l1.adicionarProduto(p4);
		l1.adicionarProduto(p5);

		// Consultando os objetos por meio dos métodos da Loja
		System.out.println(l1.produtoMaisCaro("Rihappy"));
		System.out.println(l1.buscaEstoque(11, 20, "Rihappy"));
	}
}
