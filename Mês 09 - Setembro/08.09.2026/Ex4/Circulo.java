
public class Circulo {

	// Atributo da classe.
	// Cada objeto Circulo poderá ter um valor diferente para o raio.
	double raio;

	/**
	 * Calcula a área do círculo utilizando a fórmula π × raio².
	 *
	 * @return a área do círculo.
	 */
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}