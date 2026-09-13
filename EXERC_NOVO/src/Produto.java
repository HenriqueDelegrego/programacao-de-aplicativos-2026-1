
public class Produto {

    String nome;
    String descricao;
    double precoUnitario;
    double desconto;

    public void mostrarInformacoes() {

        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço unitário: R$ " + precoUnitario);
        System.out.println("Desconto: " + desconto + "%");

    }

}