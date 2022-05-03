package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeDoAluno(a1);
		} catch(Exception excecao) { // try Exception trata de forma genérica
			System.out.println("Ocorreu um erro no momento "
					+ "de imprimir o nome do usuário");
		}
	
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) { // tratando de forma específica
			System.out.println("Ocorreu o erro: " + e.getMessage());
			// e.printStackTrace(); // imprime em que ponto a exceção foi gerada
		}	
		
		System.out.println("Fim :) ");
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
