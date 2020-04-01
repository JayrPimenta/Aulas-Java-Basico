import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 
		 * *****Aula de variaveis e Saida de dados*****
		 * 
		 * 
		String texto = "Jayr";
		int idade = 25;
		double moeda = 10.9357;
		float moeda2 = 10;
		char sexo = 'M';
		boolean escolha = true;
		System.out.print(texto+" "+idade+" ");
		System.out.printf("R$%.2f%n", moeda);
		System.out.println(moeda2);
		System.out.println(sexo);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f", moeda);
		
		int x, y;
		x = 5;
		y = 2 * 5;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		/*
		 * 
		 * *****Entrada de dados*****
		 * 
		 * 
		 
		Scanner sc = new Scanner(System.in);
		
			String nome;
			nome = sc.next();
			System.out.println("Seu nome é: "+nome);
			
			int idade;
			char sexo;
			idade = sc.nextInt();
			sexo = sc.next().charAt(0);
			System.out.println("Idade: "+idade+" e Generô: "+sexo);
			// Espaço e Enter é interpretado como fim de imput do usuário e novo imput
			
			double valor;
			
			valor = sc.nextDouble();
			System.out.printf("Valor inserido: R$%.2f%n", valor);
			
			
			String adjetivo1, adjetivo2, adjetivo3;
			
			sc.nextLine(); //Bug de consumir linha
			adjetivo1 = sc.nextLine();
			adjetivo2 = sc.nextLine();
			adjetivo3 = sc.nextLine();
			
			System.out.printf("Frases atribuidas %s, %s, %s.%n", adjetivo1, adjetivo2, adjetivo3);
			
		sc.close();
		
		 *
		 * 
		 * *****Operaçoes Matematicas*****
		 * 
		 * 
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de "+ x + " = "+A);
		System.out.println("Raiz quadrada de "+ y + " = "+B);
		System.out.println("Raiz quadrada de 25 = "+C);
		
		System.out.println();
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x+" elevado a "+y+" = "+A);
		System.out.println(x+" elevado ao quadrado = "+B);
		System.out.println("5.0 elevado ao quadrado = "+C);
		
		System.out.println();
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de "+y+" = "+A);
		System.out.println("Valor absoluto de "+z+" = "+B);
		
		
		
		
		
		 *
		 * 
		 * *****Condicional*****
		 * 
		 * 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que horas são? *24h");
		double horaDigitada = sc.nextDouble();
		
		if (horaDigitada < 12.00 ) {
			System.out.print("Bom dia!");
		}
		
		if (horaDigitada < 18.00 && horaDigitada >= 12.00) {
			System.out.print("Boa Tarde");
		} else if (horaDigitada >= 18.00) {
			System.out.print("Boa Noite");
			
		}
		
		sc.close();
		
		 *
		 * 
		 * *****Switch Case*****
		 * 
		 * 
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.print("Hoje é "+dia);
		
		sc.close();
		
		 *
		 * 
		 * *****Condicional ternária*****
		 * 
		 * 
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		
		double imposto = (salario <= 2000) ? salario : salario * 0.10 + salario; 
		
		
		
		System.out.print(imposto);
		
		sc.close();
		
		
		
		*/
		
		
		
		
		
		
	}

}
