public class Ex6 {

	public static void main(String[] args) {

		// Ao usar "new Mercado(...)", estamos criando um novo objeto
		// da classe Mercado.
		//
		// Os valores entre parênteses são enviados para o CONSTRUTOR
		// da classe Mercado.
		//
		// A ordem dos valores deve ser a mesma ordem definida
		// no construtor da classe Mercado.
		Mercado unidadeJoinville = new Mercado("Giassi", 500, 2, 400, 2.5);

		// Sem utilizar um construtor, precisaríamos criar o objeto
		// e depois preencher cada atributo separadamente:
		//
		// unidadeJoinville.nomeMercado = "Giassi";
		// unidadeJoinville.macasVendidas = 500;
		// unidadeJoinville.precoMaca = 2;
		// unidadeJoinville.laranjasVendidas = 400;
		// unidadeJoinville.precoLaranja = 2.5;
		//
		// Perceba que o construtor permite fazer tudo isso
		// diretamente na criação do objeto.

		// Aqui criamos outro objeto da classe Mercado.
		// O construtor recebe os dados do mercado de Blumenau.
		//
		// "Angeloni" -> nome do mercado
		// 450 -> quantidade de maçãs vendidas
		// 1.8 -> preço da maçã
		// 420 -> quantidade de laranjas vendidas
		// 2.2 -> preço da laranja
		Mercado unidadeBlumenau = new Mercado("Angeloni", 450, 1.8, 420, 2.2);

		// Esta seria a forma de fazer a mesma coisa SEM construtor:
		//
		// unidadeBlumenau.nomeMercado = "Angeloni";
		// unidadeBlumenau.macasVendidas = 450;
		// unidadeBlumenau.precoMaca = 1.8;
		// unidadeBlumenau.laranjasVendidas = 420;
		// unidadeBlumenau.precoLaranja = 2.2;

		// Criamos agora um terceiro objeto da classe Mercado.
		// Novamente, os valores são passados diretamente
		// para o construtor.
		Mercado unidadeFlorianopolis = new Mercado("Fort", 500, 2, 470, 2.4);

		// Sem construtor, seria necessário fazer:
		//
		// unidadeFlorianopolis.nomeMercado = "Fort";
		// unidadeFlorianopolis.macasVendidas = 500;
		// unidadeFlorianopolis.precoMaca = 2;
		// unidadeFlorianopolis.laranjasVendidas = 470;
		// unidadeFlorianopolis.precoLaranja = 2.4;

		// Criamos um vetor que vai guardar as REFERÊNCIAS
		// para os três objetos Mercado.
		//
		// O vetor não está criando novos mercados.
		// Ele apenas organiza os objetos que já criamos.
		//
		// mercados[0] ---> unidadeBlumenau
		// mercados[1] ---> unidadeFlorianopolis
		// mercados[2] ---> unidadeJoinville
		Mercado mercados[] = { unidadeBlumenau, unidadeFlorianopolis, unidadeJoinville };

		// ==========================================================
		// QUEM TEVE A MAIOR RECEITA VENDENDO MAÇÃS?
		// ==========================================================

		// Essa variável vai guardar o MAIOR VALOR de receita encontrado.
		//
		// Começamos com 0 porque sabemos que a receita dos mercados
		// será maior que zero.
		double maiorReceitaMacas = 0;

		// Essa variável vai guardar o OBJETO Mercado que possui
		// a maior receita de maçãs.
		//
		// No começo ainda não sabemos qual mercado é o vencedor,
		// então ela começa apontando para "nada" (null).
		Mercado mercadoMaiorReceitaMacas = null;

		// Percorremos todos os objetos que estão dentro do vetor.
		for (int i = 0; i < mercados.length; i++) {

			// mercados[i] representa o mercado da posição atual.
			//
			// Por exemplo:
			// i = 0 -> mercados[0] é o Blumenau
			// i = 1 -> mercados[1] é o Florianópolis
			// i = 2 -> mercados[2] é o Joinville
			//
			// Aqui NÃO estamos comparando os objetos diretamente.
			// Estamos comparando uma característica deles:
			// a receita de maçãs.
			if (mercados[i].calcularReceitaMacas() > maiorReceitaMacas) {

				// Se a receita desse mercado for maior que a maior
				// receita encontrada até agora, atualizamos o valor.
				maiorReceitaMacas = mercados[i].calcularReceitaMacas();

				// Também guardamos a REFERÊNCIA para o objeto que
				// possui essa maior receita.
				//
				// Assim conseguimos descobrir depois o nome do mercado.
				mercadoMaiorReceitaMacas = mercados[i];
			}
		}

		// Agora temos:
		//
		// maiorReceitaMacas -> guarda o VALOR da maior receita.
		//
		// mercadoMaiorReceitaMacas -> guarda o OBJETO Mercado
		// que possui essa receita.
		System.out.println("Quem teve a maior receita de maçãs: " + mercadoMaiorReceitaMacas);

		// ==========================================================
		// QUEM TEVE A MENOR RECEITA VENDENDO LARANJAS?
		// ==========================================================

		// Double.MAX_VALUE representa um número extremamente grande.
		//
		// Usamos esse valor para garantir que a primeira receita
		// encontrada seja menor do que ele.
		double menorReceitaLaranjas = Double.MAX_VALUE;

		// Ainda não sabemos qual objeto possui a menor receita.
		Mercado mercadoMenorReceitaLaranjas = null;

		// Percorremos novamente todos os mercados.
		for (int i = 0; i < mercados.length; i++) {

			// Verificamos se a receita de laranjas do mercado atual
			// é menor que a menor receita encontrada até agora.
			if (mercados[i].calcularReceitaLaranjas() < menorReceitaLaranjas) {

				// Se for menor, guardamos esse novo menor valor.
				menorReceitaLaranjas = mercados[i].calcularReceitaLaranjas();

				// E guardamos também o objeto Mercado que possui
				// essa menor receita.
				mercadoMenorReceitaLaranjas = mercados[i];
			}
		}

		// Mostramos os dados do objeto que encontramos.
		System.out.println("Quem teve a menor receita de laranjas: " + mercadoMenorReceitaLaranjas);

		// ==========================================================
		// QUAL LOJA TEVE A SEGUNDA MAIOR RECEITA TOTAL?
		// ==========================================================

		// Vai guardar o valor da segunda maior receita encontrada.
		double segundaMaiorReceitaTotal = 0;

		// Vai guardar o objeto Mercado que possui a segunda maior receita.
		Mercado mercadoSegundaMaiorReceitaTotal = null;

		// Vai guardar o valor da maior receita total.
		double maiorReceitaTotal = 0;

		// ----------------------------------------------------------
		// PRIMEIRO PASSO:
		// Descobrir qual é a MAIOR receita total.
		// ----------------------------------------------------------

		for (int i = 0; i < mercados.length; i++) {

			// Calculamos a receita total do mercado atual.
			//
			// Se ela for maior que a maior receita que conhecemos,
			// atualizamos maiorReceitaTotal.
			if (mercados[i].calcularReceitaTotal() > maiorReceitaTotal) {

				maiorReceitaTotal = mercados[i].calcularReceitaTotal();
			}
		}

		// ----------------------------------------------------------
		// SEGUNDO PASSO:
		// Descobrir a maior receita que NÃO seja a primeira maior.
		//
		// Essa será a segunda maior receita.
		// ----------------------------------------------------------

		for (int i = 0; i < mercados.length; i++) {

			// Existem duas condições aqui:
			//
			// 1) A receita precisa ser maior que a segunda maior
			// que encontramos até agora.
			//
			// 2) A receita NÃO pode ser igual à maior receita.
			//
			// Dessa forma, ignoramos o primeiro colocado e procuramos
			// o maior valor entre os mercados restantes.
			if (mercados[i].calcularReceitaTotal() > segundaMaiorReceitaTotal
					&& mercados[i].calcularReceitaTotal() != maiorReceitaTotal) {

				// Guardamos o valor da segunda maior receita.
				segundaMaiorReceitaTotal = mercados[i].calcularReceitaTotal();

				// E guardamos o objeto que possui essa receita.
				mercadoSegundaMaiorReceitaTotal = mercados[i];
			}
		}

		System.out.println("Mercado que teve a segunda maior receita total: " + mercadoSegundaMaiorReceitaTotal);

		// ==========================================================
		// A FRANQUIA FATUROU MAIS COM MAÇÃS OU LARANJAS?
		// ==========================================================

		// Essas variáveis vão somar as receitas de TODOS os mercados.
		double receitaGeralMacas = 0;
		double receitaGeralLaranjas = 0;

		// Percorremos todos os mercados.
		for (int i = 0; i < mercados.length; i++) {

			// Pegamos a receita de laranjas do mercado atual
			// e adicionamos ao total geral de laranjas.
			receitaGeralLaranjas += mercados[i].calcularReceitaLaranjas();

			// Fazemos a mesma coisa com as maçãs.
			receitaGeralMacas += mercados[i].calcularReceitaMacas();
		}

		if (receitaGeralMacas > receitaGeralLaranjas) {
			System.out.println("A franquia teve uma receita maior com maçãs");
		} else if (receitaGeralLaranjas > receitaGeralMacas) {
			System.out.println("A franquia teve uma receita maior com laranjas");
		} else {
			System.out.println("As receitas foram iguais");
		}
	}

}