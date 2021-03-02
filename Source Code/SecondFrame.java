import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

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
					//frame.;
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
		setTitle("Aamdani");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("POST  A  JOB");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				PostJobButtonClicked pajbc = new PostJobButtonClicked();
				pajbc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 50));
		btnNewButton.setBounds(95, 400, 362, 181);
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
		btnFindAJob.setForeground(new Color(255, 255, 255));
		btnFindAJob.setFont(new Font("Calibri", Font.BOLD, 50));
		btnFindAJob.setBorder(null);
		btnFindAJob.setBackground(new Color(60, 179, 113));
		btnFindAJob.setBounds(533, 400, 362, 181);
		contentPane.add(btnFindAJob);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/welcome3.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(95, 40, 800, 300);
		contentPane.add(lblNewLabel);
		
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Image img = new ImageIcon(this.getClass().getResource("/BackButton.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				PostJobButtonClicked f = new PostJobButtonClicked();
				f.setVisible(true);
			}
		});
		lblNewLabel.setBounds(38, 28, 51, 34);
		contentPane.add(lblNewLabel);*/
	}
}
