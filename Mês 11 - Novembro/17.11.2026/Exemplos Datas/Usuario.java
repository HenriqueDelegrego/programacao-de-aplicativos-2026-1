import java.time.LocalDate;
import java.time.Period;

public class Usuario {

	private LocalDate dataNascimento;

	public Usuario(LocalDate dataNascimento) {
		setDataNascimento(dataNascimento);
	}

	public boolean determinarMaiorIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears() >= 18;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de nascimento inválida");
		}
		this.dataNascimento = dataNascimento;
	}

}
