 package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
	
		
//		Essa inteface funcional n�o recebe nenhum par�merto
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
//			|por n�o receber nenhum par�metro voc� precisa abrir e fechar os ()
				
		System.out.println(umaLista.get());		
	}
}
