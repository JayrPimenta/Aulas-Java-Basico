package entidades;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public void setImposto(double imposto) {
		this.imposto =  imposto;
	}
	
	public String toString() {
		return "Empregado: "+nome+", R$ "+ String.format("%.2f", salarioLiquido());
	}
	
	public void aumentoDeSalari(double porcentagem) {
		this.salarioBruto += salarioBruto * (porcentagem / 100);
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
}
