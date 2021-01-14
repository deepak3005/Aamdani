import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewShopkeeperSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewShopkeeperSignUp frame = new NewShopkeeperSignUp();
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
	public NewShopkeeperSignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setText("Name");
		txtrName.setBounds(73, 81, 114, 22);
		contentPane.add(txtrName);
		
		JTextArea txtrPhoneNo = new JTextArea();
		txtrPhoneNo.setText("Phone No.");
		txtrPhoneNo.setBounds(73, 113, 114, 22);
		contentPane.add(txtrPhoneNo);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setText("Email");
		txtrEmail.setBounds(73, 146, 114, 22);
		contentPane.add(txtrEmail);
		
		JTextArea txtrSetPassword = new JTextArea();
		txtrSetPassword.setText("Set Password");
		txtrSetPassword.setBounds(73, 183, 114, 22);
		contentPane.add(txtrSetPassword);
		
		JTextArea txtrShopName = new JTextArea();
		txtrShopName.setText("Shop name");
		txtrShopName.setBounds(73, 216, 114, 22);
		contentPane.add(txtrShopName);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setText("Address");
		txtrAddress.setBounds(73, 262, 114, 22);
		contentPane.add(txtrAddress);
		
		JTextArea txtrLocation = new JTextArea();
		txtrLocation.setText("Location");
		txtrLocation.setBounds(73, 306, 114, 22);
		contentPane.add(txtrLocation);
		
		JTextArea txtrDistanceFromUpes = new JTextArea();
		txtrDistanceFromUpes.setText("Distance from UPES");
		txtrDistanceFromUpes.setBounds(73, 348, 149, 22);
		contentPane.add(txtrDistanceFromUpes);
		
		textField = new JTextField();
		textField.setBounds(262, 83, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(262, 115, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(262, 148, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(262, 185, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(262, 218, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(262, 264, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(262, 308, 86, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(262, 350, 86, 20);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(431, 349, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea txtrCreateAccount = new JTextArea();
		txtrCreateAccount.setText("CREATE ACCOUNT");
		txtrCreateAccount.setBounds(73, 26, 149, 22);
		contentPane.add(txtrCreateAccount);
	}

}
