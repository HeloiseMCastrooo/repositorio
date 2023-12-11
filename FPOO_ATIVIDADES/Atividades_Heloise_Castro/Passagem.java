package Atividades_Heloise_Castro;

public class Passagem {
	private Voo voo; 
	private Passageiro passageiro;
	private double precoTotal;
	///////////construtor
	public Passagem(Voo voo, Passageiro passageiro ){
		this.passageiro = pessoa1;
		this.voo = voo;
	}
	public Passagem() {
		
	}
	///////get e set///////////
	public Voo getVoo() {
		return voo;
	}
	public Cliente getPassageiro() {
		return passageiro;
	}
	public double getPrecoTotal() {
		return precoTotal;		
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public void setCliente(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	//////metodo especial////////
	public String toString() {
		System.out.println("Nome do cliente: " + passageiro.getNome());
		System.out.println("Numero do voo: " + voo.getVoo());
		System.out.println("Origem do voo: " + voo.getOrigem());
		System.out.println("Destino do voo: " + voo.getDestino());
		System.out.println("Preco do voo: " + voo.getPreco());
	}
}
