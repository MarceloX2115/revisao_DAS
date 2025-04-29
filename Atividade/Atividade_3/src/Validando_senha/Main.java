package Validando_senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Validador de Senha ===");
        System.out.println("Requisitos da senha:");
        System.out.println("- Mínimo de 8 caracteres");
        System.out.println("- Pelo menos 1 número");
        System.out.println("- Pelo menos 1 letra maiúscula");
        System.out.println("--------------------------");
        
        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        boolean valida = ValidarSenha.validaSenha(senha);
        
        if (valida) {
            System.out.println("✅ Senha válida! Atende a todos os requisitos.");
        } else {
            System.out.println("❌ Senha inválida! Não atende aos requisitos.");
            
            // Feedback detalhado
            if (senha == null || senha.length() < 8) {
                System.out.println("- A senha deve ter no mínimo 8 caracteres");
            }
            if (!senha.matches(".\\d.")) {
                System.out.println("- A senha deve conter pelo menos 1 número");
            }
            if (!senha.matches(".[A-Z].")) {
                System.out.println("- A senha deve conter pelo menos 1 letra maiúscula");
            }
        }
        
        scanner.close();
    }
}