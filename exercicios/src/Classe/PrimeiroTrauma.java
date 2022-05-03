package Classe;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui!
	static int b = 4; // aqui foi transformado uma variavel de stancia em algo estatico
	
	
	public static void main(String[] args) { // um membro de classe static consegue acessar outro
											// menbro de outra classe static	
		
		PrimeiroTrauma p = new PrimeiroTrauma();	
			
		System.out.println(p.a);
		
		System.out.println(b); //
		
		// pode mexer aqui 
		
	}

}
