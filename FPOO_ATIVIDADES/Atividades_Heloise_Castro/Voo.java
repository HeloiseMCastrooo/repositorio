package Atividades_Heloise_Castro;

import java.sql.Date;
import java.time.LocalDate;

public class Voo {
	///atributos
	private String voo;
	private String origem;
	private String destino;
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	//////////construtor 
	Voo(String voo, String origem, String destino, double preco,  LocalDate dataIda,  LocalDate dataVolta ){
		this.voo = voo;
		this.origem = origem;
		this.destino = destino;
		this.preco = preco;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
	}
	Voo(){
		
	}
	////get e set
	public String getVoo() {
		return voo;
	}
	public void setVoo(String voo) {
		this.voo = voo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataIda() {
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
		
	
	
}
