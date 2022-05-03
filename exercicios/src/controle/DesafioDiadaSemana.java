package controle;

import java.util.Scanner;

public class DesafioDiadaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o dia: ");
		
			String dia = entrada.next();			
			
			//em casos de strings n�o se usa o == para compara��o usa-se a fun��o "equals"
			// quando se pede para o usuario digitar uma string para evitar erro
			// � indicado usar a func��o "equalsIgnoreCase"
			
			if("domingo".equalsIgnoreCase(dia)) { 
				System.out.println("Dia = 1");			
			} else if(dia.equalsIgnoreCase("segunda")) {
				System.out.println("Dia = 2");
			} else if(dia.equalsIgnoreCase("ter�a") 
					|| dia.equalsIgnoreCase("terca")) {
				System.out.println("Dia = 3");
			} else if(dia.equalsIgnoreCase("quarta")) {
				System.out.println("Dia = 4");			
			} else if(dia.equalsIgnoreCase("quinta")) {
				System.out.println("Dia = 5");
			} else if(dia.equalsIgnoreCase("sexta")) {
				System.out.println("Dia = 6");
			} else if(dia.equalsIgnoreCase("s�bado") 
					|| dia.equalsIgnoreCase("sabado")) {
				System.out.println("Dia = 7");
			} else {
				System.out.println("dia inv�lido");
			}
		
				
		entrada.close();		
	}
}
