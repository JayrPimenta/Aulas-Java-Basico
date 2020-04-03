package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDoPedido;

public class Pedido {
	
	private Date momento;
	private StatusDoPedido status;
	private Cliente cliente;
	
	SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<ItemDoPedido> listaDeProdutos = new ArrayList<>();
	
	public Pedido(){
	}

	public Pedido(Date momento, StatusDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public List<ItemDoPedido> getListaDeProdutos() {
		return listaDeProdutos;
	}
	
	public void addItem(ItemDoPedido item) {
		listaDeProdutos.add(item);
	}
	
	public void removeItem(ItemDoPedido item) {
		listaDeProdutos.remove(item);
	}
	
	public Double total() {
		Double soma = 0d;
		
		for (ItemDoPedido valores : listaDeProdutos) {
			soma += valores.subTotal();
		}
		
		return soma;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Data do pedido: ");
		stringBuilder.append(formatoDeData.format(momento) + "\n");
		stringBuilder.append("Status do pedido: ");
		stringBuilder.append(status + "\n");
		stringBuilder.append("Cliente: ");
		stringBuilder.append(cliente + "\n");
		stringBuilder.append("Itens do pedido:\n");
		for (ItemDoPedido item : listaDeProdutos) {
			stringBuilder.append(item + "\n");
		}
		stringBuilder.append("Preço total: R$");
		stringBuilder.append(String.format("%.2f", total()));
		return stringBuilder.toString();
	}
	
}
