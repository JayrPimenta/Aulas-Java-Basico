package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produtos> listaDeProdutos = new ArrayList<>();
		
		System.out.println("Registro de venda dos produtos: ");
		System.out.println();
		
		char novaVenda = 's';
		
		do {
			
			System.out.print("Nome: ");
			String nomeDoProduto = sc.nextLine();
			
			System.out.print("Preço: ");
			Double precoDoProduto = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer quantidadeDoProduto = sc.nextInt();
			
			listaDeProdutos.add(new Produtos(nomeDoProduto, precoDoProduto, quantidadeDoProduto));
			
			System.out.print("Efetuar outra venda (S/N)? ");
			novaVenda = sc.next().charAt(0);
			sc.nextLine();
			System.out.println();
			
		} while (novaVenda == 's');
		
		// Criar Pasta e Arquivo

		boolean pastaVendas = new File("C:\\Users\\Pimenta House\\Desktop\\Exercicio_Vendas").isDirectory();
		
		String diretorio = "C:\\Users\\Pimenta House\\Desktop\\Exercicio_Vendas\\ResumoDeVendas.csv";
		
		if (pastaVendas == false) {
			pastaVendas = new File("C:\\Users\\Pimenta House\\Desktop\\Exercicio_Vendas").mkdir();
		}
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(diretorio))) {
			for (Produtos produto : listaDeProdutos) {
				bufferedWriter.write(produto.toString());
				bufferedWriter.newLine();
			}
		}
		catch (IOException e) {
			e.getStackTrace();
		}

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(diretorio)) ){
			
			String linha = bufferedReader.readLine();
			
			while (null != linha) {
				String[] arrayDeProdutos = linha.split(",");
				
				String nomeDoProduto = arrayDeProdutos[0];
				Double precoDoProduto = Double.valueOf(arrayDeProdutos[1]);
				Integer quantidadeDoProduto = Integer.valueOf(arrayDeProdutos[2]);

				System.out.println(nomeDoProduto +" "+ String.format("%.2f", (precoDoProduto * quantidadeDoProduto)));
				linha = bufferedReader.readLine();
				
				
			}
		}
		catch (IOException e) {
			e.getStackTrace();
		}
		
		
		
		
		sc.close();

	}

}
