package controle;

public class WhileDterminado {
	
	public static void main(String[] args) {
		
		int contador = 0;		
		while(contador <= 20) {
			System.out.printf("i = %d\n", contador); // o %d é para mostrar que é um valor inteiro
				contador += 2;		
				
				// APESAR DE FUNCIONAR O MAIS INDICADO PARA ESTRUTURA DE REPETIÇÃO
				// NÃO É O WHILE E SIM O "FOR"
		}
		
	}

}
