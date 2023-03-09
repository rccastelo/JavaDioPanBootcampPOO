import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(5);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso AWS");
		curso2.setDescricao("Descrição do curso de AWS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria inicial de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setDescricao("Bootcamp Java Developer");
		bootcamp.setDescricao("Bootcamp de desenvolvimento de sistemas utilizando a linguagem Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		System.out.println();
		
		Dev dev1 = new Dev();
		dev1.setNome("Fulano Desenvolvedor");
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());
		
		System.out.println();
		
		Dev dev2 = new Dev();
		dev2.setNome("Ciclano Programador");
		System.out.println(dev2);
		System.out.println("Inscrito..." + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());
		
		System.out.println();

		dev1.inscreverBootcamp(bootcamp);
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev1.progredir();
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev2.inscreverBootcamp(bootcamp);
		System.out.println(dev2);
		System.out.println("Inscrito..." + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());

		System.out.println();

		dev1.progredir();
		dev1.progredir();
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev2.progredir();
		System.out.println(dev2);
		System.out.println("Inscrito..." + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());

		System.out.println();

		dev1.progredir();
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev2.progredir();
		System.out.println(dev2);
		System.out.println("Inscrito..." + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());

	}

}
