package fundamentos;

public class PrimitivosVsObjetos {

	// tudo em Java é objeto exceto os 8 tipos primitivos

	public static void main(String[] args) {

		String s = new String("texto");
		s.toUpperCase(); // isto é um comportamento criado para o objeto
		System.out.println(s .toUpperCase());

		// tipos primitvos você não consegue criar atributos e comportamentos
		// caso necessite cria atributos e comportamentos em primitivos usa-se Wrapers
		// Wrapers são a versão objeto dos tpos primitvos!!

		int a = 123;
		System.out.println(a);

	}

}
