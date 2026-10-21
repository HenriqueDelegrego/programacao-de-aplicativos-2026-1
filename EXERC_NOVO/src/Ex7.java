
public class Ex7 {

    public static void main(String[] args) {

        // Aeronave 1
        Aeronave aeronave1 = new Aeronave();

        aeronave1.modelo = "Boeing 737";
        aeronave1.passageiros = 180;
        aeronave1.velocidadeMaxima = 850;
        aeronave1.capacidadeCombustivel = 26000;
        aeronave1.queimaCombustivelPorMinuto = 45;


        // Aeronave 2
        Aeronave aeronave2 = new Aeronave();

        aeronave2.modelo = "Airbus A320";
        aeronave2.passageiros = 190;
        aeronave2.velocidadeMaxima = 840;
        aeronave2.capacidadeCombustivel = 27000;
        aeronave2.queimaCombustivelPorMinuto = 44;


        // Aeronave 3
        Aeronave aeronave3 = new Aeronave();

        aeronave3.modelo = "Boeing 747";
        aeronave3.passageiros = 410;
        aeronave3.velocidadeMaxima = 920;
        aeronave3.capacidadeCombustivel = 216000;
        aeronave3.queimaCombustivelPorMinuto = 220;


        // Aeronave 4
        Aeronave aeronave4 = new Aeronave();

        aeronave4.modelo = "Airbus A380";
        aeronave4.passageiros = 555;
        aeronave4.velocidadeMaxima = 900;
        aeronave4.capacidadeCombustivel = 320000;
        aeronave4.queimaCombustivelPorMinuto = 250;


        // Vetor com as aeronaves
        Aeronave[] aeronaves = {
                aeronave1,
                aeronave2,
                aeronave3,
                aeronave4
        };


        // A) Maior número de passageiros

        Aeronave maiorPassageiros = aeronaves[0];

        for (Aeronave aeronave : aeronaves) {

            if (aeronave.passageiros > maiorPassageiros.passageiros) {

                maiorPassageiros = aeronave;

            }

        }

        System.out.println("Aeronave com mais passageiros: "
                + maiorPassageiros.modelo);


        // B) Maior tempo no ar

        Aeronave maiorTempo = aeronaves[0];

        for (Aeronave aeronave : aeronaves) {

            if (aeronave.calcularTempoNoAr()
                    > maiorTempo.calcularTempoNoAr()) {

                maiorTempo = aeronave;

            }

        }

        System.out.println("Aeronave que fica mais tempo no ar: "
                + maiorTempo.modelo);


        // C) Maior distância

        Aeronave maiorDistancia = aeronaves[0];

        for (Aeronave aeronave : aeronaves) {

            if (aeronave.calcularDistanciaMaxima()
                    > maiorDistancia.calcularDistanciaMaxima()) {

                maiorDistancia = aeronave;

            }

        }

        System.out.println("Aeronave que voa mais longe: "
                + maiorDistancia.modelo);

    }

}