package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate data;
	
	public Mentoria() {
		this(null, null, null);
	}
	
	public Mentoria(LocalDate data) {
		this(null, null, data);
	}
	
	public Mentoria(String titulo, String descricao) {
		this(titulo, descricao, null);
	}
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.data = data;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria titulo [" + getTitulo() + "] descricao [" + getDescricao() + "] data [" + data + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}
	
}
