package Interfaces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JTextField textCliente;
	private JTextField textRuc;
	private JTextField textComprobante;
	private JTextField textFecha;
	private JTextField textProducto;
	private JTextField textStock;
	private JTextField textPrecio;
	private JTextField textNumero;
	private JTextField textConcentracion;
	private JTextField textCantidad;
	private JTextField textTotal;
	private JTable tablaVentas;
	private JTextField textSerie;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	private static final String URL = "jdbc:mysql://localhost:3306/farmacia";
    private static final String USER = "root";
    private static final String PASSWORD = "Hansellbp123,";
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
		
		textCliente = new JTextField();
		textCliente.setBounds(93, 93, 185, 19);
		contentPane.add(textCliente);
		textCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ruc:");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2.setBounds(401, 95, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		textRuc = new JTextField();
		textRuc.setBounds(444, 93, 129, 19);
		contentPane.add(textRuc);
		textRuc.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Comprobante:");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3.setBounds(46, 258, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		textComprobante = new JTextField();
		textComprobante.setBounds(130, 256, 129, 19);
		contentPane.add(textComprobante);
		textComprobante.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4.setBounds(685, 102, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		textFecha = new JTextField();
		textFecha.setBounds(657, 125, 96, 19);
		contentPane.add(textFecha);
		textFecha.setColumns(10);
		
		textProducto = new JTextField();
		textProducto.setColumns(10);
		textProducto.setBounds(106, 160, 194, 19);
		contentPane.add(textProducto);
		
		JLabel lblNewLabel_2_1 = new JLabel("Producto:");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(46, 162, 96, 13);
		contentPane.add(lblNewLabel_2_1);
		
		textStock = new JTextField();
		textStock.setColumns(10);
		textStock.setBounds(441, 160, 76, 19);
		contentPane.add(textStock);
		
		JLabel lblNewLabel_3_1 = new JLabel("Stock:");
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(401, 162, 52, 13);
		contentPane.add(lblNewLabel_3_1);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(441, 201, 76, 19);
		contentPane.add(textPrecio);
		
		JLabel lblNewLabel_4_1 = new JLabel("Precio S/:");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(382, 203, 52, 13);
		contentPane.add(lblNewLabel_4_1);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(441, 256, 96, 19);
		contentPane.add(textNumero);
		
		JLabel lblNewLabel_5_1 = new JLabel("Número:");
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_5_1.setBounds(369, 258, 82, 13);
		contentPane.add(lblNewLabel_5_1);
		
		textConcentracion = new JTextField();
		textConcentracion.setColumns(10);
		textConcentracion.setBounds(130, 201, 129, 19);
		contentPane.add(textConcentracion);
		
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
		
		textCantidad = new JTextField();
		textCantidad.setBounds(198, 307, 82, 30);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		textTotal = new JTextField();
		textTotal.setColumns(10);
		textTotal.setBounds(347, 307, 82, 30);
		contentPane.add(textTotal);
		
		JButton btnNewButton_1 = new JButton("Nuevo");
		btnNewButton_1.setBounds(796, 68, 96, 46);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(e -> limpiarCampos());

		
		JButton btnNewButton_1_2 = new JButton("Guardar");
		btnNewButton_1_2.setBounds(796, 111, 96, 46);
		contentPane.add(btnNewButton_1_2);
		btnNewButton_1_2.addActionListener(e -> guardarVenta());

		
		JButton btnNewButton_1_2_1 = new JButton("Cancelar");
		btnNewButton_1_2_1.setBounds(796, 155, 96, 46);
		contentPane.add(btnNewButton_1_2_1);
        btnNewButton_1_2_1.addActionListener(e -> cancelarVenta());

		
		JButton btnNewButton_1_2_1_1 = new JButton("Imprimir");
		btnNewButton_1_2_1_1.setBounds(796, 201, 96, 46);
		contentPane.add(btnNewButton_1_2_1_1);
		//btnNewButton_1_2_1_1.addActionListener(e -> imprimirVenta());

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
		
		textSerie = new JTextField();
		textSerie.setColumns(10);
		textSerie.setBounds(671, 184, 62, 19);
		contentPane.add(textSerie);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Cambiar");
		chckbxNewCheckBox.setBounds(671, 214, 82, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Importe");
		btnNewButton_1_2_1_1_1.setBounds(46, 285, 76, 68);
		contentPane.add(btnNewButton_1_2_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Agregar");
		btnNewButton_1_1.setBounds(465, 303, 98, 37);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Limpiar");
		btnNewButton_1_1_1.setBounds(571, 303, 96, 37);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Eliminar");
		btnNewButton_1_1_2.setBounds(677, 303, 96, 37);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("Salir");
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
		
		  try {
	            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Conexión exitosa a la base de datos");
	        } catch (SQLException e) {
	            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
	        }
	}



	private Object cancelarVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object guardarVenta() {
		  String cliente = textCliente.getText();
		  String ruc = textRuc.getText();
		  String producto = textProducto.getText();
		  String concentracion = textConcentracion.getText();
		  String comprobante = textComprobante.getText();
		  String stock = textStock.getText();
		  String precio = textPrecio.getText();
		  String numero = textNumero.getText();
		  String fecha = textFecha.getText();
		  String serie = textSerie.getText();
		  String cantidad = textCantidad.getText();
		  String total = textTotal.getText();
		  
		  try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
			  String sql = "INSERT INTO ventas (cliente, ruc, producto, concentracion, comprobante, stock, precio, numero, fecha, serie) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		        PreparedStatement statement = conn.prepareStatement(sql);
		        statement.setString(1, cliente);
		        statement.setString(2, ruc);
		        statement.setString(3, producto);
		        statement.setString(4, concentracion);
		        statement.setString(5, comprobante);
		        statement.setString(6, stock);
		        statement.setString(7, precio);
		        statement.setString(8, numero);
		        statement.setString(9, fecha);
		        statement.setString(10, serie);
		        statement.setString(11, cantidad);
		        statement.setString(12, total);
		        
	            int rowsInserted = statement.executeUpdate(); 

	            if (rowsInserted > 0) {
	                JOptionPane.showMessageDialog(null, "Venta guardada exitosamente");
	                DefaultTableModel model = (DefaultTableModel) tablaVentas.getModel();
	                model.addRow(new Object[]{cliente, ruc});
	            }
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error al guardar la venta: " + ex.getMessage());
	        }
		  return null;
	}

	private Object limpiarCampos() {
		   textCliente.setText("");  
	        textRuc.setText(""); 
	        textComprobante.setText(""); 
	        textFecha.setText(""); 		
	        return null;
	}
}