import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ShopkeeperDashboard extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

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
	
	public String getDynamicName()
	{
		String DynamicName = null;
		String getEmail = PostJobButtonClicked.shopkeeper_email_entered.getText();
		
        try 
        {
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aamdani", "root", "root");
               
            String query = "SELECT shopkeeper_name FROM shopkeeper_sign_up WHERE shopkeeper_email='"+getEmail+"'";

            Statement sta = connection.createStatement();
            ResultSet rs = sta.executeQuery(query);
            while (rs.next())
            {
            	DynamicName = rs.getString(1);
            }
            connection.close();
        }
        catch (Exception exception) 
        {
            exception.printStackTrace();
        }
		return DynamicName;
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
		txtrHelloDeepak.setFont(new Font("Cambria", Font.BOLD, 25));
		txtrHelloDeepak.setBackground(Color.DARK_GRAY);
		txtrHelloDeepak.setText("Hello "+ getDynamicName());
		//PostJobButtonClicked.shopkeeper_email_entered.getText());
		txtrHelloDeepak.setBounds(70, 55, 387, 34);
		contentPane.add(txtrHelloDeepak);
		
		JTextArea txtrThisIsYour = new JTextArea();
		txtrThisIsYour.setEditable(false);
		txtrThisIsYour.setForeground(Color.WHITE);
		txtrThisIsYour.setFont(new Font("Cambria", Font.BOLD, 25));
		txtrThisIsYour.setBackground(Color.DARK_GRAY);
		txtrThisIsYour.setText("Welcome to your Aamdani Dashboard");
		txtrThisIsYour.setBounds(70, 100, 448, 34);
		contentPane.add(txtrThisIsYour);
		
		JTextArea txtrGoAhead = new JTextArea();
		txtrGoAhead.setEditable(false);
		txtrGoAhead.setForeground(Color.WHITE);
		txtrGoAhead.setFont(new Font("Cambria", Font.BOLD, 25));
		txtrGoAhead.setBackground(Color.DARK_GRAY);
		txtrGoAhead.setText("Go ahead!");
		txtrGoAhead.setBounds(70, 140, 118, 34);
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
		lblNewLabel.setBounds(920, 15, 48, 55);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Post A New Job");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{
				dispose();
				PostNewJob pnj = new PostNewJob();
				pnj.setVisible(true);
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBounds(405, 220, 176, 38);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 300, 847, 291);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setBackground(Color.LIGHT_GRAY);
		
		JButton btnNewButton_1 = new JButton("Update Table");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				dispose();
				ShopkeeperDashboard sd5 = new ShopkeeperDashboard();
				sd5.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Cambria", Font.BOLD, 20));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(741, 220, 176, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnViewJobs = new JButton("View Jobs");
		btnViewJobs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnViewJobs.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				String getEmailId = PostJobButtonClicked.shopkeeper_email_entered.getText();
				
				try 
		        {
		        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aamdani", "root", "root");
		               
		            String query2 = "SELECT job_title,job_decription,location,stipend,distance,job_timings_from,job_timings_to,contact_at FROM jobs_posted WHERE shopkeeper_email_address='"+getEmailId+"'";

		            Statement sta = connection.createStatement();
		            ResultSet rs2 = sta.executeQuery(query2);
		            
		            table_1.setModel(DbUtils.resultSetToTableModel(rs2));
		            
		            connection.close();
		        }
		        catch (Exception exception) 
		        {
		            exception.printStackTrace();
		        }
			}
		});
		btnViewJobs.setForeground(Color.WHITE);
		btnViewJobs.setFont(new Font("Cambria", Font.BOLD, 20));
		btnViewJobs.setBorder(null);
		btnViewJobs.setBackground(new Color(65, 105, 225));
		btnViewJobs.setBounds(70, 220, 176, 38);
		contentPane.add(btnViewJobs);
	}
}
