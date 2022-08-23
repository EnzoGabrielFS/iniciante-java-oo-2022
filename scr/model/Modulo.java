package model;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
	
	private String titulo;

	private List<String> conhecimento = new ArrayList<String>();
	
	public Modulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(List<String> conhecimento) {
		this.conhecimento = conhecimento;
	}
	
	
}
