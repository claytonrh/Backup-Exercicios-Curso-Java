package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor A");
		Double valora = entrada.nextDouble();
		
		System.out.print("Digite o valor B");
		Double valorb = entrada.nextDouble();
		
		System.out.print("Digite o tipo de operação que deseja fazer");
		String op = entrada.next();
		
		// logica
		
		double resultado = "+".equals(op) ? valora + valorb : 0; // resultado é igual a : se op for igual a + então valora mais valorb senão zero 
		resultado = "-".equals(op) ? valora - valorb : resultado; // resultado é igual a : se op for igual a - então valora menos valorb senão resultado da primeira condição
		resultado = "*".equals(op) ? valora * valorb : resultado;
		resultado = "/".equals(op) ? valora / valorb : resultado;
		resultado = "%".equals(op) ? valora % valorb : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				valora, op, valorb, resultado );
		
		entrada.close();
		
		
		
				
	}

}
