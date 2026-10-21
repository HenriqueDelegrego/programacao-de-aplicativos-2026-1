
public class Ex3 {

    public static void main(String[] args) {

        // Produto 1 - Caderno
        Produto produto1 = new Produto();

        produto1.nome = "Caderno";
        produto1.descricao = "Caderno em espiral tamanho médio";
        produto1.precoUnitario = 4.50;
        produto1.desconto = 15;


        // Produto 2 - Caneta ESF
        Produto produto2 = new Produto();

        produto2.nome = "Caneta ESF";
        produto2.descricao = "Caneta esferográfica 5mm";
        produto2.precoUnitario = 1.20;
        produto2.desconto = 2;


        // Mostrar informações
        produto1.mostrarInformacoes();

        System.out.println("--------------------");

        produto2.mostrarInformacoes();

    }

}