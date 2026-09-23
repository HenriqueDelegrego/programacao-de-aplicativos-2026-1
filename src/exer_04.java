import java.util.Scanner;

public class exer_04 {

    //4)
    //Escreva um algoritmo que leia o número de inscrição e a altura de um atleta e informe:
    //• O número de inscrição e a altura do atleta mais alto
    //• O número de inscrição e a altura do atleta mais baixo
    //• A altura média do grupo de atletas
    //• A quantidade de atletas cadastrados
    //A leitura deve ser finalizada ao digitar 0 para o número de inscrição.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inscricaoMaisAlto = 0;
        int inscricaoMaisBaixo = 0;
        double alturaMaisAlta = 0;
        double alturaMaisBaixa = 0;
        double somaAlturas = 0;
        int quantidade = 0;

        System.out.println("Informe o número de inscrição (0 para finalizar)");
        int inscricao = sc.nextInt();

        while (inscricao != 0) {

            System.out.println("Informe a altura do atleta");
            double altura = sc.nextDouble();

            quantidade++;
            somaAlturas += altura;

            // Primeiro atleta cadastrado define os valores iniciais
            if (quantidade == 1) {
                alturaMaisAlta = altura;
                alturaMaisBaixa = altura;
                inscricaoMaisAlto = inscricao;
                inscricaoMaisBaixo = inscricao;
            } else {
                if (altura > alturaMaisAlta) {
                    alturaMaisAlta = altura;
                    inscricaoMaisAlto = inscricao;
                }
                if (altura < alturaMaisBaixa) {
                    alturaMaisBaixa = altura;
                    inscricaoMaisBaixo = inscricao;
                }
            }

            System.out.println("Informe o número de inscrição (0 para finalizar)");
            inscricao = sc.nextInt();
        }

        sc.close();

        System.out.println("\n----- RESULTADOS -----");

        if (quantidade == 0) {
            System.out.println("Nenhum atleta foi cadastrado.");
        } else {
            double alturaMedia = somaAlturas / quantidade;

            System.out.println("Atleta mais alto -> Inscrição: " + inscricaoMaisAlto + " | Altura: " + alturaMaisAlta);
            System.out.println("Atleta mais baixo -> Inscrição: " + inscricaoMaisBaixo + " | Altura: " + alturaMaisBaixa);
            System.out.println("Altura média do grupo: " + alturaMedia);
            System.out.println("Quantidade de atletas cadastrados: " + quantidade);
        }
    }
}