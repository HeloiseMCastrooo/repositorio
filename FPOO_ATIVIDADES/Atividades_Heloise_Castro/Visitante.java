package Atividades_Heloise_Castro;

public class Visitante {
	//atributos
		private String nome;
		private int idade;
		private float altura;
		//////////////////////////////////////
		
		public Visitante(String no, float alt, int ida) {
			this.nome = no;
			this.altura = alt;
			this.idade = ida;
		}
		//metodos
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public int getAltura() {
	return (int) altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
//////////////////////////////////metodos logica///////////////////////////
public boolean podeAndarNoBrinquedo() {
	if (altura >= 1.55 && idade >= 12 == true) {
		System.out.println("Pode andar no brinquedo");
	}return false;
}








}