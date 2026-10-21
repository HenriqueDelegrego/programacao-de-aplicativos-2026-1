import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    // Atributo que armazena a coleção de objetos 'Flor'
    private List<Flor> flores;

    // Construtor cria a lista interna vazia ao instanciar uma nova Floricultura
    public Floricultura() {
        flores = new ArrayList<Flor>();
    }

    public void adicionarFlor(Flor f) {
        flores.add(f);
    }


    public List<Flor> pesquisarFlores(String nomeCliente) {
        List<Flor> floresPesquisa = new ArrayList<Flor>();
        for (Flor f : flores) {
            // Acessa o atributo encapsulado do objeto 'f' usando o metodo getter
            if (f.getNomeCliente().equals(nomeCliente)) {
                floresPesquisa.add(f);
            }
        }
        return floresPesquisa;
    }
}