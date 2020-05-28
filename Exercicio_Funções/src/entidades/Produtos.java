package entidades;

public class Produtos {

	private String nomeDoProduto;
	private Double valorDoProduto;
	
	public Produtos(String nomeDoProduto, Double valorDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.valorDoProduto = valorDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public Double getValorDoProduto() {
		return valorDoProduto;
	}
	
	@Override
	public String toString() {
		return nomeDoProduto + ", " + String.format("%.2f", valorDoProduto);
	}
}
