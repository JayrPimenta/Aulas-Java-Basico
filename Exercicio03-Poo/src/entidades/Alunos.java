package entidades;

public class Alunos {
	
	private String nomeDoAluno;
	private double primeiraNota;
	private double segundaNota;
	private double terceiraNota;
	
	public void setnomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
	
	public void setPrimeiraNota(double primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	
	public void setSegundaNota(double segundaNota) {
		this.segundaNota = segundaNota;
	}
	
	public void setTerceiraNota(double terceiraNota) {
		this.terceiraNota = terceiraNota;
	}
	
	private double notaFinal() {
		return primeiraNota + segundaNota + terceiraNota;
	}
	
	private String condicaoDoAluno() {
		if (notaFinal() > 60.0) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
	
	public double notaParaPassar() {
			return 60.0 - notaFinal();
	}
	
	public String toString() {
		return "FINAL GRADE = "+String.format("%.2f%n", notaFinal())+condicaoDoAluno();
	}
	
}
