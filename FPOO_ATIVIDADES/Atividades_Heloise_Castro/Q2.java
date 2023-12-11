package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int menor = 4;
		int numero;
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite numeros positivos e negativos");
		boolean primeiro_numero = true;
		while (true) {
					numero = entrada.nextInt();
					if (numero ==0)
						break;
				}
				if(primeiro_numero) {
					menor = numero;
					primeiro_numero = false;					
				}
				else if(numero < menor) {
					menor = numero;
				}
	}//fim while
		if(primeiro_numero) {
			System.out.println("nenhum numero foi digitado");
			}
		else {
			System.out.println("o menor numero foi: " + menor);
		}//fim main
	} //fim classe

	















