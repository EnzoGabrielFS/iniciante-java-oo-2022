package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Evento {

	private String titulo;
	
	private Date dataEHora;
	
	private Organizador organizador;
	
	private List<Pessoa> particiipantes = new ArrayList<Pessoa>();
	
	public Evento(String titulo, Date dataEHora, Organizador organizador) {
		this.titulo = titulo;
		this.dataEHora = dataEHora;
		this.organizador = organizador;
	}
	
	public Evento(String titulo, Date dataEHora, Organizador organizador, List<Pessoa> participantes) {
		this(titulo, dataEHora, organizador);
		this.particiipantes = participantes;
	}

	public void inicia() {
		System.out.println("Evento " + this.titulo + " iniciado");
	}
	
	public abstract void executa();
	
	public void termina() {
		System.out.println("Evento " + this.titulo + " finalizado");
	}
	
	// ######## GETTERS E SETTERS
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Date getDataEHora() {
		return dataEHora;
	}
	
	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}
	
	public Organizador getOrganizador() {
		return organizador;
	}
	
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}
	
	public List<Pessoa> getParticiipantes() {
		return particiipantes;
	}
	
	public void adicionaParticipante(Pessoa participante) {
		this.particiipantes.add(participante);
	}
	
	public void removeParticipante(Pessoa participante) {
		this.particiipantes.remove(participante);
	}
	
}
