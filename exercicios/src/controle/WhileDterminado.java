package controle;

public class WhileDterminado {
	
	public static void main(String[] args) {
		
		int contador = 0;		
		while(contador <= 20) {
			System.out.printf("i = %d\n", contador); // o %d � para mostrar que � um valor inteiro
				contador += 2;		
				
				// APESAR DE FUNCIONAR O MAIS INDICADO PARA ESTRUTURA DE REPETI��O
				// N�O � O WHILE E SIM O "FOR"
		}
		
	}

}
