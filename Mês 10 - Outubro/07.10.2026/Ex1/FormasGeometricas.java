// ==========================================
// CLASSE: FormasGeometricas
// Representa o "todo" (agregação de Retangulos)
// Aqui existe uma relação do tipo "um-para-muitos" (1 : N)
// ==========================================

import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {

	// Relacionamento: Uma instância de FormasGeometricas guarda uma Lista de
	// objetos do tipo Retangulo.
	// Isso significa que FormasGeometricas "tem um ou mais" Retangulos associados a
	// ela.
	private List<Retangulo> retangulos;

	// Construtor: Inicializa a lista vazia para poder receber os retângulos depois
	public FormasGeometricas() {
		retangulos = new ArrayList<Retangulo>();
	}

	// Método para estabelecer o relacionamento:
	// Adiciona um objeto Retangulo já criado dentro da lista da coleção.
	public void adicionarRetangulo(Retangulo r) {
		retangulos.add(r);
	}

	public Retangulo obterRetanguloMaiorArea() {
		double maiorArea = Double.MIN_VALUE;
		Retangulo retanguloMaiorArea = null;

		// Para cada Retangulo 'r' dentro da nossa lista 'retangulos'...
		for (Retangulo r : retangulos) {
			// Chamamos o método do próprio objeto Retangulo para obter a sua área
			if (r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				retanguloMaiorArea = r; // Guardamos a referência do objeto que tem a maior área
			}
		}
		return retanguloMaiorArea; // Retorna o objeto Retangulo completo
	}

	// Mesma lógica de navegação na lista de objetos, mas focada no perímetro
	public Retangulo obterRetanguloMaiorPerimetro() {
		double maiorPerimetro = Double.MIN_VALUE;
		Retangulo retanguloMaiorPerimetro = null;

		for (Retangulo r : retangulos) {
			if (r.calcularPerimetro() > maiorPerimetro) {
				maiorPerimetro = r.calcularPerimetro();
				retanguloMaiorPerimetro = r;
			}
		}
		return retanguloMaiorPerimetro;
	}
}
