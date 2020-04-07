package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataDeFabricação;
	
	SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricação) {
		super(nome, preco);
		this.dataDeFabricação = dataDeFabricação;
	}

	public Date getDataDeFabricação() {
		return dataDeFabricação;
	}

	public void setDataDeFabricação(Date dataDeFabricação) {
		this.dataDeFabricação = dataDeFabricação;
	}
	
	@Override
	public String etiquetaDePreco() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nome);
		stringBuilder.append(" (Usado) R$ ");
		stringBuilder.append(String.format("%.2f", preco));
		stringBuilder.append(" (Fabricado na data: ");
		stringBuilder.append(formatoDeData.format(dataDeFabricação));
		stringBuilder.append(")");
		
		return stringBuilder.toString();
		
		
	}

}
