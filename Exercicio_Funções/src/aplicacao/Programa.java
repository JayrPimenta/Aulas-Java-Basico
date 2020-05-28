package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entidades.Produtos;


public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
			
		String arquivo = "C:\\Users\\Pimenta House\\Desktop\\Produtos.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
			
			List<Produtos> produtos = new ArrayList<>();
			
			String linha = bufferedReader.readLine();
			
			
			while (linha != null) {
				String[] listaDeProdutos = linha.split(",");
				produtos.add(new Produtos(listaDeProdutos[0], Double.valueOf(listaDeProdutos[1])));
				linha = bufferedReader.readLine();
			}	
			
			double mediaValorDosProdutos = produtos.stream()
					.map(p -> p.getValorDoProduto())
					.reduce(0.0, (x, y) -> x + y) / produtos.size();
			
			
			produtos.forEach(System.out::println);
			
			System.out.println();
			System.out.println("Media dos preços: " + String.format("%.2f", mediaValorDosProdutos));
			
			Comparator<String> comparar = (stringUm, stringDois) -> stringUm.toUpperCase().compareTo(stringDois.toUpperCase());
			
			List<String> nomesDosProdutos = produtos.stream()
					.filter(p -> p.getValorDoProduto() < mediaValorDosProdutos)
					.map(p -> p.getNomeDoProduto())
					.sorted(comparar.reversed())
					.collect(Collectors.toList());
					
			
			
			nomesDosProdutos.forEach(System.out::println);
			
			
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		

	}

}
