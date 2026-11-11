public class Ex6 {
	public static void main(String[] args) {
		// Aqui os dois objetos são instanciados e conectados na memória:
		// 1º: O 'new Endereco(...)' é executado primeiro, criando o objeto endereço.
		// 2º: Esse objeto recém-criado é passado como argumento para o construtor de
		// 'Pessoa'.
		// Obs.: Como "SCC" tem 3 letras, o setUf() de Endereco vai lançar uma exceção
		// aqui!
		Pessoa p1 = new Pessoa("Jorginho", new Endereco("SCC", "Blumenau", "89030000", "Rua São Paulo", "100"));

		// Chama o p1.toString(), que por sua vez chama o toString() do Endereco
		// associado.
		System.out.println(p1);
	}
}
