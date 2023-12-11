package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		int V, acougue, farmacia, padaria;
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o valor disponível");
		V = entrada.nextInt();
		
		
		else if (V >= (acougue + farmacia + padaria)); {
			System.out.println("será possível pagar as três contas");
		}
		else if (V >= acougue + farmacia || V >= (acougue + padaria)){
			System.out.println("não será possível pagar as três contas");
		}
		else if (V >= acougue || V> farmacia || V> padaria) {
		    System.out.println("Será possível pagar somente uma conta");
		}
			
			
		
		
	}
}