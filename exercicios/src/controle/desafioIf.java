package controle;

public class desafioIf {
	
	public static void main(String[] args) {
		
		// o desafio consiste em descobrir onde ta o erro
		
		double nota = 1.3;
		
		if (nota>= 9.0); {										
			System.out.println("Quadro de Honra!");
			System.out.println("Você é Fera!");
			
			// o bufoi gerado por causa do ponto e virgula após a sentença If
			// controle não são finalizados por ponto e virgula (tem uma exceção)
		}
	}

}
