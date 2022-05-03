package generics;

import java.util.TreeSet;

public class ComprableTeste {
	
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		// TreeSet é utilizado quando vc quer que o resultado venha na ordem
		// Porém é necessário implementar um método Compareble, neste caso não
		// foi necessário porque o Integer já tem um método compareble implementado nele mesmo
		
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
