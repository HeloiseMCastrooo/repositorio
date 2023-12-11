package Atividades_Heloise_Castro;

public class VasoDecorado extends Vaso {
	public void VasoDecorado() {
		super.getCor();
		super.getTamanho();
		super.getMaterial();
		this.getDecoracao();
	}
	public void VasoDecorado(String decoracao){
		this.decoracao = decoracao;
	}
		
	//atributos
	private String decoracao;
	//metodos getters e setters 
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	public String getDecoracao() {
		return decoracao;
	}

	
		
		
	public void exibirInfo() {
		System.out.println("Decoração: " + decoracao);
	}	
}
