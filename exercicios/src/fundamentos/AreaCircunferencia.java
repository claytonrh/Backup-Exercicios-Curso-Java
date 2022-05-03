package fundamentos;

public class AreaCircunferencia 
{
	
	// variavel e consntancia
	
	public static void main(String[] args) {
		double raio = 3.4; 
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		//esse  comando significa "imprima uma linha na sida do sistema
		System.out.println(pi * raio * raio);  
		
//outra forma seria	
		
//double area = pi * raio * raio 
//System.out.println(area);
		 
/*	
Caso eu queira impedir que algum valor seja alterado por ou digitado errado como uma forma de 
eliminar a chance de erros bas colocar na frente da variavel a palavra "FINAL" por exemplo (Final double PI)
nesse caso o valor de pi seria sempre o mesmo em todo o código impedindo erros.  
*/		
		raio = 10;
		System.out.println("Area é igual =  " + area);
				
		
	}
}
