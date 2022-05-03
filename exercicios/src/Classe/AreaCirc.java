package Classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {	
		raio = raioInicial;
	}
	
	double area () {
		return PI * raio * raio;
		// return pi * Math.pow(raio, 2);
		
	}

}
