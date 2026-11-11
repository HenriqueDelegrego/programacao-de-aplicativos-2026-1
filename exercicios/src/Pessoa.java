public class Pessoa {
    private String nome;
    private Endereco endereco; // Associação com a classe Endereco

    // Construtor
    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    // Aqui o metodo para exibir os dados da Pessoa e o seu Endereço
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        if (endereco != null) {
            System.out.println("Endereço: " + endereco.toString());
        } else {
            System.out.println("Endereço não cadastrado.");
        }
    }
}