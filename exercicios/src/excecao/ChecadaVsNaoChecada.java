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
	// Exce��o N�O cHecada ou N�O verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");
	// em uma exce��o RunTime voc� n�o � obrigado a tratar o erro, � opcional
	}	
	
	// Exce��o cHecada ou verificada	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!"); 
	//Exception siginifica uma se��o checada... 
	//A partir do momento que voc� coloca o "Throw" voc� lan�ou a Exce��o...
	//Em uma exce��o checada voc� ser� obrigado a colocar na assinatura...
	//do m�todo que voc� lan�ou essa exce��o adcionando o "Throws"
	//Isso eliminar� for�ar� a colocar um Try Catch em algum dos dois m�todos 
		
	}	
}

