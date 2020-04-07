package entidades;

public class ProdutoImportado extends Produto{

	private Double taxaPersonalizada;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxaPersonalizada) {
		super(nome, preco);
		this.taxaPersonalizada = taxaPersonalizada;
	}

	public Double getTaxaPersonalizada() {
		return taxaPersonalizada;
	}

	public void setTaxaPersonalizada(Double taxaPersonalizada) {
		this.taxaPersonalizada = taxaPersonalizada;
	}
	
	public Double precoTotal() {
		return preco + taxaPersonalizada;
	}
	
	@Override
	public String etiquetaDePreco() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nome);
		stringBuilder.append(" R$ ");
		stringBuilder.append(String.format("%.2f",precoTotal()));
		stringBuilder.append(" (Taxa Personalizada R$ ");
		stringBuilder.append(String.format("%.2f", taxaPersonalizada));
		stringBuilder.append(")");
		
		return stringBuilder.toString();
		
	}
}
