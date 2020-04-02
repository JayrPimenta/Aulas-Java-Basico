package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.ContratoPorHora;
import entidades.Departamentos;
import entidades.Funcionario;
import entidades.enums.NivelDoFuncionario;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
		//SimpleDateFormat formatoDeDataRenda = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Informe o nome do departamento: ");
		String nomeDoDepartamento = sc.nextLine();
		
		System.out.println("Entre com os dados do funcionário:");
		System.out.print("Nome: ");
		String nomeDoFuncionario = sc.nextLine();
		
		System.out.print("Nível: ");
		String nivelDoFuncionario = sc.nextLine();
		
		System.out.print("Salario base: ");
		double salarioBaseDoFuncionario = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nomeDoFuncionario, NivelDoFuncionario.valueOf(nivelDoFuncionario), salarioBaseDoFuncionario, new Departamentos(nomeDoDepartamento));
		
		System.out.print("Quantos contratos deseja atribuir a este funcionario? ");
		int quantidadeDeContratos = sc.nextInt();
		
		for (int i = 1; i <= quantidadeDeContratos; i++ ) {
			
			System.out.println("Informe os dados do contrato #"+i+":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataDoContrato = formatoDeData.parse(sc.next());
			
			System.out.print("Informe o valor da hora: ");
			double valorDaHora = sc.nextDouble();
			
			System.out.print("Horas trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			
			ContratoPorHora contrato = new ContratoPorHora(dataDoContrato, valorDaHora, horasTrabalhadas);
			funcionario.addContratos(contrato);
		}
		System.out.println();
		
 
		System.out.print("Informe mês e ano para o calculo de renda (MM/YYYY): ");
		
		String dataRenda = sc.next();
		int mes = Integer.parseInt(dataRenda.substring(0, 2));
		int ano = Integer.parseInt(dataRenda.substring(3));
		
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Departamento: "+funcionario.getDepartamentos().getNome());
		System.out.println("Renda em "+ dataRenda +": "+ String.format("%.2f", funcionario.renda(ano, mes)));
		
		/* Não funcionou
		Calendar calendario = Calendar.getInstance();
		Date dataRenda = formatoDeDataRenda.parse(sc.next());
		calendario.setTime(dataRenda);
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		*/
		
		
		sc.close();

	}

}
