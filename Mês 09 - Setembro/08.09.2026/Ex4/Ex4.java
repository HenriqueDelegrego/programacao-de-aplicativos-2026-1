public class Ex4 {

	public static void main(String[] args) {

		// Cria quatro objetos diferentes da classe Circulo.
		// Cada objeto possui seu próprio atributo "raio".
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		Circulo c4 = new Circulo();

		// Cada objeto recebe um valor de raio diferente.
		// Por isso, cada círculo terá uma área diferente,
		// pois a área depende do valor do seu próprio raio.
		c1.raio = 1;
		c2.raio = 5;
		c3.raio = 4;
		c4.raio = 2.5;

		// Chama o método calcularArea() do objeto c4.
		// O método utiliza o raio que pertence ao próprio c4.
		//
		// Como c4.raio = 2.5, o cálculo será:
		//
		// Se chamássemos c1.calcularArea(), o método usaria
		// o raio de c1, que é 1, e o resultado seria diferente.
		//
		// O método é o mesmo para todos os objetos, mas cada
		// objeto possui seus próprios valores de atributos.
		System.out.println(c4.calcularArea());

	}

}