public class Aeronave {

    String nome;
    double qtdPassageiros;
    double velocidadeMaxima;
    double combustivel;
    double consumo;

    public Aeronave(String nome, double qtdPassageiros, double velocidadeMaxima,
                    double combustivel, double consumo) {

        this.nome = nome;
        this.qtdPassageiros = qtdPassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.combustivel = combustivel;
        this.consumo = consumo;
    }

    public double calcularAutonomia() {
        return combustivel / consumo;
    }

    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velocidadeMaxima;
    }

    @Override
    public String toString() {
        return nome;
    }
}