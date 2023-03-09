package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos;
	private Set<Conteudo> conteudosConcluidos;
	
	public Dev() {
		conteudosInscritos = new LinkedHashSet<>();
		conteudosConcluidos = new LinkedHashSet<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	public void inscreverBootcamp(Bootcamp bootcamp) { }
	
	public void progredir() { }
	
	public void calcularTotalXp() { }

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
