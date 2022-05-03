package controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { // externo é o rotulo da estrutura
			 for (int j = 0; j < 3; j ++) {
				
				if(i == 1) {
					break externo; // aqui chamamos o break especificamente para a estrutura externa 
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println("");	
		
		}
		
		System.out.println("Fim!");
	}

}
