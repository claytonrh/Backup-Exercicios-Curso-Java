 package controle;

import java.util.Scanner;

public class SwitchcComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		//switch (nota) {
		//case 10:
		//	conceito = "A";
		//	break;
		//case 9:
		//	conceito = "A";
		//	break;
		
		
		// outra forma de fazer mais enxuta
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: 
		case 5: 
			conceito = "C";
			break;
		case 4: 
		case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0: 
			default:
				conceito = "n�o informado!";				
		}		
		
		System.out.println("Conceito � " + conceito);
		entrada.close();
		
	}

} 
