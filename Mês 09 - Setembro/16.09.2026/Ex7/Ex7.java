public class Ex7 {

	public static void main(String[] args) {

		// Criação de aeronaves com dados válidos
		Aeronave a1 = new Aeronave("Delta", 30, 500, 1000, 100);
		Aeronave a2 = new Aeronave("Boeing", 100, 600, 2000, 150);

		// TESTANDO A VALIDAÇÃO DO CONSTRUTOR:
		// A aeronave 'a3' possui modelo vazio (" ") e passageiros negativos (-150).
		// Como o construtor usa os métodos 'set', as mensagens de erro aparecerão no
		// console imediatamente.
		Aeronave a3 = new Aeronave("        ", -150, 550, 2500, 200);

		Aeronave a4 = new Aeronave("Cessna", 2, 200, 400, 20);

		// Exibindo a aeronave inválida para ver como ela ficou após falhar nas
		// validações
		System.out.println(a3);

		System.out.println("----------------------------------------");

		Aeronave[] aeronaves = { a1, a2, a3, a4 };

		// Qual aeronave leva o maior número de passageiros
		double maiorPassageiros = 0;
		Aeronave aeronaveMaiorPassageiros = null;

		for (int i = 0; i < aeronaves.length; i++) {
			// ENCAPSULAMENTO EM AÇÃO: Não podemos fazer "aeronaves[i].qtdPassageiros".
			// Somos obrigados a usar o método público "getQtdPassageiros()" para ler o
			// valor.
			if (aeronaves[i].getQtdPassageiros() > maiorPassageiros) {
				maiorPassageiros = aeronaves[i].getQtdPassageiros();
				aeronaveMaiorPassageiros = aeronaves[i]; // Guarda a referência do objeto inteiro
			}
		}

		System.out.println(aeronaveMaiorPassageiros);

		// Qual das aeronaves pode ficar mais tempo no ar
		double maiorAutonomia = 0;
		Aeronave aeronaveMaiorAutonomia = null;

		for (int i = 0; i < aeronaves.length; i++) {
			if (aeronaves[i].calcularAutonomia() > maiorAutonomia) {
				maiorAutonomia = aeronaves[i].calcularAutonomia();
				aeronaveMaiorAutonomia = aeronaves[i];
			}
		}

		System.out.println(aeronaveMaiorAutonomia);

		// Considerando que os aviões estão em velocidade máxima, qual deles consegue
		// voar mais longe

		double maiorDistancia = 0;
		Aeronave aeronaveMaiorDistancia = null;

		for (int i = 0; i < aeronaves.length; i++) {
			if (aeronaves[i].calcularDistanciaMaxima() > maiorDistancia) {
				maiorDistancia = aeronaves[i].calcularDistanciaMaxima();
				aeronaveMaiorDistancia = aeronaves[i];
			}
		}

		System.out.println(aeronaveMaiorDistancia);

	}

}
