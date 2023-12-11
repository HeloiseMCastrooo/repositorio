package Atividades_Heloise_Castro;

import java.util.Scanner;

public class Albumdois {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int m = entrada.nextInt();
		Boolean[] ja_tenho = new Boolean[n]; 
		int x = 0;//fig. compradas
		//varrendo o vetor
		for(int i = 0; i < n; i++)
			ja_tenho[i]=false;
		//fig. que ja temos!!!
		for(int i = 0; i < m; i++) {
			x = entrada.nextInt();
			ja_tenho[x]=true;
		}
			int repetidas = 0;
		//vamos marcar as repetidas
			for(int i = 0; i < n; i++)
				if(ja_tenho[i])
					repetidas = repetidas + 1; //ou... repetidas++
		//quantidade de fig. repetidas
			System.out.println("quantidade de fig. repetidas = " + (n - repetidas));
			System.out.println("quantidade de fig. repetidas = " + repetidas);
			System.out.println("tamanho album = " + n);
			System.out.println("quantidade de figurinhas = " + m);

	}

}
