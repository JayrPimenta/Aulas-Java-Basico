package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reservas;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o numero do quarto: ");
		int numeroDoQuarto = sc.nextInt();
		System.out.print("Informe a data  de Check-in (DD/MM/AAAA): ");
		Date checkin = formatoDeData.parse(sc.next());
		System.out.print("Informe a data  de Check-out (DD/MM/AAAA): ");
		Date checkout = formatoDeData.parse(sc.next());
		
		if (!checkout.after(checkin)) {
			System.out.println("Erro na reserva: A data de Check-Out não pode ser anterior a data de Check-In");
		} else {
			Reservas reservas = new Reservas(numeroDoQuarto, checkin, checkout);
			System.out.println("Reserva: " + reservas);
			
			System.out.println();
			System.out.println("Entre com os dados para atualizar sua reserva:");
			System.out.print("Informe a data  de Check-in (DD/MM/AAAA): ");
			checkin = formatoDeData.parse(sc.next());
			System.out.print("Informe a data  de Check-out (DD/MM/AAAA): ");
			checkout = formatoDeData.parse(sc.next());
			
			
			String erro = reservas.atualizarReservas(checkin, checkout);
			
			if ( erro != null) {
				System.out.println("Erro na reserva: "+ erro);
			} else {
				System.out.println("Reserva: " + reservas);
			}
			
		
		}
		
		
		sc.close();
	}

}
