package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produtos; 

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Estoque do produto: " + produto);
		
		System.out.println();
		System.out.print("Adicionar produtos ao estoque: ");
		Integer quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Estoque atualizado: " + produto);
		
		System.out.println();
		System.out.print("Remover produtos ao estoque: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.print("Estoque atualizado: " + produto);
		
		sc.close();
	}

}	
