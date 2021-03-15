package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearReserva extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearReserva frame = new CrearReserva();
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
	public CrearReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00E9dula");
		lblNewLabel.setBounds(46, 60, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha Llegada");
		lblNewLabel_1.setBounds(46, 83, 80, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha Salida");
		lblNewLabel_1_1.setBounds(46, 106, 80, 13);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(155, 54, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione..."}));
		comboBox.setBounds(155, 170, 96, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Habitaci\u00F3n");
		lblNewLabel_2.setBounds(46, 174, 67, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(155, 232, 75, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Plan");
		lblNewLabel_3.setBounds(46, 129, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "VIP", "Est\u00E1ndar", "Econ\u00F3mico"}));
		comboBox_1.setBounds(155, 129, 96, 21);
		contentPane.add(comboBox_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(165, 129, 45, 13);
		contentPane.add(label);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(155, 83, 96, 19);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(155, 106, 96, 19);
		contentPane.add(dateChooser_1);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(10, 10, 75, 21);
		contentPane.add(btnVolver);
	}
}
