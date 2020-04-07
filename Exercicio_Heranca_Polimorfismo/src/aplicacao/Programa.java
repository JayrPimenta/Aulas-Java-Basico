package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produto = new ArrayList<>();
		
		System.out.print("Informe a quantidade de produtos para cadastro: ");
		int quantidadeDeProdutos = sc.nextInt();
		
		for (int itemCadastrado = 1; itemCadastrado <= quantidadeDeProdutos; itemCadastrado++) {
			
			System.out.println("Dados do produto #"+itemCadastrado+":");
			System.out.print("Item Comum, Usado ou Importado (c/u/i)? ");
			char tipoDeItem;
			
			do { 
				
				tipoDeItem = sc.next().charAt(0);
				
				if (tipoDeItem != 'c' && tipoDeItem != 'u' && tipoDeItem != 'i') {
					System.out.print("Informe se o Item �: Comum(c), Usado(u) ou Importado(I): ");
				}
			
			}while(tipoDeItem != 'c' && tipoDeItem != 'u' && tipoDeItem != 'i');
			
			
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Pre�o do produto: ");
			Double preco = sc.nextDouble();

			if (tipoDeItem == 'c') {
				produto.add(new Produto(nome, preco));
			}
			
			if (tipoDeItem == 'u') {
				System.out.print("Informe a data de fabrica��o (DD/MM/AAAA): ");
				sc.nextLine();
				Date dataDeFabrica��o = formatoDeData.parse(sc.next());
				produto.add(new ProdutoUsado(nome, preco, dataDeFabrica��o));	
			}
			
			if (tipoDeItem == 'i') {
				System.out.print("Informe a taxa de importa��o: ");
				Double taxaPersonalizada = sc.nextDouble();
				produto.add(new ProdutoImportado(nome, preco, taxaPersonalizada));
			}

		}
		
		
		System.out.println();
		System.out.println("Tabela dos pre�os:");
		
		for (Produto itemDaListaDeProdutos : produto) {
			System.out.println(itemDaListaDeProdutos.etiquetaDePreco());
		}
		
		
		sc.close();

	}

}
