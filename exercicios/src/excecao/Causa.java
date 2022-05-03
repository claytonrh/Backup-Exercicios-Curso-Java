package excecao;

public class Causa {

	public static void main(String[] args) {
	
		try {
			metodoA(null);
		} catch (Exception e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {			
			throw new IllegalArgumentException(causa); 
		// dentro do Catch é possivel lançar uma nova exceçõa checada ou ñ
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException
			("Aluno está NUUUULLOOOO....");
		}
		
		System.out.println(aluno.nome);
	
	}
}
