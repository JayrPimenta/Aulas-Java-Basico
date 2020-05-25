package modelo.servicos;

public class ServicoPayPal implements ServicoDePagamentoOnline{
	
	@Override
	public Double taxaDeServico(Double valorDaParcela) {
		return valorDaParcela * 0.02;
	}
	
	@Override
	public Double jurosDoParcelamento(Double valorDaParcela, Integer mesDoVencimento) {
		return valorDaParcela * 0.01 * mesDoVencimento;
	}
	
}
