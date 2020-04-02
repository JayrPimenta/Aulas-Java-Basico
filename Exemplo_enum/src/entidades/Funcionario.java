package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelDoFuncionario;

public class Funcionario {
	
	private String nome;
	private NivelDoFuncionario nivel;
	private Double baseSalarial;
	
	private Departamentos departamentos;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Funcionario() {	
	}

	public Funcionario(String nome, NivelDoFuncionario nivel, Double baseSalarial, Departamentos departamentos) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamentos = departamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDoFuncionario getNivel() {
		return nivel;
	}

	public void setNivel(NivelDoFuncionario nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}
	
	public void addContratos(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removeContratos(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		
		double soma = baseSalarial;
		Calendar calendario = Calendar.getInstance();
		
		for (ContratoPorHora listagemContratosDoFuncionario : contratos) {
			
			calendario.setTime(listagemContratosDoFuncionario.getData());
			int listagemContratosDoFuncionarioAno = calendario.get(Calendar.YEAR);
			int listagemContratosDoFuncionarioMes = 1 + calendario.get(Calendar.MONTH);
			
			if (ano == listagemContratosDoFuncionarioAno && mes == listagemContratosDoFuncionarioMes) {
				soma += listagemContratosDoFuncionario.valorTotal();
			}
			
		}
		
		return soma;
		
	}
	
}
