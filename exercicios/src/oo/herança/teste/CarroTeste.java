package oo.heran�a.teste;

import oo.heran�a.desafio.Civic;
import oo.heran�a.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
						
		Civic c1 = new Civic();		
	//	|"Carro" Tipo Gen�rico| |Civic � o Tipo "Especifico"
	// o meto que ser� chamdo � do tipo mais especifico		
		
		c1.Acelerar();
		System.out.println(c1);
		
		c1.Acelerar();
		System.out.println(c1);
		
		c1.Acelerar();
		System.out.println(c1);
		
		Ferrari f1 = new Ferrari(400);
		f1.ligarTurbo();
		f1.ligarAr();
		f1.desligarAr();
		
		f1.Acelerar();
		f1.Frear();		
		System.out.println(f1);
		
		f1.Acelerar();
		f1.Frear();		
		System.out.println(f1);
		
		f1.Acelerar();
				
		System.out.println(f1);
		
	}

}
