package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {
	
	private Integer numeroDoQuarto;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservas() {
	}

	public Reservas(Integer numeroDoQuarto, Date checkin, Date checkout) {
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
