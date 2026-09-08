public class Ex5 {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		f1.identificacao = "984841584185";
		f1.nome = "João";
		f1.sobrenome = "Santos";
		f1.salario = 5000;

		System.out.println(f1.calcularSalarioAnual());

		System.out.println(f1.obterNomeCompleto());

		/*
		 * O método aumentarSalario() recebe o percentual de aumento.
		 *
		 * Neste caso, estamos passando 5, ou seja, queremos aumentar o salário do
		 * funcionário em 5%.
		 *
		 * O método calcula quanto representa 5% do salário atual, soma esse valor ao
		 * salário e atualiza o atributo salario.
		 */
		f1.aumentarSalario(5);

		/*
		 * Depois que o método aumentarSalario() é executado, o atributo salario passa a
		 * armazenar o novo salário.
		 */
		System.out.println(f1.salario);
	}

}