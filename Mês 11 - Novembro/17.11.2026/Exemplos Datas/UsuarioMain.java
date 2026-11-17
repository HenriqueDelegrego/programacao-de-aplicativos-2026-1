import java.time.LocalDate;

public class UsuarioMain {

	public static void main(String[] args) {

		Usuario u = new Usuario(LocalDate.of(2000, 02, 25));

		if (u.determinarMaiorIdade()) {
			System.out.println("Usuário maior de idade");
		} else {
			System.out.println("Usuário menor de idade");
		}

	}

}
