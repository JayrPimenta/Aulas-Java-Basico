package modelo.entidades;

public class Fatura {
	
	private Double pagamentoBase;
	private Double taxa;
	
	public Fatura(Double pagamentoBase, Double taxa) {
		this.pagamentoBase = pagamentoBase;
		this.taxa = taxa;
	}

	public Double getPagamentoBase() {
		return pagamentoBase;
	}

	public Double getTaxa() {
		return taxa;
	}
	
	public Double getTotalAPagar() {
		return getPagamentoBase() + getTaxa();
	}
	
}
