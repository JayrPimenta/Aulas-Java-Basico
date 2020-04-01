import java.util.Scanner;

import java.util.Locale;

public class Execicios {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		/* Exemplo 01 
		
		System.out.print("Qual a nota da primeira prova? ");
		double primeiraProva = sc.nextDouble();
		System.out.print("Qual a nota da segunda prova? ");
		double segundaProva = sc.nextDouble();
		double nota = primeiraProva + segundaProva;
		
		System.out.println();
		System.out.print("NOTA FINAL = "+nota);
		
		if (nota < 60.0) {
			System.out.print("REPROVADO");
		}
		*/
		
		/* Exemplo 02 
		
		System.out.print("Informe a: ");
		double a = sc.nextDouble();
		System.out.print("Informe b: ");
		double b = sc.nextDouble();
		System.out.print("Informe c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) -4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.print("IPOSSIVEL CALCULAR");
		} else {
			
			double resultadoUm = (-b + Math.sqrt(delta)) / (2 * a);
			double resultadoDois = (+b + Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("R1 = %.5f%n", resultadoUm);
			System.out.printf("R2 = %.5f%n", resultadoDois);
			
		}
		
		*/
		
		/* Exemplo 03 
		
		Integer primeiroNumero, segundoNumero, terceiroNumero;
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		terceiroNumero = sc.nextInt();
		
		if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			System.out.print("MENOR = "+primeiroNumero);
		} else if (segundoNumero < terceiroNumero) {
			System.out.print("MENOR = "+segundoNumero);
			
		} else {
			
			System.out.print("MENOR = "+terceiroNumero);
		}
		
		*/
		
		/* Exercicio 01 
		
		Integer numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.print("NEGATIVO");
		} else {
			System.out.print("NÃO NEGATIVO");
		}
		
		*/
		
		/* Exercicio 02 
		
		Integer numero = sc.nextInt();
		
		if (numero % 2 == 0) {			
			System.out.print("PAR");			
		} else {
			System.out.print("IMPAR");
		}
		
		*/
		
		/* Exercicio 03 
		
		Integer primeiroNumero, segundoNumero;
		primeiroNumero = sc.nextInt();
		segundoNumero = sc.nextInt();
		
		if (primeiroNumero % segundoNumero == 0 || segundoNumero % primeiroNumero == 0) {
			
			System.out.print("São Multiplos");
			
		} else {
			
			System.out.print("Não são Multiplos");
			
		}
		
		*/
		
		/* Exercicio 04 
		
		Integer horaInicio, horaFim, horasJogadas;
		System.out.println("Informa Hora Inicio e Hora Fim da Partida:");
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		
		if (horaInicio < horaFim) {
			horasJogadas = horaFim - horaInicio;
		} else {
			horasJogadas = (horaFim + 24) - horaInicio ;	
		}
		
		System.out.print("O jogo durou "+horasJogadas+" hora(s)");
		
		*/
		
		/* Exercicio 05 
		
		System.out.println("Codigo - Especificação   - Preço");
		System.out.println("1      - Cachorro Quente - R$ 4,00");
		System.out.println("2      - X-Salada        - R$ 4,50");
		System.out.println("3      - X- Bacon        - R$ 5,00");
		System.out.println("4      - Torrada Simples - R$ 2,00");
		System.out.println("5      - Refrigerante    - R$ 1,50");
		System.out.println("Diga o codigo e a quantidade de lanches:");
		Integer codigo = sc.nextInt();
		Integer quantidade = sc.nextInt();
		
		double valor = 0.0;
		
		if (codigo == 1) {
			valor = quantidade * 4.00;
		}
		
		if (codigo == 2) {
			valor = quantidade * 4.50;
		}
		
		if (codigo == 3) {
			valor = quantidade * 5.00;
		}
		
		if (codigo == 4) {
			valor = quantidade * 2.00;
		}
		
		if (codigo == 5) {
			valor = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f",valor);
		
		*/
		
		
		/* Exercicio 06 
		
		double valor = sc.nextDouble();
		
		if (valor < 0 || valor > 100.00) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if (valor <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if (valor <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}
		
		*/
		
		/* Exercicio 07 
		
		double eixoX = sc.nextDouble();
		double eixoY = sc.nextDouble();
		
		if (eixoX == 0 && eixoY == 0) {
			
			System.out.print("Origem");
			
		} else if (eixoX == 0 || eixoY == 0) {
			
			if (eixoX != 0) {
				System.out.print("Eixo X");
			} else {
				System.out.print("Eixo Y");
			}
			
		} else {
			
			if (eixoX > 0 && eixoY > 0) {
				System.out.print("Q1");
			}
			
			if (eixoX < 0 && eixoY > 0) {
				System.out.print("Q2");
			}
			
			if (eixoX < 0 && eixoY < 0) {
				System.out.print("Q3");
			}
			
			if (eixoX > 0 && eixoY < 0) {
				System.out.print("Q4");
			}	
		}
		
		*/
		
		/* Exercicio 08 
		
		double renda = sc.nextDouble();
		double imposto;
		
		
		if (renda <= 2000.00) {
			
			imposto = 0.0;
			
		} else if (renda <= 3000.00) {
			
			imposto = (renda - 2000.00) * 0.08;
			
		} else if (renda <= 4500.00) {
			
			imposto = (renda - 3000.00) * 0.18 + 1000 * 0.08;

		} else {
			
			imposto = (renda - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			
		}
		
		
		if (imposto == 0.0) {
			System.out.print("Isento");
		}else {
			System.out.printf("R$ %.2f", imposto);
		}
		
		
		*/
		
		sc.close();
	}

}






