package fundamentos;

import javax.swing.JOptionPane;

public class desafiosLogicos {
	
	public static void main(String[] args) {
	
		
		// trabalho ter�a  (V ou F)
		// trabalho quinta (V ou F)
		
		// se os dois trabalho derem certos vai comprar TV50'
		// se apenas um trabalho derem certos vai comprar TV32'
		// independente de os dois ou um der certo v�o tomar sorvete no shoping
		// se nenhum der certo n�o v�o comprar nada e n�o v�o pro shoping
		// criar situa��es relativas ao fato de n�o tomarem sorvete
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Un�rio
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou TV 50\"? " + comprouTV50);
		System.out.println("comprou TV 50\"? " + comprouTV32); 
		System.out.println("comprou TV 50\"? " + comprouSorvete);
		System.out.println("comprou TV 50\"? " + maisSaudavel);
		
		
	}
	
	
	 
	
	

}
