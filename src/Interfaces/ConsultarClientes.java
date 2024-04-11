package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class ConsultarClientes  {

	private JFrame frmConsurtarClientes;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarClientes window = new ConsultarClientes();
					window.frmConsurtarClientes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsultarClientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsurtarClientes = new JFrame();
		frmConsurtarClientes.setTitle("Consurtar Clientes");
		frmConsurtarClientes.setBounds(100, 100, 895, 608);
		frmConsurtarClientes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmConsurtarClientes.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 11, 864, 150);
		layeredPane.add(layeredPane_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mostrar clientes por Genero:");
		rdbtnNewRadioButton.setBounds(84, 19, 186, 23);
		layeredPane_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Buscar crientes por DNI: ");
		rdbtnNewRadioButton_1.setBounds(84, 53, 166, 23);
		layeredPane_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Buscar Clientes por RUC:");
		rdbtnNewRadioButton_2.setBounds(84, 89, 186, 23);
		layeredPane_1.add(rdbtnNewRadioButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(293, 19, 109, 23);
		layeredPane_1.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(293, 54, 133, 20);
		layeredPane_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(293, 90, 135, 20);
		layeredPane_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(481, 40, 109, 48);
		layeredPane_1.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Mostrar Todos los Clientes");
		rdbtnNewRadioButton_3.setBounds(637, 53, 221, 23);
		layeredPane_1.add(rdbtnNewRadioButton_3);
		
		table = new JTable();
		table.setBounds(20, 172, 832, 328);
		layeredPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Cantidad de registros:");
		lblNewLabel.setBounds(259, 526, 144, 14);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(423, 523, 109, 20);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(713, 511, 90, 44);
		layeredPane.add(btnNewButton);
	}
}
