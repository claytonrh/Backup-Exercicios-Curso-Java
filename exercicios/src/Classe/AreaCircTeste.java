package Classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio  = 0;
		// a1.pi = 10000;    essa é uma forma de acessar pi mas não é a corerta
		
		AreaCirc a2 = new AreaCirc(5);
		a2.raio = 100; 
		// a2.pi = 0;    essa é uma forma de acessar pi mas não é a corerta
		
		// AreaCirc.pi = 3.1415; é possivel fazer dessa caso na Classe não tenha  
		// o modificador "final static" na frente do atributo
		// é sempre melhor utilizar atributo static
		
		System.out.println(a1.area());	
		
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
}
