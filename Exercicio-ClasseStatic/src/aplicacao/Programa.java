package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoeda;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar? ");
		double cotacao = sc.nextDouble();
		System.out.print("Quantos dolares pretende comprar ? ");
		double quantidade = sc.nextDouble();	
		System.out.printf("Valor total a ser pago = R$ %.2f", ConversorDeMoeda.conversor(cotacao, quantidade));
		
		
		
		sc.close();
	}

}
