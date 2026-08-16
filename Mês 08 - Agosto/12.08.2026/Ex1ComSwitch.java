import java.util.Scanner;

public class Ex1ComSwitch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe a estação do ano");
		int estacao = input.nextInt();

		switch (estacao) {
		case (1) -> imprimirVerao();
		case (2) -> imprimirOutono();
		case (3) -> imprimirInverno();
		case (4) -> imprimirPrimavera();
		}

	}

	public static void imprimirVerao() {
		System.out.println("É verão\nE o tempo está quente");
	}

	public static void imprimirOutono() {
		System.out.println("É outono\nE as folhas estão caindo");
	}

	public static void imprimirInverno() {
		System.out.println("É inverno\nE o tempo está frio");
	}

	public static void imprimirPrimavera() {
		System.out.println("É primavera\nE as folhas estão florindo");
	}
}
