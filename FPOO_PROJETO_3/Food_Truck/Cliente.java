package Aula_1109;

public class Cliente extends Pessoa{
	//////////atributos/////////////
	private double dinheiro;
///////////////getters e setters//////////////
	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	////////////////////////construtor
	Cliente(double dinheiro, String nome,  int cpf, int telefone, int idade){
		super();
		this.dinheiro = dinheiro;
		super.setNome(nome);
		super.setIdade(idade);
		super.setCpf(cpf);
		super.setTelefone(telefone);
	}
	Cliente(){
		
	}
		
		

}
