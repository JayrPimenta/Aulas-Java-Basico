package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentarios;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios comentarioUm = new Comentarios("Excelente viagem!");
		Comentarios comentarioDois = new Comentarios("Nossa muito legal!");
		Post postagemUm = new Post(
				dataFormat.parse("21/06/2018 13:05:44"), 
				"Viagem a Nova Zelandia", 
				"Vou visitar esse pais maravilhoso!",
				12);
		
		postagemUm.addComentario(comentarioUm);
		postagemUm.addComentario(comentarioDois);
		
		System.out.println(postagemUm);

	}

}
