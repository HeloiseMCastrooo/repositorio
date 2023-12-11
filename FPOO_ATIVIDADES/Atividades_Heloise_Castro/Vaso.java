package Atividades_Heloise_Castro;

public class Vaso {
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	//metodo construtor
	public void Vaso(){
		System.out.println("vaso---");
	}
	public void Vaso(String cor, double tamanho, String material){
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	//exibir inf vaso final
	public void exibirInfoVaso() {
		System.out.println("cor do vaso:" + cor);
		System.out.println("tamanho do vaso:" + tamanho);
		System.out.println("material do vaso" + material);
		
		
	}
	

//metodos getters e setters 
  public String getCor() {
	  return cor;
  }public double getTamanho() {
	  return tamanho;
  }public String getMaterial() {
	  return material;
  }public void setCor(String cor) {
		this.cor = cor;
  }public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
  }public void setMaterial(String material) {
		this.material = material;
 }
  //exibir info
  public void exibirInfo() {
	  System.out.println("Cor: " + cor);
	  System.out.println("Tamanho: " + tamanho);
	  System.out.println("Material: " + material);
  }
public void setDecoracao(String decoracao) {
	// TODO Auto-generated method stub
	
}
  }