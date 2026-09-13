public class Mercado {

    // Atributos
    String nome;
    int quantidadeMacas;
    double precoMacas;
    int quantidadeLaranjas;
    double precoLaranjas;


    // AQUI entra o método
    public void mostrarInformacoes() {

        System.out.println("Nome do mercado: " + nome);
        System.out.println("Maçãs vendidas por ano: " + quantidadeMacas);
        System.out.println("Preço das maçãs: R$ " + precoMacas);
        System.out.println("Laranjas vendidas por ano: " + quantidadeLaranjas);
        System.out.println("Preço das laranjas: R$ " + precoLaranjas);

    }

}