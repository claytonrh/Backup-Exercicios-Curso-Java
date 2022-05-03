package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor A");
		Double valora = entrada.nextDouble();
		
		System.out.print("Digite o valor B");
		Double valorb = entrada.nextDouble();
		
		System.out.print("Digite o tipo de opera��o que deseja fazer");
		String op = entrada.next();
		
		// logica
		
		double resultado = "+".equals(op) ? valora + valorb : 0; // resultado � igual a : se op for igual a + ent�o valora mais valorb sen�o zero 
		resultado = "-".equals(op) ? valora - valorb : resultado; // resultado � igual a : se op for igual a - ent�o valora menos valorb sen�o resultado da primeira condi��o
		resultado = "*".equals(op) ? valora * valorb : resultado;
		resultado = "/".equals(op) ? valora / valorb : resultado;
		resultado = "%".equals(op) ? valora % valorb : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f",
				valora, op, valorb, resultado );
		
		entrada.close();
		
		
		
				
	}

}
