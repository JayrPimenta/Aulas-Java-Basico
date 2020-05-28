package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Funcionarios;

public class Programa  {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String arquivo = "C:\\Users\\Pimenta House\\Desktop\\Funcionarios.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
			
			List<Funcionarios> funcionarios = new ArrayList<>();
			
			String linha = bufferedReader.readLine();
			
			while(linha != null) {
				
				String[] dadosDoArquivoDosFuncionarios = linha.split(",");
				String nomeDoFuncionario = dadosDoArquivoDosFuncionarios[0];
				String emailDoFuncionario = dadosDoArquivoDosFuncionarios[1];
				Double salarioDoFuncionario = Double.valueOf(dadosDoArquivoDosFuncionarios[2]);
				
				funcionarios.add(new Funcionarios(nomeDoFuncionario, emailDoFuncionario, salarioDoFuncionario));

				linha = bufferedReader.readLine();
			}
			
			System.out.print("Informe o Salário para filtragem: ");
			Double perquisarSalario = sc.nextDouble();
			
			System.out.println("Email dos funcionarios que recebem um salário superior a "+ String.format("%.2f", perquisarSalario) +":");
			
			List<String> emailDosFuncionarios = funcionarios.stream()
					.filter(f -> f.getSalarioDoFuncionario() > perquisarSalario)
					.map(f -> f.getEmailDoFuncionario())
					.sorted()
					.collect(Collectors.toList());
			
			emailDosFuncionarios.forEach(System.out::println);
			
			Double totalSalariosDosFuncionarios = funcionarios.stream()
					.filter(f -> f.getNomeDoFuncionario().charAt(0) == 'M')
					.map(f -> f.getSalarioDoFuncionario())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Soma dos salários de todas os funcionários que o nome começam com a letra 'M':" + String.format("%.2f", totalSalariosDosFuncionarios));
			
			
			
			
		} catch (IOException e ) {
			System.out.println("Erro: " + e.getMessage());
		}
	
		sc.close();
	}
}
