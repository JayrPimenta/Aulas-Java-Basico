import java.util.Locale;
import java.util.Scanner;

public class Exercicio_while {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* Exemplo 1
		
		Integer primeiroNumero = sc.nextInt();
		Integer segundoNumero = sc.nextInt();
		
		while (primeiroNumero != segundoNumero) {
					
			if (primeiroNumero < segundoNumero) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}
			
			primeiroNumero = sc.nextInt();
			segundoNumero = sc.nextInt();
			
		}
		
		*/
		
		/* Exemplo 2
		
		Integer idade = sc.nextInt();
		Integer quantidadeDeIndividuos = 0;
		Integer soma = 0;
		
		
		while (idade >= 0) {
			quantidadeDeIndividuos += 1;
			soma += idade;
			idade = sc.nextInt();
			
		}
			
		if (quantidadeDeIndividuos > 0) {
			double media = (double) soma / quantidadeDeIndividuos;
			System.out.printf("Media: %.2f", media);
		} else {		
			System.out.println("Impossivel Calcular");
		}
		
		*/
		
		/* Exercicio 1
		
		Integer senha = sc.nextInt();
		
		while (senha != 2002) {
			
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso Permitido");
		
		*/
		
		/* Exercicio 2 
		
		double eixoX = sc.nextDouble();
		double eixoY = sc.nextDouble();
		
		while (eixoX != 0 && eixoY != 0) {
			
			if (eixoX > 0 && eixoY > 0) {
				System.out.println("Primeiro");
			}
			if (eixoX > 0 && eixoY < 0) {
				System.out.println("Quarto");
			}
			if (eixoX < 0 && eixoY > 0) {
				System.out.println("Segundo");
			}
			if (eixoX < 0 && eixoY < 0) {
				System.out.println("Terceiro");
			}
			
			eixoX = sc.nextDouble();
			eixoY = sc.nextDouble();
		}
		
		*/
		
		/* Exercicio 3 
		
		System.out.println("Qual o serviço desejado?");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Disel");
		System.out.println("4 - FIM");
		System.out.println();
		
		Integer codigoDoServico = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		while (codigoDoServico != 4) {
			
			if (codigoDoServico == 1) {
				alcool += 1;
			}
			
			if (codigoDoServico == 2) {
				gasolina += 1;
			}
			
			if (codigoDoServico == 3) {
				disel += 1;
			}
			
			if (codigoDoServico > 4 || codigoDoServico <= 0) {
				System.out.println("Informe um numero válido.");
			}
			
			codigoDoServico = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Disel: "+disel);
		
		*/
		
		sc.close();
		
	}
	
	
}
