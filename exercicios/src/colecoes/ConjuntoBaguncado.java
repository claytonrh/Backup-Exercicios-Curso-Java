package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		
		// HashSet não aceitam tipos primitivos
		conjunto.add(1.2); // double -> Double (ele vai converter de primitivo p/ objeto
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); // String já é objeto		
		conjunto.add(1); // int -> Interger 
		conjunto.add('x');
		
		System.out.println("Tamanho do conjjunto é: " + conjunto.size() );
		
		conjunto.add("teste");
		
		System.out.println("Tamanho do conjjunto é: " + conjunto.size() );
		// o tamanho do conjunto continuará sendo o mesmo porque ele
											// não aceita repetições.
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		// se ele encontrar algo para remover ele irá retornar verdade, se não falso
		
		System.out.println("Tamanho do conjjunto é: " + conjunto.size() );
		
		System.out.println(conjunto.contains('x') );
		System.out.println(conjunto.contains('X') );
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(conjunto);
		System.out.println(nums);
		
		// conjunto.addAll(nums); união de dois conjuntos, mas não repete dados
		conjunto.retainAll(nums); // neste caso ele reten apenas dados iguais nos dois
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
