package Fatoriando;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Diga um numero para calcular o fatorial: ");
		int numero = sc.nextInt();
		int resultado = Fatorial.calcular(numero);
		System.out.println("Fatorial de " +numero +"=" + resultado);
		sc.close();
	}

}
