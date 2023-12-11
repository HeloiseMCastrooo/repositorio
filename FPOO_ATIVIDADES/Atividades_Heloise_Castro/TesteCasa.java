package Atividades_Heloise_Castro;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		// teste heranca
		Scanner entrada = new Scanner(System.in);
		/////////////////casa um////////////////
		Casa ca1 = new Casa();
		System.out.println("--------------casa um--------------");
		//sala1
		Sala s1 = new Sala();
		System.out.println("nome da sala:");
		s1.setNome(entrada.next());
		System.out.println("\na casa possui TV? ");
		s1.setTemTV(entrada.nextBoolean());
		//quarto1
		Quarto q1 = new Quarto();
		System.out.println("\nnome do quarto:");
		q1.setNome(entrada.next());
		System.out.println("\nquantas camas tem no quarto? ");
		q1.setNumeroCamas(entrada.nextInt());
		/////////////////casa dois////////////////
		Casa ca2 = new Casa();
		System.out.println("--------------casa dois--------------");
		//sala1
		Sala s2 = new Sala();
		System.out.println("nome da sala:");
		s1.setNome(entrada.next());
		System.out.println("\na casa possui TV? ");
		s1.setTemTV(entrada.nextBoolean());
		//quarto2
		Quarto q2 = new Quarto();
		System.out.println("\nnome do quarto:");
		q2.setNome(entrada.next());
		System.out.println("\nquantas camas tem no quarto? ");
		q2.setNumeroCamas(entrada.nextInt());
	}
}
