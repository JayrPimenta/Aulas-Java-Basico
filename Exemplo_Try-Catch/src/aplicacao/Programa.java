package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		//metodoUm();
		metodoBlocoFinally();
		
		System.out.println();
		System.out.println("Sistema finalizado!");
		

	}
	
	public static void metodoUm() {
		System.out.println("----- Inicio do Metodo 1 -----");
		metodoDois();
		System.out.println("------ Fim do Metodo 1 ------");
	}

	public static void metodoDois() {
		System.out.println("----- Inicio do Metodo 2 -----");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Informe uma sequencia de nomes: ");
			String[] vetor = sc.nextLine().split(" ");
			
			System.out.print("Informe qual nome deseja buscar: ");
			Integer index = sc.nextInt();
			
			System.out.println(vetor[index]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.printf("Numero informado não correponde%na posição de um nome.");
			System.out.println();
		}
		catch (InputMismatchException e ) {
			System.out.println();
			System.out.printf("Informe um numero para busca.");
			e.printStackTrace(); // Imprime o erro e sua origem
			System.out.println();
		}
		System.out.println();
		System.out.println("------ Fim do Metodo 2 ------");
		sc.close();
	}
	
	public static void metodoBlocoFinally() {
		File file = new File("C:\\Users\\Pimenta House\\Desktop\\teste.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		}
		catch (FileNotFoundException e){
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
				
		}
		finally {
			if(sc != null) {
				sc.close();
				// Idempendente de Funcionar ou não o bloco 
				// Finally sempre será executado
			}
		}
		
	}

}
