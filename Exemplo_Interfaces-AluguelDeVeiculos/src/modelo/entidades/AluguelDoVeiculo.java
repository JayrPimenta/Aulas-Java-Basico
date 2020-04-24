package modelo.entidades;

import java.util.Date;

public class AluguelDoVeiculo {
	
	private Date dataInicioDoAluguel;
	private Date dataFimDoAluguel;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelDoVeiculo(Date dataInicioDoAluguel, Date dataFimDoAluguel, Veiculo veiculo) {
		this.dataInicioDoAluguel = dataInicioDoAluguel;
		this.dataFimDoAluguel = dataFimDoAluguel;
		this.veiculo = veiculo;
	}

	public Date getDataInicioDoAluguel() {
		return dataInicioDoAluguel;
	}

	public void setDataInicioDoAluguel(Date dataInicioDoAluguel) {
		this.dataInicioDoAluguel = dataInicioDoAluguel;
	}

	public Date getDataFimDoAluguel() {
		return dataFimDoAluguel;
	}

	public void setDataFimDoAluguel(Date dataFimDoAluguel) {
		this.dataFimDoAluguel = dataFimDoAluguel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	

}
