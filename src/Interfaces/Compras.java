package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Compras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable tablaCompras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras frame = new Compras();
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
	public Compras() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 929, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Realizar Compra");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(370, 0, 194, 72);
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 926, 72);
		contentPane.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Proveedor:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1.setBounds(46, 93, 76, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(46, 119, 167, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ruc:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2.setBounds(223, 93, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(223, 119, 129, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Comprobante:");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3.setBounds(401, 96, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(401, 119, 129, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4.setBounds(598, 95, 68, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(577, 119, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("No. Compra");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5.setBounds(805, 96, 82, 13);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(791, 119, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Código");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(46, 187, 45, 16);
		contentPane.add(lblNewLabel_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(46, 215, 96, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(46, 270, 194, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Producto:");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(46, 244, 96, 13);
		contentPane.add(lblNewLabel_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(293, 270, 68, 19);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_1 = new JLabel("Stock:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(293, 244, 52, 13);
		contentPane.add(lblNewLabel_3_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(293, 215, 141, 19);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_4_1 = new JLabel("Presentación:");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(293, 189, 85, 13);
		contentPane.add(lblNewLabel_4_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(480, 270, 96, 19);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_5_1 = new JLabel("Costo c/u:");
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5_1.setBounds(480, 244, 82, 13);
		contentPane.add(lblNewLabel_5_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(454, 215, 149, 19);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Concentración:");
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5_1_1.setBounds(479, 189, 82, 13);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("CANTIDAD:");
		lblNewLabel_6.setBounds(46, 319, 62, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("TOTAL:");
		lblNewLabel_6_1.setBounds(206, 319, 62, 13);
		contentPane.add(lblNewLabel_6_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(114, 311, 82, 30);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(279, 311, 82, 30);
		contentPane.add(textField_12);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(384, 305, 90, 40);
		contentPane.add(btnNewButton);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(490, 304, 90, 40);
		contentPane.add(btnEliminar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(590, 305, 90, 40);
		contentPane.add(btnLimpiar);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setBounds(815, 215, 90, 80);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Guardar");
		btnNewButton_1_2.setBounds(815, 296, 90, 80);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Cancelar");
		btnNewButton_1_2_1.setBounds(815, 374, 90, 80);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Imprimir");
		btnNewButton_1_2_1_1.setBounds(815, 454, 90, 80);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Salir");
		btnNewButton_1_2_1_1_1.setBounds(815, 533, 90, 80);
		contentPane.add(btnNewButton_1_2_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 374, 707, 167);
		contentPane.add(scrollPane);
		
		tablaCompras = new JTable();
		tablaCompras.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Producto", "Presentaci\u00F3n", "Descripci\u00F3n", "Cant.", "Precio", "Total"
			}
		));
		tablaCompras.getColumnModel().getColumn(0).setPreferredWidth(33);
		tablaCompras.getColumnModel().getColumn(1).setPreferredWidth(90);
		tablaCompras.getColumnModel().getColumn(2).setPreferredWidth(108);
		tablaCompras.getColumnModel().getColumn(3).setPreferredWidth(156);
		tablaCompras.getColumnModel().getColumn(4).setPreferredWidth(51);
		tablaCompras.getColumnModel().getColumn(5).setPreferredWidth(49);
		tablaCompras.getColumnModel().getColumn(6).setPreferredWidth(58);
		scrollPane.setViewportView(tablaCompras);
	}
}
