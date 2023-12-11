package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Q1{ 
public static void main(String[] args) {
	int soma = 0;
	boolean int condicao = true;
	int num;
	Scanner entrada = new Scanner(System.in);
	while (condicao) {
		
		int num = entrada.nextInt();
		if(num<=0) {
			
			break;
		}
		soma = soma + num;
	}
	System.out.println("resultado da soma: " + soma);
} 
}



