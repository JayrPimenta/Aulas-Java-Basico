package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Alunos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Alunos alunos = new Alunos();
		
		String nomeDoAluno = sc.nextLine();
		alunos.setnomeDoAluno(nomeDoAluno);
		
		double primeiraNota = sc.nextDouble();
		alunos.setPrimeiraNota(primeiraNota);
		
		double segundaNota = sc.nextDouble();
		alunos.setSegundaNota(segundaNota);
		
		double terceiraNota = sc.nextDouble();
		alunos.setTerceiraNota(terceiraNota);
		
		System.out.println(alunos);
		
		if (alunos.notaParaPassar() > 0) {
			System.out.printf("Faltou %.2f pontos", alunos.notaParaPassar());
		}
		
		
		sc.close();
	}

}
