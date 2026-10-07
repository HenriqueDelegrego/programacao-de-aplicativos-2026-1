import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

	// RELACIONAMENTO: A Concessionaria "tem-um" conjunto de Veiculos.
	// O uso de List<Veiculo> permite guardar múltiplos objetos da classe Veiculo.
	private List<Veiculo> veiculos;

	// Construtor: Inicializa a lista vazia
	public Concessionaria() {
		veiculos = new ArrayList<Veiculo>();
	}

	// Método para adicionar um objeto Veiculo existente à lista da Concessionaria
	public void adicionarVeiculo(Veiculo v) {
		veiculos.add(v);
	}

	// Método que percorre a lista de veículos relacionados para realizar uma regra
	// de negócio
	public Veiculo obterVeiculoMaisBarato() {
		double menorPreco = Double.MAX_VALUE;
		Veiculo veiculoMaisBarato = null;

		// O laço 'for-each' navega por cada objeto Veiculo dentro da lista da
		// concessionária
		for (Veiculo v : veiculos) {
			// Utiliza o método getPreco() do objeto Veiculo relacionado
			if (v.getPreco() < menorPreco) {
				menorPreco = v.getPreco();
				veiculoMaisBarato = v; // Guarda a referência do objeto mais barato
			}
		}
		return veiculoMaisBarato; // Retorna o objeto Veiculo encontrado
	}
}
