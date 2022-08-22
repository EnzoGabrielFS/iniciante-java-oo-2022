import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Aprendiz;
import model.DadosAleatorios;
import model.Mentor;
import model.MentorLider;
import model.Modulo;
import model.ProcessoSeletivo;
import model.Recrutador;
import model.Turma;

public class IniciaMovimentoDaCodar {

	public static void main(String[] args) throws ParseException {

		Recrutador recrutadoraJessica = new Recrutador("Jessica Cestaro");
		MentorLider lider = new MentorLider("Vinicius Ueda", DadosAleatorios.conhecimentoDeTodosOsModulos());
		List<Mentor> mentores = DadosAleatorios.geraMentores();
		mentores.add(lider);
		
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(recrutadoraJessica, DadosAleatorios.geraListaCandidatos());
		processoSeletivo.agendamentoDasEntrevistas();
		processoSeletivo.realizaAsEntrevistas();

		Turma turma = new Turma(lider, processoSeletivo.getRecrutador().getAprendizes());
		turma.setMentores(mentores);
		turma.setRecrutadores(recrutadoraJessica);
		
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
