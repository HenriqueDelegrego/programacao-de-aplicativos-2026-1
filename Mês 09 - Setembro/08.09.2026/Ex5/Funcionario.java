/**
 * Representa um funcionário de uma empresa.
 * <p>
 * A classe armazena os dados básicos do funcionário e fornece operações para
 * calcular seu salário anual, obter seu nome completo e realizar aumentos
 * salariais.
 */
public class Funcionario {

	/** Identificação do funcionário. */
	String identificacao;

	/** Nome do funcionário. */
	String nome;

	/** Sobrenome do funcionário. */
	String sobrenome;

	/** Salário mensal do funcionário. */
	double salario;

	/**
	 * Calcula o salário anual do funcionário.
	 *
	 * @return o salário anual, considerando 12 meses de salário.
	 */
	public double calcularSalarioAnual() {
		return salario * 12;
	}

	/**
	 * Obtém o nome completo do funcionário.
	 *
	 * @return o nome e o sobrenome do funcionário concatenados.
	 */
	public String obterNomeCompleto() {
		return nome + " " + sobrenome;
	}

	/**
	 * Aumenta o salário do funcionário de acordo com o percentual informado.
	 *
	 * @param percentualAumento percentual de aumento a ser aplicado ao salário.
	 */
	public void aumentarSalario(double percentualAumento) {
		double aumento = salario * percentualAumento / 100;
		double salarioFinal = salario + aumento;
		salario = salarioFinal;
	}
}