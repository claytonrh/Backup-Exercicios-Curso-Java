package oo.heran�a.desafio;

public class Carro {	
	// atributo velocidade atual
	// metodo acelerar de 5 em 5
	// metodo frear 5 em 5
	// velocidade n�o pode ser menor que zero
	// criar uma quarta classe com o m�todo main para estanciar o carro
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void Acelerar() {		
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) { 
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();		
		}
		
	}

	public void Frear() {	
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
		velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual � " + velocidadeAtual + "Km/h";				
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
