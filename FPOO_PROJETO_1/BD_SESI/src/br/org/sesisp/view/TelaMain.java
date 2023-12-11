package br.org.sesisp.view;

import java.util.Iterator;
import java.util.Scanner;

import br.org.sesisp.dao.CrudeDAO;
import br.org.sesisp.model.Aluno;
/*
public class TelaMain {
	

	public static void main(String[] args) {
		//instanciar um objeto aluno
		CrudeDAO inserir_aluno = new CrudeDAO();
		//instanciar um obj aluno
		Aluno aluno1 = new Aluno();
		///////////////////////////////////////////
		aluno1.setNome("José");
		aluno1.setIdade(17);
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome() + "Idade: " + aluno1.getIdade());/////////////////////////////
//////atualizar valores
		aluno1.setNome("José Silva");
		aluno1.setIdade(18);
		aluno1.setRa(1);
		inserir_aluno.update(aluno1);
		System.out.println("Nome: " + aluno1.getNome() + "\nIdade: " + aluno1.getIdade());
		//ler tabela alunos do BD
		System.out.println("lendo a lista...");
		for(Aluno olho : inserir_aluno.read()) {
			System.out.println("Dados do aluno: " +olho.getRa() +" "+ olho.getNome()+" "+  olho.getIdade());
		}
		///escluir dados
		CrudeDAO remover_aluno = new CrudeDAO();
		remover_aluno.delete(1);
		
	}

}*/

/////////////////////////////MENU*********************************************
public class TelaMain {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int escolha;
	do {
	System.out.println("*******************Escolha de Aluno*******************");
	System.out.println("Criar aluno - Digite 1 \nLer aluno - Digite 2 \nAtualizar aluno - Digite 3 \nDeletar aluno - Digite 4");
	escolha = entrada.nextInt();
		//instanciar um objeto aluno
			CrudeDAO inserir_aluno = new CrudeDAO();
			//instanciar um obj aluno
			Aluno aluno1 = new Aluno();	
	switch(escolha) {
	case(1):
		System.out.println("Digite o nome do aluno que será criado: ");
		aluno1.setNome(entrada.next());
		System.out.println("Digite a idade do aluno que será criado: ");
		aluno1.setIdade(entrada.nextInt());
		inserir_aluno.create(aluno1);
		System.out.println("Nome: " + aluno1.getNome() + "\nIdade: " + aluno1.getIdade());
		System.out.println("Aluno Criado!");
			break;
	case(2):
		for (Aluno  olho : inserir_aluno.read()) {
			System.out.println("Nome: "+ olho.getNome() + "\nIdade: " + olho.getIdade());
		}
			break;
	case(3):
		System.out.println("Atualize o aluno de RA: ");
	int raAtualizar = entrada.nextInt();
	entrada.nextLine();
	System.out.println("Atualize o nome do aluno: ");
	String novoNome = entrada.nextLine();
	System.out.println("Atualize a idade do aluno: ");
	int novaIdade = entrada.nextInt();
	entrada.nextLine();
	aluno1.setRa(raAtualizar);
	aluno1.setNome(novoNome);
	aluno1.setIdade(novaIdade);
	System.out.println("Nome: " + aluno1.getNome() + "\nIdade: " + aluno1.getIdade() + "\nRA: " + aluno1.getRa());
	inserir_aluno.update(aluno1);
	break;
		/*System.out.println("Digite o nome do aluno que será atualizado: ");
		aluno1.setNome(entrada.nextLine());
		entrada.nextLine();
		System.out.println("Digite a idade do aluno que será atualizado: ");
		aluno1.setIdade(entrada.nextInt());
		System.out.println("Digite o RA do aluno que será atualizado: ");
		aluno1.setRa(entrada.nextInt());
		inserir_aluno.update(aluno1);
		System.out.println("Aluno atualizado!");*/
	case(4): 
		System.out.println("Digite o RA do aluno que será deletado: ");
		CrudeDAO remover_aluno = new CrudeDAO();
		remover_aluno.delete(entrada.nextInt());
		System.out.println("Aluno deletado!");
			break;
		}
	}while(escolha != 0);
	}
 	
			
			
		
}