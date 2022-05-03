package arrays;

import java.util.Scanner;

public class Desafio1 {

	//pedir quantas notas deseja informar 
	//dois la�os for
	//primeiro la�o colocar as notas digitadas em um array
	// segundo la�o for vai percorrer todo o array e somar as notas finalizando com a m�dia
	
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);		
					
		System.out.print("quantas notas : ");
		
		int qtdeNotas = entrada.nextInt();
		
		double[] notas = new double[qtdeNotas];		
		
		for (int i = 0; i < notas.length; i++) { // int i � = a zero enquanto i for menor que o total.denotas 
												// v� incluindo um i a mais na m�moria												
			
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();			
		}
		
		double total = 0;			// total vale zero
		for(double nota: notas) {   // variavel nota ser� a quantidade de entradas em notas
			total += nota;			// total soma-se ao resultado da variael nota
		}
		
		double media = total / notas.length;
		System.out.println("A m�dia � " + media + "!");
		
	entrada.close();
	}
		
}
