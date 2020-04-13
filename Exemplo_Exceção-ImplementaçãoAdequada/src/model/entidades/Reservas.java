package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.excecao.ExcecaoDeDominio;

public class Reservas {
	
	private Integer numeroDoQuarto;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservas() {
	}

	public Reservas(Integer numeroDoQuarto, Date checkin, Date checkout) {
		
		if (!checkout.after(checkin)){
			throw new ExcecaoDeDominio("A data de Check-Out não pode ser anterior a data de Check-In");
		}
		
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duracao() {
		long duracao = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(duracao, TimeUnit.MILLISECONDS);
	}
	
	public void atualizarReservas(Date checkin, Date checkout) {
		
		Date agora = new Date();
		
		if (checkin.before(agora) || checkout.before(agora)) {
			throw new ExcecaoDeDominio("As datas devem der futuras.");
		} 
		if (!checkout.after(checkin)){
			throw new ExcecaoDeDominio("A data de Check-Out não pode ser anterior a data de Check-In");
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Quanto "+
				+ numeroDoQuarto
				+ ", Check-In: "
				+ formatoDeData.format(checkin)
				+ ", check-Out: "
				+ formatoDeData.format(checkout)
				+ ", "
				+ duracao()
				+ " noites.";
	}

}
