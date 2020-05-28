package entidades;

public class Funcionarios {

	private String nomeDoFuncionario;
	private String emailDoFuncionario;
	private Double salarioDoFuncionario;
	
	public Funcionarios(String nomeDoFuncionario, String emailDoFuncionario, Double salarioDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.emailDoFuncionario = emailDoFuncionario;
		this.salarioDoFuncionario = salarioDoFuncionario;
	}

	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}

	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public String getEmailDoFuncionario() {
		return emailDoFuncionario;
	}

	public void setEmailDoFuncionario(String emailDoFuncionario) {
		this.emailDoFuncionario = emailDoFuncionario;
	}

	public Double getSalarioDoFuncionario() {
		return salarioDoFuncionario;
	}
	
	public String toString() {
		return nomeDoFuncionario + ", " + emailDoFuncionario + ", " + String.format("%.2f", salarioDoFuncionario);
	}
}
