package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (�F - 32) * 5/9 = �C
		
		final double ajuste = 32;  // isso � uma constante
		double fire = 86; 
		final double multiplicador = 5/9.0; // isso � uma constante
				
		double celcius = ajuste * multiplicador;
		
		System.out.println( ( fire - ajuste ) * multiplicador  );
		
		
		
	}
}
