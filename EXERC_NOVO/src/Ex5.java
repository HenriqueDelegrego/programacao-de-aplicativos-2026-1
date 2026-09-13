
public class Ex5 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.identificacao = "001";
        funcionario.nome = "José";
        funcionario.sobrenome = "Roberto";
        funcionario.salarioMensal = 2000;

        System.out.println("Identificação: " + funcionario.identificacao);

        System.out.println("Nome completo: " + funcionario.obterNomeCompleto());

        System.out.println("Salário mensal: R$ " + funcionario.salarioMensal);

        System.out.println("Salário anual: R$ " + funcionario.obterSalarioAnual());

        funcionario.aumentarSalario(10);

        System.out.println("Após aumento de 10%:");

        System.out.println("Novo salário mensal: R$ " + funcionario.salarioMensal);

        System.out.println("Novo salário anual: R$ " + funcionario.obterSalarioAnual());

    }

}