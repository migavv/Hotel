package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarReseña extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarReseña frame = new AgregarReseña();
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
	public AgregarReseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtn1 = new JRadioButton("");
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtn1.setBounds(19, 124, 31, 21);
		contentPane.add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("");
		
		rdbtn2.setBounds(52, 124, 31, 21);
		contentPane.add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("");
		rdbtn3.setBounds(85, 124, 31, 21);
		contentPane.add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("");
		rdbtn4.setBounds(118, 124, 31, 21);
		contentPane.add(rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("");
		rdbtn5.setBounds(151, 124, 31, 21);
		contentPane.add(rdbtn5);
		
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
			}
		});
		
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(true);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
			}
		});
		rdbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(true);
				rdbtn3.setSelected(true);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
			}
		});
		
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(true);
				rdbtn3.setSelected(true);
				rdbtn4.setSelected(true);
				rdbtn5.setSelected(false);
			}
		});
		
		rdbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(true);
				rdbtn3.setSelected(true);
				rdbtn4.setSelected(true);
				rdbtn5.setSelected(true);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Calificaci\u00F3n:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(19, 90, 97, 28);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 186, 318, 132);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Descripci\u00F3n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(19, 163, 97, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(225, 100, 86, 13);
		contentPane.add(lblNewLabel_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(225, 126, 64, 19);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(341, 297, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00E9dula del Cliente");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(19, 37, 132, 33);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(151, 46, 177, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(19, 10, 75, 21);
		contentPane.add(btnVolver);
	}
}
