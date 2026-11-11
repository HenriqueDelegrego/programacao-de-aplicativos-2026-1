import java.util.ArrayList;
import java.util.List;

public class MateriaisdeConstrucao {

    List<Produto> produtos = new ArrayList<>();

    // Esse metodo auxilia para cadastrar os produtos na loja
    public void cadastrarProduto(Produto p) {
        produtos.add(p);
    }

    // 1 - Retorna o produto mais caro de uma determinada marca
    public Produto produtoMaisCaro(String marcaDesejada) {

        Produto maisCaro = null;

        // Passa produto por produto na lista
        for (Produto p : produtos) {

            // Seleciona a marca desejada
            if (p.marca.equalsIgnoreCase(marcaDesejada)) {

                // Verifica qual é o produto mais caro
                if (maisCaro == null || p.preco > maisCaro.preco) {
                    maisCaro = p;
                }
            }
        }

        return maisCaro;
    }

    // 2 - Retorna os produtos de uma marca com preço entre X e Y
    public List<Produto> filtrarPorPrecoEMarca(
            String marcaDesejada, double x, double y) {

        List<Produto> filtrados = new ArrayList<>();

        for (Produto p : produtos) {

            if (p.marca.equalsIgnoreCase(marcaDesejada)
                    && p.preco >= x
                    && p.preco <= y) {

                filtrados.add(p);
            }
        }

        return filtrados;
    }
}
