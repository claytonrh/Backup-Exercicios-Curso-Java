package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
				
		String valor1 = "#";				
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor1);
			valor1 += "#";
		}	
		
		//eu fiz 
		
		String valor2 = "$";
		int a = 1;
		int b = 5;
				
		for(int i = a; i <= b; i++) {
			System.out.println(valor2);
			valor2 += "$";
		}
		
		
		// o correto seria fazer
		
		for( String v = "@"; !v.equals("@@@@@@"); v += "@") {
			System.out.println(v);
		}
	}

}
