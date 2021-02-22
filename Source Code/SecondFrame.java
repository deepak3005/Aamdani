import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class SecondFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondFrame frame = new SecondFrame();
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
	public SecondFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("POST  A  JOB");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				PostJobButtonClicked pajbc = new PostJobButtonClicked();
				pajbc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 30));
		btnNewButton.setBounds(86, 208, 221, 113);
		getContentPane().add(btnNewButton);
		
		JButton btnFindAJob = new JButton("FIND  A  JOB");
		btnFindAJob.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFindAJob.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				FindJobButtonClicked fjbc = new FindJobButtonClicked();
				fjbc.setVisible(true);
			}
		});
		btnFindAJob.setForeground(Color.WHITE);
		btnFindAJob.setFont(new Font("Calibri", Font.BOLD, 30));
		btnFindAJob.setBorder(null);
		btnFindAJob.setBackground(Color.DARK_GRAY);
		btnFindAJob.setBounds(355, 208, 221, 113);
		contentPane.add(btnFindAJob);
		
		JTextArea txtrWelcomeAboard = new JTextArea();
		txtrWelcomeAboard.setText("Welcome Aboard ...");
		txtrWelcomeAboard.setFont(new Font("Calibri", Font.BOLD, 36));
		txtrWelcomeAboard.setForeground(Color.DARK_GRAY);
		txtrWelcomeAboard.setBackground(Color.LIGHT_GRAY);
		txtrWelcomeAboard.setEditable(false);
		txtrWelcomeAboard.setBounds(81, 63, 302, 35);
		contentPane.add(txtrWelcomeAboard);
	}
}
