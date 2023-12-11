package Atividades_Heloise_Castro;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TesteBanda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//////////banda1/////////
		///Banda bandaSesi = new Banda();///////////////////
		MembroBanda m1 = new MembroBanda();
		MembroBanda m2 = new MembroBanda();
		MembroBanda m3 = new MembroBanda();
		MembroBanda m4 = new MembroBanda();
		//
		Banda ban = new Banda("ban");
		System.out.println("Nome da banda: " );
		String a = entrada.nextLine();
		ban.setNome(a);
		System.out.println("Digite o nome dos integrantes da banda: ");
		//////////////////////////////////
		String n = entrada.nextLine();
		m1.setNome(n);
		String x = entrada.nextLine();
		m2.setNome(x);
		String y = entrada.nextLine();
		m3.setNome(y);
		String i = entrada.nextLine();
		m4.setNome(i);
		///lista vazia 
		List<MembroBanda> lista_banda = new ArrayList<MembroBanda>();
		//add membros
		lista_banda.add(m1);
		lista_banda.add(m2);
		lista_banda.add(m3);
		lista_banda.add(m4);
		    for(MembroBanda olho : lista_banda) {
	    System.out.println("Membro da banda: " + olho.getNome() );
	  } ban.getAdicionarMembro();
	    ban.realizarShow();

	}

}
