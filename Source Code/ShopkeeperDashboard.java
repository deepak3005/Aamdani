import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class ShopkeeperDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopkeeperDashboard frame = new ShopkeeperDashboard();
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
	public ShopkeeperDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrHelloDeepak = new JTextArea();
		txtrHelloDeepak.setEditable(false);
		txtrHelloDeepak.setForeground(Color.BLACK);
		txtrHelloDeepak.setFont(new Font("Calibri", Font.BOLD, 24));
		txtrHelloDeepak.setBackground(Color.LIGHT_GRAY);
		txtrHelloDeepak.setText("Hello Deepak");
		txtrHelloDeepak.setBounds(27, 21, 138, 34);
		contentPane.add(txtrHelloDeepak);
		
		JTextArea txtrThisIsYour = new JTextArea();
		txtrThisIsYour.setEditable(false);
		txtrThisIsYour.setForeground(Color.BLACK);
		txtrThisIsYour.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrThisIsYour.setBackground(Color.LIGHT_GRAY);
		txtrThisIsYour.setText("This is your Aamdani Dashboard.");
		txtrThisIsYour.setBounds(27, 60, 282, 24);
		contentPane.add(txtrThisIsYour);
		
		JTextArea txtrGoAhead = new JTextArea();
		txtrGoAhead.setEditable(false);
		txtrGoAhead.setForeground(Color.BLACK);
		txtrGoAhead.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrGoAhead.setBackground(Color.LIGHT_GRAY);
		txtrGoAhead.setText("Go ahead!");
		txtrGoAhead.setBounds(27, 87, 148, 37);
		contentPane.add(txtrGoAhead);
	}
}
