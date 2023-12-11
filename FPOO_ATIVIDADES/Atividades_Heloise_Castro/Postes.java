package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int substituidos = 0;
		int consertados = 0;
		
		for (int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			if (x < 50) {
				substituidos++;
			}
			if (50 <= x && x < 85) {
				consertados++;
			}
		}System.out.println(substituidos + "-----" + consertados);

	}

}
