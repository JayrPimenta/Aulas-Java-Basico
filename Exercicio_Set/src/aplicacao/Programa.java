package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.LogDeEntrada;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String arquivo = "C:\\Users\\Pimenta House\\Desktop\\in.log";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
			
			Set<LogDeEntrada> set = new HashSet<>();
			
			String linha = bufferedReader.readLine();
			
			while (linha != null) {
				
				String[] extrairCampos = linha.split(" ");
				String nomeDoUsuario = extrairCampos[0];
				Date instanteDoAcesso = Date.from(Instant.parse(extrairCampos[1]));
				
				set.add(new LogDeEntrada(nomeDoUsuario, instanteDoAcesso));
				
				linha = bufferedReader.readLine();
				
			}
			
			System.out.println("Total usuários logados: " + set.size());
			
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}

}
