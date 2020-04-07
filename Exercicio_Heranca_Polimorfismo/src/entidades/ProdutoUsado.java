package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataDeFabrica��o;
	
	SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabrica��o) {
		super(nome, preco);
		this.dataDeFabrica��o = dataDeFabrica��o;
	}

	public Date getDataDeFabrica��o() {
		return dataDeFabrica��o;
	}

	public void setDataDeFabrica��o(Date dataDeFabrica��o) {
		this.dataDeFabrica��o = dataDeFabrica��o;
	}
	
	@Override
	public String etiquetaDePreco() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nome);
		stringBuilder.append(" (Usado) R$ ");
		stringBuilder.append(String.format("%.2f", preco));
		stringBuilder.append(" (Fabricado na data: ");
		stringBuilder.append(formatoDeData.format(dataDeFabrica��o));
		stringBuilder.append(")");
		
		return stringBuilder.toString();
		
		
	}

}
