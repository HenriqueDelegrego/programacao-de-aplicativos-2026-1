public class Conta {
	private String nomeTitular;
	private double saldo;

	public Conta(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	}

	public void sacarValor(double saque) {
		if (saque <= 0 || saque > saldo) {
			throw new IllegalArgumentException("Erro, valor de saque inválido");
		}
		saldo -= saque;
	}

	public void depositarValor(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("Erro, valor de deposito inválido");
		}
		saldo += deposito;
	}

	/*
	 * Este método estabelece uma relação entre objetos. O objeto atual interage
	 * diretamente com outro objeto do mesmo tipo (a 'contadestino' passada como
	 * parâmetro).
	 */
	public void transferirValor(double v, Conta contaDestino) {
		// Validação: Garante que o objeto de destino existe (não é nulo) antes de
		// interagir com ele
		if (v <= 0 || contaDestino == null || v > saldo) {
			throw new IllegalArgumentException("Transferencia Invalida");
		}

		// Altera o estado do objeto atual (this) diminuindo o seu saldo
		saldo -= v;

		// contadestino.depositarValor(v);

		/*
		 * Comunicação entre objetos: Aqui, o objeto atual modifica diretamente o estado
		 * interno do objeto 'contadestino'. Nota de boa prática: A linha comentada
		 * acima (.depositarValor) seria mais adequada, pois respeitaria o
		 * encapsulamento, deixando o próprio objeto destino gerenciar seu saldo.
		 */
		contaDestino.saldo += v;
	}

	public double simularInvestimento(double valorInvestido, int tempo) {
		if (tempo <= 0 || valorInvestido <= 0) {
			throw new IllegalArgumentException("Erro, tempo ou valor investido inválido");
		}
		return valorInvestido * Math.pow(1.01, tempo);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		if (nomeTitular == null || nomeTitular.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
}
