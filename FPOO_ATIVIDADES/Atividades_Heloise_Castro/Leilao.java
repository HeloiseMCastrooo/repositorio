package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantidade de lances:");
		int numero = entrada.nextInt();
		int v=0;
		int [] n= {v};
		String c = null; //null = variavel vazia
		String [] n1 = {c};
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Digite o nome");
			String c1 = entrada.next();
			System.out.println("Digite o valor dos lances");
			int lance = entrada.nextInt();
			if (lance > n [0]) {
				n[0] = lance;
				n1[0] = c1;
			}
		}
		
		System.out.printf("O nome do licitante é:%s\n", n1[0]);
		System.out.printf("O valor dado é: %d ", n[0]);
	}

}
