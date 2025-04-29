package Faturamento;
import java.util.Scanner;

public class FaturaTotal {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o numero do item: ");
		String numero = scanner.nextLine();
		
		System.out.print("Fale a descrição do item: ");
		String descricao = scanner.nextLine();
		
	    int quantidade = 0;
        while (true) {
            System.out.print("Quantidade comprada: ");
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
                if (quantidade > 0) break;
                System.out.println("Erro: A quantidade deve ser maior que 0!");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido!");
            }
        }
        double precoPorItem = 0.0;
        while (true) {
            System.out.print("Preço por item (R$): ");
            try {
                precoPorItem = Double.parseDouble(scanner.nextLine());
                if (precoPorItem > 0) break;
                System.out.println("Erro: O preço deve ser maior que 0!");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um valor válido (ex: 50.99)!");
            }
        }
        Fatura fatura = new Fatura(numero, descricao, quantidade, precoPorItem);
        
        System.out.println("\n=== Resumo da Fatura ===");
        System.out.println("Número: " + fatura.getnumero());
        System.out.println("Descrição: " + fatura.getdescricao());
        System.out.println("Quantidade: " + fatura.getquantidade());
        System.out.printf("Preço por Item: R$%.2f%n", fatura.getprecoPorItem());
        System.out.printf("Total da Fatura: R$%.2f%n", fatura.getCalcularCusto());
        
        scanner.close();
}
	}
