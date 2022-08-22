import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import modelo.Aprendiz;
import modelo.DadosAleatorios;
import modelo.Mentor;
import modelo.MentorLider;
import modelo.Modulo;
import modelo.ProcessoSeletivo;
import modelo.Recrutador;
import modelo.Turma;

public class IniciaMovimentoDaCodar {

	public static void main(String[] args) throws ParseException {

		Recrutador recrutadoraHelena = new Recrutador("Helena");
		MentorLider lider = new MentorLider("Vinicius Ueda", DadosAleatorios.conhecimentoDeTodosOsModulos());
		List<Mentor> mentores = DadosAleatorios.geraMentores();
		mentores.add(lider);
		
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(recrutadoraHelena, DadosAleatorios.geraListaCandidatos());
		processoSeletivo.agendamentoDasEntrevistas();
		processoSeletivo.realizaAsEntrevistas();

		Turma turma = new Turma(lider, processoSeletivo.getRecrutador().getAprendizes());
		turma.setMentores(mentores);
		turma.setRecrutadores(recrutadoraHelena);
		
		for (Modulo modulo : lider.getModulos()) {
			lider.passaOProximoModulo(turma);
			
			for (Aprendiz aprendiz : turma.getAprendizes()) {
				for (String conhecimento : modulo.getConhecimento()) {
					aprendiz.absorveConhecimento(conhecimento);
				}
			}
			
			for (String duvida : turma.getListaDuvias()) {
				Mentor mentorDisponivel = turma.getMentores().get(new Random().nextInt(mentores.size()));
				mentorDisponivel.tiraDuvida(duvida, turma);
			}
			
			turma.setListaDuvias(new ArrayList<String>());
		}
		System.out.println("Duvidas da turma" + turma.getListaDuvias().size());
	}
}
