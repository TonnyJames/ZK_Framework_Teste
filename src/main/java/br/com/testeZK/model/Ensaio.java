package br.com.testeZK.model;

import org.zkoss.zul.Datebox;

public class Ensaio {

	private int id;
	private String NomeBanda;
	private Datebox dataCriacao;
	private Datebox dataEnsaio;
	private String obs;
	private int qtdHoras;
	
	
	public Ensaio() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ensaio(String nomeBanda, Datebox dataCriacao, Datebox dataEnsaio, String obs, int qtdHoras) {
		super();
		NomeBanda = nomeBanda;
		this.dataCriacao = dataCriacao;
		this.dataEnsaio = dataEnsaio;
		this.obs = obs;
		this.qtdHoras = qtdHoras;
	}


	public String getNomeBanda() {
		return NomeBanda;
	}


	public void setNomeBanda(String nomeBanda) {
		NomeBanda = nomeBanda;
	}


	public Datebox getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Datebox dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Datebox getDataEnsaio() {
		return dataEnsaio;
	}


	public void setDataEnsaio(Datebox dataEnsaio) {
		this.dataEnsaio = dataEnsaio;
	}


	public String getObs() {
		return obs;
	}


	public void setObs(String obs) {
		this.obs = obs;
	}


	public int getQtdHoras() {
		return qtdHoras;
	}


	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Ensaio [id=" + id + ", NomeBanda=" + NomeBanda + ", dataCriacao=" + dataCriacao + ", dataEnsaio="
				+ dataEnsaio + ", obs=" + obs + ", qtdHoras=" + qtdHoras + "]";
	}
	
	
	
}
