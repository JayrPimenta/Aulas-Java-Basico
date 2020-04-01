package aplicacao;

public class Programa {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Jayr", "Joice", "Ana", "Marcia", "Joel", "José Jayr"}; 
		
		
		System.out.println("Uso do For:");
		System.out.println();
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println();
		System.out.println("---------------");	
		System.out.println();
		
		
		System.out.println("Uso do For each");
		System.out.println();
		
		for (String nomes : vetor) {
			System.out.println(nomes);
		}
		
	}

}
