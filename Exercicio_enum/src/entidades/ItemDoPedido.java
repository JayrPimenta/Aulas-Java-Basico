package entidades;

public class ItemDoPedido {

	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public ItemDoPedido() {
	}
	
	public ItemDoPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}
	
	public double subTotal() {
		return quantidade * preco;
	}
	
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantity: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	
}
