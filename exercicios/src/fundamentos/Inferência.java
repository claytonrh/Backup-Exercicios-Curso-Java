package fundamentos;

public class Inferência {
	
	public static void main(String[] args) {
	
			double a = 4.5;
			System.out.println( a );
			
			a = 12; // é possivel declarar uma variavel inteira após declarar com pono e virgula, porém o inverso não é possível 
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
		
			
	var e = 126.45; // no formato var a declaração e a incialização precisam ser na mesma linha
	System.out.println();
	
	}

}
