package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recrutador extends Pessoa implements Organizador {
	
	private List<Aprendiz> aprendizes = new ArrayList<Aprendiz>();
	
	private List<Entrevista> entrevistasMarcadas = new ArrayList<Entrevista>();
	
	private List<Date> diasDisponiveis;

	public Recrutador(String nome) throws ParseException {
		super(nome);
		this.diasDisponiveis = DadosAleatorios.geraDiasEHorariosAleatorios();
	}
	
	public void agendaEntrevista(Candidato candidato) {
		Entrevista entrevista = new Entrevista(this, candidato, getProximoDiaDisponivel());
		System.out.println("Entrevista marcada com " + candidato.getNome() + " no dia " + entrevista.getDataEHora());
		this.entrevistasMarcadas.add(entrevista);
	}
	
	public List<Entrevista> getEntrevistasMarcadas() {
		return entrevistasMarcadas;
	}
	
	// INSERIR EXCEPTION: SemDiaDisponivelException
	private Date getProximoDiaDisponivel() {
		if (this.diasDisponiveis.size() > 0) {
			Date diaSelecionado = this.diasDisponiveis.get(0);
			this.diasDisponiveis.remove(0);
			return diaSelecionado;
		}
		return null;
	}
	
	public void avaliaCandidato(Candidato candidato) {
		boolean aprovado = candidato.apresentaCandidatura();
		if (aprovado) {
			aprendizes.add(new Aprendiz(candidato));
			System.out.println("Candidato " + candidato.getNome() + " aprovado");
		}
	}
	
	public List<Aprendiz> getAprendizes() {
		return aprendizes;
	}

}
