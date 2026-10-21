
public class Aeronave {

    // Atributos
    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelPorMinuto;

    // Método para calcular o tempo no ar
    public double calcularTempoNoAr() {

        return capacidadeCombustivel / queimaCombustivelPorMinuto;

    }

    // Método para calcular a distância máxima
    public double calcularDistanciaMaxima() {

        return velocidadeMaxima * calcularTempoNoAr() / 60;

    }

}