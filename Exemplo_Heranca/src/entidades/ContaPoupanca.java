package entidades;

public class ContaPoupanca extends Conta {
	
	private Double taxaDeJuros;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, Double taxaDeJuros) {
		super (numeroDaConta, titularDaConta, saldoDaConta);
		this.taxaDeJuros = taxaDeJuros;	
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldoComJuros() {
		saldoDaConta += saldoDaConta * taxaDeJuros;
	}
	
	@Override
	public void saque(Double valor) {
		saldoDaConta -= valor;
	}

}
