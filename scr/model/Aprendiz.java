package model;

import java.util.Random;

public class Aprendiz extends Pessoa {
	
	private Turma turma;

	public Aprendiz(Candidato candidato) {
		super(candidato.getNome());
	}
	
	public void absorveConhecimento(String conhecimento) {
		if (new Random().nextBoolean()) {
			super.getConhecimento().add(conhecimento);
			System.out.println("Aprendiz " + this.getNome() + " aprendeu " + conhecimento);
		} else {
			//super.getDuvidas().add(conhecimento);
			this.divulgaDuvidaNaTurma(conhecimento, this.turma);
		}
	}
	
	public void divulgaDuvidaNaTurma(String duvida, Turma turma) {
		turma.compartilhaDuvida(duvida);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
