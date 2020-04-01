package entidades;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double area() {
		double area = base * altura;
		return area;
	}
	
	public double perimetro() {
		double perimetro = base * 2 + altura *2;
		return perimetro;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
	}
}
