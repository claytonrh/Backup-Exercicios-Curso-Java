package controle;

import java.util.Scanner;

public class DesafioDiadaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.print("Digite o dia: ");
		
			String dia = entrada.next();			
			
			//em casos de strings não se usa o == para comparação usa-se a função "equals"
			// quando se pede para o usuario digitar uma string para evitar erro
			// é indicado usar a funcção "equalsIgnoreCase"
			
			if("domingo".equalsIgnoreCase(dia)) { 
				System.out.println("Dia = 1");			
			} else if(dia.equalsIgnoreCase("segunda")) {
				System.out.println("Dia = 2");
			} else if(dia.equalsIgnoreCase("terça") 
					|| dia.equalsIgnoreCase("terca")) {
				System.out.println("Dia = 3");
			} else if(dia.equalsIgnoreCase("quarta")) {
				System.out.println("Dia = 4");			
			} else if(dia.equalsIgnoreCase("quinta")) {
				System.out.println("Dia = 5");
			} else if(dia.equalsIgnoreCase("sexta")) {
				System.out.println("Dia = 6");
			} else if(dia.equalsIgnoreCase("sábado") 
					|| dia.equalsIgnoreCase("sabado")) {
				System.out.println("Dia = 7");
			} else {
				System.out.println("dia inválido");
			}
		
				
		entrada.close();		
	}
}
