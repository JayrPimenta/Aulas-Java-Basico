import java.util.Locale;
import java.util.Scanner;
public class Exercicio_for {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		/* Exemplo 1 
		
		Integer numero = sc.nextInt();
		
		if (numero > 1 && numero < 1001) {
			
			for (int i = 1; i <= 10; i++) {
				Integer resultado = i * numero;
				System.out.println(i +" x "+numero+" = "+resultado);
			}
			
		} else {
			System.out.print("Numero invalido");
		}
		
		*/
		
		/* Exemplo 2 
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		
		for (int i = min+1; i<max; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		*/
		
		/* Exercicio 1 
		
		Integer numero = sc.nextInt();
		for (int i = 1; i<=numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		*/
		
		/* Exercicio 2 
		
		Integer N = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for (int i = 0; i<N ; i++) {
			
		int	X = sc.nextInt();
			
			if ( X >= 10 && X <= 20 ) {
				dentro += 1;
			} else {
				fora += 1;
			}
			
		}
		
		System.out.println(dentro+" in");
		System.out.println(fora+" out");
		
		*/
		
		/* Exercicio 3 
		
		int N = sc.nextInt();
		
		for (int i = 0; i<N ; i++) {
			double valorUm = sc.nextDouble();
			double valorDois = sc.nextDouble();
			double valorTres = sc.nextDouble();
			double media = (valorUm * 2.0 + valorDois * 3.0 + valorTres * 5.0)/10 ;
			System.out.printf("%.1f%n",media);
		}
		
		*/
		
		/* Exercicio 4 
		
		Integer N = sc.nextInt();
		
		for (int i = 0; i<N ; i++) {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			
			if (divisor != 0) {
				double quociente = (double) dividendo / divisor;
				System.out.println(quociente);
			} else {
				System.out.println("Dividão Impossivel");
			}
			
			
		}

		*/
		
		/* Exercicio 5 
		
		Integer N = sc.nextInt();
		
		
		int valor = N;
		for (int i = 1; i<N ; i++) {
				valor = valor*i;
		}
		
		if (N == 0) {
			valor++;
		}
		
		System.out.println(valor);
		
		*/
		
		/* Exercicio 6 
		
		Integer dividendo = sc.nextInt();
		
		for (int i = 1; i <= dividendo; i++) {
			
			if (dividendo % i == 0) {
				System.out.println(i);
			}
		}
		
		*/
		
		/* Exercicio 7 
		
		Integer numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.printf("%d %.0f %.0f%n",i ,Math.pow(i, 2) ,Math.pow(i, 3));	
		}
		
		*/
		
		sc.close();
	}
}
