package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date vencimentoDaParcela;
	private Double valorDaParcela;
	
	public Parcelas() {
		
	}
	
	public Parcelas(Date vencimentoDaParcela, Double valorDaParcela) {
		this.vencimentoDaParcela = vencimentoDaParcela;
		this.valorDaParcela = valorDaParcela;
	}

	public Date getVencimentoDaParcela() {
		return vencimentoDaParcela;
	}

	public void setVencimentoDaParcela(Date vencimentoDaParcela) {
		this.vencimentoDaParcela = vencimentoDaParcela;
	}

	public Double getValorDaParcela() {
		return valorDaParcela;
	}
	
	@Override
	public String toString() {
		return sdf.format(vencimentoDaParcela) + " - " + String.format("%.2f", valorDaParcela);
	}

}
