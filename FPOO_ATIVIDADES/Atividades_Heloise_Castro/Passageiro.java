package Atividades_Heloise_Castro;

public class Passageiro {
	//atributos
	private String nome;
	private String sobrenome;
	private String email;
	////construtor
	Passageiro(String nome, String sobrenome,  String email){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
	}
	Passageiro(){
		
	}
	//////////////get e set//////////////////
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
