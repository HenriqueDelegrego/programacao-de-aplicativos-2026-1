import java.util.Scanner;

    public class EXERCICIO_METODO4 {

            static int maiorElemento(int[] vetor) {
                int maior = vetor[0];
                for (int i = 1; i < vetor.length; i++) {
                    if (vetor[i] > maior) {
                        maior = vetor[i];
                    }
                }
                return maior;
            }


            static int menorElemento(int[] vetor) {
                int menor = vetor[0];
                for (int i = 1; i < vetor.length; i++) {
                    if (vetor[i] < menor) {
                        menor = vetor[i];
                    }
                }
                return menor;
            }


            static double media(int[] vetor) {
                int soma = 0;
                for (int i = 0; i < vetor.length; i++) {
                    soma += vetor[i];
                }
                return (double) soma / vetor.length;
            }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite quantos elementos terá o vetor, seguido dos elementos, tudo separado por espaço.");
            System.out.print("Entrada: ");

            int tamanho = scanner.nextInt();
            int[] vetor = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = scanner.nextInt();
            }

            System.out.println("Maior elemento: " + maiorElemento(vetor));
            System.out.println("Menor elemento: " + menorElemento(vetor));
            System.out.println("Média dos valores: " + media(vetor));

            scanner.close();
        }
    }