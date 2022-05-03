package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {			
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :) ");
		
	}
	// Exceção NÃO cHecada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	// em uma exceção RunTime você não é obrigado a tratar o erro, é opcional
	}	
	
	// Exceção cHecada ou verificada	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!"); 
	//Exception siginifica uma seção checada... 
	//A partir do momento que você coloca o "Throw" você lançou a Exceção...
	//Em uma exceção checada você será obrigado a colocar na assinatura...
	//do método que você lançou essa exceção adcionando o "Throws"
	//Isso eliminará forçará a colocar um Try Catch em algum dos dois métodos 
		
	}	
}

