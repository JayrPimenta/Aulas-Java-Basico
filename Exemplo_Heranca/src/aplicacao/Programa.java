package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta contaBancaria = new Conta(1001, "Jayr Pimenta", 0.0);
		ContaEmpresa contaEmpresarial = new ContaEmpresa(1002, "Joice Pimenta", 0.0, 500.00);
		
		
		// UPCASTING
		
		Conta contaBancariaUm = contaEmpresarial;
		Conta contaBancariaDois = new ContaEmpresa(1003, "Maria Bonita", 0.0, 200.00);
		Conta contaBancariaTres = new ContaPoupanca(1004, "Marcos José", 0.0, 0.01);
		
		
		// DOWNCASTING
		
		ContaEmpresa contaBancariaQuatro = (ContaEmpresa) contaBancariaDois;
		
		if (contaBancariaTres instanceof ContaEmpresa) {
			ContaEmpresa contaBancariaCinco = (ContaEmpresa) contaBancariaTres;
			contaBancariaCinco.emprestimo(200.00);
			System.out.println("Emprestimo efetuado!");
		}
		
		if (contaBancariaTres instanceof ContaPoupanca) {
			ContaPoupanca contaBancariaCinco = (ContaPoupanca)contaBancariaTres;
			contaBancariaCinco.atualizarSaldoComJuros();
			System.out.println("Taxa de juros aplicada!");
		}
		
	}

}
