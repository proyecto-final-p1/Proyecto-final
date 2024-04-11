package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes {

	private JFrame frmClientes;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes window = new Clientes();
					window.frmClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Clientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClientes = new JFrame();
		frmClientes.setTitle("Clientes");
		frmClientes.setBounds(100, 100, 692, 566);
		frmClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmClientes.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Buscar Clientes");
		lblNewLabel.setBounds(39, 35, 82, 14);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 32, 221, 20);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Mostrar todo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(388, 31, 122, 23);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setBounds(561, 464, 89, 23);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar");
		btnNewButton_2.setBounds(50, 464, 89, 23);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setBounds(561, 31, 89, 23);
		layeredPane.add(btnNewButton_3);
		
		table = new JTable();
		table.setBounds(39, 83, 610, 358);
		layeredPane.add(table);
	}
}
