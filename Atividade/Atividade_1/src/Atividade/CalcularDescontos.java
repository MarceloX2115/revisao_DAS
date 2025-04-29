package Atividade;

import java.util.Map;

public class CalcularDescontos {
	private static final Map<String,Double> DESCONTOS = Map.of(
			"A",0.1,
			"B", 0.15,
			"C",0.2
			);
	public double CalculandoDescontos(String produto, double preco) {
		if (!DESCONTOS.containsKey(produto)) {
			return preco;
		}
	double desconto = DESCONTOS.get(produto);
	return preco - (preco * desconto);
	}
}