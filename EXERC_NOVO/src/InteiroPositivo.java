
public class InteiroPositivo {

    int valor;

    // A) Definir o valor
    public void setValor(int valor) {

        if (valor <= 0) {

            throw new IllegalArgumentException(
                    "O valor deve ser positivo"
            );

        }

        this.valor = valor;
    }

    // B) Multiplicar pelo valor de outro objeto
    public int multiplicar(InteiroPositivo outro) {

        return this.valor * outro.valor;
    }

    // C) Calcular o fatorial
    public int fatorial() {

        int resultado = 1;

        for (int i = 1; i <= valor; i++) {

            resultado = resultado * i;

        }

        return resultado;
    }

    // D) Mostrar os divisores e a quantidade
    public void mostrarDivisores() {

        int quantidade = 0;

        System.out.println("Divisores de " + valor + ":");

        for (int i = 1; i <= valor; i++) {

            if (valor % i == 0) {

                System.out.println(i);

                quantidade++;

            }

        }

        System.out.println("Quantidade de divisores: "
                + quantidade);
    }

    // E) Série de Fibonacci
    public void fibonacci() {

        int primeiro = 1;
        int segundo = 1;

        System.out.println("Fibonacci:");

        for (int i = 1; i <= valor; i++) {

            System.out.println(primeiro);

            int proximo = primeiro + segundo;

            primeiro = segundo;

            segundo = proximo;

        }
    }
}