package model.entidades;

import model.excecao.ContaExcecoes;

public class Conta {
	
	private Integer numeroDaConta;
	private String titularDaConta;
	private Double saldoDaConta;
	private Double limiteParaSaque;
	
	public Conta() {
	}

	public Conta(Integer numeroDaConta, String titularDaConta, Double saldoDaConta, Double limiteParaSaque) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		this.saldoDaConta = saldoDaConta;
		this.limiteParaSaque = limiteParaSaque;
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

	public Double getLimiteParaSaque() {
		return limiteParaSaque;
	}
	
	public void deposito(Double valorParaDeposito) {
		saldoDaConta += valorParaDeposito;
	}
	
	public void saque(Double valorParaSaque) {
		
		if (valorParaSaque > limiteParaSaque) {
			throw new ContaExcecoes("O valor excede o limete para saque");
		}
		
		if (valorParaSaque > saldoDaConta) {
			throw new ContaExcecoes("Saldo insuficiente");
		}
		
		saldoDaConta -= valorParaSaque;
	}
	
	
	
}
