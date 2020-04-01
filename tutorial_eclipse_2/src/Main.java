import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 * * * * * Repetidores * * * * * 
		 * 
		  
		 
		 * *----------------------------------------------*
		 * 
		 * while *
		 * 
		 * 
		
		
		Integer numero = sc.nextInt();
		Integer soma = 0;
		
		while (numero != 0) {
			soma += numero;
			numero = sc.nextInt();
		}
		
		System.out.print(soma);
		
		
		int x = 0;
		int y = 4;
		
		while (x < 3) {
			x += 1;
			y += 2;
			System.out.println(x +" - "+ y);
		}
		
		
		
		
		
		 *----------------------------------------------*
		 *
		 * for *
		 * 
		 * 
		 
		
		Integer numeroDeRepeticoes = sc.nextInt();
		
		Integer soma = 0;
		
		for (int i = 0; i<numeroDeRepeticoes; i++) {
			
			Integer valorASerSomado = sc.nextInt();
			soma = soma + valorASerSomado;
			
		}
		
		System.out.println(soma);
		
		
		
		
		
		*----------------------------------------------*
		*
		* do while *
		* 
		* 
		
		
		
		char resposta;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		
		
		
		
		
		*----------------------------------------------*
		*
		* String *
		* 
		* 
		
		
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String exemploLetrasMaiusculasParaMinusculas = original.toLowerCase();
		String exemploLetrasMinusculasParaMaiusculas = original.toUpperCase();
		String exemploPalavraSemEspaco = original.trim();
		String exemploTirarCaracteresIniciais = original.substring(4);
		String exemploTirarCaracteresIniciaisEFinais = original.substring(2, 9);
		String exemploTrocaDeCaracter = original.replace('a', 'X');
		String exemploTorcaDeCaracteres = original.replace("abc" , "ZZZ");
		Integer ondeEstaNaPalavraPrimeiro = original.indexOf("bc");
		Integer ondeEstaNaPalavraUltimo = original.lastIndexOf("bc");
		
		System.out.println("Original:                   -"+original+"-");
		System.out.println("toLowerCase:                -"+exemploLetrasMaiusculasParaMinusculas+"-");
		System.out.println("toUpperCase:                -"+exemploLetrasMinusculasParaMaiusculas+"-");
		System.out.println("trim:                       -"+exemploPalavraSemEspaco+"-");
		System.out.println("substring(4):               -"+exemploTirarCaracteresIniciais+"-");
		System.out.println("substring(2, 9):            -"+exemploTirarCaracteresIniciaisEFinais+"-");
		System.out.println("replace('a', 'X'):          -"+exemploTrocaDeCaracter+"-");
		System.out.println("replace('abc' , 'ZZZ'):     -"+exemploTorcaDeCaracteres+"-");
		System.out.println("original.indexOf('bc'):     "+ondeEstaNaPalavraPrimeiro);
		System.out.println("original.lastIndexOf('bc'): "+ondeEstaNaPalavraUltimo);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//Split
		
		
		System.out.println("split");
		System.out.println();
		String frase = "Três trigos para três tigres";
		
		String[] vetor = frase.split(" ");
		
		String palavraUm = vetor[0];
		String palavraDois = vetor[1];
		String palavraTres = vetor[2];
		
		
		System.out.println("Frase: "+frase);
		
		System.out.println();
		
		System.out.println("Palavras:");
		
		System.out.println(palavraUm);
		System.out.println(palavraDois);
		System.out.println(palavraTres);
		
		System.out.println(vetor[3]);
		System.out.println(vetor[4]);
		
		*/
		
		
		
		
		
		
		
		
		
		/*
		
		*----------------------------------------------*
		*
		* Função (Sintaxe) *
		* 
		*	
		*/
		
		// exemplo de como puxar outras classes "maior" e "mostrarResultado"
		System.out.println("Inform três numeros: ");
		int primeiroNumero = sc.nextInt();
		int segundoNumero = sc.nextInt();
		int terceiroNumero = sc.nextInt();
		
		
		int maiorValor = maior(primeiroNumero, segundoNumero, terceiroNumero);
		mostrarResultado(maiorValor);
		
		sc.close();
		
	}
	
	public static int maior(int x, int y, int z) {
		// Classe para verificar qual maior valor dentre 3 valores informados
		int auxiliar;
		
		if (x > y && x > z ) {
			auxiliar = x;
		} else if (y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		
		return auxiliar;
	}
	
	public static void mostrarResultado(int valor) {
		// classe para imprimir o maior valor na tela
		System.out.println("O maior é: "+ valor);
	}
	
}
