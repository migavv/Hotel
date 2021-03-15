package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCedula;
	private JTextField textEdad;
	private JTextField textSalario;
	private JTextField textField_5;
	private JTextField textHorario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerEmpleado frame = new VerEmpleado();
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
	public VerEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(174, 188, 96, 19);
		contentPane.add(textNombre);
		textNombre.setEditable(false);
		textNombre.setEnabled(false);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(174, 217, 96, 19);
		contentPane.add(textApellidos);
		textApellidos.setEditable(false);
		textApellidos.setEnabled(false);
		
		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(174, 246, 96, 19);
		contentPane.add(textCedula);
		textCedula.setEditable(false);
		textCedula.setEnabled(false);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(174, 275, 96, 19);
		contentPane.add(textEdad);
		textEdad.setEditable(false);
		textEdad.setEnabled(false);
		
		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(174, 304, 96, 19);
		contentPane.add(textSalario);
		textSalario.setEditable(false);
		textSalario.setEnabled(false);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(73, 191, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(73, 220, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00E9dula");
		lblNewLabel_2.setBounds(73, 249, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(73, 278, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Salario");
		lblNewLabel_4.setBounds(73, 307, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(10, 6, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(32, 63, 324, 68);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"ohurgp", "OSHEwu", "oahdsgan", "dgj"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 34, 249, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Buscar");
		lblNewLabel_5.setBounds(32, 37, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		textHorario = new JTextField();
		textHorario.setColumns(10);
		textHorario.setBounds(174, 333, 96, 19);
		contentPane.add(textHorario);
		textHorario.setEditable(false);
		textHorario.setEnabled(false);
		
		JButton btnGuardarCambios = new JButton("Guardar Cambios");
		btnGuardarCambios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSalario.setEditable(false);
				textSalario.setEnabled(false);
				textEdad.setEditable(false);
				textEdad.setEnabled(false);
				textSalario.setEditable(false);
				textSalario.setEnabled(false);
				textCedula.setEditable(false);
				textCedula.setEnabled(false);
				textApellidos.setEditable(false);
				textApellidos.setEnabled(false);
				textNombre.setEditable(false);
				textNombre.setEnabled(false);
				textHorario.setEditable(false);
				textHorario.setEnabled(false);
				btnGuardarCambios.setVisible(false);
			}
		});
		btnGuardarCambios.setBounds(118, 373, 152, 21);
		contentPane.add(btnGuardarCambios);
		btnGuardarCambios.setVisible(false);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textSalario.setEditable(true);
				textSalario.setEnabled(true);
				textEdad.setEditable(true);
				textEdad.setEnabled(true);
				textSalario.setEditable(true);
				textSalario.setEnabled(true);
				textCedula.setEditable(true);
				textCedula.setEnabled(true);
				textApellidos.setEditable(true);
				textApellidos.setEnabled(true);
				textNombre.setEditable(true);
				textNombre.setEnabled(true);
				textHorario.setEditable(true);
				textHorario.setEnabled(true);
				btnGuardarCambios.setVisible(true);
			}
		});
		btnNewButton.setBounds(280, 161, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5_1 = new JLabel("Horario");
		lblNewLabel_5_1.setBounds(73, 336, 45, 13);
		contentPane.add(lblNewLabel_5_1);
		
		
	}

}
