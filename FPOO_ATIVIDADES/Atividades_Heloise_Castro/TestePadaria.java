package Atividades_Heloise_Castro;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in); 
		/////////////////pao/////////
		//produto um
		ProdutoPadaria p1 = new Pao();
		System.out.println("digite o nome do pao: ");
		p1.setNome(entrada.next());
		System.out.println("preço do pao: ");
		p1.setPreco(entrada.nextDouble());
		p1.ExibirInfo(null, 0);
		//produto dois
		ProdutoPadaria p2 = new Pao();
		System.out.println("digite o nome do pao: ");
		p2.setNome(entrada.next());
		System.out.println("preço do pao: ");
		p2.setPreco(entrada.nextDouble());
		p2.ExibirInfo(null, 0);
		///////////////bolo////////////
		//produto um
		ProdutoPadaria b1 = new Bolo();
		System.out.println("digite o nome do bolo: ");
		b1.setNome(entrada.next());
		System.out.println("preço do bolo: ");
		b1.setPreco(entrada.nextDouble());
		b1.ExibirInfo(null, 0);
		//produto dois
		ProdutoPadaria b2 = new Bolo();
		System.out.println("digite o nome do bolo: ");
		b2.setNome(entrada.next());
		System.out.println("preço do pao: ");
		b2.setPreco(entrada.nextDouble());
		b2.ExibirInfo(null, 0);
		////////////Doce///////////////
		//produto um
		ProdutoPadaria d1 = new Doce();
		System.out.println("digite o nome do doce: ");
		d1.setNome(entrada.next());
		System.out.println("preço do doce: ");
		d1.setPreco(entrada.nextDouble());
		d1.ExibirInfo(null, 0);
		//produto dois
		ProdutoPadaria d2 = new Doce();
		System.out.println("digite o nome do doce: ");
		d2.setNome(entrada.next());
		System.out.println("preço do doce: ");
		d2.setPreco(entrada.nextDouble());
		d2.ExibirInfo(null, 0);
		
	    /////////////////////////obs
		System.out.println("hmmmmmmmm...");
		ClientePadaria cliente1 = new ClientePadaria();
		cliente1.setCliente(entrada.next());
		System.out.println(cliente1.getCliente() + "comeu" + p1.getNome() + b1.getNome() + d1.getNome() + d2.getNome());
	}

}
