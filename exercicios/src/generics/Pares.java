package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares <C extends Number, V>  {

	private final Set <Par<C, V>> itens = new LinkedHashSet<>();
	  // a fun��o Set n�o aceita repeti��es
	
	public void adicionar(C chave, V valor) {
		//if(chave != null) * esta seria a forma mais comum de garantir
//		que o m�todo apenas seja executado se o valor de chave � for null
		if (chave == null) return;  // neste outro exemplo vo manda sair do m�todo			
			
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
			
		itens.add(novoPar);			
	}   
		
		public 	V getValor(C chave) {
			if(chave == null) return null;
			
			Optional<Par<C, V>> parOpcional = itens.stream()
					.filter(par -> chave.equals(par.getChave()))
					.findFirst();
			
			return parOpcional.isPresent()
					? parOpcional.get().getValor() :null;		
		}	
}
	
	
