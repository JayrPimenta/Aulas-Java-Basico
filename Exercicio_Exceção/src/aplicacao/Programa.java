package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import model.entidades.Conta;
import model.excecao.ContaExcecoes;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Informe os dados da conta:");
			System.out.print("Numero: ");
			Integer numeroDaConta = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String titularDaConta = sc.nextLine();
			System.out.print("Saldo inicial: ");
			Double saldoDaConta = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double limiteParaSaque = sc.nextDouble();
			
			Conta conta = new Conta(numeroDaConta, titularDaConta, saldoDaConta, limiteParaSaque);
			
			System.out.println();
			System.out.print("Informe o valor que deseja sacar: ");
			Double valorParaSaque = sc.nextDouble();
			
			conta.saque(valorParaSaque);
			
			System.out.println("Novo saldo: R$ "+String.format("%.2f", conta.getSaldoDaConta()));
		}
		catch (ContaExcecoes e) {
			System.out.println("Erro no saque: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado");
		}
		
		sc.close();
	}

}
