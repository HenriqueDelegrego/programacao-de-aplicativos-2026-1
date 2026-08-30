import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a palavra");
		String palavra = input.next();

		System.out.println(obterCaractere(palavra));

	}

	public static char obterCaractere(String palavra) {
		// O operador ternário é uma forma simplificada de escrever um if/else.
		//
		// Estrutura:
		// condição ? valor_se_verdadeiro : valor_se_falso
		return palavra.length() % 2 == 0 ? palavra.charAt(0) : palavra.charAt(1);
	}

}
