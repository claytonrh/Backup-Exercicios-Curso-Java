package padroes.observer;

public class AniversarioSupresa {
	
	public static void main(String[] args) {
		
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();		
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via Lambida!");
			System.out.println("Ocorrreu em: " + e.getMomento());
		});
		porteiro.monitorar();
	}

}
