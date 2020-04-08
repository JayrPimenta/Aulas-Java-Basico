package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> listaDeContribuintes = new ArrayList<>();
		
		System.out.print("Informe o numero de Contribuintes: ");
		int numeroDeContribuintes = sc.nextInt();
		
		for (int taxaPaga = 1; taxaPaga <= numeroDeContribuintes; taxaPaga++) {
			System.out.println("Dados do imposto recolhido #"+taxaPaga+":");
			System.out.print("Pessoa Fisica ou Juridica (f/j): ");
			char tipoDeContribuinte = sc.next().charAt(0);
			
			while ( tipoDeContribuinte != 'f' && tipoDeContribuinte != 'j' ) {
				System.out.print("Informe se o contribunte é pessoa FISICA(f) ou JURIDICA(j): ");
				tipoDeContribuinte = sc.next().charAt(0);
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if (tipoDeContribuinte == 'f') {
				System.out.print("Despesas médicas: ");
				Double despesasMedicas = sc.nextDouble();
				
				listaDeContribuintes.add(new PessoaFisica(nome, rendaAnual, despesasMedicas));
				
			} else {
				
				System.out.print("Numero de funcionários: ");
				int numeroDeFuncionarios = sc.nextInt();
				
				listaDeContribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
				
			}
			
		}
		
		
		System.out.println();
		System.out.println("Taxas pagas:");
		
		Double totalTaxas = 0D;
		for (Contribuintes contribuinte : listaDeContribuintes) {
			System.out.println(contribuinte.getNome()+": R$ "+String.format("%.2f", contribuinte.imposto()));
			totalTaxas += contribuinte.imposto();
		}
		
		System.out.println();
		System.out.printf("Total de impostos pagos: R$ %.2f", totalTaxas);
		
		
		
		
		
		sc.close();

	}

}
