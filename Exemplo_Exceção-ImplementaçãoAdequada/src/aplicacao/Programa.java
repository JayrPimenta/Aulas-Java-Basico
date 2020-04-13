package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reservas;
import model.excecao.ExcecaoDeDominio;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Informe o numero do quarto: ");
			int numeroDoQuarto = sc.nextInt();
			System.out.print("Informe a data  de Check-in (DD/MM/AAAA): ");
			Date checkin = formatoDeData.parse(sc.next());
			System.out.print("Informe a data  de Check-out (DD/MM/AAAA): ");
			Date checkout = formatoDeData.parse(sc.next());
			
			Reservas reservas = new Reservas(numeroDoQuarto, checkin, checkout);
			System.out.println("Reserva: " + reservas);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar sua reserva:");
			System.out.print("Informe a data  de Check-in (DD/MM/AAAA): ");
			checkin = formatoDeData.parse(sc.next());
			System.out.print("Informe a data  de Check-out (DD/MM/AAAA): ");
			checkout = formatoDeData.parse(sc.next());
			
			reservas.atualizarReservas(checkin, checkout);
			System.out.println("Reserva: " + reservas);
		}
		catch(ParseException e) {
			System.out.println("Formato de data invalido");
		}
		catch (ExcecaoDeDominio e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado");
		}
			
		
		
		
		sc.close();
	}

}
