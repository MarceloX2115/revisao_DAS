package Atividade;

public class main {
	public static void main(String[] args) {
		CalcularDescontos calculadora = new CalcularDescontos();
		
		String[] produtos = {"A", "B", "C", "D"};
		double [] precos = {100.0, 200.0, 300.00, 400.0};
		
		for (int i = 0; i < produtos.length; i++) {
			String produto = produtos[i];
			double precoOriginal = precos[i];
			double precoComDesconto = calculadora.CalculandoDescontos(produto, precoOriginal);
			
			System.out.printf("Produto %s: R$ %.2f (original) = R$ %.2f (com desconto)%n",
	                produto, precoOriginal, precoComDesconto);
		}
	}

}
