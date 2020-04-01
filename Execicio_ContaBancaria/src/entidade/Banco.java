package entidade;

public class Banco {

	private Integer contaBancaria;
	private String nomeDoTitular;
	private double saldo;
		
	public Banco(Integer contaBancaria, String nomeDoTitular) {
		this.contaBancaria = contaBancaria;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public Banco(Integer contaBancaria, String nomeDoTitular, double depositoInicial) {
		this.contaBancaria = contaBancaria;
		this.nomeDoTitular = nomeDoTitular;
		deposito(depositoInicial);
	}	
	
	public Integer getContaBancaria() {
		return contaBancaria;
	}
		
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	
	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public double deposito( double valorDoDeposito) {
		return saldo += valorDoDeposito;
	}
	
	public double saque(double valorDoSaque) {
		return saldo -= valorDoSaque + 5.0;
	}
	
	public String toString() {
		return "Numero da Conta: " +getContaBancaria()
		+", Titular: "+getNomeDoTitular()
		+", Saldo: "+String.format("R$ %.2f", getSaldo());
	}
}
