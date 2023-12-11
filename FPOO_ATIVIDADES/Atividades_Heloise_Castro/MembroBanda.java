package Atividades_Heloise_Castro;

public class MembroBanda {
	////atributos
	public String nome;
	//////get e set/////////
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	////////metodo especial////
	public void tocar() {
		System.out.println("tocando...");
	}
}
