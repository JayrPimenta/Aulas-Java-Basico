package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionario = new ArrayList<>();
		
		System.out.print("Informe o numero de funcionarios: ");
		int numeroDeFuncionarios = sc.nextInt();
		
		for (int cadastrado = 1; cadastrado <= numeroDeFuncionarios; cadastrado++) {
			System.out.println("Dados do funcionário #"+cadastrado+":");
			System.out.print("Terceirizado (s/n)? ");
			char tipoDeFuncionario = sc.next().charAt(0);
			
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			Integer horas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			Double valorPorHora = sc.nextDouble();
			
			if (tipoDeFuncionario == 's') {
				
				System.out.print("Bonus: ");
				Double bonus = sc.nextDouble();
				Funcionario listaFuncionario = new FuncionarioTerceirizado(nome, horas, valorPorHora, bonus); 
				funcionario.add(listaFuncionario);
				
			} else {
				
				funcionario.add(new Funcionario(nome, horas, valorPorHora));	
				
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		
		for (Funcionario itemDaLista : funcionario) {
			System.out.printf("%s - R$ %.2f%n", itemDaLista.getNome(), itemDaLista.pagamento());
		}
		
		sc.close();
	}

}
