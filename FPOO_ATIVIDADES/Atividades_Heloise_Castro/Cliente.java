package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Cliente {
	//atributos
	public String nome;
	public String cpf;
	public int telefone;
	public int idade;
	public float altura;
	public float peso;	

	//metodos
//public String getNome(){
	//return nome;
//}
//public String getCpf() {
	//return cpf;
//}
//public int getTelefone() {
	//return telefone;
//}
//public float getPeso(){
	//return peso;
//}
//public float getAltura() {
	//return altura;
//}
//public int getIdade() {
	//return idade;
//}
///////////////////////metodos logica//////////////////////////////////
	public void Imc(double peso, double altura){
		double imc = peso/(altura*altura);
		System.out.println("o resultado e:" + imc);
		if (imc < 18.5) {
			System.out.println("magreza");
		}else if (imc > 18.5 && imc < 24.9) {
			System.out.println("normal");
		}else if (imc > 25 && imc < 29.9) {
			System.out.println("sobrepeso");
		}

	}
	//calcular peso desejado
	public double CalcularPesoDesejado(double metaPeso) {
		if (peso > metaPeso) {
		return peso - metaPeso;	
		}else 
	return metaPeso - peso;
	}
	
	//imprimir dados
	public void getImprimirdados() {
		System.out.println("cpf:" + cpf);
		System.out.println("nome: " + nome);
		System.out.println("altura: " + altura);
		System.out.println("idade: " + idade);
		System.out.println("telefone: " + telefone);
		System.out.println("peso" + peso);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}