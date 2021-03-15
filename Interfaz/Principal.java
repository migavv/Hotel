package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Principal extends JFrame {

	private JPanel contentPane;
	private AgregarEmpleado agregarEmpleado = new AgregarEmpleado();
	private CrearReserva crearReserva = new CrearReserva();
	private AgregarReseña agregarReseña = new AgregarReseña();
	private AgregarCliente agregarCliente = new AgregarCliente();
	private EliminarCliente eliminarCliente = new EliminarCliente();
	private EliminarEmpleado eliminarEmpleado = new EliminarEmpleado();
	private EliminarResena eliminarResena = new EliminarResena();
	private EliminarReserva eliminarReserva = new EliminarReserva();
	private JTextField textField;
	private VerEmpleado verEmpleado = new VerEmpleado();
	private VerResena verResena = new VerResena();
	private VerReserva verReserva = new VerReserva();
	private VerCliente verCliente = new VerCliente();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 161);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnReservas = new JMenu("RESERVAS");
		menuBar.add(mnReservas);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarReserva.setVisible(true);
			}
		});
		mnReservas.add(mntmEliminar);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearReserva.setVisible(true);
			}
		});
		mnReservas.add(mntmAgregar);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Ver");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verReserva.setVisible(true);
			}
		});
		mnReservas.add(mntmNewMenuItem_7);
		
		JMenu mnClientes = new JMenu("CLIENTES");
		menuBar.add(mnClientes);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Eliminar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarCliente.setVisible(true);
			}
		});
		mnClientes.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Agregar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarCliente.setVisible(true);
			}
		});
		mnClientes.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_7_1 = new JMenuItem("Ver");
		mntmNewMenuItem_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verCliente.setVisible(true);
			}
		});
		mnClientes.add(mntmNewMenuItem_7_1);
		
		JMenu mnEmpleados = new JMenu("EMPLEADOS");
		menuBar.add(mnEmpleados);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarEmpleado.setVisible(true);
			}
		});
		mnEmpleados.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Agregar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				agregarEmpleado.setVisible(true);
			}
		});
		mnEmpleados.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_7_2 = new JMenuItem("Ver");
		mntmNewMenuItem_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verEmpleado.setVisible(true);
			}
		});
		mnEmpleados.add(mntmNewMenuItem_7_2);
		
		JMenu mnNewMenu_3 = new JMenu("RESE\u00D1AS");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Leer");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verResena.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Eliminar");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarResena.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Agregar");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				agregarReseña.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 124, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CUENTA:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 47, 83, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(104, 52, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		textField.setEnabled(false);
		
		
		
	}
}
