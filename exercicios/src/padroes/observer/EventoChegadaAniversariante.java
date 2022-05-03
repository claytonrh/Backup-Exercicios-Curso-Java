package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {
	
	private final Date momento;
	
	public EventoChegadaAniversariante(java.util.Date date) {
		this.momento = date;		
	}
	
	public Date getMomento () {
		return momento;
	}
}
