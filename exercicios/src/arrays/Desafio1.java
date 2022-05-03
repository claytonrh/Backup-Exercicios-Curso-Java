package arrays;

import java.util.Scanner;

public class Desafio1 {

	//pedir quantas notas deseja informar 
	//dois laços for
	//primeiro laço colocar as notas digitadas em um array
	// segundo laço for vai percorrer todo o array e somar as notas finalizando com a média
	
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);		
					
		System.out.print("quantas notas : ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];		
		
		for (int i = 0; i < notas.length; i++) { // int i é = a zero enquanto i for menor que o total.denotas 
												// vá incluindo um i a mais na mémoria												
			
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();			
		}
		
		double total = 0;			// total vale zero
		for(double nota: notas) {   // variavel nota será a quantidade de entradas em notas
			total += nota;			// total soma-se ao resultado da variael nota
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media + "!");
		
	entrada.close();
	}
		
}
