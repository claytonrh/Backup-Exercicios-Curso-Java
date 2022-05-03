package oo.herança.teste;

import oo.herança.desafio.Civic;
import oo.herança.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
						
		Civic c1 = new Civic();		
	//	|"Carro" Tipo Genérico| |Civic é o Tipo "Especifico"
	// o meto que será chamdo é do tipo mais especifico		
		
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
