public class Contribuinte {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    // Construtor
    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    // Setters e Getters
    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getCpf() { return cpf; }

    public void setUf(String uf) { this.uf = uf; }
    public String getUf() { return uf; }

    public void setRendaAnual(double rendaAnual) { this.rendaAnual = rendaAnual; }
    public double getRendaAnual() { return rendaAnual; }

    // Regras do Imposto
    public double calcularImposto() {
        return rendaAnual * calcularAliquota();
    }

    private double calcularAliquota() {
        if (rendaAnual <= 4000) {
            return 0;
        } else if (rendaAnual <= 9000) {
            return 0.058;
        } else if (rendaAnual <= 25000) {
            return 0.15;
        } else if (rendaAnual <= 35000) {
            return 0.275;
        }
        return 0.3;
    }


    public static void main(String[] args) {
        // Criando um objeto para testar
        Contribuinte c1 = new Contribuinte("Pedro", "123.456.789-00", "SC", 10000);

        System.out.println("Imposto a pagar: R$ " + c1.calcularImposto());
    }
}