
public class Ex9 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.velocidade = 0;

        carro.acelerar(10);

        System.out.println("Velocidade: "
                + carro.velocidade);

        carro.reduzir(5);

        System.out.println("Velocidade: "
                + carro.velocidade);

    }
}