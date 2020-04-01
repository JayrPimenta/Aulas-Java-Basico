package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Recepcao;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Quantos quartos serem alugados? ");
		
		Integer quantidadeDeQuartos = sc.nextInt();
		
		System.out.println();
		Recepcao[] vetor = new Recepcao[10];
		
		for (int i = 0 ; i < quantidadeDeQuartos; i++) {
			
			sc.nextLine();
			System.out.println("Aluguel #"+(i+1) );
			System.out.print("Nome: ");
			String nomeDoLocatario = sc.nextLine();
			System.out.print("Email: ");
			String emailDoLocatario = sc.nextLine();
			System.out.print("Numero do Quarto: ");
			int numeroDoQuarto = sc.nextInt();	
			System.out.println();
			
			if (numeroDoQuarto <= 9 && numeroDoQuarto >= 0) {
				vetor[numeroDoQuarto] = new Recepcao(nomeDoLocatario, emailDoLocatario);
			} else {
				System.out.println("numero do quarto invalido. Informe um numero de 0 a 9.");
				i--;
			}
			
		}
		
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < vetor.length; i++ ) {
			
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
			
		}
		
		
		
		sc.close();
		
	}

}
