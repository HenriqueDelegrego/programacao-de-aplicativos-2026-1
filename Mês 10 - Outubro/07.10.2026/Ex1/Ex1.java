
public class Ex1 {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(5, 4);
		Retangulo r2 = new Retangulo(18, 1);

		FormasGeometricas f1 = new FormasGeometricas();

		f1.adicionarRetangulo(r1);
		f1.adicionarRetangulo(r2);

		System.out.println(f1.obterRetanguloMaiorArea());
		System.out.println(f1.obterRetanguloMaiorPerimetro());

	}

}
