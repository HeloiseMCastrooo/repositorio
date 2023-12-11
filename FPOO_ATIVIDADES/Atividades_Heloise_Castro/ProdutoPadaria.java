package Atividades_Heloise_Castro;

public class ProdutoPadaria implements Produto {
	//atributos
	private String nome;
	private double preco;
	//construtores
	ProdutoPadaria(){
		super();
	}
	ProdutoPadaria(String nome, double preco){
		super();
	}

	//getters e setters 
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public double getPreco() {
		
		return preco;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//exibir inf
	public void ExibirInfo(String nome, double preco) {
		System.out.println("Produto: " + getNome());
		System.out.println("Preço: " + getPreco());
	}
	//comer
	public void Comer() {
	System.out.println("hmmmmm que delícia... ");
	}
	
}
	
