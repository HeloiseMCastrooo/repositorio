package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("digite o n1:");
		int num1 = entrada.nextInt();
		System.out.println("digite o n2:");
		int num2 = entrada.nextInt();
		int mmc = calcularMMC(num1, num2);
		System.out.println("o MMM de " + num1 + "e" + num2 + "é" + mmc);
	}//fim main
		Scanner entrada = new Scanner(System.in);{
			
		}
		public static int calcularMMC(int num1, int num2) {
			int maior = Math.max(num1, num2);
			int mmc = maior;
			while(true) {
				if(mmc % num1 == 0 && mmc % num2 == 0) {
					break;
				}
				mmc = mmc +maior;
			}
				
		
		
		}

	}


