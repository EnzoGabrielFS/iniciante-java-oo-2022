package model;

import java.util.Date;

public class Entrevista extends Evento {

	private Recrutador recrutador;
	
	private Candidato candidato;
	
	public Entrevista(Recrutador recrutador, Candidato candidato, Date dataEHoraMarcada) {
		super("Entrevista com " + candidato.getNome(), dataEHoraMarcada, recrutador);
		this.recrutador = recrutador;
		this.candidato = candidato;
		super.getParticiipantes().add(candidato);
	}

	@Override
	public void executa() {
		recrutador.avaliaCandidato(candidato);
	}
	
}
