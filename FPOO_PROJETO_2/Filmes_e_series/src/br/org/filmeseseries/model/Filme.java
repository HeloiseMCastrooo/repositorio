package br.org.filmeseseries.model;

public class Filme {
	private String titulo;
	private String genero;
	private float classificacao;
	private String ator;
	///construtor
	public Filme(){		
	}
	//construtor com parametros
	public Filme(String titulo, String genero, float classificacao, String ator) {
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setClassificacao(classificacao);
		this.setAtor(ator);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(float classificacao) {
		this.classificacao = classificacao;
	}
	public String getAtor() {
		return ator;
	}
	public void setAtor(String ator) {
		this.ator = ator;
	}
}