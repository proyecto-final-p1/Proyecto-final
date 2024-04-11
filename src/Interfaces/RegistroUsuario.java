package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;

public class RegistroUsuario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_7;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroUsuario window = new RegistroUsuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegistroUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 904, 716);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(362, 73, 510, 286);
		layeredPane.add(textPane);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(437, 414, 46, 14);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(502, 411, 169, 20);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar Todo");
		btnNewButton.setBounds(706, 406, 140, 30);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Imagen");
		lblNewLabel_1.setBounds(465, 489, 46, 14);
		layeredPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(544, 481, 160, 30);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Agregar");
		btnNewButton_1.setBounds(737, 485, 89, 23);
		layeredPane.add(btnNewButton_1);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 77, 342, 458);
		layeredPane.add(layeredPane_1);
		
		JLabel lblNewLabel_3 = new JLabel("  id:");
		lblNewLabel_3.setBounds(51, 30, 69, 37);
		layeredPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre:");
		lblNewLabel_4.setBounds(33, 168, 46, 14);
		layeredPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido");
		lblNewLabel_5.setBounds(33, 128, 46, 14);
		layeredPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo:");
		lblNewLabel_6.setBounds(33, 209, 46, 14);
		layeredPane_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Cedula:");
		lblNewLabel_7.setBounds(33, 89, 46, 14);
		layeredPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Usuario:");
		lblNewLabel_8.setBounds(33, 251, 74, 21);
		layeredPane_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Contraseña:");
		lblNewLabel_9.setBounds(32, 302, 75, 21);
		layeredPane_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("Tipo de Ususario:");
		lblNewLabel_11.setBounds(33, 349, 97, 22);
		layeredPane_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Estado:");
		lblNewLabel_12.setBounds(33, 393, 74, 28);
		layeredPane_1.add(lblNewLabel_12);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 38, 86, 20);
		layeredPane_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(147, 298, 144, 28);
		layeredPane_1.add(textField_8);
		textField_8.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Activo");
		chckbxNewCheckBox.setBounds(136, 396, 97, 23);
		layeredPane_1.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 346, 144, 29);
		layeredPane_1.add(comboBox);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(147, 247, 144, 28);
		layeredPane_1.add(textField_7);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(147, 202, 144, 28);
		layeredPane_1.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(144, 161, 144, 28);
		layeredPane_1.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(147, 121, 144, 28);
		layeredPane_1.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(147, 82, 144, 28);
		layeredPane_1.add(textField_6);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(243, 30, 57, 30);
		layeredPane_1.add(btnNewButton_3);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(10, 593, 862, 73);
		layeredPane.add(layeredPane_2);
		
		JButton btnNewButton_2 = new JButton("Nuevo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 11, 112, 51);
		layeredPane_2.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Guardar");
		btnNewButton_2_1.setBounds(148, 11, 112, 51);
		layeredPane_2.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Eliminar");
		btnNewButton_2_2.setBounds(288, 11, 112, 51);
		layeredPane_2.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("Imprimir");
		btnNewButton_2_3.setBounds(422, 11, 112, 51);
		layeredPane_2.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("Regresar");
		btnNewButton_2_4.setBounds(740, 11, 112, 51);
		layeredPane_2.add(btnNewButton_2_4);
		
		JLabel lblNewLabel_2 = new JLabel("Datos de Usuario");
		lblNewLabel_2.setBounds(10, 73, 118, 14);
		layeredPane.add(lblNewLabel_2);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(10, 11, 862, 51);
		layeredPane.add(layeredPane_3);
		
		JLabel lblNewLabel_13 = new JLabel("                     Registro de Usuarios");
		lblNewLabel_13.setToolTipText("");
		lblNewLabel_13.setLabelFor(frame);
		lblNewLabel_13.setBounds(283, 0, 295, 40);
		layeredPane_3.add(lblNewLabel_13);
	}
}
