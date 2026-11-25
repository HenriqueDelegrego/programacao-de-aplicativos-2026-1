
import java.time.LocalDate;
import java.time.Period;

//  (Classe): Define o molde/estrutura para criar objetos do tipo Pessoa.
public class Pessoa {

	// (Encapsulamento): Atributos marcados como 'private'
	// para proteger os dados e impedir acesso direto fora desta classe.
	private String nome;
	private LocalDate dataNascimento; // LOCALDATE: Tipo específico para armazenar apenas datas (ano, mês, dia), sem
										// horas.

	// (Construtor): Método especial executado ao instanciar
	// (criar) um novo objeto Pessoa.
	public Pessoa(String nome, LocalDate dataNascimento) {
		// Chama os setters dentro do construtor para aproveitar as regras de validação
		// já na criação do objeto.
		setNome(nome);
		setDataNascimento(dataNascimento);
	}

	// (Getters e Setters): Métodos públicos que controlam o
	// acesso e a modificação dos atributos privados.
	public String getNome() {
		return nome;
	}

	public int obterIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	public void setNome(String nome) {
		// Regra de negócio/validação garantida pelo encapsulamento
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome; // 'this' diferencia o atributo da classe do parâmetro recebido no método.
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		// LOCALDATE: LocalDate.now() pega a data atual do sistema.
		// O método .isAfter() verifica se a data informada é posterior à data de hoje
		// (impedindo datas no futuro).
		if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data nascimento inválida");
		}
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
