// Esta é outra classe, usada neste exemplo para executar o programa.
public class ClassePrincipal {

	// O método main é o ponto de início da execução de um programa Java.
	public static void main(String[] args) {

		// Aqui estamos criando um OBJETO da classe Veiculo.
		//
		// "Veiculo" é o tipo do objeto.
		// "v1" é uma variável que vai guardar uma referência para o objeto.
		// "new Veiculo()" cria efetivamente um novo objeto na memória.
		Veiculo v1 = new Veiculo();

		// Estamos atribuindo valores aos ATRIBUTOS do objeto v1.
		// O operador "." permite acessar um atributo ou método de um objeto.
		v1.marca = "Honda";
		v1.modelo = "Civic";
		v1.placa = "xxx1xx11";
		v1.ano = 2010;
		v1.preco = 50000;

		// Exibimos no console os valores dos atributos marca e modelo
		// pertencentes especificamente ao objeto v1.
		System.out.println(v1.marca + " " + v1.modelo);

		// Criamos um SEGUNDO objeto da classe Veiculo.
		//
		// É importante perceber que v1 e v2 são objetos diferentes.
		// Embora tenham sido criados a partir da mesma classe (mesmo molde),
		// cada objeto possui seus próprios valores para os atributos.
		Veiculo v2 = new Veiculo();

		// Atribuímos valores aos atributos do objeto v2.
		v2.marca = "Volkswagen";
		v2.modelo = "Gol";
		v2.placa = "XX2X2X12";
		v2.ano = 2015;
		v2.preco = 30000;

		// Exibimos os valores dos atributos do objeto v2.
		System.out.println(v2.marca + " " + v2.modelo);
	}
}