import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas (ano, mês e dia, sem horário)
import java.time.Period; // Importa a classe Period para calcular a diferença/intervalo entre duas datas

public class ExemploDatas {
	public static void main(String[] args) {

		// LocalDate.now() pega a data atual do sistema (ano, mês, dia)
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); // Exibe a data de hoje no formato ISO (ex: 2026-11-17)

		// LocalDate.of(ano, mês, dia) cria uma data específica informando os números
		LocalDate dataNascimentoHenrique = LocalDate.of(2001, 10, 11); // 11 de outubro de 2001
		LocalDate dataNascimentoDiogo = LocalDate.of(2003, 4, 2); // 2 de abril de 2003

		// .isAfter() verifica se uma data é "depois" (posterior) de outra
		// Como 2003 é depois de 2001, essa condição é verdadeira
		if (dataNascimentoDiogo.isAfter(dataNascimentoHenrique)) {
			System.out.println("Diogo é mais novo");
		} else {
			System.out.println("Henrique é mais novo");
		}

		// Period.between(dataInicial, dataFinal) calcula o intervalo de tempo entre as
		// duas datas
		// .getYears() extrai apenas a quantidade de anos dessa diferença
		int idadeDiogo = Period.between(dataNascimentoDiogo, hoje).getYears();
		System.out.println("O Diogo tem " + idadeDiogo + " anos");
	}
}
