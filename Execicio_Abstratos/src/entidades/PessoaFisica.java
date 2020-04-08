package entidades;

public class PessoaFisica extends Contribuintes{
	
	private Double despesasMedicas;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double despesasMedicas) {
		super(nome, rendaAnual);
		this.despesasMedicas = despesasMedicas;
	}
	
	public Double getDespesasMedicas() {
		return despesasMedicas;
	}

	public void setDespesasMedicas(Double despesasMedicas) {
		this.despesasMedicas = despesasMedicas;
	}

	@Override
	public Double imposto() {
		Double abonoDespesasMedicas = 0D;
		Double taxa;
		
		if (!despesasMedicas.equals(null) && despesasMedicas > 0) {
			abonoDespesasMedicas = despesasMedicas * 0.5;
		}
		
		if (getRendaAnual() < 20000D) {
			taxa = getRendaAnual() * 0.15;
		} else {
			taxa = getRendaAnual() * 0.25;
		}
		
		return taxa - abonoDespesasMedicas;
	}
	
	/* 
	 * Solução do professor
	 * 
	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual()) * 0.15 - despesasMedicas * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesasMedicas * 0.5;
		}
	}
	 */
	

}
