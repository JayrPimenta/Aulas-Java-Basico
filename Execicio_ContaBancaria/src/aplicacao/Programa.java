package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Banco;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Informe o numero da sua conta: ");
		Integer contaBancaria = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Informe o nome do titular: ");
		String nomeDoTitular = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito inicial (s/n)? ");
		char depositoInicial = sc.next().charAt(0);
		
		if ( depositoInicial == 's' ) {
			System.out.print("Informe o valor do deposito inicial: ");
			double valorDepositoInicial = sc.nextDouble();
			banco = new Banco(contaBancaria, nomeDoTitular, valorDepositoInicial);
		} else {
			banco = new Banco(contaBancaria, nomeDoTitular);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Informe o valor a ser depositado: ");
		double valorDoDeposito = sc.nextDouble();
		banco.deposito(valorDoDeposito);
		System.out.println("Dados da conta atualizados:");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Informe o valor para saque: ");
		double valorDoSaque = sc.nextDouble();
		banco.saque(valorDoSaque);
		System.out.println("Dados da conta atualizados:");
		System.out.println(banco);
		
		sc.close();
		
	}

}
