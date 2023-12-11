package Atividades_Heloise_Castro;

public class TesteParque {

	public static void main(String[] args) {
		//exibir info visitante1
		Visitante pes1 = new Visitante("Tarciso", 1.78f, 23);
		System.out.println("Nome: " + pes1.getNome());
		//System.out.println("Altura: " + pes1.setAltura());
		System.out.println("Altura: " + pes1.getAltura());
		System.out.println("Idade: " + pes1.getIdade() + " anos");
		//exibir info visitante2 
		Visitante pes2 = new Visitante ("Marcia", 1.63f, 11);
		System.out.println("Nome: " + pes2.getNome());
		System.out.println("Altura: " + pes2.getAltura());
		System.out.println("Idade: " + pes2.getIdade() + " anos");
		//exibir info brinquedo1
		Brinquedo brin1 = new Brinquedo("Carrinho Bate-bate", 1.56, 15);
		System.out.println("Nome: " + brin1.getNome());
		System.out.println("Altura Mínima: " + brin1.getAlturaminima());
		System.out.println("Capacidade Máxima: " + brin1.getCapacidademax() + " pessoas");
		//exibir info brinquedo2
		Brinquedo brin2 = new Brinquedo("Montanha Russa", 1.56f, 20);
		System.out.println("Nome: " + brin2.getNome());
		System.out.println("Altura Mínima: " + brin2.getAlturaminima());
		System.out.println("Capacidade Máxima: " + brin2.getCapacidademax() + " pessoas");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Brinquedo brinquedoum = new Brinquedo();
		//System.out.println("Carrinho bate-bate");
		

	}

}
