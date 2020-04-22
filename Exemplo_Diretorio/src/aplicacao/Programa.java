package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Url Padrão: C:\\Users\\Pimenta House\\Desktop");
		System.out.println();
		
		System.out.println("Informe um diretório: ");
		String urlInformadoPeloUsuario = sc.nextLine();
		
		File url = new File(urlInformadoPeloUsuario);
		
		File[] pastas = url.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		System.out.println();
		
		File[] arquivos = url.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}

		System.out.println();
		System.out.println("NOMES DOS ARQUIVOS");
		
		for (File arquivo : arquivos) {
			System.out.println(arquivo.getName());
		}
		
		System.out.println();
		System.out.println("DIR DOS ARQUIVOS");
		
		for (File arquivo : arquivos) {
			System.out.println(arquivo.getParent());
		}
		
		System.out.println();
		
		//Criar pasta
		boolean sucesso = new File(urlInformadoPeloUsuario + "\\TesteCriarPasta").mkdir();
		if (sucesso == true) {
			System.out.println("Pasta TesteCriarPasta criada com sucesso no diretório" + urlInformadoPeloUsuario);
		}
			
		// pegar so o nome do arquivo sem diretório
		
		sc.close();

	}

}
