package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import entidades.Retangulo; 

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informa a largura e base do retangulo: ");
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		retangulo.setBase(base);
		retangulo.setAltura(altura);
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
		
		sc.close();
	}

}
