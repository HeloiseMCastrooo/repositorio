package Aula_1109;

public class ProdutoPedido {
	///atributos
	public String nome;
	public String preco;
	////construtor
	ProdutoPedido(String nome, String preco){
		this.nome = nome;
		this.preco = preco;
	}
	ProdutoPedido(){
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public String getPreco() {
		return preco;
	}
	
	
}
