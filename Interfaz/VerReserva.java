package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class VerReserva extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textCedula;
	private JTextField textPlan;
	private JTextField textHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerReserva frame = new VerReserva();
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
	public VerReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"123", "123", "43", "4", "463", "5", "63", "4", "6", "3", "6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(167, 1, 139, 68);
		contentPane.add(list);
		
		JScrollPane scrollPane = new JScrollPane(list);
		
		scrollPane.setBounds(34, 63, 324, 68);
		contentPane.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(89, 34, 269, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(34, 37, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00E9dula");
		lblNewLabel_1.setBounds(34, 181, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(143, 175, 96, 19);
		contentPane.add(textCedula);
		textCedula.setEditable(false);
		textCedula.setEnabled(false);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha Llegada");
		lblNewLabel_1_1.setBounds(34, 204, 80, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblFechaS = new JLabel("Fecha Salida");
		lblFechaS.setBounds(34, 227, 80, 13);
		contentPane.add(lblFechaS);
		
		JLabel lblNewLabel_2 = new JLabel("Habitaci\u00F3n");
		lblNewLabel_2.setBounds(34, 276, 67, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Plan");
		lblNewLabel_3.setBounds(34, 250, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		textPlan = new JTextField();
		textPlan.setColumns(10);
		textPlan.setBounds(143, 247, 96, 19);
		contentPane.add(textPlan);
		textPlan.setEditable(false);
		textPlan.setEnabled(false);
		
		textHabitacion = new JTextField();
		textHabitacion.setColumns(10);
		textHabitacion.setBounds(143, 273, 96, 19);
		contentPane.add(textHabitacion);
		textHabitacion.setEditable(false);
		textHabitacion.setEnabled(false);
		
		JButton btnNewButton = new JButton("Editar");
		
		btnNewButton.setBounds(299, 144, 85, 21);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPlan.setText((String) comboBox.getSelectedItem());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "VIP", "Est\u00E1ndar", "Econ\u00F3mico"}));
		comboBox.setBounds(299, 246, 85, 21);
		contentPane.add(comboBox);
		comboBox.setVisible(false);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textHabitacion.setText((String) comboBox_1.getSelectedItem());
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "103"}));
		comboBox_1.setBounds(299, 276, 85, 21);
		contentPane.add(comboBox_1);
		comboBox_1.setVisible(false);
		
		JDateChooser dcFechaL = new JDateChooser();
		dcFechaL.setBounds(143, 198, 85, 19);
		contentPane.add(dcFechaL);
		dcFechaL.getDateEditor().setEnabled(false);
		((JTextField)dcFechaL.getDateEditor()).setEditable(false); 
		dcFechaL.getCalendarButton().setEnabled(false);
		
		
		JDateChooser dcFechaS = new JDateChooser();
		dcFechaS.setBounds(143, 221, 85, 19);
		contentPane.add(dcFechaS);
		dcFechaS.getDateEditor().setEnabled(false);
		((JTextField)dcFechaS.getDateEditor()).setEditable(false); 
		dcFechaS.getCalendarButton().setEnabled(false);
		
		JButton btnNewButton_1 = new JButton("Guardar Cambios");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCedula.setEditable(false);
				textCedula.setEnabled(false);
				dcFechaS.getDateEditor().setEnabled(false);
				((JTextField)dcFechaS.getDateEditor()).setEditable(false);
				dcFechaL.getDateEditor().setEnabled(false);
				((JTextField)dcFechaL.getDateEditor()).setEditable(false); 
				dcFechaL.getCalendarButton().setEnabled(false);
				dcFechaS.getCalendarButton().setEnabled(false);
				comboBox.setVisible(false);
				comboBox_1.setVisible(false);
				btnNewButton_1.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(298, 307, 111, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(10, 387, 85, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_1.setVisible(false);
		
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCedula.setEditable(true);
				textCedula.setEnabled(true);
				dcFechaS.getDateEditor().setEnabled(true);
				((JTextField)dcFechaS.getDateEditor()).setEditable(true);
				dcFechaL.getDateEditor().setEnabled(true);
				((JTextField)dcFechaL.getDateEditor()).setEditable(true); 
				dcFechaL.getCalendarButton().setEnabled(true);
				dcFechaS.getCalendarButton().setEnabled(true);
				comboBox.setVisible(true);
				comboBox_1.setVisible(true);
				btnNewButton_1.setVisible(true);
			}
		});
		

	}
}
