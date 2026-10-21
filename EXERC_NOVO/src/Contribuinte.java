
public class Contribuinte {

    // Atributos
    String nome;
    String cpf;
    String uf;
    double rendaAnual;

    // Método para calcular o imposto
    public double calcularImposto() {

        if (rendaAnual <= 4000) {

            return rendaAnual * 0;

        } else if (rendaAnual <= 9000) {

            return rendaAnual * 0.058;

        } else if (rendaAnual <= 25000) {

            return rendaAnual * 0.15;

        } else if (rendaAnual <= 35000) {

            return rendaAnual * 0.275;

        } else {

            return rendaAnual * 0.30;

        }

    }
}
