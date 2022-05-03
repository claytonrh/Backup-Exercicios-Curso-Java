package fundamentos;

public class PrimitivosVsObjetos {

	// tudo em Java � objeto exceto os 8 tipos primitivos

	public static void main(String[] args) {

		String s = new String("texto");
		s.toUpperCase(); // isto � um comportamento criado para o objeto
		System.out.println(s .toUpperCase());

		// tipos primitvos voc� n�o consegue criar atributos e comportamentos
		// caso necessite cria atributos e comportamentos em primitivos usa-se Wrapers
		// Wrapers s�o a vers�o objeto dos tpos primitvos!!

		int a = 123;
		System.out.println(a);

	}

}
