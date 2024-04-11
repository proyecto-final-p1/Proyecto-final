package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JRadioButton;

public class Proveedores {

	private JFrame frmProveedores;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proveedores window = new Proveedores();
					window.frmProveedores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proveedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProveedores = new JFrame();
		frmProveedores.setTitle("Proveedores");
		frmProveedores.setBounds(100, 100, 940, 705);
		frmProveedores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmProveedores.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBounds(785, 24, 104, 81);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBounds(785, 116, 104, 81);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Modificar");
		btnNewButton_2.setBounds(785, 208, 104, 81);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancelar");
		btnNewButton_3.setBounds(785, 300, 104, 81);
		layeredPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Eliminar");
		btnNewButton_4.setBounds(785, 392, 104, 81);
		layeredPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Vorlver");
		btnNewButton_5.setBounds(785, 484, 104, 81);
		layeredPane.add(btnNewButton_5);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 11, 765, 644);
		layeredPane.add(layeredPane_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 745, 622);
		layeredPane_1.add(tabbedPane);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setToolTipText("Buscar");
		tabbedPane.addTab("  Buscar      ", null, layeredPane_2, null);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBounds(10, 11, 720, 163);
		layeredPane_2.add(layeredPane_4);
		
		JLabel lblNewLabel = new JLabel("Buscar Proveedor");
		lblNewLabel.setBounds(10, 0, 96, 26);
		layeredPane_4.add(lblNewLabel);
		
		JButton btnNewButton_6 = new JButton("Reporte");
		btnNewButton_6.setBounds(513, 39, 129, 63);
		layeredPane_4.add(btnNewButton_6);
		
		textField = new JTextField();
		textField.setBounds(38, 49, 431, 32);
		layeredPane_4.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 173, 720, 410);
		layeredPane_2.add(table);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("  Nuevo Proveedor  ", null, layeredPane_3, null);
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		layeredPane_5.setBounds(10, 11, 727, 590);
		layeredPane_3.add(layeredPane_5);
		
		JLabel lblNewLabel_1 = new JLabel("ID ");
		lblNewLabel_1.setBounds(57, 56, 40, 20);
		layeredPane_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(41, 108, 67, 17);
		layeredPane_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RUC:");
		lblNewLabel_3.setBounds(51, 169, 46, 14);
		layeredPane_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DNI:");
		lblNewLabel_4.setBounds(376, 169, 46, 14);
		layeredPane_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion:");
		lblNewLabel_5.setBounds(41, 235, 67, 14);
		layeredPane_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono:");
		lblNewLabel_6.setBounds(41, 302, 46, 14);
		layeredPane_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setBounds(376, 302, 46, 14);
		layeredPane_5.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Banca de Referencia:");
		lblNewLabel_8.setBounds(40, 383, 122, 14);
		layeredPane_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nº Cuenta:");
		lblNewLabel_9.setBounds(376, 383, 75, 14);
		layeredPane_5.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Estado:");
		lblNewLabel_10.setBounds(57, 477, 56, 17);
		layeredPane_5.add(lblNewLabel_10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Activo");
		rdbtnNewRadioButton.setBounds(172, 467, 122, 36);
		layeredPane_5.add(rdbtnNewRadioButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 56, 225, 20);
		layeredPane_5.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 106, 357, 20);
		layeredPane_5.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 166, 170, 20);
		layeredPane_5.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(456, 166, 204, 20);
		layeredPane_5.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(156, 232, 357, 20);
		layeredPane_5.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(156, 299, 170, 20);
		layeredPane_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(461, 299, 199, 20);
		layeredPane_5.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(172, 380, 170, 20);
		layeredPane_5.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(461, 380, 199, 20);
		layeredPane_5.add(textField_9);
		
		JLabel lblNewLabel_11 = new JLabel("*Campos Obligatorios");
		lblNewLabel_11.setBounds(549, 522, 148, 36);
		layeredPane_5.add(lblNewLabel_11);
	}
}
