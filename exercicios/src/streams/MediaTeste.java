package streams;

public class MediaTeste {
	
	public static void main(String[] args) {

	
		
		System.out.println("Forma 1");
		Media m1 = new Media();
		m1.adicionar(8.3);
		m1.adicionar(6.7);
		System.out.println(m1.getValor());		
		
		System.out.println("\nForma 2");
		
		Media m2 = new Media().adicionar(8.3).adicionar(6.7); 		
		System.out.println(m2.getValor());
		
		System.out.println("\nForma 3");
		Media m3 = new Media().adicionar(7.9).adicionar(6.6);
		
		System.out.println(m1.getValor());
		System.out.println(m3.getValor());
		
		System.out.println(Media.combinar(m1, m3).getValor());
	}

}
