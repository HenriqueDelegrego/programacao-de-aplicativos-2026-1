
import java.util.Scanner;

public class EXERCICIO_METODO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Escolha 1 para verão 2 para inverno 3 para outono 4 primavera");
        int escolha = sc.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("é verão o tempo esta quente ");
                break;

            case 2:


                System.out.println("é inverno esta frio");


            case 3:
                System.out.println("é outono as folhas caem no chão ");

            case 4:
                System.out.println("é primavera o dia esta lindo ");
        }


    }
}
