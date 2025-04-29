package Faturamento;

public class Fatura {
	private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;
    
    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
    	this.numero = numero;
    	this.descricao = descricao;
    	this.quantidade = (quantidade > 0) ? quantidade : 0;
    	this.precoPorItem = (precoPorItem > 0) ? precoPorItem : 0.0;
    }
    public String getnumero() { return numero; }
    public void setnumero(String numero) { this.numero = numero; }
    
    public String getdescricao() { return descricao; }
    public void setdescricao(String descricao) { this.numero = descricao; }
    
    public int getquantidade() { return quantidade; }
    public void setquantidade(int quantidade) { this.quantidade = quantidade; }
    
    public double getprecoPorItem() { return precoPorItem; }
    public void setprecoPorItem(double precoPorItem) { this.precoPorItem = precoPorItem; }
    
    public double getCalcularCusto() {
        double custo = quantidade  * precoPorItem; // Converte gramas para kg
        return (custo > 0) ? custo : 0.0; // Retorna 0 se custo for negativo
    }
    
}
