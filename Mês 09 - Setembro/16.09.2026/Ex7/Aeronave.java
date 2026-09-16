// ENCAPSULAMENTO: A classe é pública, mas seus atributos são privados.
// Isso impede o acesso direto de outras classes, protegendo os dados da aeronave.
public class Aeronave {

	// O modificador 'private' garante que estes dados só mudem através de regras
	// controladas.
	private String modelo;
	private int qtdPassageiros;
	private double velMax;
	private double capCombustivel;
	private double queimaMinuto;

	/**
	 * Construtor completo para inicializar todos os atributos da aeronave.
	 * 
	 * SET NO CONSTRUTOR: Em vez de usar "this.atributo = parametro", chamamos os
	 * métodos set. Isso garante que os dados passem pelas validações logo no
	 * momento da criação do objeto.
	 */
	public Aeronave(String modelo, int qtdPassageiros, double velMax, double capCombustivel, double queimaMinuto) {
		// Chamando os métodos modificadores (setters) para validar os argumentos
		// iniciais
		setModelo(modelo);
		setQtdPassageiros(qtdPassageiros);
		setVelMax(velMax);
		setCapCombustivel(capCombustivel);
		setQueimaMinuto(queimaMinuto);
	}

	/**
	 * Calcula a autonomia da aeronave em minutos de voo.
	 */
	public double calcularAutonomia() {
		return capCombustivel / queimaMinuto;
	}

	/**
	 * Calcula a distância máxima que a aeronave consegue percorrer.
	 */
	public double calcularDistanciaMaxima() {
		return calcularAutonomia() * velMax;
	}

	// --- MÉTODOS GETTERS E SETTERS ---

	// GET: Método de leitura. Permite que outras classes vejam o valor do atributo
	// privado.
	public String getModelo() {
		return modelo;
	}

	// SET COM VALIDAÇÃO: Método de modificação. Controla como o atributo pode ser
	// alterado.
	public void setModelo(String modelo) {
		// Validação: Impede que o modelo seja criado vazio, nulo ou cheio de espaços.
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo da aeronave inválida");
		} else {
			this.modelo = modelo; // Se passar na validação, o atributo privado recebe o valor.
		}
	}

	// GET: Retorna a quantidade atual de passageiros.
	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	// SET COM VALIDAÇÃO: Protege o negócio impedindo que o avião tenha passageiros
	// negativos.
	public void setQtdPassageiros(int qtdPassageiros) {
		if (qtdPassageiros < 0) {
			System.out.println("Erro, quantidade de passageiros inválida");
		} else {
			this.qtdPassageiros = qtdPassageiros;
		}
	}

	// GET: Retorna a velocidade máxima.
	public double getVelMax() {
		return velMax;
	}

	// SET COM VALIDAÇÃO: Uma aeronave não pode voar com velocidade zero ou
	// negativa.
	public void setVelMax(double velMax) {
		if (velMax <= 0) {
			System.out.println("Erro, velocidade máxima inválida");
		} else {
			this.velMax = velMax;
		}
	}

	// GET: Retorna a capacidade do tanque de combustível.
	public double getCapCombustivel() {
		return capCombustivel;
	}

	// SET COM VALIDAÇÃO: Impede que a capacidade de combustível seja menor ou igual
	// a zero.
	public void setCapCombustivel(double capCombustivel) {
		if (capCombustivel <= 0) {
			System.out.println("Erro, capacidade de combustível inválida");
		} else {
			this.capCombustivel = capCombustivel;
		}
	}

	// GET: Retorna a taxa de consumo de combustível por minuto.
	public double getQueimaMinuto() {
		return queimaMinuto;
	}

	// SET COM VALIDAÇÃO: Garante que o consumo seja um número positivo válido.
	public void setQueimaMinuto(double queimaMinuto) {
		if (queimaMinuto <= 0) {
			System.out.println("Erro, queima de combustível inválida");
		} else {
			this.queimaMinuto = queimaMinuto;
		}
	}

	/**
	 * Retorna uma representação em texto com todos os dados da aeronave.
	 */
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", qtdPassageiros=" + qtdPassageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaMinuto=" + queimaMinuto + "]";
	}
}
