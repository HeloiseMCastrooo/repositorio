package Atividades_Heloise_Castro;

public class Quarto extends Comodo {
	//atributos
	private int numeroCamas;
	///construtor
	Quarto(int numeroCamas, String nome){
		super();
		this.numeroCamas = numeroCamas;
		super.getNome(); 
		}
	//construtor padrao
	Quarto(){
		
	}
	///get e set
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
}
