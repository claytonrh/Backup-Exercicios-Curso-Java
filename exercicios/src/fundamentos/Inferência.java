package fundamentos;

public class Infer�ncia {
	
	public static void main(String[] args) {
	
			double a = 4.5;
			System.out.println( a );
			
			a = 12; // � possivel declarar uma variavel inteira ap�s declarar com pono e virgula, por�m o inverso n�o � poss�vel 
			System.out.println(a);
			
			var b = 4.5;
			System.out.println(b);
			
			
			var c = "text";
			System.out.println(c);
			
			c = "outro texto";
			System.out.println(c );
			
			
	double d; // AQUI A VARIAVEL FOI DECLARADA
	d = 126.65; // AQUI A VARIAVEL FOI INICIALIZADA
	System.out.println(d); // USADA
		
			
	var e = 126.45; // no formato var a declara��o e a incializa��o precisam ser na mesma linha
	System.out.println();
	
	}

}
