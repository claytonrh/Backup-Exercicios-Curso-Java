package controle;

public class desafioIf {
	
	public static void main(String[] args) {
		
		// o desafio consiste em descobrir onde ta o erro
		
		double nota = 1.3;
		
		if (nota>= 9.0); {										
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � Fera!");
			
			// o bufoi gerado por causa do ponto e virgula ap�s a senten�a If
			// controle n�o s�o finalizados por ponto e virgula (tem uma exce��o)
		}
	}

}
