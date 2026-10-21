
public class Ex8 {

    public static void main(String[] args) {

        // Contribuinte 1
        Contribuinte contribuinte1 = new Contribuinte();

        contribuinte1.nome = "João da Silva";
        contribuinte1.cpf = "123.456.789-00";
        contribuinte1.uf = "PR";
        contribuinte1.rendaAnual = 40000;


        // Contribuinte 2
        Contribuinte contribuinte2 = new Contribuinte();

        contribuinte2.nome = "Maria Souza";
        contribuinte2.cpf = "234.567.890-11";
        contribuinte2.uf = "SC";
        contribuinte2.rendaAnual = 30000;


        // Contribuinte 3
        Contribuinte contribuinte3 = new Contribuinte();

        contribuinte3.nome = "Pedro Santos";
        contribuinte3.cpf = "345.678.901-22";
        contribuinte3.uf = "RS";
        contribuinte3.rendaAnual = 20000;


        // Contribuinte 4
        Contribuinte contribuinte4 = new Contribuinte();

        contribuinte4.nome = "Ana Oliveira";
        contribuinte4.cpf = "456.789.012-33";
        contribuinte4.uf = "PR";
        contribuinte4.rendaAnual = 8000;


        // Contribuinte 5
        Contribuinte contribuinte5 = new Contribuinte();

        contribuinte5.nome = "Carlos Lima";
        contribuinte5.cpf = "567.890.123-44";
        contribuinte5.uf = "SC";
        contribuinte5.rendaAnual = 3500;


        // Vetor com os contribuintes
        Contribuinte[] contribuintes = {
                contribuinte1,
                contribuinte2,
                contribuinte3,
                contribuinte4,
                contribuinte5
        };


        // A) Quem mais paga imposto?

        Contribuinte maiorImposto = contribuintes[0];

        for (Contribuinte contribuinte : contribuintes) {

            if (contribuinte.calcularImposto()
                    > maiorImposto.calcularImposto()) {

                maiorImposto = contribuinte;

            }

        }

        System.out.println("Quem mais paga imposto: "
                + maiorImposto.nome);


        // B) Total de imposto pago pelos 5 contribuintes

        double totalImposto = 0;

        for (Contribuinte contribuinte : contribuintes) {

            totalImposto += contribuinte.calcularImposto();

        }

        System.out.println("Total de imposto pago: R$ "
                + totalImposto);

    }

}