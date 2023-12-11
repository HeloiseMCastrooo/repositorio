package Aula_1109;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TesteFoodTruck {

	public static void main(String[] args) {
		///////////////criar 3 clientes e 5 produtos
		////////////cliente um///////////////////////////////////
		Scanner entrada = new Scanner(System.in);
		Cliente cliente1 = new Cliente();//tipo de pessoa
		Pessoa pes1 = new Pessoa();
		///////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------CLIENTES---------------------------------------");
		System.out.println("============================Dados do cliente um: ============================");//nome, cpf, tel, idade
		System.out.println("Nome: ");
		pes1.setNome(entrada.next());
		System.out.println("CPF: ");
		pes1.setCpf(entrada.nextInt());
		System.out.println("Telefone: ");
		pes1.setTelefone(entrada.nextInt());
		System.out.println("Idade: ");
		pes1.setIdade(entrada.nextInt());
	////////////cliente dois///////////////////////////////////
		Cliente cliente2 = new Cliente();//tipo de pessoa
		Pessoa pes2 = new Pessoa();
		System.out.println("============================Dados do cliente  dois: ============================");//nome, cpf, tel, idade
		System.out.println("Nome: ");
		pes2.setNome(entrada.next());
		System.out.println("CPF: ");
		pes2.setCpf(entrada.nextInt());
		System.out.println("Telefone: ");
		pes2.setTelefone(entrada.nextInt());
		System.out.println("Idade: ");
		pes2.setIdade(entrada.nextInt());
	////////////cliente tres///////////////////////////////////
		Cliente cliente3 = new Cliente();//tipo de pessoa
		Pessoa pes3 = new Pessoa();
		System.out.println("============================Dados do cliente  tres: ============================");//nome, cpf, tel, idade
		System.out.println("Nome: ");
		pes3.setNome(entrada.next());
		System.out.println("CPF: ");
		pes3.setCpf(entrada.nextInt());
		System.out.println("Telefone: ");
		pes3.setTelefone(entrada.nextInt());
		System.out.println("Idade: ");
		pes3.setIdade(entrada.nextInt());
		/////////funcionarios/////////////////////////////////////
		//////funcionario 1/////////////
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("---------------------------------------FUNCIONARIOS---------------------------------------");
		System.out.println("Nome do Caixa: ");//nome, cpf, tel, idade, cargo, salario
		String fn1 = entrada.next();
		System.out.println("CPF: ");
		int fcpf1 = entrada.nextInt();
		System.out.println("Telefone: ");
		int ft1 = entrada.nextInt();
		System.out.println("Idade: ");
		int fi1 = entrada.nextInt();
		System.out.println("Cargo: ");
		String fc1 = entrada.next();
		System.out.println("Salario: ");
		float fs1 = entrada.nextFloat();
		///////////////////////////////////////////////
		System.out.println("Nome do Cozinheiro: ");//nome, cpf, tel, idade, cargo, salario
		String fn2 = entrada.next();
		System.out.println("CPF: ");
		int fcpf2 = entrada.nextInt();
		System.out.println("Telefone: ");
		int ft2 = entrada.nextInt();
		System.out.println("Idade: ");
		int fi2 = entrada.nextInt();
		System.out.println("Cargo: ");
		String fc2 = entrada.next();
		System.out.println("Salario: ");
		float fs2 = entrada.nextFloat();
		///////////////////////////////////////////////
		System.out.println("Nome do Faxineiro: ");//nome, cpf, tel, idade, cargo, salario
		String fn3 = entrada.next();
		System.out.println("CPF: ");
		int fcpf3 = entrada.nextInt();
		System.out.println("Telefone: ");
		int ft3 = entrada.nextInt();
		System.out.println("Idade: ");
		int fi3 = entrada.nextInt();
		System.out.println("Cargo: ");
		String fc3 = entrada.next();
		System.out.println("Salario: ");
		float fs3 = entrada.nextFloat();
		//////////////////////////////////////////////////////
		System.out.println("Nome do Motoboy: ");//nome, cpf, tel, idade, cargo, salario
		String fn4 = entrada.next();
		System.out.println("CPF: ");
		int fcpf4 = entrada.nextInt();
		System.out.println("Telefone: ");
		int ft4 = entrada.nextInt();
		System.out.println("Idade: ");
		int fi4 = entrada.nextInt();
		System.out.println("Cargo: ");
		String fc4 = entrada.next();
		System.out.println("Salario: ");
		float fs4 = entrada.nextFloat();
		//////inst func/////////////////
		Caixa caixa1 = new Caixa(fn1, fs1, fc1, fcpf1, ft1, fi1);
		Cozinheiro coz1 = new Cozinheiro(fn2, fs2, fc2, fcpf2, ft2, fi2);
		QmLimpa faxineiro = new QmLimpa(fn3, fs3, fc3, fcpf3, ft3, fi3);
		//Motoboy motoboy = new Motoboy(fn4, fs4, fc4, fcpf4, ft4, fi4);
		Motoboy motoboy = new Motoboy(fn4, fcpf4, ft4, fi4, fc4, fs4);
		//////////lista de funcionarios/////////////////
		System.out.println("============================Lista de funcionarios: ============================");
		ArrayList<Funcionario> lista_func = new ArrayList<Funcionario>();
		////add funcionarios
		lista_func.add(caixa1);
		lista_func.add(coz1);
		lista_func.add(faxineiro);
		lista_func.add(motoboy);
		for(Funcionario olho : lista_func) {
			System.out.println("Funcao:" + olho.getNome() + "\nnome: " + olho.getCargo() + "\nCPF: " + olho.getCpf());
		}
		///////////cardapio//////////////
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------CARDAPIO-----------------------------");
		System.out.println("Opcoes de doces veganos/vegetarianos... ");
		System.out.println("Digite 1, 2 ou 3 e scolha seu Doce \n1 - Macaron \n2 - Torta Holandesa \n3 - Brigadeiro ");
		//////doces
		List<ProdutoPedido> lista_pedido = new ArrayList<ProdutoPedido>();
		int doces = entrada.nextInt();
		switch(doces) {
			case(1): System.out.println("Macaron");
			ProdutoPedido p1 = new ProdutoPedido("Macaron", "R$ 6,00");
			lista_pedido.add(p1);
		break;
			case(2): System.out.println("Torta Holandesa");
			ProdutoPedido p2 = new ProdutoPedido("Torta Holandesa", "R$ 58,90");
			lista_pedido.add(p2);
		break;
			case(3): System.out.println("Brigadeiro");
			ProdutoPedido p3 = new ProdutoPedido("Brigadeiro", "R$ 2,00");
			lista_pedido.add(p3);
		break;
					default: System.out.println("---------------");
		break;
		}
		System.out.println("\nAgora escolha uma bebida doce vegana/vegetariana...");
		///////////bebidas doce
		System.out.println("\nOpcoes de bebidas doce...");
		System.out.println("Digite 1, 2 ou 3 e escolha sua bebida doce \n1 - Chocolate quente \n2 - Cereja drink \n3 - Blue drink");
		int bebidasDoce = entrada.nextInt();
		switch(bebidasDoce) {
			case(1): System.out.println("Chocolate quente");
			ProdutoPedido p4 = new ProdutoPedido("Chocolate Quente", "R$ 5,00");
			lista_pedido.add(p4);
		break;
			case(2): System.out.println("Cereja drink");
			ProdutoPedido p5 = new ProdutoPedido("Cereja Drink", "R$ 11,00");
			lista_pedido.add(p5);
		break;
			case(3): System.out.println("Blue drink");
			ProdutoPedido p6 = new ProdutoPedido("Blue Drink", "R$ 12,00");
			lista_pedido.add(p6);
		break;
					default: System.out.println("---------------");
		break;
		}
		///////////pedido//////////////
		System.out.println("\nPedido:");
		for (ProdutoPedido olho : lista_pedido) {
			System.out.println("Item pedido: " + olho.getNome() +"\nPreco: " + olho.getPreco());
		}	
	}

}
