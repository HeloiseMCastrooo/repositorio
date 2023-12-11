package Atividades_Heloise_Castro;

import java.util.Scanner;

public class TesteVoo {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		/////dados do passageiro
		Passagem passagem1 = new Passagem();
		Passageiro pessoa1 = new Passageiro(); 
		Voo voo1 = new Voo("123", "Brasil", "Nova York", 100, null, null);
		System.out.println("-----------Dados do passageiro-----------");
		System.out.println("Nome do passageiro: ");
		pessoa1.setNome(entrada.next());
		System.out.println("Sobrenome do passageiro: ");
		pessoa1.setSobrenome(entrada.next());
		System.out.println("E-mail do passageiro: ");
		pessoa1.setEmail(entrada.next());
		System.out.println("Digite 1, 2 ou 3 para escolher sua passagem");
		Voo voo2 = new Voo();
		Voo voo3 = new Voo();
		///////////comprando a passagem//////////////
		int voo = entrada.nextInt();
		switch (voo){
			case (1): 
				System.out.println("voce escolheu a passagem um");
			break;
			case (2): 
				System.out.println("voce escolheu a passagem dois");
			break;
			case (3): 
				System.out.println("voce escolheu a passagem tres");
			break;
			default:
				System.out.println("---------------");
			break;
		
			
		
		
		}	

	}

}
