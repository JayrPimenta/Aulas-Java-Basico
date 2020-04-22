package entidades;

public class Produtos {

	private String nomeDoProduto;
	private Double precoDoProduto;
	private Integer quantidadeDoProduto;

	public Produtos(String nomeDoProduto, Double precoDoProduto, Integer quantidadeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
		this.precoDoProduto = precoDoProduto;
		this.quantidadeDoProduto = quantidadeDoProduto;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public Double getPrecoDoProduto() {
		return precoDoProduto;
	}

	public Integer getQuantidadeDoProduto() {
		return quantidadeDoProduto;
	}
	
	@Override
	public String toString() {
		return nomeDoProduto+","+precoDoProduto+","+quantidadeDoProduto;
	}
	
	
}
