package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implícita
		System.out.println(a);
		
		float b = (float)1.123456788888; // explícita ou (CAST)
		System.out.println(b);
		
		int c = 340;		// o int vai só até 127
		byte d = (byte) c; // explípcita (CAST) 
	    System.out.println(d);
	    
	    double e = 1.999999;
	    int f = (int) e;
	    System.out.println();
}
	
}
