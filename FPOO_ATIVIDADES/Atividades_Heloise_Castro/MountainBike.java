package Atividades_Heloise_Castro;

public class MountainBike implements Veiculo{
	public int  velocidade;
	public String marcha;

//construtores
	MountainBike(){
		
	}
		
	MountainBike(int velocidade, int marcha){
		
	}
	/////////////////////////get e set
	@Override
	public void setMudarMarcha(String mudarMarcha) {
		
		
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
	//////metodo especial////////////////////////////////////////////////////////////
	public void estado() {
		if(velocidade > 0) {
			System.out.println("a bicicleta está em movimento");
		}else{
			System.out.println("a bicicleta está parada");
		}
		
	}

	@Override
	public void setSubir() {
		System.out.println("subir na bike...");
		
	}

	@Override
	public void getSubir() {
		System.out.println("subir na bike...");
		
	}
}


