package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
	try {		
		System.err.println(7 / entrada.nextInt());		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("Finnally #01...");		
	}
	
	try {		
		System.err.println(7 / entrada.nextInt());		
	}finally {
		System.out.println("Finnally#02...");
		entrada.close();
	}
	
	System.out.println("Fim!");
	} 

}
