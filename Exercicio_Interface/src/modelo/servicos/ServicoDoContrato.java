package modelo.servicos;

import java.util.Calendar;
import java.util.Date;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;

public class ServicoDoContrato {
	
	private ServicoDePagamentoOnline servicoDePagamentoOnline;
	
	public ServicoDoContrato(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
	public void processarContrato(Contrato contrato, Integer mes) {
		
		Double valorDaParcela = contrato.getValorTotalDoContrato() / mes;
		
		for (int numeroDaParcela = 1; numeroDaParcela <= mes; numeroDaParcela++) {
			
			Date vencimentoDaParcela = adicionarVencimento(contrato.getDataDoContrato(), numeroDaParcela);
			
			Double atualizarParcela = valorDaParcela + servicoDePagamentoOnline.jurosDoParcelamento(valorDaParcela, numeroDaParcela);
			Double valorTotalDaParcela = atualizarParcela + servicoDePagamentoOnline.taxaDeServico(atualizarParcela);
			
			contrato.addParcelas(new Parcelas(vencimentoDaParcela, valorTotalDaParcela));
			
		}	
	}
	
	private Date adicionarVencimento(Date vencimentoDaParcela, int numeroDaParcela) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(vencimentoDaParcela);
		calendario.add(calendario.MONTH, numeroDaParcela);
		return calendario.getTime();
	}
}
