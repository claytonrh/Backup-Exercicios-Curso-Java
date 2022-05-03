package generics;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
		CaixaInt CaixaA= new CaixaInt();
		CaixaA.guardar(123);
		
		Integer CoisaA = CaixaA.abrir();
		System.out.println(CoisaA);
		
	}

}
