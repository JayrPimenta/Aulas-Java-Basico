package entidades;

public class Produtos {
	
	private String nome;
	private double preco;
	private Integer quantidade;
	
	
	// Metodo Construtor
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$ "+ String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: R$ " + String.format("%.2f", valorTotalNoEstoque()); 
	}

}
