package modelo.servicos;

import modelo.entidades.AluguelDoVeiculo;
import modelo.entidades.Fatura;

public class ServicoDeAluguel {
	
	private Double precoPorHora;
	private Double precoPorDia;
	
	private ServicoDeTaxas servicoDeTaxas;

	public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, ServicoDeTaxas servicoDeTaxas) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.servicoDeTaxas = servicoDeTaxas;
	}
	
	public void processarFatura(AluguelDoVeiculo aluguelDoVeiculo) {
		
		long retiradaDoVeiculo = aluguelDoVeiculo.getDataInicioDoAluguel().getTime();
		long devolucaoDoVeiculo = aluguelDoVeiculo.getDataFimDoAluguel().getTime();
		
		double horas = (double)(devolucaoDoVeiculo - retiradaDoVeiculo) /1000 /60 /60;
		
		double pagamentoBase;
		
		if(horas <= 12D) {
			pagamentoBase = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoBase = Math.ceil(horas / 24) * precoPorDia; 
		}
		
		double taxa = servicoDeTaxas.taxa(pagamentoBase);
		
		aluguelDoVeiculo.setFatura(new Fatura(pagamentoBase, taxa));
		
	}
	
	

}
