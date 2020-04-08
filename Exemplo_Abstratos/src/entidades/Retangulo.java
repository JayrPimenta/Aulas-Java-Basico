package entidades;

import entidades.enuns.Cor;

public class Retangulo extends Forma {

	private Double base;
	private Double altura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(Cor cor, Double base, Double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}
	
	
}
