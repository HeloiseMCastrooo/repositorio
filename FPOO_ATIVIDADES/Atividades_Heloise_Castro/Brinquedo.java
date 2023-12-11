package Atividades_Heloise_Castro;

public class Brinquedo {
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	public Brinquedo () {
		
	}
	public Brinquedo (String no, double alt, int cap) {
		this.nome = no;
		this.alturaMinima = alt;
		this.capacidadeMaxima = cap;
	}

	//metodos
public String getNome(){
	return nome;
}
public String setNome() {
	return nome;
}
public double getAlturaminima() {
	return alturaMinima;
}
public double setAlturaminima() {
	return alturaMinima;
}
public int getCapacidademax() {
	return capacidadeMaxima;
}
public int setCapacidademax() {
	return capacidadeMaxima;
}
///////////////////metodos logica///////////////////
//exibir info
public void getExibirinfo() {
	System.out.println("Nome:" + nome);
	System.out.println("Altura Mínima: " + alturaMinima);
	System.out.println("Capacidade Máxima: " + capacidadeMaxima);
}













}

