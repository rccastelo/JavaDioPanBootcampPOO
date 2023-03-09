package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	private int cargaHoraria;
	
	public Curso() {
		this(null, null, 0);
	}
	
	public Curso(int cargaHoraria) {
		this(null, null, cargaHoraria);
	}

	public Curso(String titulo, String descricao) {
		this(titulo, descricao, 0);
	}
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	public Curso(Curso curso) {
		super(curso);
		
		if (curso != null) {
			this.cargaHoraria = curso.cargaHoraria;
		}
	}

	public int getCargaHoraria() {
		return this.cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso titulo [" + getTitulo() + "] cargaHoraria [" + this.cargaHoraria + "]";// descricao [" + getDescricao() + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + this.cargaHoraria;
	}
	
}
