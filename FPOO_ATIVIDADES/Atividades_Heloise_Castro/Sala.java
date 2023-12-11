package Atividades_Heloise_Castro;

public class Sala extends Comodo {
	//atributos
	private boolean temTV;
	////construtor
	Sala(boolean temTV, String nome, boolean temTV1){
		super();
		super.setNome(nome);
		this.temTV = temTV1;
	}
	//construtor padrao
	Sala(){
		
	}
	///get
	public boolean getTemTV() {
		return temTV;
	}
	public void setTemTV(boolean temTV){
		if(temTV == true) {
			System.out.println("tem TV na sala");
		}else {
			System.out.println("nao tem TV na sala");
		}
	} 
}

