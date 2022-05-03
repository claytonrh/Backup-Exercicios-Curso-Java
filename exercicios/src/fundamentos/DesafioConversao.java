package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	// a partir do scaner pegar 3 string, receber os ultimos 3 salario e fazer a média, 
	// as casas decimas precisam funcionar tanto com ponto ou com virgula
	// precisa converter uma string em um valor numerico
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário 1: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("\nDigite o salário 2 : ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("\nDigite o salário 3 : ");
		String salario3 = entrada.next().replace(",", ".");
		
		double entrada1 = Double.parseDouble(salario1);
		double entrada2 = Double.parseDouble(salario2);
		double entrada3 = Double.parseDouble(salario3);
		
		double soma = entrada1 + entrada2 + entrada3;
					
		System.out.println(soma/3);	
						
				
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
				
				
		
				
	}

}
