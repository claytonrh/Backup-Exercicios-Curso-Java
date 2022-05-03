package controle;

import java.net.Socket;
import java.util.Scanner;

public class IfElseIf {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if (nota>= 8.1) {
			System.out.println("conteito A");
		} else if (nota>= 6.1) {
			System.out.println("conteito B");
		} else if (nota>= 4.1) {
			System.out.println("conteito C");
		} else if (nota>= 2.1) {
			System.out.println("conteito D");
		} else if (nota>= 8.1) {
			System.out.println("conteito E");
		}
		
		System.out.println("fIM");
		entrada.close();
					
	}

}
