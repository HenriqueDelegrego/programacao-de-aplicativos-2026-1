//Em um sistema de e-commerce, existe uma classe chamada Usuario com os atributos:
//• Id
//• Nome
//• Email
//• Senha
//• Cpf
//• Endereco (somente o nome da rua)
//Essa classe representa como os dados do usuário são armazenados no banco de dados
//Essa classe contém diversas informações sensíveis como id, senha, CPF e endereço. Expor
//esses dados publicamente não é adequado
//Por esse motivo, você deverá criar uma segunda classe chamada UsuarioDTO. Essa classe terá
//apenas os dados necessários para exibição ou transporte neste caso, apenas nome e email. O
//objetivo é garantir que informações críticas não sejam expostas indevidamente.
//A instância do objeto deve ser feita a partir do Usuario, porém o objeto a ser mostrado para o
//usuário é o UsuarioDTO. Para isso você deve passar as informações do Usuario para o
//UsuarioDTO

public class Usuario {

    private String id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String endereco;

    public Usuario(String id, String nome, String email, String senha, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
}

