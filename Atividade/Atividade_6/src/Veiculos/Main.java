package Veiculos;

public class Main {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio(
            1500, 200, 95000.0f,  // Veiculo (peso, velMax, preco)
            4, 150,                // Motor (cilindros, potencia)
            "Preto", "Fusion"      // Atributos específicos
        );
        carro.print();
    }
}