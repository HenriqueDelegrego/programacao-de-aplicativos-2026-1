public class Mercado {

	String nomeMercado;

	int macasVendidas;

	double precoMaca;

	int laranjasVendidas;

	double precoLaranja;

	/*
	 * CONSTRUTOR
	 *
	 * O construtor é um método especial usado para criar e inicializar um objeto da
	 * classe Mercado.
	 *
	 * Ele tem o mesmo nome da classe: Mercado.
	 *
	 * Quando criamos um objeto, podemos passar os valores que queremos colocar nos
	 * atributos.
	 *
	 * Exemplo: Mercado mercado = new Mercado("Supermercado X", 10, 2.50, 20, 3.00);
	 */
	public Mercado(String nomeMercado, int macasVendidas, double precoMaca, int laranjasVendidas, double precoLaranja) {

		/*
		 * O "this" representa o objeto atual.
		 *
		 * Aqui temos:
		 *
		 * this.nomeMercado = nomeMercado;
		 *
		 * O nomeMercado do lado esquerdo é o ATRIBUTO da classe. O nomeMercado do lado
		 * direito é o PARÂMETRO recebido pelo construtor.
		 *
		 * O "this" ajuda a diferenciar os dois.
		 */

		this.nomeMercado = nomeMercado;

		this.macasVendidas = macasVendidas;

		this.precoMaca = precoMaca;

		this.laranjasVendidas = laranjasVendidas;

		this.precoLaranja = precoLaranja;
	}

	public double calcularReceitaMacas() {
		return macasVendidas * precoMaca;
	}

	public double calcularReceitaLaranjas() {
		return laranjasVendidas * precoLaranja;
	}

	public double calcularReceitaTotal() {
		// return (macasVendidas * precoMaca) + (laranjasVendidas * precoLaranja);
		return calcularReceitaMacas() + calcularReceitaLaranjas();
	}

	/*
	 * toString()
	 *
	 * O método toString() serve para representar um objeto como uma String (texto).
	 *
	 * Quando tentamos imprimir um objeto, por exemplo:
	 *
	 * System.out.println(mercado);
	 *
	 * o Java chama automaticamente o método toString().
	 *
	 * Por isso, podemos definir aqui quais informações queremos mostrar quando o
	 * objeto for impresso.
	 *
	 * O @Override significa que estamos sobrescrevendo o método toString() que já
	 * existe na classe Object, que é a classe "base" de todas as classes Java.
	 */
	@Override
	public String toString() {

		/*
		 * Aqui estamos montando uma String com os valores dos atributos do objeto.
		 *
		 * Exemplo de resultado:
		 *
		 * Mercado{nomeMercado='Supermercado X', macasVendidas=10, precoMaca=2.5,
		 * laranjasVendidas=20, precoLaranja=3.0}
		 */

		return "Mercado{" + "nomeMercado='" + nomeMercado + '\'' + ", macasVendidas=" + macasVendidas + ", precoMaca="
				+ precoMaca + ", laranjasVendidas=" + laranjasVendidas + ", precoLaranja=" + precoLaranja + '}';
	}
}