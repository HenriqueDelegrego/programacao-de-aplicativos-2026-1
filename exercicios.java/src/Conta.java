public class Conta {

    private String nomeTitular;
    private double saldo;

    // Construtor
    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    // Getter do nome
    public String getNomeTitular() {
        return nomeTitular;
    }

    // Setter do nome
    public void setNomeTitular(String nomeTitular) throws IllegalAccessException {
        if (nomeTitular == null || nomeTitular.isBlank()) {
            throw new IllegalAccessException("Este nome é inválido");
        }

        this.nomeTitular = nomeTitular;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Depósito inválido!");
        }
    }

    // Transferir dinheiro
    public void transferir(Conta contaDestino, double valor) throws IllegalAccessException {
        if (valor <= 0 || contaDestino == null || valor > saldo) {
            throw new IllegalAccessException("Transferência inválida");
        }

        saldo -= valor;
        contaDestino.saldo += valor;
    }

    // Simular investimento
    public double simularInvestimento(double valor, int meses) {
        double taxa = 0.01;

        double montante = valor * Math.pow(1 + taxa, meses);

        return montante;
    }
}