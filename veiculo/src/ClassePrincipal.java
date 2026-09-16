public class ClassePrincipal {

    public static void main(String[] args) {

        veiculo v1 = new veiculo();
        v1.marca = "Volkswagen";
        v1.placa = "UMGX15KL5";
        v1.modelo = "Polo";
        v1.ano = 2026;
        v1.preco = 126.000;

        System.out.println(v1.marca + "" + v1.modelo);

        veiculo v2 = new veiculo();
        v2.marca = "Chevrolet";
        v2.modelo = "Onix";
        v2.placa = "KJX65JH21";
        v2.ano = 2025;
        v2.preco = 81.000;

        System.out.println(v2.marca + "" + v2.modelo);

    }
}
