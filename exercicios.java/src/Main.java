public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Conta conta1 = new Conta("Pedro Hoffmann", 1550);
        Conta conta2 = new Conta("Anna Beatriz Hackbarth", 104200);

        conta1.depositar(350);

        conta2.sacar(5000);

        conta1.transferir(conta2, 50);

        System.out.println("Pedro seu saldo é R$" + conta1.getSaldo());
        System.out.println("Anna seu saldo é R$" + conta2.getSaldo());

        double investimento = conta1.simularInvestimento(2000, 12);

        System.out.println("Seu investimento após 12 meses é R$" + investimento);
    }
}
