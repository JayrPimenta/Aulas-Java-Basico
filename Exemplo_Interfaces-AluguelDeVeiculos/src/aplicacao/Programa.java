package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.AluguelDoVeiculo;
import modelo.entidades.Veiculo;
import modelo.servicos.ServicoDeAluguel;
import modelo.servicos.ServicoDeTaxasBrasileiras;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Informe dados do alugual");
		System.out.print("Modelo do Veiculo: ");
		String modeloDoVeiculo = sc.nextLine();
		
		System.out.print("Retirada do Veiculo (dd/MM/AAAA HH:mm): ");
		Date dataInicioDoAluguel = sdf.parse(sc.nextLine());
		
		System.out.print("Devolução do veliculo (dd/MM/AAAA HH:mm): ");
		Date dataFimDoAluguel = sdf.parse(sc.nextLine());
		
		AluguelDoVeiculo aluguelDoVeiculo = new AluguelDoVeiculo(dataInicioDoAluguel, dataFimDoAluguel, new Veiculo(modeloDoVeiculo));
		
		System.out.print("Informe o valor cobrado por hora: ");
		double precoPorHora = sc.nextDouble();
		System.out.print("Informe o valor cobrado por dia: ");
		double precoPorDia = sc.nextDouble();
		
		ServicoDeAluguel servicoDeAluguel = new ServicoDeAluguel(precoPorHora, precoPorDia, new ServicoDeTaxasBrasileiras());
		
		servicoDeAluguel.processarFatura(aluguelDoVeiculo);
		
		System.out.println();
		System.out.println("FATURA");
		
		System.out.println("Valor do aluguel: "+ String.format("%.2f",aluguelDoVeiculo.getFatura().getPagamentoBase()) );
		System.out.println("Valor das taxas: "+ String.format("%.2f",aluguelDoVeiculo.getFatura().getTaxa()));
		System.out.println("Valor total da Fatura: " + String.format("%.2f",aluguelDoVeiculo.getFatura().getTotalAPagar()));
		
		sc.close();
	}

}
