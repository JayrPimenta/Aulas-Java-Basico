package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.Contrato;
import modelo.entidades.Parcelas;
import modelo.servicos.ServicoDoContrato;
import modelo.servicos.ServicoPayPal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe os dados do Contrato: ");
		System.out.print("Numero: ");
		Integer numeroDoContrato = sc.nextInt();
		System.out.print("Data (dd/MM/aaaa): ");
		sc.nextLine();
		Date dataDoContrato = sdf.parse(sc.nextLine());
		System.out.print("Valor do Contrato: ");
		Double valorTotalDoContrato = sc.nextDouble();
		
		Contrato contrato = new Contrato(numeroDoContrato, dataDoContrato, valorTotalDoContrato);
		
		System.out.print("Informe o numero de parcelas: ");
		Integer mes = sc.nextInt();
		
		ServicoDoContrato servicoDoContrato = new ServicoDoContrato(new ServicoPayPal());
		
		servicoDoContrato.processarContrato(contrato, mes);
		
		System.out.println();
		System.out.println("Parcelamento: ");

		for (Parcelas parcela : contrato.getParcela()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}

}
