package modelo.entidades;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numeroDoContrato;
	private Date dataDoContrato;
	private Double valorTotalDoContrato;
	
	private List<Parcelas> parcelas = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numeroDoContrato, Date dataDoContrato, Double valorTotalDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
		this.dataDoContrato = dataDoContrato;
		this.valorTotalDoContrato = valorTotalDoContrato;
	}

	public Integer getNumeroDoContrato() {
		return numeroDoContrato;
	}

	public void setNumeroDoContrato(Integer numeroDoContrato) {
		this.numeroDoContrato = numeroDoContrato;
	}

	public Date getDataDoContrato() {
		return dataDoContrato;
	}

	public void setDataDoContrato(Date dataDoContrato) {
		this.dataDoContrato = dataDoContrato;
	}

	public Double getValorTotalDoContrato() {
		return valorTotalDoContrato;
	}
	
	public void addParcelas (Parcelas parcela) {
		parcelas.add(parcela);
	}
	
	public void removeParcela (Parcelas parcela) {
		parcelas.remove(parcela);
	}
	
	public List<Parcelas> getParcela() {
		return parcelas;
	}

	
}
