package Atividades_Heloise_Castro;

public class SpeedBike implements Veiculo {
	public int velocidade;
	public String marcha;

//construtores
	SpeedBike(){
		
	}
	SpeedBike(int velocidade, int marcha){
		
	}
	/////////////////////////get e set
	@Override
	public void setMudarMarcha(String mudarMarcha) {
		System.out.println("mudando marcha...");
		
	}
	@Override
	public void setAcelerar() {
		System.out.println("acelerando...");
		
	}
	@Override
	public void setFrear() {
		System.out.println("freando...");
		
	}
	@Override
	public String getMudarMarcha() {
		System.out.println("mudando marcha...");
		return marcha;
		
	}
	@Override
	public void getAcelerar() {
		System.out.println("acelerando...");
		
	}
	@Override
	public void getFrear() {
		System.out.println("freando...");
		
	}
	@Override
	public void setSubir() {
		System.out.println("Subindo na bike...");
		
	}
	
	@Override
	public void getSubir() {
		System.out.println("Subindo na bike...");
		

	
	}
}
