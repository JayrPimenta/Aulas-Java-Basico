package entidades;

public class ContaEmpresa extends Conta  {
	
	private Double limiteDeEmprestimo;
	
	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, Double limiteDeEmprestimo) {
		super(numeroDaConta, titularDaConta, saldoDaConta);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public Double getlimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setlimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		
		if (valor <= limiteDeEmprestimo) {
			saldoDaConta += valor - 10.00;
		}
		
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldoDaConta -= 2.0;
	}
}
