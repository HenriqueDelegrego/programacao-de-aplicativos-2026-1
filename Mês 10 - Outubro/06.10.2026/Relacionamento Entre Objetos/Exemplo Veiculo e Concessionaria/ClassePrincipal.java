public class ClassePrincipal {

	public static void main(String[] args) {

		// 1. Criação de instâncias (objetos independentes) da classe Veiculo
		// Cada variável (v1, v2...) guarda a referência de um carro único na memória.
		Veiculo v1 = new Veiculo("Honda", "Civic", "XXX1X11", 2010, 45000);
		Veiculo v2 = new Veiculo("Mazda", "Mx3", "aaaaaaa", 1997, 50000);
		Veiculo v3 = new Veiculo("Volkswagen", "Gol Polo", "KGB-1A11", 2020, 68000.0);
		Veiculo v4 = new Veiculo("Hyundai", "HB20 Sense", "QWE-4C32", 2024, 85000.0);
		Veiculo v5 = new Veiculo("Fiat", "Argo Drive", "JKL-0F98", 2019, 20000.0);

		// 2. Criação da primeira Concessionaria (c1)
		// Neste momento, c1 tem uma lista interna de veículos que está vazia.
		Concessionaria c1 = new Concessionaria();

		// 3. Estabelecendo o Relacionamento:
		// Passamos os objetos v1 e v2 para dentro da concessionária c1.
		// Agora c1 está relacionada com (e aponta para) o Honda Civic e o Mazda Mx3.
		c1.adicionarVeiculo(v1);
		c1.adicionarVeiculo(v2);

		// 4. Executando lógica sobre o relacionamento:
		// c1 varre sua lista interna, compara os preços de v1 e v2, e o toString() do
		// mais barato é impresso.
		System.out.println(c1.obterVeiculoMaisBarato());

		// 5. Criação de uma segunda Concessionaria (c2)
		// Isso prova a independência: c2 gerencia um grupo de carros totalmente
		// diferente de c1.
		Concessionaria c2 = new Concessionaria();

		// 6. Estabelecendo novos relacionamentos:
		// Os objetos v3, v4 e v5 agora pertencem à lista da concessionária c2.
		c2.adicionarVeiculo(v3);
		c2.adicionarVeiculo(v4);
		c2.adicionarVeiculo(v5);

		// 7. Executando lógica na segunda concessionária:
		// c2 varre sua própria lista (v3, v4 e v5) e encontra o seu veículo mais barato
		// (v5).
		System.out.println(c2.obterVeiculoMaisBarato());

	}

}
