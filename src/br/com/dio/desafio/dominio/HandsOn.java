package br.com.dio.desafio.dominio;

public class HandsOn extends Conteudo {
	private String diretorioGitHub;
	private boolean aprovado;
	
	public HandsOn() {
		this(null, null, null);
	}
	
	public HandsOn(String diretorioGitHub) {
		this(null, null, diretorioGitHub);
	}
	
	public HandsOn(String titulo, String descricao) {
		this(titulo, descricao, null);
	}
	
	public HandsOn(String titulo, String descricao, String diretorioGitHub) {
		super.setTitulo(titulo);
		super.setDescricao(descricao);
		this.diretorioGitHub = diretorioGitHub;
	}
	
	public HandsOn(HandsOn handson) {
		super(handson);
		
		if (handson != null) {
			this.aprovado = handson.aprovado;
			this.diretorioGitHub = handson.diretorioGitHub;
		}
	}
	
	public String getDiretorioGitHub() {
		return diretorioGitHub;
	}

	public void setDiretorioGitHub(String diretorioGitHub) {
		this.diretorioGitHub = diretorioGitHub;
	}

	public boolean isAprovado() {
		return this.aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	@Override
	public String toString() {
		return "HandsOn titulo [" + getTitulo() + "] aprovado [" + this.isAprovado() + "]";// descricao [" + getDescricao() + "] diretorioGitHub [" + diretorioGitHub + "]";
	}

	@Override
	public double calcularXp() {
		return this.isAprovado() ? (XP_PADRAO + 50d) : (XP_PADRAO);
	}

}
