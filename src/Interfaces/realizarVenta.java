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
import javax.swing.JCheckBox;

public class realizarVenta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable tablaVentas;
	private JTextField textField_13;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					realizarVenta frame = new realizarVenta();
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
	public realizarVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 929, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Realizar Venta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(369, 0, 194, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente:");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1.setBounds(46, 93, 76, 16);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(93, 93, 185, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ruc:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2.setBounds(401, 95, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(444, 93, 129, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Comprobante:");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3.setBounds(46, 258, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 256, 129, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4.setBounds(685, 102, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(657, 125, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(106, 160, 194, 19);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Producto:");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(46, 162, 96, 13);
		contentPane.add(lblNewLabel_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(441, 160, 76, 19);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_3_1 = new JLabel("Stock:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(401, 162, 52, 13);
		contentPane.add(lblNewLabel_3_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(441, 201, 76, 19);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_4_1 = new JLabel("Precio S/:");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(382, 203, 52, 13);
		contentPane.add(lblNewLabel_4_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(441, 256, 96, 19);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_5_1 = new JLabel("Número:");
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5_1.setBounds(369, 258, 82, 13);
		contentPane.add(lblNewLabel_5_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(130, 201, 129, 19);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Concentración:");
		lblNewLabel_5_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5_1_1.setBounds(46, 203, 82, 13);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("CANTIDAD:");
		lblNewLabel_6.setBounds(130, 315, 62, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("TOTAL:");
		lblNewLabel_6_1.setBounds(290, 315, 62, 13);
		contentPane.add(lblNewLabel_6_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(198, 307, 82, 30);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(347, 307, 82, 30);
		contentPane.add(textField_12);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setBounds(796, 68, 96, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Guardar");
		btnNewButton_1_2.setBounds(796, 111, 96, 46);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1 = new JButton("Cancelar");
		btnNewButton_1_2_1.setBounds(796, 155, 96, 46);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Imprimir");
		btnNewButton_1_2_1_1.setBounds(796, 201, 96, 46);
		contentPane.add(btnNewButton_1_2_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 363, 859, 167);
		contentPane.add(scrollPane);
		
		tablaVentas = new JTable();
		tablaVentas.setModel(new DefaultTableModel(
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
		tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(33);
		tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(90);
		tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(108);
		tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(156);
		tablaVentas.getColumnModel().getColumn(4).setPreferredWidth(51);
		tablaVentas.getColumnModel().getColumn(5).setPreferredWidth(49);
		tablaVentas.getColumnModel().getColumn(6).setPreferredWidth(58);
		scrollPane.setViewportView(tablaVentas);
		
		JLabel lblNewLabel_4_2 = new JLabel("Serie");
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(688, 160, 45, 13);
		contentPane.add(lblNewLabel_4_2);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(671, 184, 62, 19);
		contentPane.add(textField_13);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cambiar");
		chckbxNewCheckBox.setBounds(671, 214, 82, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Importe");
		btnNewButton_1_2_1_1_1.setBounds(46, 285, 76, 68);
		contentPane.add(btnNewButton_1_2_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Nuevo");
		btnNewButton_1_1.setBounds(465, 303, 98, 37);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Nuevo");
		btnNewButton_1_1_1.setBounds(571, 303, 96, 37);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Nuevo");
		btnNewButton_1_1_2.setBounds(677, 303, 96, 37);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("Nuevo");
		btnNewButton_1_1_3.setBounds(783, 303, 96, 37);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(260, 255, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(304, 159, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("VALOR VENTA");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(347, 577, 82, 16);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(336, 603, 96, 31);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DESCUENTO");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(469, 577, 82, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(458, 603, 96, 31);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("SUB TOTAL");
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(582, 577, 82, 16);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(571, 603, 96, 31);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("I.G.V");
		lblNewLabel_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1_3.setBounds(701, 577, 82, 16);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(690, 603, 96, 31);
		contentPane.add(textField_15);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("TOTAL A PAGAR");
		lblNewLabel_1_1_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_1_1_4.setBounds(796, 577, 93, 16);
		contentPane.add(lblNewLabel_1_1_4);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(796, 603, 96, 31);
		contentPane.add(textField_16);
	}
}