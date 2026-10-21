
public class Ex6 {

    public static void main(String[] args) {

        Mercado unidadeDeBlumenau = new Mercado();

        unidadeDeBlumenau.nome = "Blumenau";
        unidadeDeBlumenau.quantidadeMacas = 1000;
        unidadeDeBlumenau.precoMacas = 2.50;
        unidadeDeBlumenau.quantidadeLaranjas = 800;
        unidadeDeBlumenau.precoLaranjas = 3.00;


        Mercado unidadeDeJoinville = new Mercado();

        unidadeDeJoinville.nome = "Joinville";
        unidadeDeJoinville.quantidadeMacas = 1500;
        unidadeDeJoinville.precoMacas = 2.80;
        unidadeDeJoinville.quantidadeLaranjas = 1000;
        unidadeDeJoinville.precoLaranjas = 3.20;


        Mercado unidadeDeFlorianopolis = new Mercado();

        unidadeDeFlorianopolis.nome = "Florianópolis";
        unidadeDeFlorianopolis.quantidadeMacas = 2000;
        unidadeDeFlorianopolis.precoMacas = 3.00;
        unidadeDeFlorianopolis.quantidadeLaranjas = 1200;
        unidadeDeFlorianopolis.precoLaranjas = 3.50;


        Mercado[] mercados = {
                unidadeDeBlumenau,
                unidadeDeJoinville,
                unidadeDeFlorianopolis
        };


        // A) Maior receita vendendo maçãs

        Mercado maiorMaca = mercados[0];

        for (Mercado mercado : mercados) {

            double receitaAtual =
                    mercado.quantidadeMacas * mercado.precoMacas;

            double receitaMaior =
                    maiorMaca.quantidadeMacas * maiorMaca.precoMacas;

            if (receitaAtual > receitaMaior) {
                maiorMaca = mercado;
            }

        }

        System.out.println("Maior receita com maçãs: " + maiorMaca.nome);


        // B) Maior receita vendendo laranjas

        Mercado maiorLaranja = mercados[0];

        for (Mercado mercado : mercados) {

            double receitaAtual =
                    mercado.quantidadeLaranjas * mercado.precoLaranjas;

            double receitaMaior =
                    maiorLaranja.quantidadeLaranjas * maiorLaranja.precoLaranjas;

            if (receitaAtual > receitaMaior) {
                maiorLaranja = mercado;
            }

        }

        System.out.println("Maior receita com laranjas: " + maiorLaranja.nome);


        // C) Segunda maior receita total

        Mercado maiorTotal = mercados[0];
        Mercado segundaMaior = mercados[0];

        for (Mercado mercado : mercados) {

            double totalAtual =
                    (mercado.quantidadeMacas * mercado.precoMacas)
                            +
                            (mercado.quantidadeLaranjas * mercado.precoLaranjas);

            double totalMaior =
                    (maiorTotal.quantidadeMacas * maiorTotal.precoMacas)
                            +
                            (maiorTotal.quantidadeLaranjas * maiorTotal.precoLaranjas);

            if (totalAtual > totalMaior) {

                segundaMaior = maiorTotal;
                maiorTotal = mercado;

            }

        }

        System.out.println("Segunda maior receita total: " + segundaMaior.nome);


        // D) Maior receita vendendo maçãs ou laranjas

        Mercado maiorReceita = mercados[0];

        for (Mercado mercado : mercados) {

            double receitaAtual =
                    (mercado.quantidadeMacas * mercado.precoMacas)
                            +
                            (mercado.quantidadeLaranjas * mercado.precoLaranjas);

            double receitaMaior =
                    (maiorReceita.quantidadeMacas * maiorReceita.precoMacas)
                            +
                            (maiorReceita.quantidadeLaranjas * maiorReceita.precoLaranjas);

            if (receitaAtual > receitaMaior) {
                maiorReceita = mercado;
            }

        }

        System.out.println("Maior receita total: " + maiorReceita.nome);

    }

}