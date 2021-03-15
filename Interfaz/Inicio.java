package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUsuario;
	private String usuario = "Admin";
	private String password = "123456";
	private Principal principal = new Principal();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USUARIO:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(80, 116, 73, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(80, 145, 104, 13);
		contentPane.add(lblContrasea);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(194, 144, 172, 19);
		contentPane.add(txtPassword);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(194, 118, 172, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JButton btnInicio = new JButton("Iniciar Sesi\u00F3n");
		btnInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInicio.setBounds(80, 196, 133, 43);
		contentPane.add(btnInicio);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(248, 198, 106, 43);
		contentPane.add(btnSalir);
		
		JLabel lblError = new JLabel("Usuario o Contrase\u00F1a Incorrecta");
		lblError.setVisible(false);
		lblError.setForeground(Color.RED);
		lblError.setBounds(80, 173, 222, 13);
		contentPane.add(lblError);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals(usuario) && txtPassword.getText().equals(password)) {
					principal.setVisible(true);
					dispose();
				}else {
					lblError.setVisible(true);
				}
			}
		});
	}
}
