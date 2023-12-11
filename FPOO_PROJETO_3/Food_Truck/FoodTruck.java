package Aula_1109;

public class FoodTruck {
/////atributos
	public String nome;
	public String endereco;
	public Funcionario funcionario; //composicqo
	public String cardapio;
	public int telefone;
	///////////////////construtor
	FoodTruck(){
		
	}
	FoodTruck(String nome, String endereco,   Funcionario funcionario, String cardapio,
			int telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.funcionario = funcionario;
		this.cardapio = cardapio;
		this.telefone = telefone;
	}
	//////getters e setters 
	public String getNome() {
		return  nome;
	}
	public String getEndereco() {
		return endereco;
			}
	public Funcionario getFuncionario() {
		return funcionario;		
	}
	public String getCardapio() {
		return cardapio;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;		
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	///////////////metodo abrir///////
	public void abrir() {
		System.out.println("O FoodTruck esta aberto!");
	}
	////////////metodo fechar//////
	public void fechar() {
		System.out.println("O FoodTruck esta fechado");
	}
	////////////metodo exibir info//////
	public void exibirInfo() {
		System.out.println("Exibindo Informacoes: ");
		////////////////////????????????????????/////////////////////////
	}
}
