
public class Ex11 {

    public static void main(String[] args) {

        // A) Criar objeto
        InteiroPositivo numero1 = new InteiroPositivo();

        numero1.setValor(5);

        System.out.println("Valor: " + numero1.valor);


        // B) Multiplicação
        InteiroPositivo numero2 = new InteiroPositivo();

        numero2.setValor(3);

        System.out.println("Multiplicação: "
                + numero1.multiplicar(numero2));


        // C) Fatorial
        System.out.println("Fatorial: "
                + numero1.fatorial());


        // D) Divisores
        numero1.mostrarDivisores();


        // E) Fibonacci
        numero1.fibonacci();

    }
}