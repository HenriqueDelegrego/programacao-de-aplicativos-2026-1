public class Main {
    public static void main(String[] args) {
        // 1. Criar um objeto do tipo Endereco
        Endereco endereco1 = new Endereco("SC", "Florianópolis", "88000-000", "Rua das Flores", 123);

        // 2. Instanciar o objeto Pessoa associando-o ao Endereco criado
        Pessoa pessoa1 = new Pessoa("Maria Silva", endereco1);

        // 3. Exibir as informações
        pessoa1.exibirInformacoes();

        System.out.println("-----------------------------------");

        // Outro exemplo instanciando o Endereco diretamente no construtor da Pessoa
        Pessoa pessoa2 = new Pessoa("João Souza", new Endereco("SP", "São Paulo", "01000-000", "Av. Paulista", 1000));
        pessoa2.exibirInformacoes();
    }
}
