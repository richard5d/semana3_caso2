package semana3jueves;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class V1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Nombre :");
		lblNewLabel.setBounds(30, 42, 49, 14);
		contentPane.add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(82, 40, 160, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(264, 38, 89, 23);
		contentPane.add(btnAgregar);
		
		JButton btnCambio4 = new JButton("Cambio4");
		btnCambio4.setBounds(264, 77, 89, 23);
		contentPane.add(btnCambio4);
		
		
		//CAMBIOS ABAJO:
		//CON CAMBIOS SE AGREGO TEXTAREA:
		JTextArea textAreaParaCommit = new JTextArea();
		textAreaParaCommit.setText("paraCommit");
		textAreaParaCommit.setBounds(30, 114, 349, 138);
		contentPane.add(textAreaParaCommit);
		
		JButton btnParaCommit = new JButton("BOTON ULTIMO");
		btnParaCommit.setBounds(30, 77, 121, 23);
		contentPane.add(btnParaCommit);
		
		//AGREGANDO UN BOTON :
	}
}
