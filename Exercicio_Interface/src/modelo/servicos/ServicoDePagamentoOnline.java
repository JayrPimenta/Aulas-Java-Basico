package modelo.servicos;

public interface ServicoDePagamentoOnline  {	

	Double taxaDeServico(Double valorDaParcela);
	
	Double jurosDoParcelamento(Double valorDaParcela, Integer mesDoVencimento);
	
}
