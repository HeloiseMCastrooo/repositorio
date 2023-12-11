package Atividades_Heloise_Castro;

import java.util.Scanner;

import Aula_2308.Animal1;
import Aula_2308.Cachorro;
import Aula_2308.Gato1;

public class TesteVaso {

	public static void main(String[] args) {
		// exibir info - va1
		Scanner entrada = new Scanner(System.in);
		Vaso va1 = new Vaso();
		System.out.println("cor:");
		String cor = entrada.next();
		va1.setCor(cor);
		System.out.println("Tamanho:");
		Double tamanho = entrada.nextDouble();
		va1.setTamanho(tamanho);
		System.out.println("Material:");
		String material = entrada.next();
		va1.setMaterial(material);
		//exibir info
		System.out.println("------Informacoes va1------");
		System.out.println("Cor:" + va1.getCor());
		System.out.println("Tamanho:" + va1.getTamanho());
		System.out.println("Material:" + va1.getMaterial());
		//exibir info v2
		Vaso va2 = new Vaso();
		System.out.println("cor:");
		String cor2 = entrada.next();
		va2.setCor(cor);
		System.out.println("Tamanho:");
		Double tamanho2 = entrada.nextDouble();
		va2.setTamanho(tamanho);
		System.out.println("Material:");
		String material2 = entrada.next();
		va2.setMaterial(material);
		//exibir info
		System.out.println("------Informacoes va2------");
		System.out.println("Cor:" + va2.getCor());
		System.out.println("Tamanho:" + va2.getTamanho());
		System.out.println("Material:" + va2.getMaterial());
		//vaso decorado 1
		VasoDecorado vadec = new VasoDecorado();
		System.out.println("cor:");
		String cord = entrada.next();
		vadec.setCor(cor);
		System.out.println("Tamanho:");
		Double tamanhod = entrada.nextDouble();
		vadec.setTamanho(tamanho);
		System.out.println("Material:");
		String materiald = entrada.next();
		vadec.setMaterial(material);
		System.out.println("Decoracao:");
		String decoracao = entrada.next();
		vadec.setDecoracao(decoracao);
		//exibir inf
		System.out.println("------Informacoes vadec1------");
		System.out.println("Cor:" + vadec.getCor());
		System.out.println("Tamanho:" + vadec.getTamanho());
		System.out.println("Material:" + vadec.getMaterial());
		System.out.println("Decoracao:" + vadec.getDecoracao());
		//vaso decorado 2
		VasoDecorado vadec2 = new VasoDecorado();
		System.out.println("cor:");
		String cord2 = entrada.next();
		vadec2.setCor(cor);
		System.out.println("Tamanho:");
		Double tamanhod2 = entrada.nextDouble();
		vadec2.setTamanho(tamanho);
		System.out.println("Material:");
		String materiald2 = entrada.next();
		vadec2.setMaterial(material);
		System.out.println("Decoracao:");
		String decoracao2 = entrada.next();
		vadec2.setDecoracao(decoracao);
		System.out.println("------Informacoes vadec2------");
		System.out.println("Cor:" + vadec2.getCor());
		System.out.println("Tamanho:" + vadec2.getTamanho());
		System.out.println("Material:" + vadec2.getMaterial());
		System.out.println("Decoracao:" + vadec2.getDecoracao());
		
		
		//array list
		/*ArrayList <Vaso> vasos = new ArrayList<>();
		for(int i = 0; i < 2; i++) {
			System.out.println("digite o nome do vaso"+ (i + 1) + ": ");
			String nome = entrada.nextLine();
			System.out.println("escolha o tipo de vaso" + ("vaso simples ou vaso decorado"));
			String  tipo = entrada.nextLine();
			Vaso vasoSimples;
			if (tipo.equalsIgnoreCase("Vaso simples")) {
				vasoSimples = new Vaso(vaso);
				}else if(tipo.equalsIgnoreCase("Vaso decorado")) {
					Vaso4 = new vaso(nome);
				}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}	
}