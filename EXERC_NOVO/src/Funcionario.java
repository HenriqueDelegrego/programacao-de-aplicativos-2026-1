
public class Funcionario {

    String identificacao;
    String nome;
    String sobrenome;
    double salarioMensal;

    // Obter o salário anual
    public double obterSalarioAnual() {

        return salarioMensal * 12;

    }

    // Obter o nome completo
    public String obterNomeCompleto() {

        return nome + " " + sobrenome;

    }

    // Modificar o salário com percentual de aumento
    public void aumentarSalario(double percentual) {

        salarioMensal = salarioMensal + (salarioMensal * percentual / 100);

    }

}
