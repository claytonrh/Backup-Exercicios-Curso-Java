package Classe.Desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
		
	}
	
	void comer(Comida comida) {							//novo metodo
		if (comida != null) {
			this.peso += comida.peso;
		}
				
	}
	
	String apresentar() {
		return "Ola eu seou o " + nome + "e tenho " + peso + " Kgs ";  
	}
}
		