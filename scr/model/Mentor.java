package model;

import java.util.List;

public class Mentor extends Pessoa implements Organizador {

	public Mentor(String nome, List<String> conhecimento) {
		super(nome);
		super.setConhecimento(conhecimento);
	}
	
	public void tiraDuvida(String duvida, Turma turma) {
		turma.compartilhaExplicacao(duvida);
		System.out.println("Mentor " + super.getNome() + " tirou dúvida " + duvida + " da turma");
	}
}
