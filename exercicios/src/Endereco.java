
//6)O objetivo deste exercício é implementar a relação entre uma pessoa e seu endereço.
    //Classe Pessoa:
    //Essa classe deve conter os atributos:
    //• Nome
    //• Endereco (classe Endereco)
    //Classe Endereco:
    //Essa classe deve conter os atributos:
    //• UF
    //• Cidade
    //• CEP
    //• Logradouro
    //• Número da residência
    //Instancie objetos de Pessoa


public class Endereco {
    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private int numero;

    // Construtor
    public Endereco(String uf, String cidade, String cep, String logradouro, int numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    // Getters e Setters
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Aqui o metodo para exibir as informações do endereço
    @Override
    public String toString() {
        return logradouro + ", " + numero + " - " + cidade + "/" + uf + " (CEP: " + cep + ")";
    }
}