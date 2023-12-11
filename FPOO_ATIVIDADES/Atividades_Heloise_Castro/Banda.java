package Atividades_Heloise_Castro;

import java.util.List;
import java.util.ArrayList;

public class Banda {
	//atributos
	private String nome;
	private List <MembroBanda> membros;///varios membros
	/////////get e set//////
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	///////////////get e set list//////////
							////?????/////
	////////////??????????????//////////
	//////construtor padrao
	public Banda(String nome) {
		this.nome = nome;
		membros = new ArrayList<>();
	}
	
	/////metodo especial/////
	public void  getAdicionarMembro(){
		System.out.println("add membro");
	}
	public void realizarShow() {
		System.out.println("o show esta acontecendo...");
	}
	
}
