import java.util.ArrayList;
import java.util.List;

public class Loja {

    List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
}