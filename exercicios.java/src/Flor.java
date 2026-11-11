
public class Flor {
    // Atributos privados (Encapsulamento)
    private String nome;
    private double preco;
    private String nomeCliente;

    public Flor(String nome, double preco, String nomeCliente) {
        setNome(nome);
        setPreco(preco);
        setNomeCliente(nomeCliente);
    }

    // MÉTODOS ACESSORES (Getters e Setters): Permitem ler e modificar os dados
    // encapsulados de forma segura.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Validação preventiva: Garante a integridade dos dados do objeto
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome da flor inválido");
        }
        this.nome = nome; // "this" diferencia o atributo da classe do parâmetro do método
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Flor [nome=" + nome + ", preco=" + preco + ", nomeCliente=" + nomeCliente + "]";
    }
}