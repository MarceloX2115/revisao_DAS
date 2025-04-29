package Fatoriando;

public class Fatorial {
	public static int calcular(int numero) {
		int x1= numero;
		int f= x1;
		while (x1 > 1) {
			f=f*(x1-1);
			x1--;
		}
		return f;
	}

}
