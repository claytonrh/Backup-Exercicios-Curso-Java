 package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
	
		
//		Essa inteface funcional não recebe nenhum parâmerto
		Supplier<List<String>> umaLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
//			|por não receber nenhum parâmetro você precisa abrir e fechar os ()
				
		System.out.println(umaLista.get());		
	}
}
