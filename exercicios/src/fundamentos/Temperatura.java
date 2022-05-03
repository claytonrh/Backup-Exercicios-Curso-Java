package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		
		final double ajuste = 32;  // isso é uma constante
		double fire = 86; 
		final double multiplicador = 5/9.0; // isso é uma constante
				
		double celcius = ajuste * multiplicador;
		
		System.out.println( ( fire - ajuste ) * multiplicador  );
		
		
		
	}
}
