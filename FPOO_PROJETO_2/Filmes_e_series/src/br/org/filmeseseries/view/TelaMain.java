package br.org.filmeseseries.view;
import java.util.Scanner;
import java.util.Iterator;
import br.org.filmeseseries.dao.CrudDAO;
import br.org.filmeseseries.model.Filme;
public class TelaMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha;
		do {
		System.out.println("*******************Escolha de filmes e series*******************");
		System.out.println("Criar filme - Digite 1 \nLer filmes - Digite 2 \nAtualizar filme - Digite 3 \nDeletar filme - Digite 4");
		escolha = entrada.nextInt();
			//instanciar um objeto filme
				CrudDAO inserir_filme = new CrudDAO();
				//instanciar um obj filme
				Filme filme1 = new Filme();	
		switch(escolha) {
		case(1):
			System.out.println("Digite o nome do filme que será criado: ");
			filme1.setTitulo(entrada.next());
			System.out.println("Digite o titulo do filme que será criado: ");
			filme1.setGenero(entrada.nextLine());
			System.out.println("Digite a classificação do filme que será criado: ");
			filme1.setClassificacao(entrada.nextFloat());
			System.out.println("Digite o nome do ator do filme que será criado: ");
			filme1.setAtor(entrada.next());
			inserir_filme.create(filme1);
			System.out.println("Título: " + filme1.getTitulo() + "\n:Genero: " + filme1.getGenero() +  "\nAtor: " + filme1.getAtor() + "\nClassificacao: " + filme1.getClassificacao());
			System.out.println("Filme Criado!");
				break;
		case(2):
			for (Filme  olho : inserir_filme.read()) {
				System.out.println("Titulo: "+ olho.getTitulo() + "\nAtor: " + olho.getAtor() + "\nGenero: " + olho.getGenero() +  "\nClassificacao: " + olho.getClassificacao());
			}
				break;
		case(3):
			System.out.println("Atualize o filme de titulo: ");
		int raAtualizar = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Atualize o filme: ");
		String novoNome = entrada.nextLine();
		////
		System.out.println("Atualize o genero do filme: ");
		String novoG = entrada.nextLine();
		entrada.nextLine();
		/////
		System.out.println("Atualize a classificação do filme: ");
		int novaC = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Atualize o ator do filme: ");
		String novoA = entrada.nextLine();
		entrada.nextLine();
		filme1.setTitulo(novoNome);
		filme1.setGenero(novoG);
		filme1.setClassificacao(novaC);
		filme1.setAtor(novoA);
		System.out.println("Titulo: " + filme1.getTitulo() + "\nClassificacao: " + filme1.getClassificacao() + "\nGenero: " + filme1.getGenero()+ "\nAtor: " + filme1.getAtor());
		inserir_filme.update(filme1);
		break;
		case(4): 
			System.out.println("Digite o titulo do filme que será deletado: ");
			CrudDAO remover_filme = new CrudDAO();
			String ti = entrada.nextLine();
			remover_filme.delete(ti);
			System.out.println("Filme deletado!");
				break;
			}
		}while(escolha != 0);
		}
	 	
}
