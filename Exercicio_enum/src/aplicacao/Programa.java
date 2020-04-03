package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoDataAniversario = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do cliente:");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de aniversário (DD/MM/AAAA): ");
		String dataDeAniversario = sc.next();
		Date datadeAniversario = formatoDataAniversario.parse(dataDeAniversario);
		
		Cliente cliente = new Cliente(nome, email, datadeAniversario);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Informe os dados do pedido:");
		System.out.print("Status do pedido: ");
		sc.nextLine();
		String statusDoPedido = sc.nextLine();
		Date momentoDoPedido = new Date();
		
		Pedido pedido = new Pedido(momentoDoPedido, StatusDoPedido.valueOf(statusDoPedido), cliente);

		System.out.print("Quantos produtos deseja comprar? ");
		Integer numeroDePedidos = sc.nextInt();
		
		for (int produtosDoPedido = 1; produtosDoPedido<=numeroDePedidos; produtosDoPedido++) {
			sc.nextLine();
			System.out.println("Informe os dados do produto #"+produtosDoPedido+":");
			
			System.out.print("Nome do produto: ");
			String nomeDoProduto = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			Double precoDoProduto = sc.nextDouble();
			
			System.out.print("Quantidade do produto: ");
			Integer quantidadeDoProduto = sc.nextInt();
			
			Produto produto = new Produto(nomeDoProduto, precoDoProduto);
			
			ItemDoPedido solicitacaoDePedido = new ItemDoPedido(quantidadeDoProduto, precoDoProduto, produto);
			
			pedido.addItem(solicitacaoDePedido);
			
		}
		
		System.out.println();
		System.out.println("Detalhe do pedido:");
		System.out.println(pedido);
		
		sc.close();

	}

}
