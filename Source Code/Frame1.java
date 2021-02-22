import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 680, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("POST A JOB");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				PostJobButtonClicked pajbc = new PostJobButtonClicked();
				pajbc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setBounds(114, 242, 180, 85);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea txtrWelcome = new JTextArea();
		txtrWelcome.setBackground(Color.LIGHT_GRAY);
		txtrWelcome.setEditable(false);
		txtrWelcome.setFont(new Font("Calibri", Font.BOLD, 40));
		txtrWelcome.setText("Welcome To AAMDANI");
		txtrWelcome.setBounds(140, 56, 392, 39);
		frame.getContentPane().add(txtrWelcome);
		
		JButton btnNewButton_1 = new JButton("FIND A JOB");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton_1.setBounds(376, 242, 180, 85);
		frame.getContentPane().add(btnNewButton_1);
	}
}
