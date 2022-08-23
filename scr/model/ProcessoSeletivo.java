package model;

import java.util.List;

public class ProcessoSeletivo {

	private Recrutador recrutador;

	private List<Candidato> candidatos;
	
	public ProcessoSeletivo(Recrutador recrutador, List<Candidato> candidatos) {
		this.recrutador = recrutador;
		this.candidatos = candidatos;
	}
	
	//TRATAMENTO DA EXCEPTION: SemDiaDisponivelException
	public void agendamentoDasEntrevistas() {
		for (Candidato candidato : this.candidatos) {
			recrutador.agendaEntrevista(candidato);
		}
	}
	
	public void realizaAsEntrevistas() {
		for (Entrevista entrevista : recrutador.getEntrevistasMarcadas()) {
			entrevista.inicia();
			entrevista.executa();
			entrevista.termina();
		}
	}
	
	public Recrutador getRecrutador() {
		return recrutador;
	}
}
