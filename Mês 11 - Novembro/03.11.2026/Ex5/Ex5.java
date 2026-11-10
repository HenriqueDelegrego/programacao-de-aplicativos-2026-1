public class Ex5 {
	public static void main(String[] args) {
		// Criação (instanciação) da primeira conta (c1) pertencente à "Ana" com saldo
		// inicial de 1000
		Conta c1 = new Conta("Ana", 1000);

		// Criação (instanciação) da segunda conta (c2) pertencente ao "João" com saldo
		// inicial de 500
		Conta c2 = new Conta("João", 500);

		// Deposita 400 na conta c1 (saldo de c1 passa a ser 1400)
		c1.depositarValor(400);

		// Saca 500 da conta c1 (saldo de c1 passa a ser 900)
		c1.sacarValor(500);

		// Imprime os dados atuais da conta c1 (Nome: Ana, Saldo: 900)
		System.out.println(c1);

		// Transfere 500 da conta c1 para a conta c2
		// c1 perde 500 (fica com 400) e c2 ganha 500 (fica com 1000)
		c1.transferirValor(500, c2);

		// Imprime os dados atualizados da conta c1 (Nome: Ana, Saldo: 400)
		System.out.println(c1);

		// Imprime os dados atualizados da conta c2 (Nome: João, Saldo: 1000)
		System.out.println(c2);

		// Simula um investimento de 500 na conta c2 por 10 períodos (meses/anos) a 1%
		// ao período
		// e imprime apenas o valor futuro calculado (não altera o saldo real da c2)
		System.out.println(c2.simularInvestimento(500, 10));
	}
}
