
public class Ex8 {

	public static void main(String[] args) {

		Contribuinte c1 = new Contribuinte("João", "00000000000", "SC", 2800);
		Contribuinte c2 = new Contribuinte("Maria", "11111111111", "PR", 5000);
		Contribuinte c3 = new Contribuinte("Ana", "22222222222", "RS", 10000);
		Contribuinte c4 = new Contribuinte("Carlos", "33333333333", "PR", 27000);
		Contribuinte c5 = new Contribuinte("Jorge", "44444444444", "SC", 38000);

		Contribuinte[] contribuintes = { c1, c2, c3, c4, c5 };

		// Quem mais paga imposto
		double maiorImposto = 0;
		Contribuinte contribuinteMaiorImposto = null;

		for (int i = 0; i < contribuintes.length; i++) {
			if (contribuintes[i].calcularImposto() > maiorImposto) {
				maiorImposto = contribuintes[i].calcularImposto();
				contribuinteMaiorImposto = contribuintes[i];
			}
		}
		System.out.println(contribuinteMaiorImposto);

		// Qual o total de imposto pago entre os 5 contribuintes
		double totalImposto = 0;
		for (int i = 0; i < contribuintes.length; i++) {
			totalImposto += contribuintes[i].calcularImposto();
		}
		System.out.println("O total de imposto pago é de R$" + totalImposto);

	}

}
