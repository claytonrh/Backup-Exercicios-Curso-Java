package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Add e Ofer -> adcionam elementos na fila
		// diferen�a � que quando a fila ta cheia add -> error e Offer -> false
				
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("carlos");
		fila.offer("Daniel");
		fila.add("rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o pr�ximo elementos da fila s/ remover.
		// diferen�a � que quando a fila ta vazia peek -> null e element -> false
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpar a fila
		//fila.isEmpty(); verificar se est� vazia
		//fila.contains(....) verificar se determinado elemento est� na fila
		
		
		// chama o proximo elemento da filha removendo 
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.poll()); 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // lan�a uma exece��o dando erro
		
	}

}
