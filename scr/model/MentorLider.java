package model;

import java.util.List;

public class MentorLider extends Mentor {

	private List<Modulo> modulos = DadosAleatorios.geraModulos();
	
	public MentorLider(String nome, List<String> conhecimento) {
		super(nome, conhecimento);
	}

	public void passaOProximoModulo(Turma turma) {
		int indiceProximoModulo = turma.numeroUltimoModulo();
		Modulo proximoModuloDaTurma = modulos.get(indiceProximoModulo);
		turma.liberaModulo(proximoModuloDaTurma);
	}
	
	public List<Modulo> getModulos() {
		return modulos;
	}
}
