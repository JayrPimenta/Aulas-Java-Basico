package util;

public class ConversorDeMoeda {
	
	private static final double IOF = 0.06;
	
	public static double conversor(double cotacao, double quantidade) {
		return cotacao * quantidade * (1.0 + IOF); 
	}
	
	
}
