package Atividades_Heloise_Castro;

public class Casa {
	///atributos
	private String cor;
	private float preco;
	private float metragem;
	private Sala sala;
	private Quarto quarto;
	///get e set
	public String getCor() {
		return cor;
	}
	public float getPreco() {
		return preco;
	}
	public float getMetragem() {
		return metragem;
	}
	public void setCor(String cor){
		this.cor = cor;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	//////mostrar detalhes/////metodo especial///
	public void mostrarDetalhes() {
		System.out.println("A cor da casa e: " + getCor());
		System.out.println("O preco da casa e: " + getPreco());
		System.out.println("A metragem da casa e: " + getMetragem());
	}
	
}
