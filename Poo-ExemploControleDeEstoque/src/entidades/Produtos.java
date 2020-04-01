package entidades;

public class Produtos {
	
	public String nome;
	public double preco;
	public Integer quantidade;
	
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
