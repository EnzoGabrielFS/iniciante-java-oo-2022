package model;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private MentorLider lider;
	
	private List<Modulo> modulos = new ArrayList<Modulo>();
	
	private List<Mentor> mentores;
	
	private List<Aprendiz> aprendizes;
	
	private Recrutador recrutador;
	
	private List<String> listaDuvias = new ArrayList<String>();
	
	public Turma(MentorLider lider, List<Aprendiz> aprendizes) {
		this.lider = lider;
		this.aprendizes = aprendizes;
		// Ligação importante para o aprendiz poder lançar suas dúvidas na turma
		realizaVinculoReversoDeAprendizes();
	}
	
	private void realizaVinculoReversoDeAprendizes() {
		for (Aprendiz aprendiz : this.aprendizes)
			aprendiz.setTurma(this);
	}
	
	public void liberaModulo(Modulo modulo) {
		this.modulos.add(modulo);
	}
	
	public int numeroUltimoModulo() {
		return this.modulos.size();
	}
	
	public void compartilhaDuvida(String duvida) {
		this.listaDuvias.add(duvida);
	}
	
	public void compartilhaExplicacao(String explicacao) {
		System.out.println("Compartilha explicação");
	}

	public MentorLider getLider() {
		return lider;
	}

	public void setLider(MentorLider lider) {
		this.lider = lider;
	}

	public List<Mentor> getMentores() {
		return mentores;
	}

	public void setMentores(List<Mentor> mentores) {
		this.mentores = mentores;
	}

	public List<Aprendiz> getAprendizes() {
		return aprendizes;
	}

	public void setAprendizes(List<Aprendiz> aprendizes) {
		this.aprendizes = aprendizes;
	}

	public Recrutador getRecrutadores() {
		return recrutador;
	}

	public void setRecrutadores(Recrutador recrutador) {
		this.recrutador = recrutador;
	}

	public Recrutador getRecrutador() {
		return recrutador;
	}

	public void setRecrutador(Recrutador recrutador) {
		this.recrutador = recrutador;
	}

	public List<String> getListaDuvias() {
		return listaDuvias;
	}

	public void setListaDuvias(List<String> listaDuvias) {
		this.listaDuvias = listaDuvias;
	}
	
	
}
