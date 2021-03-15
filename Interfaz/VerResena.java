package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerResena extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerResena frame = new VerResena();
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
	public VerResena() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(54, 70, 324, 68);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"lakbd", "g\u00F1ajbg", "ag\u00F1akjfbg\u00F1akdjfg", "aalerg{a"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 41, 269, 19);
		contentPane.add(textField);
		
		JLabel lblNewLabel = new JLabel("Buscar");
		lblNewLabel.setBounds(54, 44, 45, 13);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1");
		rdbtnNewRadioButton.setBounds(54, 173, 45, 21);
		contentPane.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setEnabled(false);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setEnabled(false);
		rdbtnNewRadioButton_1.setBounds(101, 173, 45, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setEnabled(false);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("3");
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_2.setBounds(148, 173, 45, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setEnabled(false);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("4");
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_3.setBounds(195, 173, 45, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setEnabled(false);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("5");
		rdbtnNewRadioButton_4.setEnabled(false);
		rdbtnNewRadioButton_4.setBounds(242, 173, 45, 21);
		contentPane.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setEnabled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Calificaci\u00F3n");
		lblNewLabel_1.setBounds(54, 154, 92, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(54, 219, 324, 141);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(0, 10, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Descripci\u00F3n");
		lblNewLabel_2.setBounds(54, 196, 92, 13);
		contentPane.add(lblNewLabel_2);
	}

}
