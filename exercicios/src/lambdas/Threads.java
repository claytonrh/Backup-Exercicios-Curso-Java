package lambdas;

public class Threads {
	
	
	public static void main(String[] args) {
		
		// Runnable é uma Interface, você não pode instancear uma Interfaces
		//pois elas definem apenas métodos abstratos 
		Runnable trabalho1  = new Trabalho1();
		Runnable trabalho2  = new Runnable() {
		
			// a forma de instancear a Interface é criado uma classe anonima			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				// como o java entende essa situação ao criar um "new Runnable"
				// ele automaticamente cria uma classe anonima
				for (int i = 0; i <10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {				
					}
				}
			}
		};
		
		Runnable trabalho3 = () -> {
			
			for (int i = 0; i <10; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				} catch (Exception e) {				
				}
			}			
		};
		
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
