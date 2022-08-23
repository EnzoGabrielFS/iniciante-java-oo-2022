package model;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	
	private List<String> conhecimento = new ArrayList<String>();
	
	private List<String> duvidas = new ArrayList<String>();
	
	public Pessoa (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(List<String> conhecimento) {
		this.conhecimento = conhecimento;
	}

	public List<String> getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(List<String> duvidas) {
		this.duvidas = duvidas;
	}

}
