package model;

import java.util.Random;

public class Candidatos extends Pessoa {

	public Candidatos(String nome) {
		super(nome);
	}
	
	public boolean apresentaCandidaturas() {
		return new Random().nextBoolean();
	}

}
