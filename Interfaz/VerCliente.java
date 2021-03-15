package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class VerCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCedula;
	private JTextField textEdad;
	private JTextField textField_4;
	private JTextField textMetodoPago;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerCliente frame = new VerCliente();
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
	public VerCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(152, 173, 96, 19);
		contentPane.add(textNombre);
		textNombre.setEditable(false);
		textNombre.setEnabled(false);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(152, 202, 96, 19);
		contentPane.add(textApellidos);
		textApellidos.setEditable(false);
		textApellidos.setEnabled(false);
		
		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(152, 231, 96, 19);
		contentPane.add(textCedula);
		textCedula.setEditable(false);
		textCedula.setEnabled(false);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(152, 260, 96, 19);
		contentPane.add(textEdad);
		textEdad.setEditable(false);
		textEdad.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(51, 176, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setBounds(51, 205, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("C\u00E9dula");
		lblNewLabel_2.setBounds(51, 234, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(51, 263, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("M\u00E9todo de Pago");
		lblNewLabel.setBounds(51, 290, 90, 13);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Tarjeta Credito", "Tarjeta Debito", "Efectivo"}));
		comboBox.setBounds(290, 290, 85, 17);
		contentPane.add(comboBox);
		comboBox.setVisible(false);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		
		rdbtnSi.setBounds(155, 313, 45, 21);
		contentPane.add(rdbtnSi);
		rdbtnSi.setEnabled(false);
		
		
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSi.setSelected(false);
			}
		});
		rdbtnNo.setBounds(202, 313, 45, 21);
		contentPane.add(rdbtnNo);
		rdbtnNo.setEnabled(false);
		
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNo.setSelected(false);
			}
		});
		
		JLabel lblesSocio = new JLabel("\u00BFEs socio?");
		lblesSocio.setBounds(51, 317, 90, 13);
		contentPane.add(lblesSocio);
		
		JButton btnNewButton_1 = new JButton("Volver");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(29, 10, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(51, 67, 324, 68);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"sdf", "dfyjd", "dfd", "gff"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		scrollPane.setViewportView(list);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(126, 38, 249, 19);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_5 = new JLabel("Buscar");
		lblNewLabel_5.setBounds(51, 41, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Editar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setEditable(true);
				textNombre.setEnabled(true);
				textApellidos.setEditable(true);
				textApellidos.setEnabled(true);
				textCedula.setEditable(true);
				textCedula.setEnabled(true);
				textEdad.setEditable(true);
				textEdad.setEnabled(true);
				comboBox.setVisible(true);
				rdbtnSi.setEnabled(true);
				rdbtnNo.setEnabled(true);
			}
		});
		btnNewButton.setBounds(290, 172, 85, 21);
		contentPane.add(btnNewButton);
		
		
		textMetodoPago = new JTextField();
		textMetodoPago.setBounds(152, 289, 96, 19);
		contentPane.add(textMetodoPago);
		textMetodoPago.setColumns(10);
		textMetodoPago.setEditable(false);
		textMetodoPago.setEnabled(false);
		
		JButton btnNewButton_2 = new JButton("Guardar Cambios");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setEditable(false);
				textNombre.setEnabled(false);
				textApellidos.setEditable(false);
				textApellidos.setEnabled(false);
				textCedula.setEditable(false);
				textCedula.setEnabled(false);
				textEdad.setEditable(false);
				textEdad.setEnabled(false);
				comboBox.setVisible(false);
				rdbtnSi.setEnabled(false);
				rdbtnNo.setEnabled(false);
				btnNewButton_2.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(252, 334, 123, 21);
		contentPane.add(btnNewButton_2);
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textMetodoPago.setText((String) comboBox.getSelectedItem());
			}
		});
		
	}

}
