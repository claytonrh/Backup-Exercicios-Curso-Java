package oo.herança;

public class Heroi extends Jogador {	
//				   |herda|
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	// outra forma de sobescrever o código chamando o método "PAI" com "super"
	
	@Override
	public  boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
		
	}
	
	
	//** ESSA É UMA FORMA DE SOBESCRVER O CÓDIGO ORIGINAL DO QUAL FOI HERDADO**//
// boolean atacar(Jogador oponente) {
//		
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if(deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 10;
//			return true;			
//		}else if (deltaX == 1 && deltaY == 0) {
//			oponente.vida -=10;
//			return true;
//		}else {
//			return false;
//		}			
		
}
