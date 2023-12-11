package Aula_1109;

public class Pessoa {
	/////atributos//////////
	private String nome;
	private int cpf;
	private int telefone;
	private int idade;
	//////////////construtor
	 Pessoa() {
		
	}
	 Pessoa(String nome,  int cpf, int telefone, int idade) {
		this.nome = nome;
		this.cpf =cpf;
		this.telefone = telefone;
		this.idade = idade;
	}
	/////////////getters e setters 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
