import java.util.Scanner;

public class mt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        desempenharCalculo(10, 5, 2);
    }
    public static void desempenharCalculo(int n1, int n2, int n3){
        int resultado = (n1+n2)*n3;
        System.out.println(resultado);
    }
}
