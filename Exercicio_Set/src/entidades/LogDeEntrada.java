package entidades;

import java.util.Date;

public class LogDeEntrada {

	private String nomeDoUsuario;
	private Date instanteDoAcesso;
	
	public LogDeEntrada(String nomeDoUsuario, Date instanteDoAcesso) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.instanteDoAcesso = instanteDoAcesso;
	}

	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public Date getInstanteDoAcesso() {
		return instanteDoAcesso;
	}

	public void setInstanteDoAcesso(Date instanteDoAcesso) {
		this.instanteDoAcesso = instanteDoAcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoUsuario == null) ? 0 : nomeDoUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogDeEntrada other = (LogDeEntrada) obj;
		if (nomeDoUsuario == null) {
			if (other.nomeDoUsuario != null)
				return false;
		} else if (!nomeDoUsuario.equals(other.nomeDoUsuario))
			return false;
		return true;
	}
	
	
	
}
