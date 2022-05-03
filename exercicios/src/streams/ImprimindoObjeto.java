package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjeto {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		System.out.println("Usando o foreach...");		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando o Iterator...");
		Iterator<String> it = aprovados.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream...");
		//interface Stream
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //la�o interno 
		//forEach � uma fun��o
		
		// dentro do paradigma funcional parte dos problemas s�o resolvidos...
		// ...internamente pela linguagem
	}
}
