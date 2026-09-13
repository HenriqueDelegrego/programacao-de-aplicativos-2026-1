
public class Carro {

    int velocidade;

    public void acelerar(int velocidade) {

        if (velocidade < 0 || velocidade >= 20) {
            throw new IllegalArgumentException(
                    "Velocidade para acelerar deve ser de 0 até 19"
            );
        }

        this.velocidade += velocidade;
    }

    public void reduzir(int velocidade) {

        if (velocidade < 0 || velocidade >= 30) {
            throw new IllegalArgumentException(
                    "Velocidade para reduzir deve ser de 0 até 29"
            );
        }

        this.velocidade -= velocidade;

        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
}