package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
				
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		funcionario.setNome(nome);
		
		System.out.print("Salário Bruto: ");
		double salarioBruto = sc.nextDouble();
		funcionario.setSalarioBruto(salarioBruto);
		
		System.out.print("Imposto: ");
		double imposto = sc.nextDouble();
		funcionario.setImposto(imposto);
		System.out.println();
		
		System.out.println(funcionario);
		
		System.out.println();
		
		System.out.print("Deseja atribuir uma procentagem ao salario? ");
		double aumento = sc.nextDouble();
		funcionario.aumentoDeSalari(aumento);
		
		System.out.println();
		
		System.out.println(funcionario);
		
		sc.close();
	}

}
