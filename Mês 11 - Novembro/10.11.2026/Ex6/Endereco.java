// Esta classe é independente: ela não sabe que a classe Pessoa existe.
// Ela apenas representa os dados de um endereço e valida suas próprias regras.
public class Endereco {
	private String uf;
	private String cidade;
	private String cep;
	private String logradouro;
	private String numero;

	public Endereco(String uf, String cidade, String cep, String logradouro, String numero) {
		setUf(uf); // Chama o setter para garantir a validação da UF logo na criação
		this.cidade = cidade;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank() || uf.length() != 2) {
			throw new IllegalArgumentException("Uf inválida");
		}
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Quando a classe Pessoa precisar imprimir seu endereço, o Java chamará este
	// método automaticamente.
	@Override
	public String toString() {
		return "Endereco [uf=" + uf + ", cidade=" + cidade + ", cep=" + cep + ", logradouro=" + logradouro + ", numero="
				+ numero + "]";
	}
}
