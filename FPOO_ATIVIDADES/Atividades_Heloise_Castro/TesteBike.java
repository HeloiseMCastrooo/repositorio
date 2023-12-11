package Atividades_Heloise_Castro;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Veiculo bike1 = new SpeedBike();
		PessoaBike p1 = new PessoaBike();
		System.out.println("---------Speed Bike--------- ");
		System.out.println("Digite seu nome: ");
		p1.setNome(entrada.nextLine());
		bike1.getAcelerar();
		bike1.getMudarMarcha();
		bike1.getFrear();
		/////////////////////////////////////////////
		Veiculo bike2 = new MountainBike();
		PessoaBike p2 = new PessoaBike();
		System.out.println("---------Mountain Bike---------");
		System.out.println("Digite seu nome:");
		p2.setNome(entrada.nextLine());
		bike2.getAcelerar();
		bike2.getMudarMarcha();
		bike2.getFrear();
		//////////////////////////////////
		Veiculo bike3 = new SpeedBike();
		PessoaBike p3 = new PessoaBike();
		System.out.println("---------Speed Bike--------- ");
		System.out.println("Digite seu nome: ");
		p3.setNome(entrada.nextLine());
		bike3.getAcelerar();
		bike3.getMudarMarcha();
		bike3.getFrear();
		//////////////////////////////////////
		Veiculo bike4 = new MountainBike();
		PessoaBike p4 = new PessoaBike();
		System.out.println("---------Mountain Bike---------");
		System.out.println("Digite seu nome:");
		p4.setNome(entrada.nextLine());
		bike4.getAcelerar();
		bike4.getMudarMarcha();
		bike4.getFrear();
		/////////////////////////////////////////
		
	}
	

}
