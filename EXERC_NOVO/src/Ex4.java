
public class Ex4 {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.raio = 2;

        Circulo circulo2 = new Circulo();
        circulo2.raio = 3;

        Circulo circulo3 = new Circulo();
        circulo3.raio = 4;

        Circulo circulo4 = new Circulo();
        circulo4.raio = 5;

        System.out.println("Área do círculo 1: " + circulo1.calcularArea());

        System.out.println("Área do círculo 2: " + circulo2.calcularArea());

        System.out.println("Área do círculo 3: " + circulo3.calcularArea());

        System.out.println("Área do círculo 4: " + circulo4.calcularArea());

    }

}