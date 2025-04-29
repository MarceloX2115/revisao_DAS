package Veiculos;

public class Carro {
	private int Peso;
	private int VelocMax;
	private float Preco;
	
	public Carro() {
		this.Peso = 0;
		this.VelocMax = 0;
		this.Preco = 0;	
	}
	public Carro(int Peso, int VelocMax, float Preco) {
		this.Peso = Peso;
		this.VelocMax = VelocMax;
		this.Preco = Preco;
	}
	public void set(int Peso, int VelocMax, float Preco) {
		this.Peso = Peso;
		this.VelocMax = VelocMax;
		this.Preco = Preco;
	}
	public void print() {
        System.out.println("Peso do carro: " + Peso );
        System.out.println("Velocidade Máxima: " + VelocMax);
        System.out.println("Preço do carro: " + Preco);
    }

}
