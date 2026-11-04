public class Conta {

    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) throws IllegalAccessException {
        if (nomeTitular == null || nomeTitular.isBlank()) {
            throw new IllegalAccessException("Este Nome é Inválido");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito Realizado com Sucesso!");
        } else {
            System.out.println("Depósito Indiponível!");
        }
    }

    public void transferir(Conta contaDestino, double valor) throws IllegalAccessException {
        if (valor <= 0 || contaDestino == null || valor > saldo) {
            throw new IllegalAccessException("Transferência Inválida");
            saldo -= valor;
            contaDestino.saldo += valor;
        }
    }

}
    public double simularInvestimento(double valor, int meses) {
        double taxa = 0.01;
        double montante = valor * Math.pow(1 + taxa, meses);

        return montante;
    }
}
