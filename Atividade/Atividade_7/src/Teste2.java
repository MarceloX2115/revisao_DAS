public class Teste2 {

    public static void main(String[] args) {
        Empregados empregado1 = new Empregados("Marcelo", "Sampaio", 12000.00);
        Empregados empregado2 = new Empregados("Rachel", "Souza", 11000.00);

        
        SalarioAnual calculador = new SalarioAnual();
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - Salário Anual: " + calculador.salarioAnual(empregado1));
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - Salário Anual: " + calculador.salarioAnual(empregado2));

        Percentual aumento = new Percentual(5);
        aumento.aplicarAumento(empregado1);
        aumento.aplicarAumento(empregado2);

        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - Salário Anual (Após Aumento): " + calculador.salarioAnual(empregado1));
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - Salário Anual (Após Aumento): " + calculador.salarioAnual(empregado2));
    }
}