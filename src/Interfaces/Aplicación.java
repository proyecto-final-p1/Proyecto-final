package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Choice;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Aplicación extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmNewMenuItem, mntmNewMenuItem_1, mntmNewMenuItem_9, mntmNewMenuItem_13, mntmNewMenuItem_16,
	mntmNewMenuItem_19, mntmNewMenuItem_22;
	private JButton btnCaja, btnVentas, btnClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicación frame = new Aplicación();
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
	public Aplicación() {
		setTitle("Titulo de la Farmacia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 537);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivos");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Cerrar Sesión");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(this);
		
		mntmNewMenuItem_1 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(this);
		
		JMenu mnNewMenu_1 = new JMenu("Registro\r\n");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Productos ");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Clientes");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Empleados ");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Proveedores");
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Presentación");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Laboratorios");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Comprobantes");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Movimientos\r\n");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_9 = new JMenuItem("Compras");
		mnNewMenu_2.add(mntmNewMenuItem_9);
		mntmNewMenuItem_9.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Ventas");
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Caja");
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_3 = new JMenu("Consultas");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Compras");
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		mntmNewMenuItem_13 = new JMenuItem("Clientes");
		mnNewMenu_3.add(mntmNewMenuItem_13);
		mntmNewMenuItem_13.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Empleados");
		mnNewMenu_3.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Productos");
		mnNewMenu_3.add(mntmNewMenuItem_15);
		
		mntmNewMenuItem_16 = new JMenuItem("Proveedores");
		mnNewMenu_3.add(mntmNewMenuItem_16);
		mntmNewMenuItem_16.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Ventas");
		mnNewMenu_3.add(mntmNewMenuItem_17);
		
		JMenu mnNewMenu_4 = new JMenu("Reportes");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Clientes");
		mnNewMenu_4.add(mntmNewMenuItem_18);
		
		mntmNewMenuItem_19 = new JMenuItem("Productos");
		mnNewMenu_4.add(mntmNewMenuItem_19);
		mntmNewMenuItem_19.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Proveedores");
		mnNewMenu_4.add(mntmNewMenuItem_20);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Empleados");
		mnNewMenu_4.add(mntmNewMenuItem_21);
		
		JMenu mnNewMenu_5 = new JMenu("Administrador");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_5);
		
		mntmNewMenuItem_22 = new JMenuItem("Nuevo Usuario Ctrl + U");
		mnNewMenu_5.add(mntmNewMenuItem_22);
		mntmNewMenuItem_22.addActionListener(this);
		
		JMenu mnNewMenu_6 = new JMenu("Perfil");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("Administrar Perfil");
		mnNewMenu_6.add(mntmNewMenuItem_23);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("FARMACIA");
		lblNewLabel_11.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblNewLabel_11.setBounds(442, 140, 151, 47);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("logo");
		lblNewLabel_12.setBounds(498, 255, 45, 13);
		contentPane.add(lblNewLabel_12);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 990, 71);
		contentPane.add(panel);
		
		JButton btnProductos = new JButton("Productos");
		btnProductos.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		
		btnClientes = new JButton("Clientes");
		btnClientes.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		btnClientes.addActionListener(this);
		
		btnCaja = new JButton("Caja");
		btnCaja.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		btnCaja.addActionListener(this);
		
		btnVentas = new JButton("Ventas");
		btnVentas.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		btnVentas.addActionListener(this);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addComponent(btnProductos, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnClientes, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCaja, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnVentas, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(664, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnProductos, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnClientes, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
							.addComponent(btnCaja, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnVentas, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 81, 990, 392);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_14 = new JLabel("Usuario:");
		lblNewLabel_14.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JLabel lblNewLabel_14_1 = new JLabel("Rol:");
		lblNewLabel_14_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JLabel lblNewLabel_14_2 = new JLabel("Id:");
		lblNewLabel_14_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(66)
					.addComponent(lblNewLabel_14_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(48)
					.addComponent(lblNewLabel_14_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(596, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(378, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(30, 477, 45, 13);
		contentPane.add(lblNewLabel_13);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mntmNewMenuItem_9) {
			Compras compraFrame = new Compras();
			compraFrame.setVisible(true);
		}
		else if (e.getSource() == btnCaja) {
			resumenCaja caja = new resumenCaja();
			caja.setVisible(true);
		}
		else if(e.getSource() == btnVentas) {
			realizarVenta ventas = new realizarVenta();
			ventas.setVisible(true);
		}
		else if (e.getSource() == mntmNewMenuItem_13) {
			ConsultarClientes.main(null);
		}
		else if (e.getSource() == mntmNewMenuItem_16) {
			Proveedores.main(null);
		}
		else if(e.getSource() == mntmNewMenuItem_22) {
			RegistroUsuario.main(null);
		}
		else if (e.getSource() == mntmNewMenuItem) {
			JOptionPane.showMessageDialog(null, "Sesión cerrada correctamente.");
			dispose();		    
			inicioSesion inicioSesion = new inicioSesion();
			inicioSesion.setVisible(true);	
		}
		else if(e.getSource() == btnClientes) {
			Clientes.main(null);
		}
		else if (e.getSource() == mntmNewMenuItem_1) {
			dispose();
		}
		else if (e.getSource() == mntmNewMenuItem_19) {
			ReporteProducto.main(null);
		}
	}
}
