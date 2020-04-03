package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String comentario;
	private Integer likes;
	
	List<Comentarios> comentarios = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(Date momento, String titulo, String comentario, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentario = comentario;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentarios comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentarios comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(titulo + "\n");
		stringBuilder.append(likes);
		stringBuilder.append(" Likes - ");
		stringBuilder.append(dataFormat.format(momento) + "\n");
		stringBuilder.append(comentario + "\n");
		stringBuilder.append("Comentarios:\n");
		for (Comentarios comentario : comentarios) {
			stringBuilder.append(comentario.getComentarios()+"\n");
		}
		
		return stringBuilder.toString();
	}
	
	
}
