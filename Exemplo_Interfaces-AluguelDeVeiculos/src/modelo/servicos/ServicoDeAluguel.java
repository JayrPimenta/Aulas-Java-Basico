package modelo.servicos;

import modelo.entidades.AluguelDoVeiculo;

public class ServicoDeAluguel {
	
	private Double precoPorHora;
	private Double precoPorDia;
	
	private ServicoDeTaxasBrasileiras servicoDeTaxasBrasileiras;

	public ServicoDeAluguel(Double precoPorHora, Double precoPorDia, ServicoDeTaxasBrasileiras servicoDeTaxasBrasileiras) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		this.servicoDeTaxasBrasileiras = servicoDeTaxasBrasileiras;
	}
	
	public void processarFatura(AluguelDoVeiculo aluguelDoVeiculo) {
		
	}
	
	

}
