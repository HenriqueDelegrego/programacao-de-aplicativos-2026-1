import java.util.Scanner;

public class Ex2 {

	// Este método é responsável por imprimir
	// as informações do João.
	public static void imprimirJoao() {
		System.out.println("O nome dele é João");
		System.out.println("Ele tem 20 anos");
		System.out.println("Ele é aluno de desenvolvimento de sistemas");
	}

	public static void imprimirMaria() {
		System.out.println("O nome dela é Maria");
		System.out.println("Ela tem 19 anos");
		System.out.println("Ela é aluna de desenvolvimento de sistemas");
	}

	public static void imprimirAna() {
		System.out.println("O nome dela é Ana");
		System.out.println("Ela tem 22 anos");
		System.out.println("Ela é aluna de desenvolvimento de sistemas");

	}

	public static void main(String[] args) {

		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Informe o nome do seu colega");

		String nome = inputScanner.next();

		// Verificamos se o nome digitado é "João".
		//
		// equalsIgnoreCase() é um método usado para comparar
		// duas Strings, ignorando letras maiúsculas e minúsculas.
		//
		// Por exemplo:
		// "João".equalsIgnoreCase("joão") -> true
		// "João".equalsIgnoreCase("JOÃO") -> true
		//
		// Se a comparação for verdadeira, chamamos
		// o método imprimirJoao().
		if (nome.equalsIgnoreCase("João")) {
			imprimirJoao();
		} else if (nome.equalsIgnoreCase("Maria")) {
			imprimirMaria();
		} else if (nome.equalsIgnoreCase("Ana")) {
			imprimirAna();
		}

	}

}
