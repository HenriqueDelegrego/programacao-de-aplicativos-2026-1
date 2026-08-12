public class ExemploMetodo {

	public static void main(String[] args) {

		// Aqui estamos chamando (executando) o método introduzirProfessor().
		// Quando o Java chega nesta linha, ele procura o método com esse nome
		// e executa o código que está dentro dele.
		introduzirProfessor();

		// Aqui fazemos a mesma coisa, mas chamando o método introduzirAluno().
		introduzirAluno();
	}

	// Este é um método chamado "introduzirProfessor".
	// As chaves { } delimitam o código que pertence ao método.
	public static void introduzirProfessor() {
		System.out.println("O professor se chama Henrique");
	}

	// Este é outro método, chamado "introduzirAluno".
	public static void introduzirAluno() {
		System.out.println("O aluno se chama João");
	}
}