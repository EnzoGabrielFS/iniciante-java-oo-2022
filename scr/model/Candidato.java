package model;

import java.util.Random;

public class Candidato extends Pessoa {

	public Candidato(String nome) {
		super(nome);
	}
	
	public boolean apresentaCandidatura() {
		return new Random().nextBoolean();
	}

}
