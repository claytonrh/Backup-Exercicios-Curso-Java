package fundamentos.Operadores;

import java.util.Scanner;

public class TipoStringEqual {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2" .equals(s1));
		
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // ao comparar String nunca usar o operador == e sim a fun��o .equals
		
		entrada.close();
		
		
	}

}
