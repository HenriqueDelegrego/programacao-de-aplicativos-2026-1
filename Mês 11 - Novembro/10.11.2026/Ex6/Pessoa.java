public class Pessoa {
	private String nome;

	// AQUI ESTÁ O RELACIONAMENTO (Associação "Tem-Um"):
	// Em vez de colocar rua, cep e cidade soltos dentro de Pessoa,
	// ela guarda uma referência para um objeto do tipo Endereco.
	private Endereco endereco;

	// Para criar uma Pessoa, é obrigatório passar um objeto Endereco já pronto.
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		// Delega a atribuição para o método setEndereco, aproveitando a validação de
		// nulo.
		setEndereco(endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Permite que outras classes acessem o objeto Endereco que pertence a esta
	// Pessoa.
	public Endereco getEndereco() {
		return endereco;
	}

	// Garante a integridade do relacionamento: uma Pessoa não pode existir sem um
	// Endereco válido.
	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Endereço nulo");
		}
		this.endereco = endereco;
	}

	// Ao concatenar "+ endereco", o Java chama automaticamente o método
	// endereco.toString(),
	// unindo os dados da Pessoa com os dados do seu Endereco.
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + "]";
	}
}
