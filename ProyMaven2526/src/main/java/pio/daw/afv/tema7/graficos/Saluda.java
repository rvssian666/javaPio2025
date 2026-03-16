package pio.daw.afv.tema7.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Saluda {

	public static void main(String[] args) {
		// Crear marco general
		JFrame frame = new JFrame("Saluda GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		// ahora creamos el panel donde iran los componentes
		JPanel panel = new JPanel();
		frame.add(panel);
		ponerComponentes(panel);
		//hacer visible la ventana 
		frame.setVisible(true);

	}

	private static void ponerComponentes(JPanel panel) {
		// Hay que definir un layout , indicamos que colocaremos
		// los componentes manualmente ((null)
		panel.setLayout(null);

		// Etiqueta
		JLabel userLabel = new JLabel("Nombre de Usuario");
		userLabel.setBounds(10, 20, 150, 25);
		panel.add(userLabel);
		// campo de texto
		JTextField userText = new JTextField(20);
		userText.setBounds(150, 20, 130, 25);
		panel.add(userText);

		// crear boton
		JButton saludarBoton = new JButton("Saludar");
		saludarBoton.setBounds(90, 80, 120, 25);
		panel.add(saludarBoton);

		// añadimos el evento

		saludarBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = userText.getText();// leemos el text
				JOptionPane.showMessageDialog(panel, "Hola " + username + " con swing");
			}
		});
	}

}
