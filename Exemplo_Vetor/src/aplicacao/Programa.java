package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 * * * * * Exemplo vetor
		 * 
		 * 
		int n =sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < n; i++) {
			soma += vetor[i]; 
		}
		
		double media = soma / n;
		
		System.out.printf("Media das alturas: %.2f", media);
		
		*/
		
		
		/*
		 * 
		 * * * * * Exemplo vetor com classe
		 * 
		 */
		
		int numeroDeProdutos = sc.nextInt();
		Produtos[] vetor = new Produtos[numeroDeProdutos];
		
		for (int i = 0; i < vetor.length ; i++ ) {
			sc.nextLine();
			String nomeDoProduto = sc.nextLine();
			double valorDoProduto = sc.nextDouble();
			vetor[i] = new Produtos(nomeDoProduto, valorDoProduto);
		}
		
		double soma = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getValorDoProduto();
		}
		
		double media = soma / numeroDeProdutos;
		
		System.out.printf("Media: %.2f%n", media);
		
		
		
		
		sc.close();
		
	}

}