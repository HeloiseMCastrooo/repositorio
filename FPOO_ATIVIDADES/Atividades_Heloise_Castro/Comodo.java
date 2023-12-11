package Atividades_Heloise_Castro;

public abstract class Comodo {
	//atributos
	private String nome;
	////construtor padrao
	Comodo(){
		super();
	}
	//////construtor com parametros
	Comodo(String nome){
		this.nome = nome;
	}
	///get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
