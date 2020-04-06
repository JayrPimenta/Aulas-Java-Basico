package entidades;

public class Conta {

	private Integer numeroDaConta;
	private String titularDaConta;
	protected Double saldoDaConta;
	
	public Conta() {
	}

	public Conta(Integer numeroDaConta, String titularDaConta, Double saldoDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.saldoDaConta = saldoDaConta;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public Double getSaldoDaConta() {
		return saldoDaConta;
	}
	
	public void saque(Double valor) {
		saldoDaConta -= valor + 5.0;
	}
	
	public void deposito(Double valor) {
		saldoDaConta += valor;
	}
	
	
	
	
}
