package Aula_1109;

public class Pedido {
	/////atributos
	public String bebida;
	public String doce;
	public float pagamento;
	public float valor;
	public ProdutoPedido produtos;
	public String entregarEmCasa;
	public double tempoDeEntrega;
	//agregação
	////////////construtor
	Pedido(){
		
	}
	Pedido(String bebida, String doce, float pagamento, float valor, String entregarEmCasa,
			double tempoDeEntrega	){
		
	}
///////////////////getters e setters/////////////
	public String getBebida() {
		return bebida;
	}
	public String getDoce() {
		return doce;
	}
	public float getPagamento() {
		return pagamento;
	}
	public float getValor() {
		return valor;
	}
	public String getEntregarEmCasa() {
		return entregarEmCasa;
	}
	public double getTempoDeEntrega() {
		return tempoDeEntrega;
	}
	////////metodo finalizar pedido///////
	public void finalizarPedido() {
		//???????????////
	}

}