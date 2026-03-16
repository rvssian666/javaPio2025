package pio.daw.afv.tema7.graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LeerAlumnoPioAlex {
	final static String RUTA_FICH="src\\main\\java\\pio\\daw\\afv\\tema7\\graficos";

	public static void main(String[] args) {
		// Crear marco general
				JFrame frame = new JFrame("Datos del alumno");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(330, 330);

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
				JLabel userLabel = new JLabel("DNI:");
				userLabel.setBounds(10, 20, 150, 25);
				panel.add(userLabel);
				// campo de texto
				JTextField fieldDNI = new JTextField(20);
				fieldDNI.setBounds(150, 20, 150, 25);
				panel.add(fieldDNI);
				// Etiqueta name
				JLabel userName = new JLabel("Nombre:");
				userName.setBounds(10, 45, 150, 25);
				panel.add(userName);
				// campo de texto name
				JTextField fieldName = new JTextField(20);
				fieldName.setBounds(150, 45, 150, 25);
				panel.add(fieldName);
				//etiqueta appelido
				JLabel userApellido = new JLabel("Primer Apellido:");
				userApellido.setBounds(10, 70, 150, 25);
				panel.add(userApellido);
				// campo de texto apellido
				JTextField fieldApellido = new JTextField(20);
				fieldApellido.setBounds(150, 70, 150, 25);
				panel.add(fieldApellido);
				//etiqueta 2do apellido
				JLabel userSecondApellido1 = new JLabel("Segundo Apellido:");
				userSecondApellido1.setBounds(10, 95, 150, 25);
				panel.add(userSecondApellido1);
				// campo de texto 2do apellido
				JTextField fielSecondApellido1 = new JTextField(20);
				fielSecondApellido1.setBounds(150, 95, 150, 25);
				panel.add(fielSecondApellido1);
				// --- NIA ---
			    JLabel userNia = new JLabel("NIA:");
			    userNia.setBounds(10, 120, 150, 25);
			    panel.add(userNia);
			    
			    JTextField fieldNia = new JTextField(20);
			    fieldNia.setBounds(150, 120, 150, 25);
			    panel.add(fieldNia);

			    // --- Ciclo ---
			    JLabel userCiclo = new JLabel("Ciclo:");
			    userCiclo.setBounds(10, 145, 150, 25);
			    panel.add(userCiclo);
			    
			    JTextField fieldCiclo = new JTextField(20);
			    fieldCiclo.setBounds(150, 145, 150, 25);
			    panel.add(fieldCiclo);

			    // --- Curso ---
			    JLabel userCurso = new JLabel("Curso:");
			    userCurso.setBounds(10, 170, 150, 25);
			    panel.add(userCurso);
			    
			    JTextField fieldCurso = new JTextField(20);
			    fieldCurso.setBounds(150, 170, 150, 25);
			    panel.add(fieldCurso);

			    JButton btnCreate=new JButton("Crear alumno");
			    btnCreate.setBounds(10, 200, 145, 25);
			    panel.add(btnCreate);
			    
			    btnCreate.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						AlumnoPioAlex al=new AlumnoPioAlex(fieldDNI.getText(),
								fieldName.getText(),
								fieldApellido.getText(), 
								fielSecondApellido1.getText(), 
								fieldNia.getText(),
								fieldCiclo.getText(),
								fieldCurso.getText());
						dataInsert(al);
						
					}
					
				});
				
	}
	public static void dataInsert(AlumnoPioAlex al) {
		
		List<AlumnoPioAlex> alumnos=new ArrayList<>();
		
		
	}

}
