package controle;

public class For4 {
	
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {				// se quiser acessar a variavel i depois é necessário tirar					
			for(int j = 0; j < 10; j++) {			//a delcaração da variavel i de dentro do for e colocar uma linha antes				
				System.out.printf("[%d %d]", i, j);		
				
				
			}
			System.out.println();
		}			
	}
}
