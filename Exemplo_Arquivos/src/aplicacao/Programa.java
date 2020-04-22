package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Programa {

	public static void main(String[] args) {
		String dir = "C:\\Users\\Pimenta House\\Desktop\\";
		String arquivo ="Teste1.txt";
		String url = dir + arquivo;

		// Criação e edição de arquivos
		
		String[] linhas = new String[] {"Teste 1", "teste 2", "teste 3"};

		
		// O paremetro "true" no "try" permite que somente seja arecentada informação ao arquivo
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(url, true))){ 
			for (String linha : linhas) {
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Err: "+ e.getMessage());
		}
		
		
		
		// recria o arquivo toda vez que for executado
		arquivo ="Teste2.txt";
		url = dir + arquivo;
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(url))){
			for (String linha : linhas) {
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Err: "+ e.getMessage());
		}
		
		
		
		
		
		// Leitura de Arquivos
		File arquivoExemplo = new File("C:\\Users\\Pimenta House\\Desktop\\Orçamento-Humberto.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivoExemplo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e ) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			if (null != sc) {
				sc.close();
			}
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();
		
		// FileReader e BufferedReader (Modo inapropriado)
		arquivo ="Teste1.txt";
		url = dir + arquivo;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(url);
			br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while (null != linha) {
				System.out.println(linha);
				linha = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		finally {
			try {
				if (null != br) {
					br.close();
				}
				if (null != fr) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.getStackTrace();
			}
			
			
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();
		// Bloco Try-With-Resources (Fecha Automaticamanete os recursos Readers)
		arquivo ="Teste2.txt";
		url = dir + arquivo;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))) {
			
			String linha = bufferedReader.readLine();
			
			while (null != linha) {
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		
		
		
	}

}
