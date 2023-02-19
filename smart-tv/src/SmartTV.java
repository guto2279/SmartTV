
public class SmartTV {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume += 1;
	}
	
	public void diminuirVolume() {
		volume -= 1;
	}
	
	public void aumentarCanal() {
		canal += 1;
	}
	
	public void diminuirCanal() {
		canal -= 1;
	}
	
	
	
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	
	
	
	
	
	
	
	
		
}
