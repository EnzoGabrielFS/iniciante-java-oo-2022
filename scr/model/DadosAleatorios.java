package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DadosAleatorios {

	public static List<Candidato> geraListaCandidatos() {
		List<Candidato> candidados = new ArrayList<Candidato>();
		candidados.add(new Candidato("Luiz"));
		candidados.add(new Candidato("Pedro"));
		candidados.add(new Candidato("Luiz"));
		candidados.add(new Candidato("Cabral"));
		candidados.add(new Candidato("Teodor"));
		candidados.add(new Candidato("Luan"));
		candidados.add(new Candidato("Jair"));
		candidados.add(new Candidato("Fernando"));
		candidados.add(new Candidato("Isaque"));
		candidados.add(new Candidato("João Paulo"));
		return candidados;
	}

	// Usado na classe Recrutador
	public static List<Date> geraDiasEHorariosAleatorios() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		List<Date> dias = new ArrayList<Date>();
		dias.add(format.parse("01/08/2022 09:00"));
		dias.add(format.parse("01/08/2022 09:10"));
		dias.add(format.parse("01/08/2022 10:00"));
		dias.add(format.parse("01/08/2022 10:10"));
		dias.add(format.parse("01/08/2022 11:00"));
		dias.add(format.parse("01/08/2022 11:10"));
		dias.add(format.parse("02/08/2022 12:10"));
		dias.add(format.parse("02/08/2022 13:00"));
		dias.add(format.parse("02/08/2022 13:10"));
		dias.add(format.parse("02/08/2022 14:00"));
		dias.add(format.parse("02/08/2022 14:10"));
		return dias;
	}
	
	public static List<Mentor> geraMentores() {
		
		List<String> todoConhecimento = conhecimentoDeTodosOsModulos();
		
		List<Mentor> mentores = new ArrayList<Mentor>();
		mentores.add(new Mentor("Gabriel", todoConhecimento));
		mentores.add(new Mentor("Camila", todoConhecimento));
		mentores.add(new Mentor("Eduardo Branquinho", todoConhecimento));
		mentores.add(new Mentor("Portiolli", todoConhecimento));
		return mentores;
	}
	
	public static List<String> conhecimentoDeTodosOsModulos() {
		List<String> todoConhecimento = new ArrayList<String>();
		List<Modulo> modulos = geraModulos();
		for (Modulo modulo : modulos)
			for (String conhecimento : modulo.getConhecimento())
				todoConhecimento.add(conhecimento); 
		return todoConhecimento;
	}
	
	public static List<Modulo> geraModulos() {
		List<Modulo> modulos = new ArrayList<Modulo>();
		
		Modulo modulo1 = new Modulo("Introdução a programação");
		modulo1.getConhecimento().add("10 dúvidas de quem quer iniciar na carreira de programação");
		modulo1.getConhecimento().add("Como começar a desenvolver softwares");
		modulo1.getConhecimento().add("Arquitetura de computadores");
		modulo1.getConhecimento().add("Lógica de programação");
		modulo1.getConhecimento().add("Git e Github");
		modulos.add(modulo1);

//		Modulo modulo2 = new Modulo("Front-end");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 1");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 2");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 3");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 4");
//		modulo2.getConhecimento().add("Javascript para Web");
//		modulos.add(modulo2);
//		
//		Modulo modulo3 = new Modulo("Back-end - Java e OO");
//		modulo3.getConhecimento().add("Java JRE e JDK");
//		modulo3.getConhecimento().add("Java OO");
//		modulo3.getConhecimento().add("Java Polimorfismo");
//		modulo3.getConhecimento().add("Java Exceções");
//		modulo3.getConhecimento().add("Clean Code");
//		modulos.add(modulo3);
		
		return modulos;
	}

}
