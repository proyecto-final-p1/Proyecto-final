package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ReporteProducto {

	private JFrame frmReporteDeProductos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DefaultTableModel mode;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteProducto window = new ReporteProducto();
					window.frmReporteDeProductos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ReporteProducto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReporteDeProductos = new JFrame();
		frmReporteDeProductos.setTitle("Reporte De Productos ");
		frmReporteDeProductos.setBounds(100, 100, 789, 494);
		frmReporteDeProductos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmReporteDeProductos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reportes\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 111, 30);
		frmReporteDeProductos.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Generar reporte por presentación ");
		rdbtnNewRadioButton.setBounds(64, 50, 240, 21);
		frmReporteDeProductos.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnGenerarReportePor = new JRadioButton("Generar reporte por ID");
		rdbtnGenerarReportePor.setBounds(64, 83, 165, 21);
		frmReporteDeProductos.getContentPane().add(rdbtnGenerarReportePor);
		
		JRadioButton rdbtnGenerarReportePor_1 = new JRadioButton("Generar reporte por estado\r\n");
		rdbtnGenerarReportePor_1.setBounds(64, 114, 192, 21);
		frmReporteDeProductos.getContentPane().add(rdbtnGenerarReportePor_1);
		
		JRadioButton rdbtnMostrarReporteGeneral = new JRadioButton("Mostrar reporte general");
		rdbtnMostrarReporteGeneral.setBounds(64, 147, 192, 21);
		frmReporteDeProductos.getContentPane().add(rdbtnMostrarReporteGeneral);
		
		textField = new JTextField();
		textField.setBounds(310, 51, 149, 20);
		frmReporteDeProductos.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(310, 84, 149, 20);
		frmReporteDeProductos.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(310, 115, 149, 20);
		frmReporteDeProductos.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Generar reporte");
		btnNewButton.setBounds(536, 83, 165, 76);
		frmReporteDeProductos.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(224, 298, 0, 60);
		frmReporteDeProductos.getContentPane().add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 212, 755, 235);
		frmReporteDeProductos.getContentPane().add(scrollPane);
		
		mode = new DefaultTableModel(new Object[][] {
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null, null, null}

	}
			,new String[] {"ID", "Presentación", "Descripción", "Stock", 
				"Costo", "Ventas", "Vencimiento", "Registro", "Estado"}

	);
		
		table = new JTable();
		table.setModel(mode);
		scrollPane.setViewportView(table);
	}
}
