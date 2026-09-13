
public class Ex2 {
            public static void main(String[] args) {

                // Criando o objeto de Blumenau
                Mercado unidadeDeBlumenau = new Mercado();

                unidadeDeBlumenau.nome = "Mercado Blumenau";
                unidadeDeBlumenau.quantidadeMacas = 1000;
                unidadeDeBlumenau.precoMacas = 2.50;
                unidadeDeBlumenau.quantidadeLaranjas = 800;
                unidadeDeBlumenau.precoLaranjas = 3.00;


                // Criando o objeto de Joinville
                Mercado unidadeDeJoinville = new Mercado();

                unidadeDeJoinville.nome = "Mercado Joinville";
                unidadeDeJoinville.quantidadeMacas = 1500;
                unidadeDeJoinville.precoMacas = 2.80;
                unidadeDeJoinville.quantidadeLaranjas = 1000;
                unidadeDeJoinville.precoLaranjas = 3.20;


                // Criando o objeto de Florianópolis
                Mercado unidadeDeFlorianopolis = new Mercado();

                unidadeDeFlorianopolis.nome = "Mercado Florianópolis";
                unidadeDeFlorianopolis.quantidadeMacas = 2000;
                unidadeDeFlorianopolis.precoMacas = 3.00;
                unidadeDeFlorianopolis.quantidadeLaranjas = 1200;
                unidadeDeFlorianopolis.precoLaranjas = 3.50;


                // Mostrando as informações
                unidadeDeBlumenau.mostrarInformacoes();

                System.out.println("--------------------");

                unidadeDeJoinville.mostrarInformacoes();

                System.out.println("--------------------");

                unidadeDeFlorianopolis.mostrarInformacoes();

            }
        }


