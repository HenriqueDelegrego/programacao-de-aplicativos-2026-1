import java.time.LocalDate;

public class Ex9 {
	public static void main(String[] args) {

		// (Instanciação): Criando objetos reais (instâncias) a
		// partir da classe Pessoa usando 'new'.
		// LOCALDATE: LocalDate.of(ano, mês, dia) é usado para criar uma data
		// específica.
		Pessoa p1 = new Pessoa("Carlos", LocalDate.of(2005, 10, 25));
		Pessoa p2 = new Pessoa("Maria", LocalDate.of(2004, 8, 27));

		// Instanciando um objeto da classe Familia.
		Familia f1 = new Familia();

		// ASSOCIAÇÃO NA PRÁTICA: Conectando os objetos independientes (p1 e p2) ao
		// objeto família (f1).
		f1.adicionarPessoa(p1);
		f1.adicionarPessoa(p2);

		// (Troca de mensagens e Polimorfismo):
		// O método encontrarPessoaMaisVelha() retorna o objeto 'p2' (Maria).
		// O System.out.println() chama automaticamente o método toString() sobrescrito
		// na classe Pessoa.
		System.out.println(f1.encontrarPessoaMaisVelha());
	}
}
