import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.HandsOn;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(5);
		
		Curso curso2 = new Curso("Curso Java Spring Boot", "Descrição do curso de Java Spring Boot", 4);
		
		Curso curso3 = new Curso("Curso AWS", "Descrição do curso de AWS", 7);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Mentoria inicial de Java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria("Mentoria AWS", "Mentoria inicial de AWS", LocalDate.now());
		
		HandsOn handson1 = new HandsOn();
		handson1.setTitulo("Hands On Java Developer");
		handson1.setDescricao("Descrição do Hands On de Java");
		
		HandsOn handson2 = new HandsOn();
		handson2.setTitulo("Hands On AWS");
		handson2.setDescricao("Descrição do Hands On de AWS");
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setDescricao("Bootcamp Java Developer");
		bootcamp1.setDescricao("Bootcamp de desenvolvimento de sistemas utilizando a linguagem Java");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(curso2);
		bootcamp1.getConteudos().add(mentoria1);
		bootcamp1.getConteudos().add(handson1);

		Bootcamp bootcamp2 = new Bootcamp();
		bootcamp2.setDescricao("Bootcamp Cloud AWS");
		bootcamp2.setDescricao("Bootcamp para entender funcionalidades de nuvem com AWS");
		bootcamp2.getConteudos().add(curso3);
		bootcamp2.getConteudos().add(mentoria2);
		bootcamp2.getConteudos().add(handson2);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		System.out.println(mentoria1);
		System.out.println(mentoria2);
		System.out.println(handson1);
		System.out.println(handson2);
		
		System.out.println();
		
		Dev dev1 = new Dev("Fulano Desenvolvedor");
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

		dev1.inscreverBootcamp(bootcamp1);
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev1.progredir();
		System.out.println(dev1);
		System.out.println("Inscrito... " + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		dev2.inscreverBootcamp(bootcamp1);
		System.out.println(dev2);
		System.out.println("Inscrito... " + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());

		System.out.println();

		dev1.progredir();
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

		System.out.println();

		dev1.inscreverBootcamp(bootcamp2);
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
		
		dev1.aprovarHandsOn();
		System.out.println(dev1);
		System.out.println("Inscrito..." + dev1.getConteudosInscritos());
		System.out.println("Concluido... " + dev1.getConteudosConcluidos());

		System.out.println();

		System.out.println(dev2);
		System.out.println("Inscrito..." + dev2.getConteudosInscritos());
		System.out.println("Concluido... " + dev2.getConteudosConcluidos());
	}

}
