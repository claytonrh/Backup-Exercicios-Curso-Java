package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Obervador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centraliza com a tela do PC
		
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Evento ocorreu!");
				
			}
		});
		// como interfaces não podem ser stanceadas e a função add.Action.Listener
		// é uma Interface Funcional "tem apenas um métodos sem corpo."
		// como você não instancear uma interface o Próprio JAva cria uma classe anonima
		
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!");	// essa é outra forma mais....		
		});											// simples de fazer 	
		janela.setVisible(true);
	}

}
