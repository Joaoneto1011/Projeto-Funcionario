package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities_enums.NivelTrabalhador;

public class Funcionario {
	
	private String nome;
	private NivelTrabalhador nivel;
	private double salarioBase;
	
	private Departamento departamento;
	
	private List<ContratoPorHora> contratos = new ArrayList<>();
	
	public Funcionario() {
	}
	
	
	public Funcionario(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	

	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public NivelTrabalhador getNivel() {
		return nivel;
	}

	
	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	
	public double getSalarioBase() {
		return salarioBase;
	}

	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	public Departamento getDepartamento() {
		return departamento;
	}

	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	
	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			
			if (ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		
		return soma;
	}

}
