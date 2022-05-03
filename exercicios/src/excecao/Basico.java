package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception excecao) { // try Exception trata de forma gen�rica
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usu�rio");
		}
	
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) { // tratando de forma espec�fica
			System.out.println("Ocorreu o erro: " + e.getMessage());
			// e.printStackTrace(); // imprime em que ponto a exce��o foi gerada
		}	
		
		System.out.println("Fim :) ");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
