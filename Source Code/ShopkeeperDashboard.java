import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JLabel;

public class ShopkeeperDashboard extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopkeeperDashboard frame = new ShopkeeperDashboard();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
		setTitle("Aamdani Dashboard");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrHelloDeepak = new JTextArea();
		txtrHelloDeepak.setEditable(false);
		txtrHelloDeepak.setForeground(Color.WHITE);
		txtrHelloDeepak.setFont(new Font("Calibri", Font.BOLD, 24));
		txtrHelloDeepak.setBackground(Color.DARK_GRAY);
		txtrHelloDeepak.setText("Hello "+PostJobButtonClicked.shopkeeper_email_entered.getText());
		txtrHelloDeepak.setBounds(53, 92, 418, 34);
		contentPane.add(txtrHelloDeepak);
		
		JTextArea txtrThisIsYour = new JTextArea();
		txtrThisIsYour.setEditable(false);
		txtrThisIsYour.setForeground(Color.WHITE);
		txtrThisIsYour.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrThisIsYour.setBackground(Color.DARK_GRAY);
		txtrThisIsYour.setText("This is your Aamdani Dashboard.");
		txtrThisIsYour.setBounds(53, 137, 282, 24);
		contentPane.add(txtrThisIsYour);
		
		JTextArea txtrGoAhead = new JTextArea();
		txtrGoAhead.setEditable(false);
		txtrGoAhead.setForeground(Color.WHITE);
		txtrGoAhead.setFont(new Font("Calibri", Font.BOLD, 20));
		txtrGoAhead.setBackground(Color.DARK_GRAY);
		txtrGoAhead.setText("Go ahead!");
		txtrGoAhead.setBounds(53, 168, 148, 37);
		contentPane.add(txtrGoAhead);
		
		table = new JTable();
		table.setBounds(98, 284, 135, -61);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("Logout");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				dispose();
				PostJobButtonClicked pjbc3 = new PostJobButtonClicked();
				pjbc3.setVisible(true);
			}
		});
		Image img1 = new ImageIcon(this.getClass().getResource("/logout.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(925, 15, 48, 55);
		contentPane.add(lblNewLabel);
	}
}
