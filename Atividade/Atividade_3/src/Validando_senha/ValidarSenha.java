package Validando_senha;

public class ValidarSenha {
    public static boolean validaSenha(final String senha) {
        if (senha == null || senha.length() < 8) {
            return false;
        }
        
        boolean temNumero = false;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        
        for (final char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                temNumero = true;
            } else if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }
            
            if (temNumero && temMaiuscula && temMinuscula) {
                break;
            }
        }
        
        return temNumero && temMaiuscula && temMinuscula;
    }
}