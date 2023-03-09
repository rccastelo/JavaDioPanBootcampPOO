package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos;
	private Set<Conteudo> conteudosConcluidos;
	
	public Dev() {
		this(null);
	}
	
	public Dev(String nome) {
		this.nome = nome;
		this.conteudosInscritos = new LinkedHashSet<>();
		this.conteudosConcluidos = new LinkedHashSet<>();
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return this.conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return this.conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) {
		for (Conteudo c : bootcamp.getConteudos()) {
			if (c instanceof HandsOn) {
				this.conteudosInscritos.add(new HandsOn((HandsOn)c));
			}
			if (c instanceof Curso) {
				this.conteudosInscritos.add(new Curso((Curso)c));
			}
			if (c instanceof Mentoria) {
				this.conteudosInscritos.add(new Mentoria((Mentoria)c));
			}
		}
		
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() { 
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.out.println("Você não está matriculado em nenhum conteúdo!");
		}
	}
	
	public void aprovarHandsOn() {
		for (Conteudo c : this.conteudosConcluidos) {
			if (c instanceof HandsOn) {
				HandsOn h = (HandsOn) c;
				h.setAprovado(true);
			}
		}
	}
	
	public double calcularTotalXp() { 
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
	}

	@Override
	public String toString() {
		return "Dev nome [" + this.nome + "] xp [" + this.calcularTotalXp() + "] ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(nome, other.nome)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) 
				&& Objects.equals(conteudosConcluidos, other.conteudosConcluidos);
	}
	
}
