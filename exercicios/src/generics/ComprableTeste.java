package generics;

import java.util.TreeSet;

public class ComprableTeste {
	
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		// TreeSet � utilizado quando vc quer que o resultado venha na ordem
		// Por�m � necess�rio implementar um m�todo Compareble, neste caso n�o
		// foi necess�rio porque o Integer j� tem um m�todo compareble implementado nele mesmo
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}

}
