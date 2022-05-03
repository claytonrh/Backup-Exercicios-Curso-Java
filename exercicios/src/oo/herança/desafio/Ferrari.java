package oo.herança.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	//							| implments siginifca que a classe herda de 
	//							| uma interface.	
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari() {
		this(315);
	}
	
	public Ferrari (int velocidadeMaxima) {
		super (velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
		
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
		return 15;
	}
	//***** AO SOBESCREVER UM METODO VC NÃO PODE 	
		///DIMINUIR O NIVEL DE VISIBILIDADE*****
	
	
//	@Override
//	public void Acelerar() {		
//		velocidadeAtual += 15;		
//	}	

	}
}
