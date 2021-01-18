import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class PostJobButtonClicked extends JFrame {

	private JPanel contentPane;
	private JTextField txtDfgh;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostJobButtonClicked frame = new PostJobButtonClicked();
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
	public PostJobButtonClicked() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.setBorder(null);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(323, 229, 278, 40);
		contentPane.add(btnNewButton);
		
		txtDfgh = new JTextField();
		txtDfgh.setFont(new Font("Calibri", Font.BOLD, 18));
		txtDfgh.setBounds(323, 90, 278, 34);
		contentPane.add(txtDfgh);
		txtDfgh.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 18));
		textField_1.setBounds(323, 154, 278, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea txtrEmail = new JTextArea();
		txtrEmail.setEditable(false);
		txtrEmail.setFont(new Font("Calibri", Font.BOLD, 22));
		txtrEmail.setBackground(Color.LIGHT_GRAY);
		txtrEmail.setText("Email");
		txtrEmail.setBounds(251, 97, 55, 23);
		contentPane.add(txtrEmail);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setEditable(false);
		txtrPassword.setFont(new Font("Calibri", Font.BOLD, 22));
		txtrPassword.setBackground(Color.LIGHT_GRAY);
		txtrPassword.setText("Password");
		txtrPassword.setBounds(213, 160, 97, 23);
		contentPane.add(txtrPassword);
		
		JTextArea txtrNewUser = new JTextArea();
		txtrNewUser.setEditable(false);
		txtrNewUser.setFont(new Font("Calibri", Font.BOLD, 22));
		txtrNewUser.setBackground(Color.LIGHT_GRAY);
		txtrNewUser.setText("New User ?");
		txtrNewUser.setBounds(323, 316, 108, 23);
		contentPane.add(txtrNewUser);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 24));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				NewShopkeeperSignUp nssu = new NewShopkeeperSignUp();
				nssu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(464, 305, 137, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Login-icon.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(40, 90, 152, 255);
		contentPane.add(lblNewLabel);
	}
}
