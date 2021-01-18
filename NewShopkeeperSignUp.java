import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class NewShopkeeperSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtSdf;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrName = new JTextArea();
		txtrName.setEditable(false);
		txtrName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrName.setBackground(Color.LIGHT_GRAY);
		txtrName.setText("Name");
		txtrName.setBounds(53, 95, 45, 21);
		contentPane.add(txtrName);
		
		JTextArea txtrPhoneNo = new JTextArea();
		txtrPhoneNo.setEditable(false);
		txtrPhoneNo.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrPhoneNo.setBackground(Color.LIGHT_GRAY);
		txtrPhoneNo.setText("Phone No.");
		txtrPhoneNo.setBounds(53, 139, 77, 22);
		contentPane.add(txtrPhoneNo);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setEditable(false);
		txtrEmail.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrEmail.setBackground(Color.LIGHT_GRAY);
		txtrEmail.setText("Email");
		txtrEmail.setBounds(53, 182, 45, 21);
		contentPane.add(txtrEmail);
		
		JTextArea txtrSetPassword = new JTextArea();
		txtrSetPassword.setEditable(false);
		txtrSetPassword.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrSetPassword.setBackground(Color.LIGHT_GRAY);
		txtrSetPassword.setText("Set Password");
		txtrSetPassword.setBounds(53, 223, 96, 22);
		contentPane.add(txtrSetPassword);
		
		JTextArea txtrShopName = new JTextArea();
		txtrShopName.setEditable(false);
		txtrShopName.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrShopName.setBackground(Color.LIGHT_GRAY);
		txtrShopName.setText("Shop name");
		txtrShopName.setBounds(53, 267, 86, 22);
		contentPane.add(txtrShopName);
		
		JTextArea txtrAddress = new JTextArea();
		txtrAddress.setEditable(false);
		txtrAddress.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrAddress.setBackground(Color.LIGHT_GRAY);
		txtrAddress.setText("Address");
		txtrAddress.setBounds(53, 313, 59, 22);
		contentPane.add(txtrAddress);
		
		JTextArea txtrDistanceFromUpes = new JTextArea();
		txtrDistanceFromUpes.setEditable(false);
		txtrDistanceFromUpes.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrDistanceFromUpes.setBackground(Color.LIGHT_GRAY);
		txtrDistanceFromUpes.setText("Distance from UPES (km)");
		txtrDistanceFromUpes.setBounds(53, 360, 179, 22);
		contentPane.add(txtrDistanceFromUpes);
		
		txtSdf = new JTextField();
		txtSdf.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtSdf.setBounds(241, 91, 179, 21);
		contentPane.add(txtSdf);
		txtSdf.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(241, 135, 179, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(241, 178, 179, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(241, 219, 179, 22);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(241, 263, 179, 22);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(241, 309, 179, 22);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(241, 356, 179, 22);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				ShopkeeperDashboard sd = new ShopkeeperDashboard();
				sd.setVisible(true);
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setBounds(448, 337, 187, 40);
		contentPane.add(btnNewButton);
		
		JTextArea txtrCreateAccount = new JTextArea();
		txtrCreateAccount.setEditable(false);
		txtrCreateAccount.setFont(new Font("Calibri", Font.BOLD, 30));
		txtrCreateAccount.setBackground(Color.LIGHT_GRAY);
		txtrCreateAccount.setText("CREATE ACCOUNT");
		txtrCreateAccount.setBounds(49, 33, 233, 31);
		contentPane.add(txtrCreateAccount);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/NewUserIcon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(440, 95, 195, 200);
		contentPane.add(lblNewLabel);
	}
}
