package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		String arquivo = "C:\\Users\\Pimenta House\\Desktop\\votos.csv";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo))){
			
			String linha = bufferedReader.readLine();
			
			while (linha != null) {
				
				String[] extrairCampos = linha.split(",");
				String nomeDoCandidato = extrairCampos[0];
				Integer quantidadeDeVotos = Integer.parseInt(extrairCampos[1]);
				
				if (votos.containsKey(nomeDoCandidato)) {
					
					Integer votosPara = votos.get(nomeDoCandidato);
					votos.put(nomeDoCandidato, quantidadeDeVotos + votosPara);
					
				} else {
					
					votos.put(nomeDoCandidato, quantidadeDeVotos);
					
				}
				
				linha = bufferedReader.readLine();
			}
			
			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}
			
			
		} catch (IOException e) {
			System.out.println("Erro: "+ e.getMessage());
		}

	}

}
