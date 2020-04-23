package modelo.servicos;

public class ServicoDeTaxasBrasileiras {
	
	public Double taxa(Double valor) {	
		if (valor <= 100D) {
			return valor * 0.2;
		} else {
			return valor * 0.15;
		}
	}
}
